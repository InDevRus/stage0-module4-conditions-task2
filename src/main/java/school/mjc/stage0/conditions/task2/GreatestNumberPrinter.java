package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        var bigger = first > second ? first : second;
        System.out.println(bigger);
    }
}
