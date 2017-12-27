package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class FashionFestival {
  public String name;
  public String dateBegin;
  public String dateEnd;
  public String local;
  private VDMSet events = SetUtil.set();
  private Number numberEvents = 0L;
  private VDMSet designers = SetUtil.set();
  private Number numberDesigners = 0L;

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

  public void insertEvent(final String eventName) {

    numberEvents = numberEvents.longValue() + 1L;
    events = SetUtil.union(Utils.copy(events), SetUtil.set(eventName));
  }

  public void removeEvent(final String eventName) {

    events = SetUtil.diff(Utils.copy(events), SetUtil.set(eventName));
    numberEvents = numberEvents.longValue() - 1L;
  }

  public Number getNumberEvents() {

    return numberEvents;
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
        + ", designers := "
        + Utils.toString(designers)
        + ", numberDesigners := "
        + Utils.toString(numberDesigners)
        + "}";
  }
}
