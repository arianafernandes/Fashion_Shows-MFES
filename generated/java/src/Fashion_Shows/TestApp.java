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
  private static VDMSeq modelsTemp = SeqUtil.seq();
  private static VDMSeq designersTemp = SeqUtil.seq();
  private static FashionFestival festivalTemp = new FashionFestival();

  public static void printTests() {

    IO.print("\nExecuting Tests.vdmpp operations...\n");
    new Tests().run();
  }

  public static void printFestivalsName() {

    IO.print("\nPrint Festivals");
    long toVar_1 = Tests.getFestivals().size();

    for (Long counter = 1L; counter <= toVar_1; counter++) {
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

  public static void printEventsName() {

    IO.print("\nPrint Events");
    long toVar_2 = Tests.getEvents().size();

    for (Long counter = 1L; counter <= toVar_2; counter++) {
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

    long toVar_3 = ((FashionFestival) Utils.get(Tests.getFestivals(), num)).getEvents().size();

    for (Long counter = 1L; counter <= toVar_3; counter++) {
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
    long toVar_4 = ((FashionFestival) Utils.get(Tests.getFestivals(), num)).getEvents().size();

    for (Long counter = 1L; counter <= toVar_4; counter++) {
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

  public static void getModelsNameByEvent(final Number optionFestival, final Number optionEvent) {

    IO.print("\n");
    long toVar_5 =
        ((Event) Utils.get(getEventsByFestival2(optionFestival), optionEvent)).getModels().size();

    for (Long counter = 1L; counter <= toVar_5; counter++) {
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

  public static VDMSeq getModelsNameByEvent2(
      final Number optionFestival, final Number optionEvent) {

    festivalTemp = ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival));
    long toVar_6 = ((Event) Utils.get(festivalTemp.getEvents(), optionEvent)).getModels().size();

    for (Long counter = 1L; counter <= toVar_6; counter++) {
      modelsTemp =
          SeqUtil.conc(
              Utils.copy(TestApp.modelsTemp),
              SeqUtil.seq(
                  ((Model)
                      Utils.get(
                          ((Event) Utils.get(festivalTemp.getEvents(), optionEvent)).getModels(),
                          counter))));
    }
    return Utils.copy(TestApp.modelsTemp);
  }

  public static void getModelInf(
      final Number optionFestival, final Number optionEvent, final Number optionModel) {

    festivalTemp = ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival));
    IO.print("Name: ");
    IO.print(
        ((Model) Utils.get(getModelsNameByEvent2(optionFestival, optionEvent), optionModel))
            .getName());
    IO.print("\n");
    IO.print("Age: ");
    IO.print(
        ((Model) Utils.get(getModelsNameByEvent2(optionFestival, optionEvent), optionModel))
            .getAge());
    IO.print("\n");
    IO.print("Nationality: ");
    IO.print(
        ((Model) Utils.get(getModelsNameByEvent2(optionFestival, optionEvent), optionModel))
            .getNationality());
    IO.print("\n");
    IO.print("Address: ");
    IO.print(
        ((Model) Utils.get(getModelsNameByEvent2(optionFestival, optionEvent), optionModel))
            .getAddress());
    IO.print("\n");
    IO.print("\n");
  }

  public static VDMSeq getDesginersNameByEvent2(
      final Number optionFestival, final Number optionEvent) {

    festivalTemp = ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival));
    long toVar_7 = ((Event) Utils.get(festivalTemp.getEvents(), optionEvent)).getDesigners().size();

    for (Long counter = 1L; counter <= toVar_7; counter++) {
      designersTemp =
          SeqUtil.conc(
              Utils.copy(TestApp.designersTemp),
              SeqUtil.seq(
                  ((Designer)
                      Utils.get(
                          ((Event) Utils.get(festivalTemp.getEvents(), optionEvent)).getDesigners(),
                          counter))));
    }
    return Utils.copy(TestApp.designersTemp);
  }

  public static void getDesignersNameByEvent(
      final Number optionFestival, final Number optionEvent) {

    IO.print("\n");
    long toVar_8 =
        ((Event) Utils.get(getEventsByFestival2(optionFestival), optionEvent))
            .getDesigners()
            .size();

    for (Long counter = 1L; counter <= toVar_8; counter++) {
      IO.print(counter);
      IO.print(": ");
      IO.print(
          ((Designer)
                  Utils.get(
                      ((Event) Utils.get(getEventsByFestival2(optionFestival), optionEvent))
                          .getDesigners(),
                      counter))
              .getName());
      IO.print("\n");
    }
  }

  public static void getDesignerInf(
      final Number optionFestival, final Number optionEvent, final Number optionDesigner) {

    festivalTemp = ((FashionFestival) Utils.get(Tests.getFestivals(), optionFestival));
    IO.print("Name: ");
    IO.print(
        ((Designer)
                Utils.get(getDesginersNameByEvent2(optionFestival, optionEvent), optionDesigner))
            .getName());
    IO.print("\n");
    IO.print("Age: ");
    IO.print(
        ((Designer)
                Utils.get(getDesginersNameByEvent2(optionFestival, optionEvent), optionDesigner))
            .getAge());
    IO.print("\n");
    IO.print("Nationality: ");
    IO.print(
        ((Designer)
                Utils.get(getDesginersNameByEvent2(optionFestival, optionEvent), optionDesigner))
            .getNationality());
    IO.print("\n");
    IO.print("Address: ");
    IO.print(
        ((Designer)
                Utils.get(getDesginersNameByEvent2(optionFestival, optionEvent), optionDesigner))
            .getAddress());
    IO.print("\n");
    IO.print("Style: ");
    IO.print(
        ((Designer)
                Utils.get(getDesginersNameByEvent2(optionFestival, optionEvent), optionDesigner))
            .getStyle());
    IO.print("\n");
    IO.print("\n");
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
        + "}";
  }
}
