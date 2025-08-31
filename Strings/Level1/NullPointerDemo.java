package Level1;

public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // throws exception
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // uncomment to crash
        handleException();
    }
}
