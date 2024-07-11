package TaskFive;

public class Main {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder("Куриная", PizzaOrder.Size.PERSONAL, false, "Гагарина 43");

        System.out.println(order);

        order.cancel();
        order.order();
    }
}
