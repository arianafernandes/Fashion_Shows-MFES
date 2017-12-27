package Fashion_Shows.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Outono_InvernoQuote {
  private static int hc = 0;
  private static Outono_InvernoQuote instance = null;

  public Outono_InvernoQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static Outono_InvernoQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new Outono_InvernoQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof Outono_InvernoQuote;
  }

  public String toString() {

    return "<Outono_Inverno>";
  }
}
