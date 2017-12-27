package Fashion_Shows.quotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class UnisexoQuote {
  private static int hc = 0;
  private static UnisexoQuote instance = null;

  public UnisexoQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static UnisexoQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new UnisexoQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof UnisexoQuote;
  }

  public String toString() {

    return "<Unisexo>";
  }
}
