package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestApp {
  private static VDMSeq festivals = SeqUtil.seq();
  private static VDMSeq events = SeqUtil.seq();
  private static VDMSeq designers = SeqUtil.seq();
  private static VDMSeq models = SeqUtil.seq();
  private static VDMSeq users = SeqUtil.seq();

  public static void printTests() {

    IO.print("\nExecuting Tests.vdmpp operations...\n");
    new Tests().run();
  }

  public static void printFestivals() {

    IO.print("\nPrint Festivals");
    long toVar_4 = Tests.getFestivals().size();

    for (Long counter = 1L; counter <= toVar_4; counter++) {
      IO.print("\n");
      IO.print("Event Name: ");
      IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), counter)).getName());
      IO.print("\n");
      IO.print("Local: ");
      IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), counter)).getLocal());
    }
  }

  public static void printEvents() {

    IO.print("\nPrint Events");
    long toVar_5 = Tests.getEvents().size();

    for (Long counter = 1L; counter <= toVar_5; counter++) {
      IO.print("\n");
      IO.print("Event Name: ");
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getName());
      IO.print("\n");
      IO.print("Local: ");
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getLocal());
    }
  }

  public static void printDesigners() {

    IO.print("\nPrint Designers");
    long toVar_6 = Tests.getDesigners().size();

    for (Long counter = 1L; counter <= toVar_6; counter++) {
      IO.print("\n");
      IO.print("Designer Name: ");
      IO.print(((Designer) Utils.get(Tests.getDesigners(), counter)).getName());
      IO.print("\n");
      IO.print("Age: ");
      IO.print(((Designer) Utils.get(Tests.getDesigners(), counter)).getAge());
    }
  }

  public static void printModels() {

    IO.print("\nPrint Models");
    long toVar_7 = Tests.getModels().size();

    for (Long counter = 1L; counter <= toVar_7; counter++) {
      IO.print("\n");
      IO.print("Model Name: ");
      IO.print(((Model) Utils.get(Tests.getModels(), counter)).getName());
      IO.print("\n");
      IO.print("Age: ");
      IO.print(((Model) Utils.get(Tests.getModels(), counter)).getAge());
    }
  }

  public static void printUsers() {

    IO.print("\nPrint Users");
    long toVar_8 = Tests.getUsers().size();

    for (Long counter = 1L; counter <= toVar_8; counter++) {
      IO.print("\n");
      IO.print("User Name: ");
      IO.print(((FashionUser) Utils.get(Tests.getUsers(), counter)).getName());
      IO.print("\n");
      IO.print("Age: ");
      IO.print(((FashionUser) Utils.get(Tests.getUsers(), counter)).getAge());
    }
  }

  public static void main() {

    printTests();
    printFestivals();
    printEvents();
    printModels();
    printDesigners();
    printUsers();
  }

  public TestApp() {}

  public String toString() {

    return "TestApp{"
        + "festivals := "
        + Utils.toString(festivals)
        + ", events := "
        + Utils.toString(events)
        + ", designers := "
        + Utils.toString(designers)
        + ", models := "
        + Utils.toString(models)
        + ", users := "
        + Utils.toString(users)
        + "}";
  }
}
