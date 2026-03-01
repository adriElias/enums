package n2EnumTask;

public class ParseLevel {
    public static Level parseLevel(String input) {
        try {
            return Level.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value: '" + input + "'. Allowed values: LOW, MEDIUM, HIGH");
            return null;
        }
    }
}