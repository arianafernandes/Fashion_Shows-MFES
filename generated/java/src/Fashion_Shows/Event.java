package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Event {
  public String name = "";
  public String date = "";
  public String local = "";
  public Number time = 0L;
  public Number duration = 0L;
  public String theme = "";
  public Object gender = Fashion_Shows.quotes.HomemQuote.getInstance();
  public Object collection = Fashion_Shows.quotes.Outono_InvernoQuote.getInstance();
  private VDMSeq runways = SeqUtil.seq();

  public void cg_init_Event_1(
      final String nm,
      final String dt,
      final String lc,
      final Number hr,
      final Number dr,
      final String tm,
      final Object gr,
      final Object cl) {

    name = nm;
    date = dt;
    local = lc;
    time = hr;
    duration = dr;
    theme = tm;
    gender = gr;
    collection = cl;
    return;
  }

  public Event(
      final String nm,
      final String dt,
      final String lc,
      final Number hr,
      final Number dr,
      final String tm,
      final Object gr,
      final Object cl) {

    cg_init_Event_1(nm, dt, lc, hr, dr, tm, gr, cl);
  }

  public String getName() {

    return name;
  }

  public String getDate() {

    return date;
  }

  public String getLocal() {

    return local;
  }

  public Number getTime() {

    return time;
  }

  public Number getDuration() {

    return duration;
  }

  public String getTheme() {

    return theme;
  }

  public Object getGender() {

    return gender;
  }

  public Object getCollection() {

    return collection;
  }

  public VDMSeq getRunways() {

    return Utils.copy(runways);
  }

  public void insertRunway(final Runway r) {

    runways = SeqUtil.conc(Utils.copy(runways), SeqUtil.seq(r));
  }

  public void printEvent() {

    IO.print("Event Name: ");
    IO.print(name);
    IO.print("\n");
    IO.print("Date: ");
    IO.print(date);
    IO.print("\n");
    IO.print("Time: ");
    IO.print(time);
    IO.print("\n");
    IO.print("Theme: ");
    IO.print(theme);
    IO.print("\n");
    IO.print("Gender: ");
    IO.print(((Object) gender));
    IO.print("\n");
    IO.print("Collection: ");
    IO.print(((Object) collection));
    IO.print("\n");
  }

  public Event() {}

  public String toString() {

    return "Event{"
        + "name := "
        + Utils.toString(name)
        + ", date := "
        + Utils.toString(date)
        + ", local := "
        + Utils.toString(local)
        + ", time := "
        + Utils.toString(time)
        + ", duration := "
        + Utils.toString(duration)
        + ", theme := "
        + Utils.toString(theme)
        + ", gender := "
        + Utils.toString(gender)
        + ", collection := "
        + Utils.toString(collection)
        + ", runways := "
        + Utils.toString(runways)
        + "}";
  }
}
