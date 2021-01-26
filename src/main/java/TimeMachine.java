public class TimeMachine {

    public void goToFuture(int currentYear) {

        currentYear = currentYear+10;
    }

    public void goToPast(int currentYear) {

        currentYear = currentYear-10;
    }

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();
        int currentYear = 2020;

        System.out.println("What year now?");
        System.out.println(currentYear);

        timeMachine.goToPast(currentYear);
        System.out.println("And now?");
        System.out.println(currentYear);
    }
}
