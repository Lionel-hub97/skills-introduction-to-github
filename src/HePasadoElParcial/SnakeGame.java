package HePasadoElParcial;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame {
    private static final int WIDTH = 20; // Ancho del tablero
    private static final int HEIGHT = 10; // Altura del tablero
    private static final char EMPTY = '.'; // Espacios vacíos
    private static final char SNAKE = 'O'; // Cuerpo de la serpiente
    private static final char FOOD = 'X'; // Comida

    private static ArrayList<int[]> snake = new ArrayList<>(); // Coordenadas de la serpiente
    private static int[] food = new int[2]; // Coordenadas de la comida
    private static String direction = "RIGHT"; // Dirección inicial de la serpiente
    private static boolean gameOver = false;

    public static void main(String[] args) throws Exception {
        // Inicializar la serpiente en el centro del tablero
        snake.add(new int[]{HEIGHT / 2, WIDTH / 2});

        // Generar la primera comida
        generateFood();

        // Crear un hilo para capturar entradas del usuario
        Thread inputThread = new Thread(() -> {
            try {
                while (!gameOver) {
                    int key = System.in.read(); // Captura una tecla
                    switch (key) {
                        case 'w':
                            if (!direction.equals("DOWN")) direction = "UP";
                            break;
                        case 's':
                            if (!direction.equals("UP")) direction = "DOWN";
                            break;
                        case 'a':
                            if (!direction.equals("RIGHT")) direction = "LEFT";
                            break;
                        case 'd':
                            if (!direction.equals("LEFT")) direction = "RIGHT";
                            break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        inputThread.start(); // Inicia el hilo de entrada del usuario

        // Bucle principal del juego
        while (!gameOver) {
            clearScreen(); // Limpia la pantalla antes de imprimir el tablero
            printBoard(); // Imprime el tablero
            moveSnake(); // Mover la serpiente
            checkCollision(); // Comprobar colisiones

            // Añadir un pequeño retraso entre cada frame
            try {
                Thread.sleep(200); // 200ms de retraso
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Game Over! Tu puntuación: " + (snake.size() - 1));
    }

    // Limpia la pantalla (para evitar superposición de frames)
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Imprime el tablero
    private static void printBoard() {
        char[][] board = new char[HEIGHT][WIDTH];

        // Rellenar el tablero con espacios vacíos
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                board[i][j] = EMPTY;
            }
        }

        // Dibujar la comida
        board[food[0]][food[1]] = FOOD;

        // Dibujar la serpiente
        for (int[] segment : snake) {
            board[segment[0]][segment[1]] = SNAKE;
        }

        // Imprimir el tablero
        System.out.println("+" + "-".repeat(WIDTH) + "+");
        for (int i = 0; i < HEIGHT; i++) {
            System.out.print("|");
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("+" + "-".repeat(WIDTH) + "+");
    }

    // Mover la serpiente en la dirección actual
    private static void moveSnake() {
        int[] head = snake.get(0); // Cabeza actual de la serpiente
        int newHeadRow = head[0];
        int newHeadCol = head[1];

        switch (direction) {
            case "UP" -> newHeadRow--;
            case "DOWN" -> newHeadRow++;
            case "LEFT" -> newHeadCol--;
            case "RIGHT" -> newHeadCol++;
        }

        // Insertar la nueva cabeza al principio de la lista
        snake.add(0, new int[]{newHeadRow, newHeadCol});

        // Comprobar si la serpiente ha comido la comida
        if (newHeadRow == food[0] && newHeadCol == food[1]) {
            generateFood(); // Generar nueva comida
        } else {
            snake.remove(snake.size() - 1); // Eliminar la cola si no ha crecido
        }
    }

    // Comprobar colisiones (con paredes o con el propio cuerpo)
    private static void checkCollision() {
        int[] head = snake.get(0);

        // Colisión con las paredes
        if (head[0] < 0 || head[0] >= HEIGHT || head[1] < 0 || head[1] >= WIDTH) {
            gameOver = true;
        }

        // Colisión con el propio cuerpo
        for (int i = 1; i < snake.size(); i++) {
            if (head[0] == snake.get(i)[0] && head[1] == snake.get(i)[1]) {
                gameOver = true;
                break;
            }
        }
    }

    // Generar nueva comida en una posición aleatoria
    private static void generateFood() {
        Random random = new Random();
        int foodRow, foodCol;

        // Asegurarse de que la comida no aparece sobre la serpiente
        while (true) {
            foodRow = random.nextInt(HEIGHT);
            foodCol = random.nextInt(WIDTH);

            boolean onSnake = false;
            for (int[] segment : snake) {
                if (segment[0] == foodRow && segment[1] == foodCol) {
                    onSnake = true;
                    break;
                }
            }

            if (!onSnake) break;
        }

        food[0] = foodRow;
        food[1] = foodCol;
    }
}
