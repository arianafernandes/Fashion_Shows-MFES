package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestEvent extends TestCommon {
  public void run() {

    Event ev0 =
        new Event(
            "BaixaShow",
            "04/05/2018",
            "Baixa",
            12L,
            60L,
            "flores",
            Fashion_Shows.quotes.HomemQuote.getInstance(),
            Fashion_Shows.quotes.Primavera_VeraoQuote.getInstance());
    Designer d0 = new Designer("Yves S. L.", 72L, "Frances", "Paris", "Classico");
    Designer d1 = new Designer("Ralph Lauren", 69L, "Frances", "Paris", "Classico");
    IO.print("TestEvent.vdmpp (1/10): testInit() started...\n");
    assertNotNull(ev0);
    IO.print("TestEvent.vdmpp (1/10): testInit() passed!\n");
    IO.print("TestEvent.vdmpp (2/10): testParams() started...\n");
    assertEqual("BaixaShow", ev0.getName());
    assertEqual("04/05/2018", ev0.getDate());
    assertEqual("Baixa", ev0.getLocal());
    assertEqual(12L, ev0.getTime());
    assertEqual(60L, ev0.getDuration());
    assertEqual("flores", ev0.getTheme());
    assertEqual(Fashion_Shows.quotes.HomemQuote.getInstance(), ((Object) ev0.getGender()));
    assertEqual(
        Fashion_Shows.quotes.Primavera_VeraoQuote.getInstance(), ((Object) ev0.getCollection()));
    IO.print("TestEvent.vdmpp (2/10): testParams() passed!\n");
    IO.print("TestEvent.vdmpp (3/10): testInsertDesigner() started...\n");
    ev0.insertDesigner(d0.getName());
    ev0.insertDesigner(d1.getName());
    assertEqual(2L, ev0.getNumberDesigners());
    IO.print("TestEvent.vdmpp (3/10): testInsertDesigner() passed!\n");
    IO.print("TestEvent.vdmpp (4/10): testNumberDesigners() started...\n");
    assertEqual(2L, ev0.getNumberDesigners());
    IO.print("TestEvent.vdmpp (4/10): testNumberDesigners() passed!\n");
    IO.print("TestEvent.vdmpp (5/10): testRemoveDesigners() started...\n");
    ev0.removeDesigner(d0.getName());
    assertEqual(1L, ev0.getNumberDesigners());
    IO.print("TestEvent.vdmpp (5/10): testRemoveDesigners() passed!\n");
    IO.print("TestEvent.vdmpp (DONE): all tests successfully executed!\n");
  }

  public TestEvent() {}

  public String toString() {

    return "TestEvent{}";
  }
}
