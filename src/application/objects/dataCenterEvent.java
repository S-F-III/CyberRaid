package application.objects;
public class DataCenterEvent implements Events {
	
	@Override
	public void eventStart() {
	Drawable.typeText("You make your way to the Data Center.\nWatching some of the emplyees you notice that some let people in without swiping their card.\n Taking a deep breath you start walking towards the center with a small group of people.\nSure enough they let you in without a word.\n...\n...\nAfter looking through some of the files you gain some knowledge towards Risk Assessment and Management!!!\n\"That should prove useful\"\nSuddenly you feel a tap on your shoulder. Spinning around, you see a woman removing an unconvincing disguise.\n\"Get out of my way, this information belongs on the net\""); 

	}
	
	@Override
	public void eventEnd() {
	Drawable.typeText(An Alarm starts to screech overhead.\n\"Time to go!\" Making your way out of the building you manage to slip off before law enforcement could arrive.");
		
	}


}

