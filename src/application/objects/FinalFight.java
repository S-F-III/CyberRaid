package application.objects;
public class FinalFight implements Events {

@Override
public void eventStart() {
Drawable.typeText("The elevator seems to be taking forever...\nMoonlight filters in through the glass window as you speed towards the top\nOpening into a large foyer the elevator shuts behind you.\nA lone door stands between you and fixing this mess.\n"Do you enter and embrace your destiny?");
}

@Override
public void eventEnd() {
Drawable.typeText("The group stumbles back clearly in shock that they have been defeated.\n\"Thats impossible\" Stuttering as they fall into unconciousness....");
}
}
