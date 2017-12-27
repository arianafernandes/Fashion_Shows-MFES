package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Event {
  public String name;
  public String date;
  public String local;
  public Number time;
  public Number duration;
  public String theme;
  public Object gender;
  public Object collection;
  private VDMSet designers = SetUtil.set();
  private Number numberDesigners = 0L;
  private VDMSet models = SetUtil.set();
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

  public void insertDesigner(final String designerName) {

    numberDesigners = numberDesigners.longValue() + 1L;
    designers = SetUtil.union(Utils.copy(designers), SetUtil.set(designerName));
  }

  public void removeDesigner(final String designerName) {

    designers = SetUtil.diff(Utils.copy(designers), SetUtil.set(designerName));
    numberDesigners = numberDesigners.longValue() - 1L;
  }

  public Number getNumberDesigners() {

    return numberDesigners;
  }

  public void insertModel(final String modelName) {

    numberModels = numberModels.longValue() + 1L;
    models = SetUtil.union(Utils.copy(models), SetUtil.set(modelName));
  }

  public void removeModel(final String modelName) {

    models = SetUtil.diff(Utils.copy(models), SetUtil.set(modelName));
    numberModels = numberModels.longValue() - 1L;
  }

  public Number getNumberModels() {

    return numberModels;
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
