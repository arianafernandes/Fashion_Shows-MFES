package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Runway {
  public String name = "";
  private VDMSet designers = SetUtil.set();
  private Number numberDesigners = designers.size();
  private VDMSeq models = SeqUtil.seq();
  private Number numberModels = 0L;

  public void cg_init_Runway_1(final String nm) {

    name = nm;
    return;
  }

  public Runway(final String nm) {

    cg_init_Runway_1(nm);
  }

  public String getName() {

    return name;
  }

  public VDMSeq getModels() {

    return Utils.copy(models);
  }

  public VDMSet getDesigners() {

    return Utils.copy(designers);
  }

  public void insertDesigner(final Designer dg) {

    designers = SetUtil.union(Utils.copy(designers), SetUtil.set(dg));
  }

  public void insertModel(final Model md) {

    numberModels = numberModels.longValue() + 1L;
    models = SeqUtil.conc(Utils.copy(models), SeqUtil.seq(md));
  }

  public Number getNumberModels() {

    return numberModels;
  }

  public void printRunway() {

    IO.print("Runway Name: ");
    IO.print(name);
    IO.print("\n");
  }

  public Runway() {}

  public String toString() {

    return "Runway{"
        + "name := "
        + Utils.toString(name)
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
