package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad(){
        printMessage(20, "writing the same code doesn't have much impact, and it's also time consuming");
    }
    private void printMessage(int count, String message) {
        if (count > 0) {
            System.out.println(message);
            printMessage(count - 1, message);
        }
    }
}
