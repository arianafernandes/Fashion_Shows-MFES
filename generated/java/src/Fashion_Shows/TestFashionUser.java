package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestFashionUser extends TestCommon {
  public void run() {

    FashionUser u0 = new FashionUser("Joao", 30L, Fashion_Shows.quotes.HomemQuote.getInstance());
    IO.print("TestFashionUser.vdmpp (1/10): testInit() started...\n");
    assertNotNull(u0);
    IO.print("TestFashionUser.vdmpp (1/10): testInit() passed!\n");
    IO.print("TestFashionUser.vdmpp (2/10): testParams() started...\n");
    assertEqual("Joao", u0.getName());
    assertEqual(30L, u0.getAge());
    assertEqual(Fashion_Shows.quotes.HomemQuote.getInstance(), ((Object) u0.getGender()));
    IO.print("TestFashionUser.vdmpp (2/10): testParams() passed!\n");
    IO.print("TestFashionUser.vdmpp (DONE): all tests successfully executed!\n");
  }

  public TestFashionUser() {}

  public String toString() {

    return "TestFashionUser{}";
  }
}
