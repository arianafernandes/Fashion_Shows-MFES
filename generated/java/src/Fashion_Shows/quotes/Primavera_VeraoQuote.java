package Fashion_Shows.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Primavera_VeraoQuote {
  private static int hc = 0;
  private static Primavera_VeraoQuote instance = null;

  public Primavera_VeraoQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static Primavera_VeraoQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new Primavera_VeraoQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof Primavera_VeraoQuote;
  }

  public String toString() {

    return "<Primavera_Verao>";
  }
}
