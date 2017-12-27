package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestMain {
  public static void printTests() {

    IO.print("\nExecuting Tests.vdmpp operations...\n");
    new Tests().run();
  }

  public static void main(String[] args) {

    printTests();
  }

  public TestMain() {}

  public String toString() {

    return "TestMain{}";
  }
}
