public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepIn sleepIn = new SleepIn();

        System.out.println("sleepIn(false, false): " + sleepIn.sleepIn(false, false));
        System.out.println("sleepIn(true, false): " + sleepIn.sleepIn(true, false));
        System.out.println("sleepIn(false, true): " + sleepIn.sleepIn(false, true));
    }
}