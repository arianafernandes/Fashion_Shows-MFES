package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tests extends MyTestCase {
  private static VDMSeq festivals = SeqUtil.seq();
  private static VDMSeq events = SeqUtil.seq();
  private static VDMSeq designers = SeqUtil.seq();
  private static VDMSeq models = SeqUtil.seq();
  private static VDMSeq users = SeqUtil.seq();

  public void run() {

    FashionFestival f0 =
        new FashionFestival("Porto Fashion Week", "04/05/2018", "10/05/2018", "Porto");
    FashionFestival f1 =
        new FashionFestival("Madrid Weekend", "26/08/2018", "30/08/2018", "Madrid");
    Event ev0 =
        new Event(
            "BaixaShow",
            "04/05/2018",
            "Baixa",
            12L,
            3L,
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
    festivals = SeqUtil.conc(Utils.copy(Tests.festivals), SeqUtil.seq(f0));
    festivals = SeqUtil.conc(Utils.copy(Tests.festivals), SeqUtil.seq(f1));
    events = SeqUtil.conc(Utils.copy(Tests.events), SeqUtil.seq(ev0));
    events = SeqUtil.conc(Utils.copy(Tests.events), SeqUtil.seq(ev1));
    events = SeqUtil.conc(Utils.copy(Tests.events), SeqUtil.seq(ev2));
    designers = SeqUtil.conc(Utils.copy(Tests.designers), SeqUtil.seq(d0));
    designers = SeqUtil.conc(Utils.copy(Tests.designers), SeqUtil.seq(d1));
    models = SeqUtil.conc(Utils.copy(Tests.models), SeqUtil.seq(m0));
    models = SeqUtil.conc(Utils.copy(Tests.models), SeqUtil.seq(m1));
    models = SeqUtil.conc(Utils.copy(Tests.models), SeqUtil.seq(m2));
    models = SeqUtil.conc(Utils.copy(Tests.models), SeqUtil.seq(m3));
    users = SeqUtil.conc(Utils.copy(Tests.users), SeqUtil.seq(u0));
    IO.print("TestEvent.vdmpp (1/10): testInit() started...\n");
    assertNotNull(f0);
    assertNotNull(f1);
    assertNotNull(ev0);
    assertNotNull(ev1);
    assertNotNull(ev2);
    assertNotNull(d0);
    assertNotNull(d1);
    assertNotNull(ev2);
    assertNotNull(m0);
    assertNotNull(m1);
    assertNotNull(m2);
    assertNotNull(m3);
    assertNotNull(u0);
    IO.print("TestFashionFestival.vdmpp (2/10): testParamsFestival() started...\n");
    assertEqual("Porto Fashion Week", f0.getName());
    assertEqual("04/05/2018", f0.getDateBegin());
    assertEqual("10/05/2018", f0.getDateEnd());
    assertEqual("Porto", f0.getLocal());
    IO.print("TestFashionFestival.vdmpp (3/10): testInsertEventAtFestival() started...\n");
    f0.insertEvent(ev0);
    f0.insertEvent(ev2);
    f1.insertEvent(ev1);
    assertEqual(2L, f0.getNumberEvents());
    assertEqual(ev0.getName(), ((Event) Utils.get(f0.getEvents(), 2L)).getName());
    assertEqual(1L, f1.getNumberEvents());
    assertEqual(ev1.getName(), ((Event) Utils.get(f1.getEvents(), 1L)).getName());
    IO.print("TestEvent.vdmpp (3/10): testEventParams() started...\n");
    assertEqual("BaixaShow", ev0.getName());
    assertEqual("04/05/2018", ev0.getDate());
    assertEqual("Baixa", ev0.getLocal());
    assertEqual(12L, ev0.getTime());
    assertEqual(3L, ev0.getDuration());
    assertEqual("flores", ev0.getTheme());
    assertEqual(Fashion_Shows.quotes.HomemQuote.getInstance(), ((Object) ev0.getGender()));
    assertEqual(
        Fashion_Shows.quotes.Primavera_VeraoQuote.getInstance(), ((Object) ev0.getCollection()));
    IO.print("TestEvent.vdmpp (4/10): testInsertDesignerAtEvent() started...\n");
    ev0.insertDesigner(d0);
    ev1.insertDesigner(d1);
    assertEqual(1L, ev0.getNumberDesigners());
    assertEqual(d0.getName(), ((Designer) Utils.get(ev0.getDesigners(), 1L)).getName());
    assertEqual(1L, ev1.getNumberDesigners());
    assertEqual(d1.getName(), ((Designer) Utils.get(ev1.getDesigners(), 1L)).getName());
    IO.print("TestEvent.vdmpp (3/10): testInsertModelAtEvent() started...\n");
    ev0.insertModel(m0);
    ev0.insertModel(m1);
    ev1.insertModel(m1);
    ev1.insertModel(m2);
    ev2.insertModel(m3);
    assertEqual(2L, ev0.getNumberModels());
    assertEqual(m0.getName(), ((Model) Utils.get(ev0.getModels(), 1L)).getName());
    assertEqual(m1.getName(), ((Model) Utils.get(ev0.getModels(), 2L)).getName());
    assertEqual(2L, ev1.getNumberModels());
    assertEqual(m1.getName(), ((Model) Utils.get(ev1.getModels(), 1L)).getName());
    assertEqual(m2.getName(), ((Model) Utils.get(ev1.getModels(), 2L)).getName());
    assertEqual(1L, ev2.getNumberModels());
    assertEqual(m3.getName(), ((Model) Utils.get(ev2.getModels(), 1L)).getName());
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
  }

  public static VDMSeq getFestivals() {

    return Utils.copy(Tests.festivals);
  }

  public static VDMSeq getEvents() {

    return Utils.copy(Tests.events);
  }

  public static VDMSeq getDesigners() {

    return Utils.copy(Tests.designers);
  }

  public static VDMSeq getModels() {

    return Utils.copy(Tests.models);
  }

  public static VDMSeq getUsers() {

    return Utils.copy(Tests.users);
  }

  public Tests() {}

  public String toString() {

    return "Tests{"
        + "festivals := "
        + Utils.toString(festivals)
        + ", events := "
        + Utils.toString(events)
        + ", designers := "
        + Utils.toString(designers)
        + ", models := "
        + Utils.toString(models)
        + ", users := "
        + Utils.toString(users)
        + "}";
  }
}
