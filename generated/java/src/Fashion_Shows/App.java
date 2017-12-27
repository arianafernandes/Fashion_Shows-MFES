package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class App {
  public static void main(final String[] args) {

    IO.print("\nExecuting TestDesigner.vdmpp operations...\n");
    new TestDesigner().run();
    IO.print("\nExecuting TestFashionFestival.vdmpp operations...\n");
    new TestFashionFestival().run();
    IO.print("\nExecuting TestEvent.vdmpp operations...\n");
    new TestEvent().run();
    IO.print("\nExecuting TestFashionUser.vdmpp operations...\n");
    new TestFashionUser().run();
    IO.print("\nExecuting TestModel.vdmpp operations...\n");
    new TestModel().run();
  }

  public App() {}

  public String toString() {

    return "TestMain{}";
  }
}
