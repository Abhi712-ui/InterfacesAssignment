package InterfacesAssignment;
import java.awt.*;
public class Circle implements Shapes {
      private int Radius;

      public Circle(int Radius){
            this.Radius = Radius;
      }

      public double getArea(){
            return Math.PI * Radius * Radius;
      }

      public double getPerimeter(){
            return Math.PI * Radius * 2.0;
      }

      public void Draw(Graphics x){
            x.drawOval(20, 20, Radius * 10, Radius * 10);
      }
}
