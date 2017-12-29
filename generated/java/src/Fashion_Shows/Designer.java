package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Designer {
  public String name;
  public Number age;
  public String nationality;
  public String address;
  public String style;

  public void cg_init_Designer_1(
      final String nm, final Number ag, final String nt, final String ad, final String sty) {

    name = nm;
    age = ag;
    nationality = nt;
    address = ad;
    style = sty;
    return;
  }

  public Designer(
      final String nm, final Number ag, final String nt, final String ad, final String sty) {

    cg_init_Designer_1(nm, ag, nt, ad, sty);
  }

  public String getName() {

    return name;
  }

  public Number getAge() {

    return age;
  }

  public String getNationality() {

    return nationality;
  }

  public String getAddress() {

    return address;
  }

  public String getStyle() {

    return style;
  }

  public void printDesigner() {

    IO.print("Designer Name: ");
    IO.print(name);
    IO.print("\n");
    IO.print("Age: ");
    IO.print(age);
    IO.print("\n");
    IO.print("Nationality: ");
    IO.print(nationality);
    IO.print("\n");
    IO.print("Address: ");
    IO.print(address);
    IO.print("\n");
    IO.print("Style: ");
    IO.print(style);
    IO.print("\n");
  }

  public Designer() {}

  public String toString() {

    return "Designer{"
        + "name := "
        + Utils.toString(name)
        + ", age := "
        + Utils.toString(age)
        + ", nationality := "
        + Utils.toString(nationality)
        + ", address := "
        + Utils.toString(address)
        + ", style := "
        + Utils.toString(style)
        + "}";
  }
}
