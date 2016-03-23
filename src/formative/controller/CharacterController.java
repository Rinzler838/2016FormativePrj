package formative.controller;

import formative.model.MajorStatus;
//import formative.view.CharacterView;

/**
 * Application controller for 2016Formative project.
 * @author Deigen Villalobos
 * @version 1.4 3/23/16 Deleted unnecessary code
 */

public class CharacterController
{
	private MajorStatus myMS;
	public String twoCharacters;
	//private CharacterView myDisplay;
	
	public CharacterController()
	{
		myDisplay = new CharacterView();
		String twoCharacters = myDisplay.characterInput("Please enter your 2 characters (A letter & a number) to continue...");
		myMS = new MajorStatus(twoCharacters);
	}
	
	public void start()
	{
		System.out.println("Translation: " + myMS.getTranslation());
		//myDisplay.showMessage("Translation: " + myMS.getTranslation());
	}
}
