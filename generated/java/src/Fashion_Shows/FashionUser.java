package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class FashionUser {
  private String username;
  private String password;
  public String name;
  public String age;
  private VDMSeq designers = SeqUtil.seq();
  private Number numberDesigners = 0L;
  private VDMSeq models = SeqUtil.seq();
  private Number numberModels = 0L;
  private VDMSeq events = SeqUtil.seq();
  private Number numberEvents = 0L;
  private String output = "";

  public void cg_init_FashionUser_1(
      final String u, final String p, final String nm, final String ag) {

    username = u;
    password = p;
    name = nm;
    age = ag;
    return;
  }

  public FashionUser(final String u, final String p, final String nm, final String ag) {

    cg_init_FashionUser_1(u, p, nm, ag);
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

  public String getAge() {

    return age;
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

  public void insertModel(final Model d) {

    numberModels = numberModels.longValue() + 1L;
    models = SeqUtil.conc(Utils.copy(models), SeqUtil.seq(d));
  }

  public Number getNumberFavModels() {

    return numberModels;
  }

  public VDMSeq getModels() {

    return Utils.copy(models);
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

  public String printUser() {

    output =
        "Username: "
            + username
            + "\n"
            + "Password: "
            + password
            + "\n"
            + "Name: "
            + name
            + "\n"
            + "Age: "
            + age
            + "\n";
    return output;
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
        + ", designers := "
        + Utils.toString(designers)
        + ", numberDesigners := "
        + Utils.toString(numberDesigners)
        + ", models := "
        + Utils.toString(models)
        + ", numberModels := "
        + Utils.toString(numberModels)
        + ", events := "
        + Utils.toString(events)
        + ", numberEvents := "
        + Utils.toString(numberEvents)
        + ", output := "
        + Utils.toString(output)
        + "}";
  }
}
