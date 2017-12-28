package Fashion_Shows;

import java.util.Scanner;
import org.overture.codegen.runtime.*;

public class App {

	private static Scanner inputScanner = new Scanner(System.in);
	private static int optionFestival;
	private static int optionEvent;
	
	private static void printMenuInitial()
	{
		System.out.println("\n+===========================+");
		System.out.println("|    FASHIONS_SHOWS  APP    |");
		System.out.println("+===========================+\n");
		System.out.println("List of festivals avaliable:");
		TestApp.printFestivalsName();
		System.out.println("\nPlease select a festival for more informations:");
		optionFestival = inputScanner.nextInt();
		if(optionFestival != 0){
			TestApp.getFestivalInf(optionFestival);
			printMenuFestival(optionFestival);
		}
		else{
			System.out.println("SAIR");
	}
	}
	private static void printMenuFestival(int optionFestival){
	
		//getEvents By festival ID
		System.out.println("\nList of events of the festival:\n");
		TestApp.getEventsByFestival(optionFestival);
		System.out.println("\nPlease select a event for more informations:");
		optionEvent = inputScanner.nextInt();
		if(optionEvent != 0){
			TestApp.getEventInf(optionFestival, optionEvent);
			//printMenuEvent(optionEvent);
		}
		else{
			System.out.println("SAIR");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestApp.printTests();
		printMenuInitial();
	}

}
