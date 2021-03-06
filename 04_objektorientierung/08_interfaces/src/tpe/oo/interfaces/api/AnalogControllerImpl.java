package tpe.oo.interfaces.api;

import java.awt.Point;
import java.awt.geom.Point2D;

public class AnalogControllerImpl implements AnalogController{

    private Point2D position = new Point2D.Double(0,0);

    @Override
    public void up(double procentage) {
        position.setLocation(position.getX(), position.getY()- procentage);
    }

    @Override
    public void down(double procentage) {
        position.setLocation(position.getX(), position.getY()+ procentage);

    }

    @Override
    public void left(double procentage) {
        position.setLocation(position.getX()- procentage, position.getY());

    }

    @Override
    public void right(double procentage) {
        position.setLocation(position.getX()+ procentage, position.getY());

    }

    public Point getPosition() {

       return new Point((int)position.getX(), (int) position.getY());
    }

}
