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
    public static void typeTextFaster(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(10); // Delay in milliseconds (adjust as needed)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                break;
            }
        }
        System.out.println();
    }
  public static void gameOverText()
  Drawable.typeTextFaster(" _____   ___  ___  ___ _____   _____  _   _ ___________ _ _ _ ");
  Drawable.typeTextFaster("|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\ | | |");
  Drawable.typeTextFaster("| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ / | | |");
  Drawable.typeTextFaster("| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    /| | | |");
  Drawable.typeTextFaster("| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\|_|_|_|);
  Drawable.typeTextFaster(" \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_(_|_|_)");
}
