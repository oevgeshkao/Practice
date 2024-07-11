public class Main {
    public static void main(String[] args) {
        /*Задание 1*/
        System.out.println("*******Задание 1*******");
        TaskFirst();

        /*Задание 2*/
        System.out.println("*******Задание 2*******");
        TaskSecond();

        /*Задание 3*/
        System.out.println("*******Задание 3*******");
        TaskThree();

        /*Задание 4*/
        System.out.println("*******Задание 4*******");
        TaskFour();
    }

    private static void TaskFirst() {
        for (int number = 7; number < 100; number += 7) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void TaskSecond() {
        double sum = 0;
        int max = 0;

        int[] array = new int[12];

        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * 50);
            sum += array[index];
            if (max < array[index]) {
                max = array[index];
            }
            System.out.print(array[index] + " ");
        }

        System.out.println("\nМаксимальное число: " + max);
        System.out.println("Среднее арифметическое: " + sum / array.length);
    }

    private static void TaskThree() {
        boolean primeNumber;

        for (int number = 2; number <= 100; number++) {
            primeNumber = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    primeNumber = false;
                    break;
                }
            }

            if (primeNumber) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void TaskFour() {
        String asterisk;
        for (int i = 1; i <= 15; i++) {
            asterisk = (i % 5 == 0) ? "*\n" : "* ";
            System.out.print(asterisk);
        }
        System.out.println();
    }
}
