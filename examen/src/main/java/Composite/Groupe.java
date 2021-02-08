package Composite;

import Composite.Figure;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure {

  private List<Figure> figures = new ArrayList<>();

  @Override
  public float perimetre() {
    float r = 0;
    for (Figure f : figures) {
      r += f.perimetre();
    }
    return r;
  }

  @Override
  public float surface() {
    float r = 0;
    for (Figure f : figures) {
      r += f.surface();
    }
    return r;
  }

  public Groupe(List<Figure> figures) {
    this.figures = figures;
  }

  public List<Figure> getFigures() {
    return figures;
  }

  public void setFigures(List<Figure> figures) {
    this.figures = figures;
  }

  @Override
  public String toString() {
    String s = "Group : \n";
    for (Figure f : figures) {
      s += "\t"+f.toString() + "\n";
    }
    return s;
  }
}
