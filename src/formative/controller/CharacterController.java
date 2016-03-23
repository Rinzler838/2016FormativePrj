package formative.controller;

import formative.model.MajorStatus;
import formative.view.CharacterView;

/**
 * Application controller for 2016Formative project.
 * @author Deigen Villalobos
 * @version 1.4 3/23/16 Deleted unnecessary code
 */

public class CharacterController
{
	private MajorStatus formativeMS;
	public String twoCharacters;
	private CharacterView formativeDisplay;
	
	public CharacterController()
	{
		formativeDisplay = new CharacterView();
		formativeMS = new MajorStatus();
	}
	
	public void start()
	{
		String twoCharacters = formativeDisplay.characterInput("Please input your two characters to continue...");
		formativeDisplay.showMessage("Translation: " + formativeMS.getTranslation(twoCharacters));
	}
}
