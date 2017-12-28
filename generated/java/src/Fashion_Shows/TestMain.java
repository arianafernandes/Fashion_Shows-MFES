package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;
import java.util.Scanner;

import Fashion_Shows.Tests;
import Fashion_Shows.Event;

@SuppressWarnings("all")
public class TestMain {
	
	private static Scanner inputScanner = new Scanner(System.in);
	
  public static void printTests() {

    IO.print("\nExecuting Tests.vdmpp operations...\n");
    new Tests().run();
  }

  public static void main(String[] args) {
	  
	  final Event allEvents = new Event("BaixaShow",
	            "04/05/2018",
	            "Baixa",
	            12L,
	            60L,
	            "flores",
	            Fashion_Shows.quotes.HomemQuote.getInstance(),
	            Fashion_Shows.quotes.Primavera_VeraoQuote.getInstance());
	  
    printTests();
    printMenuInitial(allEvents);
  }

  public TestMain() {}

  public String toString() {

    return "TestMain{}";
  }
  
  private static void printMenuInitial(final Event allEvents)
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
			allEvents.printEvent();
		}
	}
}
