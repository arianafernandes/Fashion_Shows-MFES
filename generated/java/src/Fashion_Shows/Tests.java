package Fashion_Shows;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Tests extends MyTestCase {
  private static VDMSeq festivals = SeqUtil.seq();
  private static VDMSeq events = SeqUtil.seq();
  private static VDMSeq designers = SeqUtil.seq();
  private static VDMSeq models = SeqUtil.seq();
  private static VDMSet appUsers = SetUtil.set();
  private static VDMSeq runways = SeqUtil.seq();

  public void run() {

    FashionFestival f0 =
        new FashionFestival(" Porto Fashion Week", "04/05/2018", "10/05/2018", "Porto");
    FashionFestival f1 =
        new FashionFestival(" Madrid Fashion Week", "26/08/2018", "30/08/2018", "Madrid");
    Event ev0 =
        new Event(
            " Meet Portugal Fashion Designers",
            "04/05/2018",
            "Baixa",
            "12:00",
            "3h",
            "Portugal",
            "Unisexo",
            "Primavera_Verao");
    Event ev1 =
        new Event(
            " Fashion Night Out Porto",
            "10/06/2018",
            "Baixa",
            "20:00",
            "2h",
            "GeometricForms",
            "Unisexo",
            "Primavera_Verao");
    Event ev2 =
        new Event(
            " Madrid Black Fashion",
            "12/06/2018",
            "Madrid",
            "19:00",
            "4h",
            "Fashion Sales",
            "Unisexo",
            "Outono_Inverno");
    Designer d0 = new Designer("Yves S. L.", "72", "Frances", "Paris", "Classico");
    Designer d1 = new Designer("Ralph Lauren", "69", "Frances", "Paris", "Classico");
    Model m0 = new Model("Sara Sampaio", "24", "Portuguesa", "New York");
    Model m1 = new Model("Claudia Schiffer", "47", "Alema", "Alemanha");
    Model m2 = new Model("Naomi Campbell", "47", "Inglesa", "Inglaterra");
    Model m3 = new Model("Kate Moss", "43", "Inglesa", "Inglaterra");
    FashionUser u0 = new FashionUser("Joao", "123456", "Joao", "30");
    FashionUser u1 = new FashionUser("Maria", "654321", "Maria", "34");
    Runway r0 = new Runway(" Meet winter collecion");
    Runway r1 = new Runway(" African Power");
    Runway r2 = new Runway(" Nautical Vibes");
    f0.insertEvent(ev0);
    f0.insertEvent(ev2);
    f1.insertEvent(ev0);
    f1.insertEvent(ev1);
    f0.insertFashionUser(u0);
    f0.insertFashionUser(u1);
    ev0.insertRunway(r0);
    ev1.insertRunway(r1);
    ev1.insertRunway(r2);
    ev2.insertRunway(r2);
    r0.insertDesigner(d0);
    r0.insertDesigner(d1);
    r0.insertModel(m0);
    r1.insertDesigner(d1);
    r1.insertModel(m1);
    r1.insertModel(m2);
    r1.insertModel(m3);
    r2.insertDesigner(d0);
    r2.insertModel(m2);
    u0.insertEvent(ev0);
    u0.insertEvent(ev1);
    u0.insertDesigner(d0);
    u0.insertDesigner(d1);
    u0.insertModel(m0);
    u0.insertModel(m1);
    u1.insertEvent(ev2);
    u1.insertEvent(ev0);
    u1.insertDesigner(d1);
    u1.insertModel(m3);
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
    appUsers = SetUtil.union(Utils.copy(Tests.appUsers), SetUtil.set(u0));
    appUsers = SetUtil.union(Utils.copy(Tests.appUsers), SetUtil.set(u1));
    runways = SeqUtil.conc(Utils.copy(Tests.runways), SeqUtil.seq(r0));
    runways = SeqUtil.conc(Utils.copy(Tests.runways), SeqUtil.seq(r1));
    runways = SeqUtil.conc(Utils.copy(Tests.runways), SeqUtil.seq(r2));
    assertNotNull(f0);
    assertNotNull(f1);
    assertNotNull(ev0);
    assertNotNull(ev1);
    assertNotNull(ev2);
    assertNotNull(d0);
    assertNotNull(d1);
    assertNotNull(m0);
    assertNotNull(m1);
    assertNotNull(m2);
    assertNotNull(m3);
    assertNotNull(u0);
    assertNotNull(u1);
    assertEqual(" Porto Fashion Week", f0.getName());
    assertEqual("04/05/2018", f0.getDateBegin());
    assertEqual("10/05/2018", f0.getDateEnd());
    assertEqual("Porto", f0.getLocal());
    assertEqual(2L, f0.getNumberEvents());
    assertEqual(ev0.getName(), ((Event) Utils.get(f0.getEvents(), 2L)).getName());
    assertEqual(2L, f1.getNumberEvents());
    assertEqual(ev1.getName(), ((Event) Utils.get(f1.getEvents(), 1L)).getName());
    assertEqual(ev1.getName(), ((Event) Utils.get(f1.getEvents(), 1L)).getName());
    assertEqual(2L, f0.getFashionUsers().size());
    assertEqual(2L, f0.getNumberFashionUsers());
    assertEqual(
        "Name: "
            + f0.getName()
            + "\n"
            + "Date Begin: "
            + f0.getDateBegin()
            + "\n"
            + "Date End: "
            + f0.getDateEnd()
            + "\n"
            + "Local: "
            + f0.getLocal()
            + "\n",
        f0.printFashionFestival());
    assertEqual(f0.getName() + "\n", f0.printFashionFestivalName());
    assertEqual(" Meet Portugal Fashion Designers", ev0.getName());
    assertEqual("04/05/2018", ev0.getDate());
    assertEqual("Baixa", ev0.getLocal());
    assertEqual("12:00", ev0.getTime());
    assertEqual("3h", ev0.getDuration());
    assertEqual("Portugal", ev0.getTheme());
    assertEqual("Unisexo", ev0.getGender());
    assertEqual("Primavera_Verao", ev0.getCollection());
    assertEqual(1L, ev0.getNumberRunways());
    assertEqual(2L, ev1.getNumberRunways());
    assertEqual(1L, ev2.getNumberRunways());
    assertEqual(r0.getName(), ((Runway) Utils.get(ev0.getRunways(), 1L)).getName());
    assertEqual(
        "Event Name: "
            + ev0.getName()
            + "\n"
            + "Date: "
            + ev0.getDate()
            + "\n"
            + "Time: "
            + ev0.getTime()
            + "\n"
            + "Theme: "
            + ev0.getTheme()
            + "\n"
            + "Gender: "
            + ev0.getGender()
            + "\n"
            + "Collection: "
            + ev0.getCollection()
            + "\n",
        ev0.printEvent());
    assertEqual(r0.getDesignersNumber(), r0.getDesigners().size());
    assertEqual(1L, r0.getNumberModels());
    assertEqual(m0.getName(), ((Model) Utils.get(r0.getModels(), 1L)).getName());
    assertEqual(r0.getName() + "\n", r0.printRunway());
    assertEqual("Yves S. L.", d0.getName());
    assertEqual("72", d0.getAge());
    assertEqual("Frances", d0.getNationality());
    assertEqual("Paris", d0.getAddress());
    assertEqual("Classico", d0.getStyle());
    assertEqual(
        "Designer Name: "
            + d0.getName()
            + "\n"
            + "Age: "
            + d0.getAge()
            + "\n"
            + "Nationality: "
            + d0.getNationality()
            + "\n"
            + "Address: "
            + d0.getAddress()
            + "\n"
            + "Style: "
            + d0.getStyle()
            + "\n",
        d0.printDesigner());
    assertEqual("Sara Sampaio", m0.getName());
    assertEqual("24", m0.getAge());
    assertEqual("Portuguesa", m0.getNationality());
    assertEqual("New York", m0.getAddress());
    assertEqual(
        "Model Name: "
            + m0.getName()
            + "\n"
            + "Age: "
            + m0.getAge()
            + "\n"
            + "Nationality: "
            + m0.getNationality()
            + "\n"
            + "Address: "
            + m0.getAddress()
            + "\n",
        m0.printModel());
    assertEqual("Joao", u0.getName());
    assertEqual("30", u0.getAge());
    assertEqual("Joao", u0.getUsername());
    assertEqual("123456", u0.getPassword());
    assertEqual(
        "Username: "
            + u0.getUsername()
            + "\n"
            + "Password: "
            + u0.getPassword()
            + "\n"
            + "Name: "
            + u0.getName()
            + "\n"
            + "Age: "
            + u0.getAge()
            + "\n",
        u0.printUser());
    assertEqual(2L, u0.getNumberEvents());
    assertEqual(ev0.getName(), ((Event) Utils.get(u0.getEvents(), 1L)).getName());
    assertEqual(ev1.getName(), ((Event) Utils.get(u0.getEvents(), 2L)).getName());
    assertEqual(2L, u0.getNumberFavDesigners());
    assertEqual(d0.getName(), ((Designer) Utils.get(u0.getDesigners(), 1L)).getName());
    assertEqual(d1.getName(), ((Designer) Utils.get(u0.getDesigners(), 2L)).getName());
    assertEqual(2L, u0.getNumberFavModels());
    assertEqual(m0.getName(), ((Model) Utils.get(u0.getModels(), 1L)).getName());
    assertEqual(m1.getName(), ((Model) Utils.get(u0.getModels(), 2L)).getName());
    assertEqual(2L, TestApp.getUsers().size());
    assertEqual(2L, TestApp.getFestivals().size());
    //assertEqual(" Porto Fashion Week\n", TestApp.getFestivalsNames());
    assertEqual(f0.getName(), TestApp.getFestival(1L).getName());
    assertEqual(2L, TestApp.getFestivalEvents(1L).size());
    //assertEqual(" Madrid Black Fashion", TestApp.getFestivalEventsNames(1L));
    assertEqual(2L, TestApp.getFestivalUsers(1L).size());
    assertEqual(ev2.getName(), TestApp.getEvent(1L, 1L).getName());
    assertEqual(1L, TestApp.getRunwaysByEvent(1L, 1L).size());
    //assertEqual(" Nautical Vibes", TestApp.getRunwaysNames(1L, 1L));
    assertEqual(r2.getName(), TestApp.getOneRunwayByEvent(1L, 1L, 1L).getName());
    assertEqual(
        m2.getName(), ((Model) Utils.get(TestApp.getModelsByRunway(1L, 1L, 1L), 1L)).getName());
    assertEqual(1L, TestApp.getDesignersByRunway(1L, 1L, 1L).size());
    assertEqual(2L, getFestivals().size());
    assertEqual(3L, getEvents().size());
    assertEqual(2L, getDesigners().size());
    assertEqual(4L, getModels().size());
    assertEqual(3L, getRunways().size());
    assertEqual(2L, getAppUsers().size());
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

  public static VDMSet getAppUsers() {

    return Utils.copy(Tests.appUsers);
  }

  public static VDMSeq getRunways() {

    return Utils.copy(Tests.runways);
  }

  public static void setAppUser(
      final String username, final String password, final String name, final String age) {

    FashionUser u5 = new FashionUser(username, password, name, age);
    appUsers = SetUtil.union(Utils.copy(Tests.appUsers), SetUtil.set(u5));
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
        + ", appUsers := "
        + Utils.toString(appUsers)
        + ", runways := "
        + Utils.toString(runways)
        + "}";
  }
}
