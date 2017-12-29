package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class FashionUser {
  private String username;
  private String password;
  public String name;
  public Number age;
  public Object gender;
  private VDMSeq designers = SeqUtil.seq();
  private Number numberDesigners = 0L;
  private VDMSeq events = SeqUtil.seq();
  private Number numberEvents = 0L;

  public void cg_init_FashionUser_1(
      final String u, final String p, final String nm, final Number ag, final Object gr) {

    username = u;
    password = p;
    name = nm;
    age = ag;
    gender = gr;
    return;
  }

  public FashionUser(
      final String u, final String p, final String nm, final Number ag, final Object gr) {

    cg_init_FashionUser_1(u, p, nm, ag, gr);
  }

  public String getUsername() {

    return username;
  }

  public String getPassword() {

    return password;
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

  public void printUser() {

    IO.print(" Name: ");
    IO.print(name);
    IO.print("\n");
    IO.print("Age: ");
    IO.print(age);
    IO.print("\n");
    IO.print("Gender: ");
    IO.print(((Object) gender));
    IO.print("\n");
  }

  public FashionUser() {}

  public String toString() {

    return "FashionUser{"
        + "username := "
        + Utils.toString(username)
        + ", password := "
        + Utils.toString(password)
        + ", name := "
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
