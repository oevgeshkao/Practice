package TaskFirst;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("89814383085", "Samsung", 250);
        Phone phone1 = new Phone("891114457899", "Nokia");

        System.out.println(phone);
        System.out.println(phone1);

        System.out.println(phone.getNumber());
        System.out.println(phone1.getNumber());

        phone.receiveCall("Vera");
        phone1.receiveCall("Lida", phone1.getNumber());

        String[] numbers = {"89114457899", "89536574125", "89115478431"};
        phone.sendMessage(numbers);


    }
}
