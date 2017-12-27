package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestModel extends TestCommon {
  public void run() {

    Model m0 = new Model("Sara Sampaio", 24L, "Portuguesa", "New York");
    IO.print("TestModel.vdmpp (1/10): testInit() started...\n");
    assertNotNull(m0);
    IO.print("TestModel.vdmpp (1/10): testInit() passed!\n");
    IO.print("TestModel.vdmpp (2/10): TestEvent() started...\n");
    assertEqual("Sara Sampaio", m0.getName());
    assertEqual(24L, m0.getAge());
    assertEqual("Portuguesa", m0.getNationality());
    assertEqual("New York", m0.getAddress());
    IO.print("TestModel.vdmpp (2/10): testParams() passed!\n");
    IO.print("TestModel.vdmpp (DONE): all tests successfully executed!\n");
  }

  public TestModel() {}

  public String toString() {

    return "TestModel{}";
  }
}
