package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestApp {
  private static VDMSeq festivals = SeqUtil.seq();
  private static VDMSeq events = SeqUtil.seq();
  private static VDMSeq designers = SeqUtil.seq();
  private static VDMSeq models = SeqUtil.seq();
  private static VDMSet users = SetUtil.set();
  private static VDMSeq eventsTemp = SeqUtil.seq();
  private static VDMSeq modelsTemp = SeqUtil.seq();
  private static VDMSeq designersTemp = SeqUtil.seq();
  private static FashionFestival festivalTemp = new FashionFestival();
  private static VDMSeq runwaysTemp = SeqUtil.seq();

  public static void printTests() {

    IO.print("Executing Tests.vdmpp operations...");
    new Tests().run();
  }

  public static VDMSet getUsers() {

    return Tests.getAppUsers();
  }

  public static void registerUser(
      final String username, final String password, final String name, final String age) {

    Tests.setAppUser(username, password, name, age);
  }

  public static VDMSeq getFestivals() {

    return Tests.getFestivals();
  }

  public static void getFestivalsNames() {

    long toVar_1 = Tests.getFestivals().size();

    for (Long counter = 1L; counter <= toVar_1; counter++) {
      IO.print("\n");
      IO.print(counter);
      IO.print(((FashionFestival) Utils.get(Tests.getFestivals(), counter)).getName());
      IO.print("\n");
      IO.print("\n");
    }
  }

  public static FashionFestival getFestival(final Number optionFestival) {

    return ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival));
  }

  public static VDMSeq getFestivalEvents(final Number optionFestival) {

    return ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival)).getEvents();
  }

  public static VDMSet getFestivalUsers(final Number optionFestival) {

    return ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival)).getFashionUsers();
  }

  public static void getFestivalEventsNames(final Number optionFestival) {

    IO.print("\"n\"");
    long toVar_2 =
        ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival)).getEvents().size();

    for (Long counter = 1L; counter <= toVar_2; counter++) {
      IO.print(counter);
      IO.print(": ");
      IO.print(
          ((Event)
                  Utils.get(
                      ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival))
                          .getEvents(),
                      counter))
              .getName());
      IO.print("\n");
    }
  }

  public static Event getEvent(final Number optionFestival, final Number optionEvent) {

    return ((Event) Utils.get(getFestivalEvents(optionFestival), optionEvent));
  }

  public static VDMSeq getRunwaysByEvent(final Number optionFestival, final Number optionEvent) {

    return ((Event) Utils.get(getFestivalEvents(optionFestival), optionEvent)).getRunways();
  }

  public static void getRunwaysNames(final Number optionFestival, final Number optionEvent) {

    IO.print("\n");
    long toVar_3 = getRunwaysByEvent(optionFestival, optionEvent).size();

    for (Long counter = 1L; counter <= toVar_3; counter++) {
      IO.print(counter);
      IO.print(": ");
      IO.print(
          ((Runway) Utils.get(getRunwaysByEvent(optionFestival, optionEvent), counter)).getName());
      IO.print("\n");
    }
  }

  public static Runway getOneRunwayByEvent(
      final Number optionFestival, final Number optionEvent, final Number optionRunWay) {

    return ((Runway) Utils.get(getRunwaysByEvent(optionFestival, optionEvent), optionRunWay));
  }

  public static VDMSeq getModelsByRunway(
      final Number optionFestival, final Number optionEvent, final Number optionRunWay) {

    return getOneRunwayByEvent(optionFestival, optionEvent, optionRunWay).getModels();
  }

  public static VDMSet getDesignersByRunway(
      final Number optionFestival, final Number optionEvent, final Number optionRunWay) {

    return getOneRunwayByEvent(optionFestival, optionEvent, optionRunWay).getDesigners();
  }

  public static void main() {

    printTests();
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
        + ", modelsTemp := "
        + Utils.toString(modelsTemp)
        + ", designersTemp := "
        + Utils.toString(designersTemp)
        + ", festivalTemp := "
        + Utils.toString(festivalTemp)
        + ", runwaysTemp := "
        + Utils.toString(runwaysTemp)
        + "}";
  }
}
