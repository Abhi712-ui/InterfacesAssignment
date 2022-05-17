package InterfacesAssignment;
import java.awt.*;
public class Oval implements Shapes{
      private int Height;
      private int Width;

      public Oval(int Height, int Width){
            this.Height = Height;
            this.Width = Width;
      }

      public double getArea(){
            return Math.PI * (Width/2) * (Height/2);
      }

      public double getPerimeter(){
            return 2 * Math.PI * Math.sqrt(((Width/2) * (Width/2)) + ((Height/2) * (Height/2))/2);
      }

      public void Draw(Graphics x){
            x.fillRect(20, 20, Width, Height);
      }
}
