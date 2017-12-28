package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class FashionUser {
  public String name;
  public Number age;
  public Object gender;
  private VDMSet favDesigners = SetUtil.set();
  private Number numberFavDesigners = 0L;
  private VDMSet events = SetUtil.set();
  private Number numberEvents = 0L;

  public void cg_init_FashionUser_1(final String nm, final Number ag, final Object gr) {

    name = nm;
    age = ag;
    gender = gr;
    return;
  }

  public FashionUser(final String nm, final Number ag, final Object gr) {

    cg_init_FashionUser_1(nm, ag, gr);
  }

  public String getName() {

    return name;
  }

  public Number getAge() {

    return age;
  }

  public Object getGender() {

    return gender;
  }

  public void insertDesigner(final String designerName) {

    numberFavDesigners = numberFavDesigners.longValue() + 1L;
    favDesigners = SetUtil.union(Utils.copy(favDesigners), SetUtil.set(designerName));
  }

  public void removeDesigner(final String designerName) {

    favDesigners = SetUtil.diff(Utils.copy(favDesigners), SetUtil.set(designerName));
    numberFavDesigners = numberFavDesigners.longValue() - 1L;
  }

  public Number getNumberFavDesigners() {

    return numberFavDesigners;
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

  public FashionUser() {}

  public String toString() {

    return "FashionUser{"
        + "name := "
        + Utils.toString(name)
        + ", age := "
        + Utils.toString(age)
        + ", gender := "
        + Utils.toString(gender)
        + ", favDesigners := "
        + Utils.toString(favDesigners)
        + ", numberFavDesigners := "
        + Utils.toString(numberFavDesigners)
        + ", events := "
        + Utils.toString(events)
        + ", numberEvents := "
        + Utils.toString(numberEvents)
        + "}";
  }
}
