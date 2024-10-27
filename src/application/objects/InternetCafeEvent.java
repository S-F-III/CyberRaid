package application.objects;
public class InternetCafeEvent implements Events {

	@Override
	public void startEvent() {
	Drawable.typeText("Unable to think of a place to go you wander for a while before stumbling into an internet cafe.\n\"Time to figure out who those creeps were\"\n...\n...\n...\nMethodically combing through some new history and trying to identify the men who jumped you leads to a better understanding of Digital Forensics!!!\nSomething those creeps said jumped out at you,\n\"We have been watching you...\"\nThat could only mean one thing...those men must be part of an Advanced Persistent Threat!\nThe computers around you immediately shut off and are replaced by an unfamiliar OS...\n
	}

	public void endEvent() {
	Drawable.typeText("\"These fights are getting tougher, I had better finish this quickly\"\nNow that the BotNet has been dealt with you can continue your research.");
	}


}
