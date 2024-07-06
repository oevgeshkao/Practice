package base;

public class TaskSecond {
    public static void main(String[] args) {
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
        System.out.println("Среднее арифметическое: " + sum/array.length);
    }
}
