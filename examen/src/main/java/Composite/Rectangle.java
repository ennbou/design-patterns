package Composite;

import Composite.Figure;
import Composite.Point;

public class Rectangle extends Figure {

  private Point p;
  private float L;
  private float H;

  @Override
  public float perimetre() {
    return 2 * (L + H);
  }

  @Override
  public float surface() {
    return L * H;
  }

  public Rectangle(Point p, float l, float h) {
    this.p = p;
    L = l;
    H = h;
  }

  public Point getP() {
    return p;
  }

  public void setP(Point p) {
    this.p = p;
  }

  public float getL() {
    return L;
  }

  public void setL(float l) {
    L = l;
  }

  public float getH() {
    return H;
  }

  public void setH(float h) {
    H = h;
  }

  @Override
  public String toString() {
    return super.toString() + " -> Composite.Rectangle : centre(" + p.getX() + "," + p.getX() + ") L = " + L + " et H = " + H;
  }
}
