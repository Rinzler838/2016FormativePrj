package formative.model;

import java.util.ArrayList;

/**
 * MajorStatus Model class
 * @author Deigen Villalobos
 * @version 1.9 3/23/16 Added code to handle errors.
 */

public class MajorStatus
{
	private ArrayList<String> majorList;
	private ArrayList<String> statusList;
	private String major;
	private String status;
	private String twoCharacters;
	public String translation;
	
	public MajorStatus()
	{
		this.majorList = new ArrayList<String>();
		this.statusList = new ArrayList<String>();
		this.twoCharacters = new String();

		buildMajorList();
		buildStatusList();
	}
	
	/**
	 * Builds the ArrayList that contains majors.
	 */
	private void buildMajorList()
	{
		this.majorList.add("Network Secutiry - ");
		this.majorList.add("Multimedia Management - ");
		this.majorList.add("Telecommunications - ");
		this.majorList.add("Computer Graphics - ");
		this.majorList.add("Artificial Intelligence - ");
		this.majorList.add("Web Page Design - ");
		this.majorList.add("Software Engineer - ");
		this.majorList.add("Desktop Publishing - ");
		this.majorList.add("Information Technology - ");
	}
	
	/**
	 * Builds the ArrayList that contains statuses.
	 */
	private void buildStatusList()
	{
		this.statusList.add("1Freshman");
		this.statusList.add("2Sophmore");
		this.statusList.add("3Junior");
		this.statusList.add("4Senior");
	}	
	
	/**
	 * If it is 2 characters long, this checks to see if "twoCharacters" can match a major in the MajorList.
	 * @param twoCharacters: The user's supplied text
	 * @return major: The major from the list that corresponds to what the user typed in.
	 */
	public String majorChecker(String twoCharacters)
	{
		if (twoCharacters.length() == 2)
		{
			for (int currentMajor = 0; currentMajor < majorList.size(); currentMajor++)
			{
				if (twoCharacters.substring(0, 1).equals(majorList.get(currentMajor).substring(0, 1)))
				{
					return major = majorList.get(currentMajor);
				}
				else
				{
					major = "Error 404: Major Not Found - ";
				}
			}
		}
		else
		{
			major = "Error Code 413: Too Long of Entry";
		}
		return major;
	}
	
	/**
	 * If it is 2 characters long, this checks to see if "twoCharacters" can match a status in the StatusList.
	 * @param twoCharacters: The user's supplied text.
	 * @return status: The status from the list that corresponds to that the user typed in.
	 */
	public String statusChecker(String twoCharacters)
	{
		if (twoCharacters.length() == 2)
		{
			for (int currentStatus = 0; currentStatus < statusList.size(); currentStatus++)
			{
				if (twoCharacters.substring(1, 2).equals(statusList.get(currentStatus).substring(0, 1)))
				{
					return status = statusList.get(currentStatus).substring(1, statusList.get(currentStatus).length());
				}
				else
				{
					status = "Error Code 404: Status Not Found";
				}
			}
		}
		else
		{
			status = " - Please Try Again";
		}
		return status;
	}
	
	/**
	 * If both are not "null", it takes the returned major and status and combines them into one String and returns it.
	 * @param twoCharacters: The user's supplied text.
	 * @return translation: The final and translated text.
	 */
	public String getTranslation(String twoCharacters)
	{
		majorChecker(twoCharacters);
		statusChecker(twoCharacters);
		
		if (major != null && status != null)
		{
			translation = major + status;
		}
		else
		{
			translation = "Error Code 502: Critical Program Failure";
		}
		return translation;
	}
}
