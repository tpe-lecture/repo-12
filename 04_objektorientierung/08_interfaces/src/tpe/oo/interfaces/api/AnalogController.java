package tpe.oo.interfaces.api;

import java.awt.Point;

public interface AnalogController  {


   void up(double procentage);

   void down(double procentage);

   void left(double procentage);

   void right(double procentage);

   Point getPosition();




}
