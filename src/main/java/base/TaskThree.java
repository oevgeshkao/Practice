package base;

public class TaskThree {
    public static void main(String[] args) {
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
    }
}
