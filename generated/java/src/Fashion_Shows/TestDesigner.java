package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestDesigner extends TestCommon {
  public void run() {

    Designer d0 = new Designer("Yves S. L.", 72L, "Frances", "Paris", "Classico");
    IO.print("TestDesigner.vdmpp (1/10): testInit() started...\n");
    assertNotNull(d0);
    IO.print("TestDesigner.vdmpp (1/10): testInit() passed!\n");
    IO.print("TestDesigner.vdmpp (2/10): TestEvent() started...\n");
    assertEqual("Yves S. L.", d0.getName());
    assertEqual(72L, d0.getAge());
    assertEqual("Frances", d0.getNationality());
    assertEqual("Paris", d0.getAddress());
    assertEqual("Classico", d0.getStyle());
    IO.print("TestDesigner.vdmpp (2/10): testParams() passed!\n");
    IO.print("TestDesigner.vdmpp (DONE): all tests successfully executed!\n");
  }

  public TestDesigner() {}

  public String toString() {

    return "TestDesigner{}";
  }
}
