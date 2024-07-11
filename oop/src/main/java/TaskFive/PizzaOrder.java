package TaskFive;

public class PizzaOrder {
    private String name;
    private Size size;
    private boolean sauce;
    private String address;
    private boolean accept;

    public enum Size {
        PERSONAL("Персональная"),
        SMALL("Маленькая"),
        MEDIUM("Средняя"),
        BIG("Большая"),
        VERYBIG("Очень большая");

        private final String sizePizza;

        Size(String sizePizza) {
            this.sizePizza = sizePizza;
        }

        public String getSize() {
            return sizePizza;
        }
    }

    public PizzaOrder(String name, Size size, boolean sauce, String address) {
        this.name = name;
        this.size = size;
        this.sauce = sauce;
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public boolean isSauceNeed() {
        return sauce;
    }

    public void setSauceNeed(boolean sauceNeed) {
        sauce = sauceNeed;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = name;
    }

    public String sauceNeed() {
        if (sauce) {
            return "с соусом";
        } else {
            return "без соуса";
        }
    }

    public void order() {
        if (accept) {
            System.out.println("Заказ принят");
        } else {
            accept = true;
            System.out.println("Заказ принят." + size.getSize() + " пицца " + name + " " + sauceNeed() + " на адрес " + address);
        }
    }

    public void cancel() {
        if (accept) {
            accept = false;
            System.out.println("Заказ отменён");
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    @Override
    public String toString() {
        return "Пицца: " + name  + "\nРазмер: " + size+ "\nСоус: " + sauceNeed()  + "\nАдрес: " + address ;
    }
}
