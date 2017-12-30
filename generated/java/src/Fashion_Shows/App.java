package Fashion_Shows;

import java.util.Iterator;
import java.util.Scanner;
import org.overture.codegen.runtime.*;

public class App {
	private static Scanner inputScanner = new Scanner(System.in);
	private static int optionLogin;
	private static int optionProfile;
	private static int optionP;
	private static int optionFestival;
	private static int optionEvent;
	private static int optionRunway;
	private static int optionExit;
	private static String UserName;
	
	private static void printMenuInitial()
	{	System.out.println("+========================================================================+");
	    System.out.println("|                                                                        |");
		System.out.println("|                WELCOME TO THE FASHIONS_SHOWS  APP                      |");
		System.out.println("|                                                                        |");
		System.out.println("|   Welcome to the App You Need to Win Fashion Week!                     |");
		System.out.println("|                                                                        |");
		System.out.println("| 1. Login                                                               |");
		System.out.println("| 2. Visitor                                                             |");
		System.out.println("| 3. Register                                                            |");
		System.out.println("+========================================================================+\n");
		
		optionLogin = inputScanner.nextInt();
		
		if(optionLogin == 1){
			MenuLogin();
		}
		if(optionLogin == 2){
			printFestivals();
		}
		if(optionLogin == 3){
			Scanner scn = new Scanner(System.in);
	        System.out.print("Userame: ");
	        String username = scn.nextLine();
	        System.out.print("Password: ");
	        String password = scn.nextLine();
	        System.out.print("Name: ");
	        String name = scn.nextLine();
	        System.out.print("Age: ");
	        String age = scn.nextLine();
	        System.out.print("Doing the Register...");
	        Tests.setAppUser(username,password,name,age);
	        Iterator<FashionUser> iteratorU = TestApp.getUsers().iterator();
			 while(iteratorU.hasNext()) {
			    FashionUser userTemp = iteratorU.next();
				if( (userTemp.getUsername().equals(username)) && (userTemp.getPassword().equals(password))){
						userTemp.printUser();
						System.out.print(TestApp.getUsers().size());
						}
				}
			System.out.print("Register done with success.");
			MenuLoggado(username);
		}
	}
	
	
	private static void MenuLogin(){
		System.out.println("Login\n");
	 	Scanner scn = new Scanner(System.in);
        System.out.print("Username Name: ");
        String optionUsername = scn.nextLine();
        System.out.print("Password: ");
        String optionPassword = scn.nextLine();
        
		Iterator<FashionUser> iteratorU = TestApp.getUsers().iterator();
		 while(iteratorU.hasNext()) {
		    FashionUser userTemp = iteratorU.next();
			if( (userTemp.getUsername().equals(optionUsername)) && (userTemp.getPassword().equals(optionPassword))){
					System.out.println("Login com sucesso!\n");
					UserName = optionUsername;
					MenuLoggado(UserName);
			}
		 }
	}
			
	private static void MenuLoggado(String UserName){
					System.out.println("+========================================================================+");
					System.out.println("|                                                                        |");
					System.out.println("|                                                                        |");
				    System.out.println("|                          FASHIONS_SHOWS  APP                           |");
					System.out.println("| 1. My Profile                                                          |");
					System.out.println("| 2. All Festivals                                                       |");
					System.out.println("+========================================================================+\n");
					
					optionProfile = inputScanner.nextInt();
					
					if(optionProfile == 1){
						MenuProfile(UserName);
					}
					if(optionProfile == 2){
					printFestivals();
					}
					
				}
	
	private static void MenuProfile(String UserName){
		System.out.println("+========================================================================+");
		System.out.println("|                                                                        |");
		System.out.println("|                                                                        |");
	    System.out.println("|                          FASHIONS_SHOWS  APP                           |");
		System.out.println("| 1. My Events                                                           |");
		System.out.println("| 2. My Favorite Designers                                               |");
		System.out.println("| 3. My Favorite Models                                                  |");
		System.out.println("+========================================================================+\n");
		optionP = inputScanner.nextInt();
		
		if(optionP == 1){
			Iterator<FashionUser> iterator = TestApp.getUsers().iterator();
			 while(iterator.hasNext()) {
				 FashionUser setUser = iterator.next();
				 if(setUser.getUsername().equals(UserName)){
					 Iterator<Event> iteratorE = setUser.getEvents().iterator();
					 while(iteratorE.hasNext()) {
						 Event setEvent = iteratorE.next();
						 setEvent.printEvent();
			 }
		}
		}
			 printExit();
		}
		if(optionP == 2){
			Iterator<FashionUser> iterator = TestApp.getUsers().iterator();
			 while(iterator.hasNext()) {
				 FashionUser setUser = iterator.next();
				 if(setUser.getUsername().equals(UserName)){
					 Iterator<Designer> iteratorE = setUser.getDesigners().iterator();
					 while(iteratorE.hasNext()) {
						 Designer setEvent = iteratorE.next();
						 System.out.println(setEvent.printDesigner());
			 }
		}
		}
			 printExit();
		}
		if(optionP == 3){
			Iterator<FashionUser> iterator = TestApp.getUsers().iterator();
			 while(iterator.hasNext()) {
				 FashionUser setUser = iterator.next();
				 if(setUser.getUsername().equals(UserName)){
					 Iterator<Model> iteratorE = setUser.getModels().iterator();
					 while(iteratorE.hasNext()) {
						 Model setEvent = iteratorE.next();
						 System.out.println(setEvent.printModel());
					 }
				 }
			 }
			 printExit();
		}
	}
	
	private static void printFestivals(){
		System.out.println("+========================================================================+");
	    System.out.println("|                                                                        |");
		System.out.println("|                          FASHIONS_SHOWS  APP                           |");
		System.out.println("|                                                                        |");
		System.out.println("|   List of fashion festivals happening now:                             |");
		System.out.println("|                                                                        |");
		System.out.println("+========================================================================+\n");
		TestApp.getFestivalsNames();
		System.out.println("Please select a Festival number to get more information about\n");
		optionFestival = inputScanner.nextInt();
		System.out.println(TestApp.getFestival(optionFestival).printFashionFestival());
		System.out.println(TestApp.getFestivals().size());
		if(optionFestival > TestApp.getFestivals().size()){
			printInvalidOption();
			printFestivals();
		}
		else{
			printMenuFestival(optionFestival);
		}
	}
	
	private static void printMenuFestival(int optionFestival){
		System.out.println("+========================================================================+");
	    System.out.println("|                                                                        |");
		System.out.println("|                          FASHIONS_SHOWS  APP                           |");
		System.out.println("|                                                                        |");
		System.out.println("|   List of events of the festival happening now:                        |");
		System.out.println("|                                                                        |");
		System.out.println("+========================================================================+\n");
		TestApp.getFestivalEventsNames(optionFestival);
		System.out.println("\nPlease select a Event number to get more information about the Event.");
		optionEvent = inputScanner.nextInt();
		if(optionEvent > TestApp.getFestivalEvents(optionFestival).size()){
			printInvalidOption();
			printMenuFestival(optionFestival);
		}
		else{
		printMenuEvent(optionFestival,optionEvent);
		}
	}
	private static void printMenuEvent(int optionFestival, int optionEvent){
		System.out.println("+========================================================================+");
	    System.out.println("|                                                                        |");
		System.out.println("|                          FASHIONS_SHOWS  APP                           |");
		System.out.println("|                                                                        |");
		System.out.println("|   List of the runways of the event:                                    |");
		System.out.println("|                                                                        |");
		System.out.println("+========================================================================+\n");
		TestApp.getRunwaysNames(optionFestival, optionEvent);
		System.out.println("Please select a Runway number to get more information about the runway. \n");
		optionRunway = inputScanner.nextInt();
		if(optionRunway > TestApp.getRunwaysByEvent(optionFestival, optionEvent).size()){
			printInvalidOption();
			printMenuEvent(optionFestival,optionEvent);
		}
		else{
		printMenuRunway(optionFestival,optionEvent,optionRunway);
		
		}
	}
	
	private static void printMenuRunway(int optionFestival, int optionEvent, int optionRunway){
		System.out.println(TestApp.getOneRunwayByEvent(optionFestival, optionEvent, optionRunway).printRunway());
		System.out.println("List of the Designers of the runway:\n");
		Iterator<Designer> iterator = TestApp.getDesignersByRunway(optionFestival, optionEvent, optionRunway).iterator();
		 while(iterator.hasNext()) {
		        Designer setElement = iterator.next();
		        System.out.println(setElement.printDesigner());
		 }
		 System.out.println("List of the Models of the runway:\n");
		 for(int i = 1; i < TestApp.getModelsByRunway(optionFestival, optionEvent, optionRunway).size(); i++){
			 Model setElementM = ((Model) Utils.get(TestApp.getModelsByRunway(optionFestival, optionEvent, optionRunway), i));
			 System.out.println(setElementM.printModel());
		 }
		 printExit();
	}
	
	public static void printExit(){
		System.out.println("+========================================================================+");
		System.out.println("|                                                                        |");
		System.out.println("|                                                                        |");
	    System.out.println("|                          FASHIONS_SHOWS  APP                           |");
		System.out.println("| 0. Home Menu                                                           |");
		System.out.println("| 9. Exit                                                                |");
		System.out.println("+========================================================================+\n");
		optionExit = inputScanner.nextInt();
		if(optionExit == 0){
			printMenuInitial();
		}
		if(optionExit == 9){
			System.exit(0);
		}
	}
	
	public static void printInvalidOption(){
		System.out.println("+========================================================================+");
		System.out.println("|                          Invalid Option!                               |");
		System.out.println("|                                                                        |");
		System.out.println("| Please choose a valid number.                                          |");
		System.out.println("+========================================================================+\n");
	}
	
	public static void main(String[] args) {
		TestApp.printTests();
		printMenuInitial();
	}

}
