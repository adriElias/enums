package n2EnumTask;

public enum Level {
    LOW("Green"),
    MEDIUM("Yellow"),
    HIGH("Red");

    private String color;

    Level(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Level{" +
                "color='" + color + '\'' +
                '}';
    }
}
