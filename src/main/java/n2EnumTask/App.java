package n2EnumTask;

import n1EnumDay.Day;

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
    }
}
