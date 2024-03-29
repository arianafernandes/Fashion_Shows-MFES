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
	public static final int BACK_INPUT = 0;
	public static final int MENU_INPUT = 1;
	
	private static void printMenuInitial()
	{	System.out.println("\n+========================================================================+");
	    System.out.println("|                                                                        |");
		System.out.println("|                  WELCOME TO THE FASHIONS_SHOWS  APP                    |");
		System.out.println("|                                                                        |");
		System.out.println("|   Welcome to the App You Need to Win Fashion Week!                     |");
		System.out.println("|                                                                        |");
		System.out.println("| 1. Login                                                               |");
		System.out.println("| 2. Visitor                                                             |");
		System.out.println("| 3. Register                                                            |");
		System.out.println("+========================================================================+\n");
		
		optionLogin = inputScanner.nextInt();
		switch(optionLogin){
		case 1:
			MenuLogin();
			break;
		case 2:
			printFestivals();
			break;
		case 3:
			Scanner scn = new Scanner(System.in);
	        System.out.print("Userame: ");
	        String username = scn.nextLine();
	        System.out.print("Password: ");
	        String password = scn.nextLine();
	        while(password.length() != 6){
	        	System.out.print("Password must have 6 characters.\n");
	        	System.out.print("Password: ");
	 	        password = scn.nextLine();
	        }
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
			break;
			default:
				printInvalidOption();
				break;
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
					System.out.println("Login done with success!\n");
					UserName = optionUsername;
					MenuLoggado(UserName);
			}
		 }
		 System.out.println("User not found!\n"
		 					+ "Please try doing login again with a valid user/password or register yourself.");
		 printMenuInitial();
	}
			
	private static void MenuLoggado(String UserName){
					System.out.println("Welcome back "+UserName +"\n");
					System.out.println("\n+========================================================================+");
					System.out.println("|                                                                        |");
					System.out.println("|                                                                        |");
				    System.out.println("|                          FASHIONS_SHOWS  APP                           |");
					System.out.println("| 1. My Profile                                                          |");
					System.out.println("| 2. All Festivals                                                       |");
					System.out.println("| 0. Exit                                                                |");
					System.out.println("| 9. Home Menu                                                           |");
					System.out.println("+========================================================================+\n");
					
					optionProfile = inputScanner.nextInt();
					switch(optionProfile){
					case 1:
						MenuProfile(UserName);
						break;
					case 2:
						printFestivals();
						break;
					case 0:
						System.exit(0);
						break;
					case 9:
						printMenuInitial();
						break;
					default:
						printInvalidOption();
						break;
				}
	}
	
	private static void MenuProfile(String UserName){
		System.out.println("\n+===========================FASHIONS_SHOWS APP===========================+");
		System.out.println("|                                                                        |");
	    System.out.println("|                              My Profile                                |");
		System.out.println("| 1. My Events                                                           |");
		System.out.println("| 2. My Favorite Designers                                               |");
		System.out.println("| 3. My Favorite Models                                                  |");
		System.out.println("| 4. Add Event                                                           |");
		System.out.println("| 5. Add Designer 					                                     |");
		System.out.println("| 6. Add Model  		                                                 |");
		System.out.println("| 0. Exit                                                                |");
		System.out.println("| 9. Home Menu                                                           |");
		System.out.println("+========================================================================+\n");
		optionP = inputScanner.nextInt();
		
		switch(optionP){
		case 1:
			System.out.println("My Events: \n");
			Iterator<FashionUser> iterator = TestApp.getUsers().iterator();
			 while(iterator.hasNext()) {
				 FashionUser setUser = iterator.next();
				 if(setUser.getUsername().equals(UserName)){
					 Iterator<Event> iteratorE = setUser.getEvents().iterator();
					 while(iteratorE.hasNext()) {
						 Event setEvent = iteratorE.next();
						 System.out.println(setEvent.printEvent());
						 
			 }
		}
		}
			 MenuProfile(UserName);
			break;
		case 2:
			System.out.println("My favorite Designers: \n");
			Iterator<FashionUser> iterator2 = TestApp.getUsers().iterator();
			 while(iterator2.hasNext()) {
				 FashionUser setUser = iterator2.next();
				 if(setUser.getUsername().equals(UserName)){
					 Iterator<Designer> iteratorE = setUser.getDesigners().iterator();
					 while(iteratorE.hasNext()) {
						 Designer setEvent = iteratorE.next();
						 System.out.println(setEvent.printDesigner());
			 }
		}
				
		}
			 MenuProfile(UserName);
			break;
		case 3:
			System.out.println("My favorite Models: \n");
			Iterator<FashionUser> iterator3 = TestApp.getUsers().iterator();
			 while(iterator3.hasNext()) {
				 FashionUser setUser = iterator3.next();
				 if(setUser.getUsername().equals(UserName)){
					 Iterator<Model> iteratorE = setUser.getModels().iterator();
					 while(iteratorE.hasNext()) {
						 Model setEvent = iteratorE.next();
						 System.out.println(setEvent.printModel());
					 }
				 }
				
			 }
			 MenuProfile(UserName);
			break;
		case 4:
			System.out.println("List of the Events of the App:\n");
			 for(int i = 1; i <= Tests.getEvents().size(); i++){
				 Event setElementE = ((Event) Utils.get(Tests.getEvents(), i));
				 System.out.println(i);
				 System.out.println(setElementE.printEvent());
			 }
			 
			Iterator<FashionUser> iterator4 = TestApp.getUsers().iterator();
			 while(iterator4.hasNext()) {
				 FashionUser setUser = iterator4.next();
				 if(setUser.getUsername().equals(UserName)){
					 System.out.println("Select the Event:\n");
					 
					 int optionAddEvent;
					 optionAddEvent = inputScanner.nextInt();
					 
					 Event ev = ((Event) Utils.get(Tests.getEvents(), optionAddEvent));
					 setUser.insertEvent(ev);
					 MenuProfile(UserName);
				 }
			 }
			break;
		case 5:
			System.out.println("List of the Designers of the App:\n");
			 for(int i = 1; i <= Tests.getDesigners().size(); i++){
				 Designer setElementE = ((Designer) Utils.get(Tests.getDesigners(), i));
				 System.out.println(i);
				 System.out.println(setElementE.printDesigner());
			 }
			 
			Iterator<FashionUser> iterator5 = TestApp.getUsers().iterator();
			 while(iterator5.hasNext()) {
				 FashionUser setUser = iterator5.next();
				 if(setUser.getUsername().equals(UserName)){
					 System.out.println("Select the Designer:\n");
					 
					 int optionAddEvent;
					 optionAddEvent = inputScanner.nextInt();
					 
					 Designer ev = ((Designer) Utils.get(Tests.getDesigners(), optionAddEvent));
					 setUser.insertDesigner(ev);
					 MenuProfile(UserName);
				 }
			 }
			break;
		case 6:
			System.out.println("List of the Models of the App:\n");
			 for(int i = 1; i <= Tests.getModels().size(); i++){
				 Model setElementE = ((Model) Utils.get(Tests.getModels(), i));
				 System.out.println(i);
				 System.out.println(setElementE.printModel());
			 }
			 
			Iterator<FashionUser> iterator6 = TestApp.getUsers().iterator();
			 while(iterator6.hasNext()) {
				 FashionUser setUser = iterator6.next();
				 if(setUser.getUsername().equals(UserName)){
					 System.out.println("Select the Model:\n");
					 
					 int optionAddEvent;
					 optionAddEvent = inputScanner.nextInt();
					 
					 Model ev = ((Model) Utils.get(Tests.getModels(), optionAddEvent));
					 setUser.insertModel(ev);
					 MenuProfile(UserName);
				 }
			 }
			break;
		case 0:
			System.exit(0);
			break;
		case 9:
			printMenuInitial();
			break;
		default:
		printInvalidOption();
		break;
	}
	}	
	private static void MenuEvents(){
	//print all Events of the app
		 System.out.println("List of the Events of the App:\n");
		 for(int i = 1; i < Tests.getEvents().size(); i++){
			 Event setElementE = ((Event) Utils.get(Tests.getEvents(), i));
			 System.out.println(i);
			 System.out.println(setElementE.printEvent());
		 }
		 System.out.println("Select the Event:\n");
		 
		 
	}
	
	private static void printFestivals(){
		System.out.println("\n+===========================FASHIONS_SHOWS APP===========================+");
		System.out.println("|                                                                        |");
		System.out.println("|   List of fashion festivals happening now:                             |");
		System.out.println("|                                                                        |");
		System.out.println("+========================================================================+\n");
		TestApp.getFestivalsNames();
		System.out.println("Please select a Festival number to get more information about\n");
		optionFestival = inputScanner.nextInt();
		System.out.println(TestApp.getFestival(optionFestival).printFashionFestival());
		System.out.println(TestApp.getFestivals().size());
		if(optionFestival > TestApp.getFestivals().size() && optionFestival != 9 && optionFestival != 0){
			printInvalidOption();
			printFestivals();
		}
		else{
			printMenuFestival(optionFestival);
		}
	}
	
	private static void printMenuFestival(int optionFestival){
		System.out.println("\n+===========================FASHIONS_SHOWS APP===========================+");
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
		System.out.println("\n+===========================FASHIONS_SHOWS APP===========================+");
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
		System.out.println("\n+===========================FASHIONS_SHOWS APP===========================+");
		System.out.println("| 0. Exit                                                                |");
		System.out.println("| 9. Home Menu                                                           |");
		System.out.println("+========================================================================+\n");
		optionExit = inputScanner.nextInt();
		if(optionExit == 0){
			System.exit(0);
		}
		if(optionExit == 9){
			printMenuInitial();
		}
	}
	
	public static void printInvalidOption(){
		
		System.out.println("\n+===========================FASHIONS_SHOWS APP===========================+");
		System.out.println("|                                                                        |");
		System.out.println("|                            Invalid Option!                             |");
		System.out.println("|                                                                        |");
		System.out.println("| Please choose a valid option number.                                   |");
		System.out.println("+========================================================================+\n");
	}
	
	
	public static void main(String[] args) {
		TestApp.printTests();
		
		printMenuInitial();
	}

}
