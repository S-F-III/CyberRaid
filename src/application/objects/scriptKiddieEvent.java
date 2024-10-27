package application.objects;
public class ScriptKiddieFight implements Events{


	@Override
	public void eventStart() {
	System.out.println("You have returned to the past! It seems they haven't thought of everything. \n...\n...\n\"This cant be the same place I just visited\" You turn around and see a disheveled man with a wicked grin.") 
	}

	@Override
	public void eventEnd() {
	System.out.println("\"It's 1985, how are there script kiddies?!\" Rummaging through some of the data you pulled from him you gain a better understanding of Threat Intelligence!!! and you find references to a Data Center and Small Business that could be of interest.") 
	}

}

