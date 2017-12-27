package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TestFashionFestival extends TestCommon {
  public void run() {

    FashionFestival f0 =
        new FashionFestival("Porto Fashion Week", "04/05/2018", "10/05/2018", "Porto");
    Designer d0 = new Designer("Yves S. L.", 72L, "Frances", "Paris", "Classico");
    Designer d1 = new Designer("Ralph Lauren", 69L, "Frances", "Paris", "Classico");
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
    Event ev1 =
        new Event(
            "NightOut",
            "15/05/2018",
            "Porto",
            21L,
            120L,
            "News",
            Fashion_Shows.quotes.UnisexoQuote.getInstance(),
            Fashion_Shows.quotes.Primavera_VeraoQuote.getInstance());
    IO.print("TestFashionFestival.vdmpp (1/10): testInit() started...\n");
    assertNotNull(f0);
    assertNotNull(d0);
    assertNotNull(d1);
    assertNotNull(ev0);
    assertNotNull(ev1);
    IO.print("TestFashionFestival.vdmpp (1/10): testInit() passed!\n");
    IO.print("TestFashionFestival.vdmpp (2/10): testParams() started...\n");
    assertEqual("Porto Fashion Week", f0.getName());
    assertEqual("04/05/2018", f0.getDateBegin());
    assertEqual("10/05/2018", f0.getDateEnd());
    assertEqual("Porto", f0.getLocal());
    IO.print("TestFashionFestival.vdmpp (2/10): testParams() passed!\n");
    IO.print("TestFashionFestival.vdmpp (3/10): testInsertDesigner() started...\n");
    f0.insertDesigner(d0.getName());
    f0.insertDesigner(d1.getName());
    assertEqual(2L, f0.getNumberDesigners());
    IO.print("TestFashionFestival.vdmpp (3/10): testInsertDesigner() passed!\n");
    IO.print("TestFashionFestival.vdmpp (4/10): testNumberDesigners() started...\n");
    assertEqual(2L, f0.getNumberDesigners());
    IO.print("TestFashionFestival.vdmpp (4/10): testNumberDesigners() passed!\n");
    IO.print("TestFashionFestival.vdmpp (5/10): testRemoveDesigners() started...\n");
    f0.removeDesigner(d0.getName());
    assertEqual(1L, f0.getNumberDesigners());
    IO.print("TestFashionFestival.vdmpp (5/10): testRemoveDesigners() passed!\n");
    IO.print("TestFashionFestival.vdmpp (6/10): testInsertEvent() started...\n");
    f0.insertEvent(ev0.getName());
    f0.insertEvent(ev1.getName());
    assertEqual(2L, f0.getNumberEvents());
    IO.print("TestFashionFestival.vdmpp (6/10): testInsertEvent() passed!\n");
    IO.print("TestFashionFestival.vdmpp (7/10): testNumberEvents() started...\n");
    assertEqual(2L, f0.getNumberEvents());
    IO.print("TestFashionFestival.vdmpp (7/10): testNumberEvents() passed!\n");
    IO.print("TestFashionFestival.vdmpp (8/10): testRemoveEvents() started...\n");
    f0.removeEvent(ev0.getName());
    assertEqual(1L, f0.getNumberEvents());
    IO.print("TestFashionFestival.vdmpp (8/10): testRemoveEvents() passed!\n");
    IO.print("TestFashionFestival.vdmpp (DONE): all tests successfully executed!\n");
  }

  public TestFashionFestival() {}

  public String toString() {

    return "TestFashionFestival{}";
  }
}
