package base;

public class TaskFour {
    public static void main(String[] args) {
        String asterisk;
        for (int i = 1; i <= 15; i++) {
            asterisk = (i % 5 == 0) ? "*\n" : "* ";
            System.out.print(asterisk);
        }
    }
}
