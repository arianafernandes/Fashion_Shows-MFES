package Fashion_Shows;

import java.util.Scanner;
import org.overture.codegen.runtime.*;

public class App {

	private static Scanner inputScanner = new Scanner(System.in);
	private static int optionFestival;
	private static int optionEvent;
	private static int optionModel;
	private static int optionDesigner;
	
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
			System.exit(0);
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
			printMenuEvent(optionFestival,optionEvent);
		}
		else{
			System.out.println("SAIR");
	}
	}
	static int option;
	private static void printMenuEvent(int optionFestival, int optionEvent){
		
		System.out.println("\nList of models of the event:\n");
		TestApp.getModelsNameByEvent(optionFestival, optionEvent);
		System.out.println("\nList of desginers of the event:\n");
		TestApp.getDesignersNameByEvent(optionFestival, optionEvent);
		System.out.println("\nSelece 1 for more information about models or 2 for more information about designers \n");
		
		option = inputScanner.nextInt();
		if(option == 1){
			System.out.println("\nPlease select a model for more informations:");
			TestApp.getModelsNameByEvent(optionFestival, optionEvent);
			optionModel = inputScanner.nextInt();
			if(optionModel != 0){
				TestApp.getModelInf(optionFestival,optionEvent, optionModel);
				//printMenuEvent(optionFestival,optionModel);
			}
		}
		else if(option == 2){
			System.out.println("\nPlease select a designer for more informations:");
			TestApp.getDesignersNameByEvent(optionFestival, optionEvent);
			optionDesigner = inputScanner.nextInt();
			if(optionDesigner != 0){
				TestApp.getDesignerInf(optionFestival,optionEvent, optionDesigner);
				//printMenuEvent(optionFestival,optionModel);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestApp.printTests();
		printMenuInitial();
	}

}
