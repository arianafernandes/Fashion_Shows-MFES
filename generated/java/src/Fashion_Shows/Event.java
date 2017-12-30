package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Event {
  public String name = "";
  public String date = "";
  public String local = "";
  public String time = "";
  public String duration = "";
  public String theme = "";
  public String gender = "";
  public String collection = "";
  public String output = "";
  private VDMSeq runways = SeqUtil.seq();

  public void cg_init_Event_1(
      final String nm,
      final String dt,
      final String lc,
      final String hr,
      final String dr,
      final String tm,
      final String gr,
      final String cl) {

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
      final String hr,
      final String dr,
      final String tm,
      final String gr,
      final String cl) {

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

  public String getTime() {

    return time;
  }

  public String getDuration() {

    return duration;
  }

  public String getTheme() {

    return theme;
  }

  public String getGender() {

    return gender;
  }

  public String getCollection() {

    return collection;
  }

  public VDMSeq getRunways() {

    return Utils.copy(runways);
  }

  public Number getNumberRunways() {

    return runways.size();
  }

  public void insertRunway(final Runway r) {

    runways = SeqUtil.conc(Utils.copy(runways), SeqUtil.seq(r));
  }

  public String printEvent() {

    output =
        "Event Name: "
            + name
            + "\n"
            + "Date: "
            + date
            + "\n"
            + "Time: "
            + time
            + "\n"
            + "Theme: "
            + theme
            + "\n"
            + "Gender: "
            + gender
            + "\n"
            + "Collection: "
            + collection
            + "\n";
    return output;
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
        + ", output := "
        + Utils.toString(output)
        + ", runways := "
        + Utils.toString(runways)
        + "}";
  }
}
