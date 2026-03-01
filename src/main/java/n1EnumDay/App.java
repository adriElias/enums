package n1EnumDay;

public class App
{
    public static void checkDay(Day day) {
        if (day.isWeekend()) {
            System.out.println(day + " its weekend day. ️");
        } else {
            System.out.println(day + " its a workday");
        }
    }

    public static void main( String[] args )
    {
        checkDay(Day.MONDAY);
        checkDay(Day.SATURDAY);
        checkDay(Day.SUNDAY);
    }
}
