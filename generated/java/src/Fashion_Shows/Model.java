package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Model {
  public String name;
  public Number age;
  public String nationality;
  public String address;

  public void cg_init_Model_1(final String nm, final Number ag, final String nt, final String ad) {

    name = nm;
    age = ag;
    nationality = nt;
    address = ad;
    return;
  }

  public Model(final String nm, final Number ag, final String nt, final String ad) {

    cg_init_Model_1(nm, ag, nt, ad);
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

  public void printModel() {

    IO.print("Model Name: ");
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
  }

  public Model() {}

  public String toString() {

    return "Model{"
        + "name := "
        + Utils.toString(name)
        + ", age := "
        + Utils.toString(age)
        + ", nationality := "
        + Utils.toString(nationality)
        + ", address := "
        + Utils.toString(address)
        + "}";
  }
}
