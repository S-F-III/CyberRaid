package application.objects;

import java.util.Random;

public class Drawable {

  public static int d20() {
      Random random = new Random();
      int randomNumber = random.nextInt(20) + 1; // Generates a number between 1 and 20
      System.out.println("Random number: " + randomNumber);
      return randomNumber;
  }
	
  public static void typeText(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
            	Thread.sleep(1); //Debug speed
                //Thread.sleep(50); // Delay in milliseconds (adjust as needed)
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
  public static void gameOverText(){
  Drawable.typeTextFaster(" _____   ___  ___  ___ _____   _____  _   _ ___________ _ _ _ ");
  Drawable.typeTextFaster("|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\ | | |");
  Drawable.typeTextFaster("| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ / | | |");
  Drawable.typeTextFaster("| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    /| | | |");
  Drawable.typeTextFaster("| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\|_|_|_|");
  Drawable.typeTextFaster(" \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_(_|_|_)");
  }
  public static void hackPastText() {
  Drawable.typeTextFaster(" _   _   ___  _____  _   __  _____ _   _  _____  ______  ___   _____ _____ ");
  Drawable.typeTextFaster("| | | | / _ \\/  __ \\| | / / |_   _| | | ||  ___| | ___ \\/ _ \\ /  ___|_   _|");
  Drawable.typeTextFaster("| |_| |/ /_\\ \\ /  \\/| |/ /    | | | |_| || |__   | |_/ / /_\\ \\ `--.  | |  ");
  Drawable.typeTextFaster("|  _  ||  _  | |    |    \\    | | |  _  ||  __|  |  __/|  _  | `--. \\ | |");
  Drawable.typeTextFaster("| | | || | | | \\__/\\| |\\  \\   | | | | | || |___  | |   | | | |/\\__/ / | |  ");
  Drawable.typeTextFaster("\\_| |_/\\_| |_/\\____/\\_| \\_/   \\_/ \\_| |_/\\____/  \\_|   \\_| |_/\\____/  \\_/ ");
  }
  public static void youWinText() {
  Drawable.typeTextFaster("__   _______ _   _   _    _ _____ _   _ _ _ _ ");
  Drawable.typeTextFaster("\\ \\ / /  _  | | | | | |  | |_   _| \\ | | | | |");
  Drawable.typeTextFaster(" \\ V /| | | | | | | | |  | | | | |  \\| | | | |");
  Drawable.typeTextFaster("  \\ / | | | | | | | | |/\\| | | | | . ` | | | |");
  Drawable.typeTextFaster("  | | \\ \\_/ / |_| | \\  /\\  /_| |_| |\\  |_|_|_|");
  Drawable.typeTextFaster("  \\_/  \\___/ \\___/   \\/  \\/ \\___/\\_| \\_(_|_|_)");
  }
}
