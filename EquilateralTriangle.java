package InterfacesAssignment;
import java.awt.*;
public class EquilateralTriangle implements Shapes {
      private int SideLength;

      public EquilateralTriangle(int SideLength){
            this.SideLength = SideLength;
      }

      public double getArea(){
            return (Math.sqrt(3)/4) * SideLength * SideLength;
      }

      public double getPerimeter(){
            return SideLength * 3;
      }

      public void Draw(Graphics x){
            int[] xPoints = {20, 20 + SideLength * 10, 20 + (SideLength/2) * 10};
            int[] yPoints = {20, 20, (int) (20 + (10 * (SideLength * (Math.sqrt(3)/2))))};
            x.drawPolygon(xPoints, yPoints, 3);
      }

}
