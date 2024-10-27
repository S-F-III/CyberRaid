package application.objects;
public class StartGameEvent implements Events {
  
  @Override
  public void eventStart() {
  Drawable.typeText("Its been years!!\n\"Finally! I've cracked time travel!\"\nWasting no time you start the program and with a deafening boom and a flash of light you are greeted with a glowing portal.\nStepping through causes your vision to be completed obscured by a dazzling white light.\nSuddenly your vision clears and you find yourself in an empty lot.\n\"The building must be newer than I realized\"\nThe wind whips some paper into your face, pulling it away you notice its a newspaper...that reads Friday, October 25th 1985!\nBefore you can celebrate you notice a portal appear a few feet away from you.\n3 feet step through in one smooth motion men leading to 2 women and a man in modern suits standing weirdly together and speaking in unison.\n\"We have been watching you for some time, but the time for watching is over! We will take your technology and remake time in our own image.\"");
	}
  
  @Override
  public void eventEnd() {
  Drawable.typeText("Reeling from the onslaught you feel yourself fall into the portal you made...\n...\n...\nWhat feels like several hours go by and you awaken to a very different bedroom.\n Everything seems to be alien, as if everything is too advanced for your comprehension.\nFearing the worst you access your computer, at least what should be your computer, and look to see if your time travel program is still there...");
  }
  
}
