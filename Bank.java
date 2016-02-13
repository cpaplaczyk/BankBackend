
package Application;

// Created by Clayton Paplaczyk

// Description: The class Bank stores bankName, bankID, and bankAddress to be
// 				used by Application.java. This stored data is then formated for
// 				an clean looking output in Application.java.


public class Bank {

	//Bank contains bankName, BankID and bankAddress as its instance variables
	private String bankName; // The name of the bank
	private int bankID; // The ID of the bank
	private Address bankAddress; // The address of the bank
	
	// Constructor initializes each attribute
	public Bank() 
	{
		bankName = "?";
		bankID = 0;
		bankAddress = new Address();
	}
	
	//Accessor method of the instance variable bankName
	public String getBankName() 
	{
		return bankName;
	}
	
	//Accessor method of the instance variable bankID
	public int getBankID() 
	{
		return bankID;
	}
	
	//Accessor method of the instance variable bankAddress
	public Address getBankAddress() 
	{
		return bankAddress;
	}
	
	//Mutator method of the instance variable banName
	public void setBankName(String BankName) 
	{
		bankName = BankName;
	}
	
	//Mutator method of the instance variable bankID
	public void setBankID(int anID) 
	{
		bankID = anID;
	}
	
	//Mutator method of the instance variables aCity and aState
	public void setBankAddress(String aCity, String aState)
	{
		bankAddress.setCity(aCity);
		bankAddress.setState(aState);
	}
	
	//toString method crates a string containing values of
	//instance variables using the specified formant and returns it
	public String toString()
	{
		String bankInfo;
		
		bankInfo = ("\nBank name:\t\t" + bankName + "\nBank ID:\t\t" + bankID + "\nBank address:\t\t" + bankAddress + "\n\n");
		
		return bankInfo;
	}
	
} //end of class Bank
