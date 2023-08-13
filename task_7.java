import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Заданные константы x, y, z
        int x = 10;
        int y = 20;
        int z = 30;

        boolean containsX = false;
        boolean containsY = false;
        boolean containsZ = false;

        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                containsX = true;
            }
            if (array[i] == y) {
                containsY = true;
            }
            if (array[i] == z) {
                containsZ = true;
            }
        }

        if (containsX || containsY || containsZ) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Ни одно из значений не совпадает с константами");
        }
    }
}