package Strategy;

import Strategy.Traitement;

public class Traitement2 implements Traitement {
  @Override
  public void traite() {
    System.out.println("Strategy.Traitement1");
  }
}
