package Fashion_Shows;

import java.util.Iterator;
import java.util.Scanner;
import org.overture.codegen.runtime.*;

public class App {

	private static Scanner inputScanner = new Scanner(System.in);
	private static int optionFestival;
	private static int optionEvent;
	private static int optionRunway;
	private static int optionModel;
	private static int optionDesigner;
	
	private static void printMenuInitial()
	{
		System.out.println("+========================================================================+");
		System.out.println("|                WELCOME TO THE FASHIONS_SHOWS  APP                      |");
		System.out.println("+========================================================================+\n");
		System.out.println("Welcome to the App You Need to Win Fashion Week!\n");
		System.out.println("List of fashion festivals happening now: \n");
		TestApp.getFestivalsNames();
		System.out.println("Please select a Festival number to get more information about\n");
		optionFestival = inputScanner.nextInt();
		TestApp.getFestival(optionFestival).printFashionFestival();
		printMenuFestival(optionFestival);
	}
	
	private static void printMenuFestival(int optionFestival){
		System.out.println("\nList of events of the festival happening now:");
		TestApp.getFestivalEventsNames(optionFestival);
		System.out.println("\nPlease select a Event number to get more information about the Event.");
		optionEvent = inputScanner.nextInt();
		printMenuEvent(optionFestival,optionEvent);
	}
	
	private static void printMenuEvent(int optionFestival, int optionEvent){
		System.out.println("List of the runways of the event:\n");
		TestApp.getRunwaysNames(optionFestival, optionEvent);
		System.out.println("Please select a Runway number to get more information about the runway. \n");
		optionRunway = inputScanner.nextInt();
		printMenuRunway(optionFestival,optionEvent,optionRunway);
	}
	
	private static void printMenuRunway(int optionFestival, int optionEvent, int optionRunway){
		TestApp.getOneRunwayByEvent(optionFestival, optionEvent, optionRunway).printRunway();
		System.out.println("List of the Designers of the runway:\n");
		Iterator<Designer> iterator = TestApp.getDesignersByRunway(optionFestival, optionEvent, optionRunway).iterator();
		 while(iterator.hasNext()) {
		        Designer setElement = iterator.next();
		        setElement.printDesigner();
		 }
		 System.out.println("List of the Models of the runway:\n");
		 TestApp.getModelsInfsByRunway(optionFestival, optionEvent, optionRunway);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestApp.printTests();
		printMenuInitial();
	}

}
