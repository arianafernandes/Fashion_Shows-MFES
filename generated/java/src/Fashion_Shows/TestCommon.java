package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestCommon {
  protected void assertTrue(final Boolean arg) {

    return;
  }

  protected void assertFalse(final Boolean arg) {

    return;
  }

  protected void assertNotNull(final Object arg) {

    return;
  }

  protected void assertEqual(final Object expected, final Object actual) {

    if (!(Utils.equals(expected, actual))) {
      IO.print("Actual value (");
      IO.print(((Object) actual));
      IO.print(") different from expected (");
      IO.print(((Object) expected));
      IO.println(")\n");
    }
  }

  public TestCommon() {}

  public String toString() {

    return "TestCommon{}";
  }
}
