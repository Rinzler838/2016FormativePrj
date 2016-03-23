package formative.controller;

import formative.controller.CharacterController;

/**
 * Initiates the 2016Formative Project
 * @author Deigen Villalobos
 * @version 1.0 3/23/16 Wrote the Runner
 */

public class CharacterRunner
{
	public static void main(String[] args)
	{
		CharacterController myController = new CharacterController();
		myController.start();
	}
}
