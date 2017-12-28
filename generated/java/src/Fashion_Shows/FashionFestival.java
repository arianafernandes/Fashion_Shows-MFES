package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class FashionFestival {
  public String name = "";
  public String dateBegin = "";
  public String dateEnd = "";
  public String local = "";
  private VDMSeq events = SeqUtil.seq();
  private Number numberEvents = 0L;

  public void cg_init_FashionFestival_2(
      final String nm, final String di, final String df, final String lc) {

    name = nm;
    dateBegin = di;
    dateEnd = df;
    local = lc;
    return;
  }

  public void cg_init_FashionFestival_1() {

    return;
  }

  public FashionFestival() {

    cg_init_FashionFestival_1();
  }

  public FashionFestival(final String nm, final String di, final String df, final String lc) {

    cg_init_FashionFestival_2(nm, di, df, lc);
  }

  public String getName() {

    return name;
  }

  public String getDateBegin() {

    return dateBegin;
  }

  public String getDateEnd() {

    return dateEnd;
  }

  public String getLocal() {

    return local;
  }

  public VDMSeq getEvents() {

    return Utils.copy(events);
  }

  public void insertEvent(final Event ev) {

    events = SeqUtil.conc(SeqUtil.seq(ev), Utils.copy(events));
    numberEvents = numberEvents.longValue() + 1L;
  }

  public Number getNumberEvents() {

    return numberEvents;
  }

  public void printFestivalInf() {

    IO.print("Festival ");
    IO.print(name);
    IO.print("\n");
    IO.print("\n");
    IO.print("Date Begin: ");
    IO.print(dateBegin);
    IO.print("\n");
    IO.print("Date End: ");
    IO.print(dateEnd);
    IO.print("\n");
    IO.print("Local: ");
    IO.print(local);
    IO.print("\n");
    IO.print("\n");
  }

  public void printEvents() {

    IO.print("Events list:");
    IO.print("\n");
    long toVar_3 = events.size();

    for (Long counter = 1L; counter <= toVar_3; counter++) {
      IO.print("\n");
      IO.print(counter);
      IO.print(":");
      IO.print("Event Name: ");
      IO.print(((Event) Utils.get(events, counter)).getName());
      IO.print("\n");
    }
  }

  public void printFashionFestival() {

    printFestivalInf();
    printEvents();
  }

  public String toString() {

    return "FashionFestival{"
        + "name := "
        + Utils.toString(name)
        + ", dateBegin := "
        + Utils.toString(dateBegin)
        + ", dateEnd := "
        + Utils.toString(dateEnd)
        + ", local := "
        + Utils.toString(local)
        + ", events := "
        + Utils.toString(events)
        + ", numberEvents := "
        + Utils.toString(numberEvents)
        + "}";
  }
}
