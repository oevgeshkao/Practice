package TaskSix.Figure;

public enum Color {
    BLUE("Голубой"),
    BLACK("Черный"),
    WHITE("Белый"),
    RED("Красный"),
    GREEN("Зеленый");

    private final String Name;

    Color(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }
}
