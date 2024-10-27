package application.objects;
public class Drawable {

  public static void typeText(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(50); // Delay in milliseconds (adjust as needed)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                break;
            }
        }
        System.out.println();
    }

  


}
