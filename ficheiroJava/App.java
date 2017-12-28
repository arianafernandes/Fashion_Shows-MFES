package Fashion_Shows;

import java.util.Scanner;
import org.overture.codegen.runtime.*;

public class App {

	private static Scanner inputScanner = new Scanner(System.in);
	private static void printMenuInitial()
	{
	  
	  int option;
	  
		System.out.println("\n+===========================+");
		System.out.println("|    FASHIONS_SHOWS  APP    |");
		System.out.println("+===========================+\n");
		
		System.out.println("1. List All Events");
		System.out.println("\nPlease select one option:");
		option = inputScanner.nextInt();
		if(option == 1)
		{
			TestApp.printEvents();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestApp.printTests();
		printMenuInitial();
	}

}
