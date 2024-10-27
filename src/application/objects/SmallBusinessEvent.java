package application.objects;
public class SmallBusinessEvent implements Events {

	@Override
	public void startEvent() {
	System.out.println("Checking the address you confirm its got to be the right place.\nThe sign reads \"ByteBack Technologies\"\nLooking around you shrug and head inside...\n...\n...\nYou eventually find a terminal that was left unlocked and begin to research why this location would have been in that script kiddie's files.\nDuring your reseach you gain a better understanding of Secure Coding Practices!!!\nA notification pings your terminal. You take some time to read the incoming message...");
	}
	
	@Override
	public void endEvent() {
	System.out.println("Rolling your eyes at the loss of time you close the terminal.\n\"Time to head out\"");
	}



}
