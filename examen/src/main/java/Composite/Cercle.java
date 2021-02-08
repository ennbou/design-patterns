package Composite;

import Composite.Point;

public class Cercle extends Figure {

  private Point centre;
  private float R;

  @Override
  public float perimetre() {
    return 2 * (float) Math.PI * R;
  }

  @Override
  public float surface() {
    return R * R * (float) Math.PI;
  }

  public Cercle(Point centre, float r) {
    this.centre = centre;
    R = r;
  }

  public Point getCentre() {
    return centre;
  }

  public void setCentre(Point centre) {
    this.centre = centre;
  }

  public float getR() {
    return R;
  }

  public void setR(float r) {
    R = r;
  }

  @Override
  public String toString() {
    return super.toString() + " -> Circle : centre(" + centre.getX() + "," + centre.getX() + ") R = " + R;
  }
}
