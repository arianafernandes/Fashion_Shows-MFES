package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Model {
  public String name;
  public String age;
  public String nationality;
  public String address;
  public String output = "";

  public void cg_init_Model_1(final String nm, final String ag, final String nt, final String ad) {

    name = nm;
    age = ag;
    nationality = nt;
    address = ad;
    return;
  }

  public Model(final String nm, final String ag, final String nt, final String ad) {

    cg_init_Model_1(nm, ag, nt, ad);
  }

  public String getName() {

    return name;
  }

  public String getAge() {

    return age;
  }

  public String getNationality() {

    return nationality;
  }

  public String getAddress() {

    return address;
  }

  public String printModel() {

    output =
        "Model Name: "
            + name
            + "\n"
            + "Age: "
            + age
            + "\n"
            + "Nationality: "
            + nationality
            + "\n"
            + "Address: "
            + address
            + "\n";
    return output;
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
        + ", output := "
        + Utils.toString(output)
        + "}";
  }
}
