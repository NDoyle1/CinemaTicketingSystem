//Assignment 1 - Cinema Ticketing System. This program will read the input from a user and output it in the form of a cinema ticket.

import java.util.Scanner; // Captures user input
import java.text.DecimalFormat; // Decimal format

class FullWorkingAssignment1

{
	public static void main (String args [])

	{

		//declaring my variables

		String filmName, surname;
		int numberOfPeople;
		int ticketCost = 12; //hardcoded cost of ticket
		double cost;
		char choice; 	// for the Y/N option
		int ticketCounter;

		ticketCounter = 0; //to add tickets at the end


		Scanner userInput = new Scanner(System.in); //setting the Scanner
		DecimalFormat df = new DecimalFormat("0.00"); // setting the decimal format


		//start of the program and asking for the users input

		System.out.println("***************************************************");
		System.out.println("     Welcome to Noreen's Cinema Ticket System!");
		System.out.println("***************************************************\n");

		//starting the do/while loop
	do{

		ticketCounter = ticketCounter +1;

		System.out.println("Please enter the name of the film you wish to see\n");
		filmName = userInput.next();

		System.out.println("\nPlease enter your Surname\n");
		surname = userInput.next();

		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n           EXCLUSIVE OFFER\n10% OFF IF MORE THAN 6 TICKETS PURCHASED\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");

		System.out.println("\nTickets are 12 Euro each.\nPlease enter number of people");
		numberOfPeople = userInput.nextInt();


		//calculating cost for the tickets and if >6 people 10% discount
		cost = ticketCost * numberOfPeople;

		if (numberOfPeople >6)
		{
			cost = (cost - (cost/100*10));
		}

		//displays cinema ticket with film name, user surname and total cost for tickets

		System.out.println("\n\n********************************************************************************************************\n\n");
		System.out.println("Show		: " +filmName);
		System.out.println("\nSurname		: " +surname);
		System.out.println("\nNo in Party	: " +numberOfPeople);
		System.out.println("\nCost		: " +cost);
		System.out.println("\n                                   Process Another Ticket? 'Y' / 'N'");
		System.out.println("\n********************************************************************************************************\n\n");

		//choice Y or N
		choice = userInput.next().toUpperCase().charAt(0);

		}
		while (choice == 'Y');

		System.out.println("Thank you! You have purchased " +ticketCounter + " ticket(s)");
		System.out.println("Enjoy the show!");
		System.out.println("*****************************************************************\n");
	}
}