package Objet_jeux;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;

public class Canon {

    static double[] formecanon = {0.0d, 0.0d, 60.0d, 0.0d, 60.0d, 80.0d, 0.0d, 80.0d};
    Color color = Color.LIMEGREEN;
    int vie = 3;
    private Polygon representation = new Polygon();
    private double x;
    private double y;
    private IModeTir modeTir = new ModeTirAuto();

    private Boolean fire=false;

    public Canon(double unX, double unY, String ImageURL) {
        x=unX;
        y=unY;
        this.representation = representation;
        for (double point : formecanon) {
            this.representation.getPoints().add(point);
        }

        if (ImageURL.equals("NULL")) this.representation.setFill(color);
        else {
            Image image = new Image(ImageURL);
            if (image.isError()) this.representation.setFill(color);
            else this.representation.setFill(new ImagePattern(image, 0, 0, 1, 1, true));
        }
        this.representation.setLayoutX(x);
        this.representation.setLayoutY(y);
        this.representation.setAccessibleText(Integer.toString(vie));
    }

    public Polygon getRepresentation() {
        return representation;
    }

    public void dep_joueur(int dep1, int difficulte) {
        if (((dep1==1)&&(this.x<1140))||(dep1==-1&&this.x>0)) {
            setX(getX()+dep1 * (2d+difficulte/5));
        }
    }

    public double getX() {return x;}

    public void setX(double x) {this.x = x;}

    public IModeTir getModeTir() {return modeTir;}

    public void setModeTir(IModeTir modeTir) {this.modeTir = modeTir;}

    public Boolean getFire() {return fire;}

    public void setFire(Boolean fire) {this.fire = fire;}
}
