package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class FashionUser {
  public String name;
  public Number age;
  public Object gender;
  private VDMSeq designers = SeqUtil.seq();
  private Number numberDesigners = 0L;
  private VDMSeq events = SeqUtil.seq();
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

  public void insertDesigner(final Designer d) {

    numberDesigners = numberDesigners.longValue() + 1L;
    designers = SeqUtil.conc(Utils.copy(designers), SeqUtil.seq(d));
  }

  public Number getNumberFavDesigners() {

    return numberDesigners;
  }

  public VDMSeq getDesigners() {

    return Utils.copy(designers);
  }

  public void insertEvent(final Event ev) {

    numberEvents = numberEvents.longValue() + 1L;
    events = SeqUtil.conc(Utils.copy(events), SeqUtil.seq(ev));
  }

  public Number getNumberEvents() {

    return numberEvents;
  }

  public VDMSeq getEvents() {

    return Utils.copy(events);
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
        + ", designers := "
        + Utils.toString(designers)
        + ", numberDesigners := "
        + Utils.toString(numberDesigners)
        + ", events := "
        + Utils.toString(events)
        + ", numberEvents := "
        + Utils.toString(numberEvents)
        + "}";
  }
}
