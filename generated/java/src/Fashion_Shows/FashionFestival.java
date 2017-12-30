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
  private VDMSet fashionUsers = SetUtil.set();
  private String output = "";

  public void cg_init_FashionFestival_1(
      final String nm, final String di, final String df, final String lc) {

    name = nm;
    dateBegin = di;
    dateEnd = df;
    local = lc;
    return;
  }

  public FashionFestival(final String nm, final String di, final String df, final String lc) {

    cg_init_FashionFestival_1(nm, di, df, lc);
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

  public void insertFashionUser(final FashionUser us) {

    fashionUsers = SetUtil.union(Utils.copy(fashionUsers), SetUtil.set(us));
  }

  public Number getNumberEvents() {

    return numberEvents;
  }

  public VDMSet getFashionUsers() {

    return Utils.copy(fashionUsers);
  }

  public Number getNumberFashionUsers() {

    return fashionUsers.size();
  }

  public String printFashionFestival() {

    output =
        "Name: "
            + name
            + "\n"
            + "Date Begin: "
            + dateBegin
            + "\n"
            + "Date End: "
            + dateEnd
            + "\n"
            + "Local: "
            + local
            + "\n";
    return output;
  }

  public FashionFestival() {}

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
        + ", fashionUsers := "
        + Utils.toString(fashionUsers)
        + ", output := "
        + Utils.toString(output)
        + "}";
  }
}
