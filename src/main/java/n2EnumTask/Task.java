package n2EnumTask;

public class Task {
    private Level level;

    public Task(Level level) {
        this.level = level;
    }

    public void showBehavior() {
        switch (level) {
            case LOW:
                System.out.println("For initial level you can practise 30 ball throws.");
                break;
            case MEDIUM:
                System.out.println("For medium level you can practice the overhead serve.");
                break;
            case HIGH:
                System.out.println("For advanced level you can practice the spike.");
                break;
        }
    }
}
