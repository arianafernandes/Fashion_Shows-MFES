package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tests extends MyTestCase {
  public void run() {

    FashionFestival f0 =
        new FashionFestival("Porto Fashion Week", "04/05/2018", "10/05/2018", "Porto");
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
            "Fashion Night Out Porto",
            "10/06/2018",
            "Baixa",
            20L,
            2L,
            "GeometricForms",
            Fashion_Shows.quotes.UnisexoQuote.getInstance(),
            Fashion_Shows.quotes.Primavera_VeraoQuote.getInstance());
    Event ev2 =
        new Event(
            "Black Friday",
            "12/06/2018",
            "Vila do Conde",
            10L,
            4L,
            "Fashion Sales",
            Fashion_Shows.quotes.UnisexoQuote.getInstance(),
            Fashion_Shows.quotes.Outono_InvernoQuote.getInstance());
    Designer d0 = new Designer("Yves S. L.", 72L, "Frances", "Paris", "Classico");
    Designer d1 = new Designer("Ralph Lauren", 69L, "Frances", "Paris", "Classico");
    Model m0 = new Model("Sara Sampaio", 24L, "Portuguesa", "New York");
    Model m1 = new Model("Claudia Schiffer", 47L, "Alemã", "Alemanha");
    Model m2 = new Model("Naomi Campbell", 47L, "Inglesa", "Inglaterra");
    Model m3 = new Model("Kate Moss", 43L, "Inglesa", "Inglaterra");
    FashionUser u0 = new FashionUser("Joao", 30L, Fashion_Shows.quotes.HomemQuote.getInstance());
    IO.print("TestEvent.vdmpp (1/10): testInit() started...\n");
    assertNotNull(f0);
    assertNotNull(ev0);
    assertNotNull(ev1);
    assertNotNull(d0);
    assertNotNull(d1);
    assertNotNull(ev2);
    assertNotNull(m0);
    assertNotNull(m1);
    assertNotNull(m2);
    assertNotNull(m3);
    IO.print("TestFashionFestival.vdmpp (2/10): testParamsFestival() started...\n");
    assertEqual("Porto Fashion Week", f0.getName());
    assertEqual("04/05/2018", f0.getDateBegin());
    assertEqual("10/05/2018", f0.getDateEnd());
    assertEqual("Porto", f0.getLocal());
    IO.print("TestFashionFestival.vdmpp (3/10): testInsertEventAtFestival() started...\n");
    f0.insertEvent(ev0);
    f0.insertEvent(ev1);
    f0.insertEvent(ev2);
    assertEqual(3L, f0.getNumberEvents());
    IO.print("TestEvent.vdmpp (3/10): testEventParams() started...\n");
    assertEqual("BaixaShow", ev0.getName());
    assertEqual("04/05/2018", ev0.getDate());
    assertEqual("Baixa", ev0.getLocal());
    assertEqual(12L, ev0.getTime());
    assertEqual(60L, ev0.getDuration());
    assertEqual("flores", ev0.getTheme());
    assertEqual(Fashion_Shows.quotes.HomemQuote.getInstance(), ((Object) ev0.getGender()));
    assertEqual(
        Fashion_Shows.quotes.Primavera_VeraoQuote.getInstance(), ((Object) ev0.getCollection()));
    IO.print("TestEvent.vdmpp (4/10): testInsertDesignerAtEvent() started...\n");
    ev0.insertDesigner(d0);
    ev1.insertDesigner(d1);
    assertEqual(1L, ev0.getNumberDesigners());
    assertEqual(1L, ev1.getNumberDesigners());
    IO.print("TestEvent.vdmpp (3/10): testInsertModelAtEvent() started...\n");
    ev0.insertModel(m0);
    ev1.insertModel(m1);
    ev1.insertModel(m2);
    ev2.insertModel(m3);
    assertEqual(1L, ev0.getNumberModels());
    assertEqual(2L, ev1.getNumberModels());
    assertEqual(1L, ev2.getNumberModels());
    IO.print("TestDesigner.vdmpp (2/10): DesignerParams() started...\n");
    assertEqual("Yves S. L.", d0.getName());
    assertEqual(72L, d0.getAge());
    assertEqual("Frances", d0.getNationality());
    assertEqual("Paris", d0.getAddress());
    assertEqual("Classico", d0.getStyle());
    IO.print("TestModel.vdmpp (2/10): ModelParams() started...\n");
    assertEqual("Sara Sampaio", m0.getName());
    assertEqual(24L, m0.getAge());
    assertEqual("Portuguesa", m0.getNationality());
    assertEqual("New York", m0.getAddress());
    IO.print("TestFashionUser.vdmpp (2/10): UserParams() started...\n");
    assertEqual("Joao", u0.getName());
    assertEqual(30L, u0.getAge());
    assertEqual(Fashion_Shows.quotes.HomemQuote.getInstance(), ((Object) u0.getGender()));
    IO.print("TestFashionFestival.vdmpp (DONE): all tests successfully executed!\n");
    f0.printFashionFestival();
    ev0.printEvent();
    ev1.printEvent();
    ev2.printEvent();
  }

  public Tests() {}

  public String toString() {

    return "Tests{}";
  }
}