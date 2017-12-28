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
  private static VDMSeq eventsTemp = SeqUtil.seq();

  public static void printTests() {

    IO.print("\nExecuting Tests.vdmpp operations...\n");
    new Tests().run();
  }

  public static void printFestivals() {

    IO.print("\nPrint Festivals");
    long toVar_4 = Tests.getFestivals().size();

    for (Long counter = 1L; counter <= toVar_4; counter++) {
      IO.print("\n");
      IO.print("Festival Name: ");
      IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), counter)).getName());
      IO.print("\n");
      IO.print("Date Begin: ");
      IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), counter)).getDateBegin());
      IO.print("\n");
      IO.print("Date End: ");
      IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), counter)).getDateEnd());
      IO.print("\n");
      IO.print("Local: ");
      IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), counter)).getLocal());
      IO.print("\n");
      IO.print("\n");
    }
  }

  public static void printFestivalsName() {

    IO.print("\nPrint Festivals");
    long toVar_5 = Tests.getFestivals().size();

    for (Long counter = 1L; counter <= toVar_5; counter++) {
      IO.print("\n");
      IO.print(counter);
      IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), counter)).getName());
      IO.print("\n");
      IO.print("\n");
    }
  }

  public static void getFestivalInf(final Number num) {

    IO.print("\n");
    IO.print("Festival Name: ");
    IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), num)).getName());
    IO.print("\n");
    IO.print("Date Begin: ");
    IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), num)).getDateBegin());
    IO.print("\n");
    IO.print("Date End: ");
    IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), num)).getDateEnd());
    IO.print("\n");
    IO.print("Local: ");
    IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), num)).getLocal());
    IO.print("\n");
    IO.print("\n");
  }

  public static void printEvents() {

    IO.print("Events List: \n");
    long toVar_6 = Tests.getEvents().size();

    for (Long counter = 1L; counter <= toVar_6; counter++) {
      IO.print("Event ");
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getName());
      IO.print("\n");
      IO.print("Date: ");
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getDate());
      IO.print("\n");
      IO.print("Local: ");
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getLocal());
      IO.print("\n");
      IO.print("Time: ");
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getTime());
      IO.print("\n");
      IO.print("Duration: ");
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getDuration());
      IO.print("\n");
      IO.print("Theme: ");
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getTheme());
      IO.print("\n");
      IO.print("Gender: ");
      IO.print(((Object) ((Event) Utils.get(Tests.getEvents(), counter)).getGender()));
      IO.print("\n");
      IO.print("Collection: ");
      IO.print(((Object) ((Event) Utils.get(Tests.getEvents(), counter)).getCollection()));
      IO.print("\n");
      IO.print("\n");
    }
  }

  public static void printEventsName() {

    IO.print("\nPrint Events");
    long toVar_7 = Tests.getEvents().size();

    for (Long counter = 1L; counter <= toVar_7; counter++) {
      IO.print("\n");
      IO.print(counter);
      IO.print(((Event) Utils.get(Tests.getEvents(), counter)).getName());
      IO.print("\n");
      IO.print("\n");
    }
  }

  public static void getEventInf(final Number optionFestiavl, final Number optionEvent) {

    IO.print("Event ");
    IO.print(((Event) Utils.get(getEventsByFestival2(optionFestiavl), optionEvent)).getName());
    IO.print("\n");
    IO.print("Date: ");
    IO.print(((Event) Utils.get(getEventsByFestival2(optionFestiavl), optionEvent)).getDate());
    IO.print("\n");
    IO.print("Local: ");
    IO.print(((Event) Utils.get(getEventsByFestival2(optionFestiavl), optionEvent)).getLocal());
    IO.print("\n");
    IO.print("Time: ");
    IO.print(((Event) Utils.get(getEventsByFestival2(optionFestiavl), optionEvent)).getTime());
    IO.print("h\n");
    IO.print("Duration: ");
    IO.print(((Event) Utils.get(getEventsByFestival2(optionFestiavl), optionEvent)).getDuration());
    IO.print("h\n");
    IO.print("Theme: ");
    IO.print(((Event) Utils.get(getEventsByFestival2(optionFestiavl), optionEvent)).getTheme());
    IO.print("\n");
    IO.print("Gender: ");
    IO.print(
        ((Object)
            ((Event) Utils.get(getEventsByFestival2(optionFestiavl), optionEvent)).getGender()));
    IO.print("\n");
    IO.print("Collection: ");
    IO.print(
        ((Object)
            ((Event) Utils.get(getEventsByFestival2(optionFestiavl), optionEvent))
                .getCollection()));
    IO.print("\n");
    IO.print("\n");
  }

  public static VDMSeq getEventsByFestival2(final Number num) {

    long toVar_8 = ((FashionFestival) Utils.get(Tests.getFestivals(), num)).getEvents().size();

    for (Long counter = 1L; counter <= toVar_8; counter++) {
      eventsTemp =
          SeqUtil.conc(
              Utils.copy(TestApp.eventsTemp),
              SeqUtil.seq(
                  ((Event)
                      Utils.get(
                          ((FashionFestival) Utils.get(Tests.getFestivals(), num)).getEvents(),
                          counter))));
    }
    return Utils.copy(TestApp.eventsTemp);
  }

  public static void getEventsByFestival(final Number num) {

    IO.print("\n");
    long toVar_9 = ((FashionFestival) Utils.get(Tests.getFestivals(), num)).getEvents().size();

    for (Long counter = 1L; counter <= toVar_9; counter++) {
      IO.print(counter);
      IO.print(": ");
      IO.print(
          ((Event)
                  Utils.get(
                      ((FashionFestival) Utils.get(Tests.getFestivals(), num)).getEvents(),
                      counter))
              .getName());
      IO.print("\n");
    }
  }

  public static void printDesigners() {

    IO.print("Designers List:");
    long toVar_10 = Tests.getDesigners().size();

    for (Long counter = 1L; counter <= toVar_10; counter++) {
      IO.print("\n");
      IO.print("Designer Name: ");
      IO.print(((Designer) Utils.get(Tests.getDesigners(), counter)).getName());
      IO.print("\n");
      IO.print("Age: ");
      IO.print(((Designer) Utils.get(Tests.getDesigners(), counter)).getAge());
      IO.print("\n");
      IO.print("Nationality: ");
      IO.print(((Designer) Utils.get(Tests.getDesigners(), counter)).getNationality());
      IO.print("\n");
      IO.print("Address: ");
      IO.print(((Designer) Utils.get(Tests.getDesigners(), counter)).getAddress());
      IO.print("\n");
      IO.print("Style: ");
      IO.print(((Designer) Utils.get(Tests.getDesigners(), counter)).getStyle());
      IO.print("\n");
    }
  }

  public static VDMSeq getModelsByEvent(final Number optionFestival, final Number optionEvent) {

    return ((Event) Utils.get(getEventsByFestival2(optionFestival), optionEvent)).getModels();
  }

  public static void getModelsNameByEvent(final Number optionFestival, final Number optionEvent) {

    IO.print("\n");
    long toVar_11 =
        ((Event) Utils.get(getEventsByFestival2(optionFestival), optionEvent)).getModels().size();

    for (Long counter = 1L; counter <= toVar_11; counter++) {
      IO.print(counter);
      IO.print(": ");
      IO.print(
          ((Model)
                  Utils.get(
                      ((Event) Utils.get(getEventsByFestival2(optionFestival), optionEvent))
                          .getModels(),
                      counter))
              .getName());
      IO.print("\n");
    }
  }

  public static void printModels() {

    IO.print("Models List:\n");
    long toVar_12 = Tests.getModels().size();

    for (Long counter = 1L; counter <= toVar_12; counter++) {
      IO.print("\n");
      IO.print("Designer Name: ");
      IO.print(((Model) Utils.get(Tests.getModels(), counter)).getName());
      IO.print("\n");
      IO.print("Age: ");
      IO.print(((Model) Utils.get(Tests.getModels(), counter)).getAge());
      IO.print("\n");
      IO.print("Nationality: ");
      IO.print(((Model) Utils.get(Tests.getModels(), counter)).getNationality());
      IO.print("\n");
      IO.print("Address: ");
      IO.print(((Model) Utils.get(Tests.getModels(), counter)).getAddress());
      IO.print("\n");
    }
  }

  public static void printUsers() {

    IO.print("Users List\n");
    long toVar_13 = Tests.getUsers().size();

    for (Long counter = 1L; counter <= toVar_13; counter++) {
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
        + ", eventsTemp := "
        + Utils.toString(eventsTemp)
        + "}";
  }
}
