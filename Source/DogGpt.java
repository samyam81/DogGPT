import java.awt.EventQueue;

public class DogGpt {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Hehe();
                } catch (Exception e) {
                    System.out.println("Error Exception.");
                    e.printStackTrace();
                }
            }
        });
    }

}
