package InterfacesAssignment;
import java.awt.*;
public class Triangle implements Shapes {
      private int Width;
      private int Length;

      public Triangle(int Width, int Length){
            this.Width = Width;
            this.Length = Length;
      }
      public double getArea(){
            return (Width * Length)/2;
      }
      public double getPerimeter(){
            return Length + Width + (Math.sqrt((Length * Length) + (Width * Width)));
      }

      public void Draw(Graphics x){
            int[] xcoords = {50, (Width * 10 + 50), 0};
            int[] ycoords = {0, (Length * 10), 50};
            x.drawPolygon(xcoords, ycoords, 3);
      }
}
