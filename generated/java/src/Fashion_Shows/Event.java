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
  private VDMSeq designers = SeqUtil.seq();
  private Number numberDesigners = 0L;
  private VDMSeq models = SeqUtil.seq();
  private Number numberModels = 0L;

  public void cg_init_Event_2(
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

  public void cg_init_Event_1() {

    return;
  }

  public Event() {

    cg_init_Event_1();
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

    cg_init_Event_2(nm, dt, lc, hr, dr, tm, gr, cl);
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

  public VDMSeq getModels() {

    return Utils.copy(models);
  }

  public void insertDesigner(final Designer dg) {

    numberDesigners = numberDesigners.longValue() + 1L;
    designers = SeqUtil.conc(Utils.copy(designers), SeqUtil.seq(dg));
  }

  public Number getNumberDesigners() {

    return numberDesigners;
  }

  public void insertModel(final Model md) {

    numberModels = numberModels.longValue() + 1L;
    models = SeqUtil.conc(Utils.copy(models), SeqUtil.seq(md));
  }

  public Number getNumberModels() {

    return numberModels;
  }

  public void printEventInf() {

    IO.print("Event ");
    IO.print(name);
    IO.print("\n");
    IO.print("Date: ");
    IO.print(date);
    IO.print("\n");
    IO.print("Local: ");
    IO.print(local);
    IO.print("\n");
    IO.print("Time: ");
    IO.print(time);
    IO.print("\n");
    IO.print("Duration: ");
    IO.print(duration);
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
    IO.print("\n");
  }

  public void printDesigners() {

    IO.print("Designers list:");
    IO.print("\n");
    long toVar_1 = designers.size();

    for (Long counter = 1L; counter <= toVar_1; counter++) {
      IO.print("\n");
      IO.print("Designer Name: ");
      IO.print(((Designer) Utils.get(designers, counter)).getName());
      IO.print("\n");
      IO.print("Age: ");
      IO.print(((Designer) Utils.get(designers, counter)).getAge());
      IO.print("\n");
      IO.print("Nationality: ");
      IO.print(((Designer) Utils.get(designers, counter)).getNationality());
      IO.print("\n");
      IO.print("Address: ");
      IO.print(((Designer) Utils.get(designers, counter)).getAddress());
      IO.print("\n");
      IO.print("Style: ");
      IO.print(((Designer) Utils.get(designers, counter)).getStyle());
      IO.print("\n");
    }
  }

  public void printModels() {

    IO.print("Models list:");
    IO.print("\n");
    long toVar_2 = models.size();

    for (Long counter = 1L; counter <= toVar_2; counter++) {
      IO.print("\n");
      IO.print("Model Name: ");
      IO.print(((Model) Utils.get(models, counter)).getName());
      IO.print("\n");
      IO.print("Age: ");
      IO.print(((Model) Utils.get(models, counter)).getAge());
      IO.print("\n");
      IO.print("Nationality: ");
      IO.print(((Model) Utils.get(models, counter)).getNationality());
      IO.print("\n");
      IO.print("Address: ");
      IO.print(((Model) Utils.get(models, counter)).getAddress());
      IO.print("\n");
    }
  }

  public void printEvent() {

    printEventInf();
    printDesigners();
    printModels();
  }

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
        + ", designers := "
        + Utils.toString(designers)
        + ", numberDesigners := "
        + Utils.toString(numberDesigners)
        + ", models := "
        + Utils.toString(models)
        + ", numberModels := "
        + Utils.toString(numberModels)
        + "}";
  }
}
