package n2EnumTask;

public class App {
    public static void main( String[] args )
    {
        Task task1 = new Task(Level.LOW);
        Task task2 = new Task(Level.MEDIUM);
        Task task3 = new Task(Level.HIGH);

        task1.showBehavior();
        task2.showBehavior();
        task3.showBehavior();

        for (Level element : Level.values()) {
            System.out.println(element + " color: " + element.getColor());
        }

        // valid values
        Level l1 = ParseLevel.parseLevel("HIGH");
        Level l2 = ParseLevel.parseLevel("low");       // toUpperCase() normalizes it

        // invalid values
        Level l3 = ParseLevel.parseLevel("CRITICAL");  // Controlled error launch

        System.out.println("l1 = " + l1);  // HIGH
        System.out.println("l2 = " + l2);  // LOW
        System.out.println("l3 = " + l3);  // null
    }
}
