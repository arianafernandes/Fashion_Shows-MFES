package Fashion_Shows.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class MulherQuote {
  private static int hc = 0;
  private static MulherQuote instance = null;

  public MulherQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static MulherQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new MulherQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof MulherQuote;
  }

  public String toString() {

    return "<Mulher>";
  }
}
