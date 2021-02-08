package Composite;

import Observer.Attribut;
import Observer.IObserver;

public abstract class Figure implements IObserver {

  private int epaisseurDuContour;
  private String couleurDuContour;
  private String couleurDeRemplissage;

  public void update(Attribut attribut){
    epaisseurDuContour = attribut.getEpaisseurDuContour();
    couleurDuContour = attribut.getCouleurDuContour();
    couleurDeRemplissage = attribut.getCouleurDeRemplissage();
  }

  public abstract float perimetre();

  public abstract float surface();

  public int getEpaisseurDuContour() {
    return epaisseurDuContour;
  }

  public void setEpaisseurDuContour(int epaisseurDuContour) {
    this.epaisseurDuContour = epaisseurDuContour;
  }

  public String getCouleurDuContour() {
    return couleurDuContour;
  }

  public void setCouleurDuContour(String couleurDuContour) {
    this.couleurDuContour = couleurDuContour;
  }

  public String getCouleurDeRemplissage() {
    return couleurDeRemplissage;
  }

  public void setCouleurDeRemplissage(String couleurDeRemplissage) {
    this.couleurDeRemplissage = couleurDeRemplissage;
  }

  @Override
  public String toString() {
    return "Composite.Figure ["+epaisseurDuContour+", "+couleurDuContour+", "+couleurDeRemplissage+"]";
  }
}
