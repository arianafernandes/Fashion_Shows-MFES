package Fashion_Shows.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class HomemQuote {
  private static int hc = 0;
  private static HomemQuote instance = null;

  public HomemQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static HomemQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new HomemQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof HomemQuote;
  }

  public String toString() {

    return "<Homem>";
  }
}
