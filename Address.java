package Application;

// Created by Clayton Paplaczyk
// Description: The Address class hold the city and state of the added bank and 
// 				allows Application.java to pull information that is formated.


public class Address {
	
	//Address contains city and state as its instance variables
	private String city; // the city of the bank
	private String state; // the state of the bank
	
	//Constructor initializes each attribute
	public Address()
	{
		city = "?";
		state = "?";
	}
	
	//Accessor method of the instance variable city
	public String getCity()
	{
		return city;
	}
	
	//Accessor method of the instance variable state
	public String getState()
	{
		return state;
	}
	
	//Mutator method of the instance variable aCity
	public void setCity(String aCity)
	{
		city = aCity;
	}
	
	//Mutator method of the instance variable aState
	public void setState(String aState)
	{
		state = aState;
	}
	
	//toString method creates a string containing values of
	//instance variables using the specified format and returns it
	public String toString()
	{
		String bankInfoString;
		
		bankInfoString = city + "," + state;
		
		return bankInfoString;
	}

} //end class
