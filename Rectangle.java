package InterfacesAssignment;
import java.awt.*;
public class Rectangle implements Shapes {
      private int Width;
      private int Length;
      

      public Rectangle(int Width, int Length){
            this.Width = Width;
            this.Length = Length;
      }

      public double getArea(){
            return Length * Width;
      }

      public double getPerimeter(){
            return Length + Length + Width + Width;
      }

      public void Draw(Graphics x){
            x.fillRect(20, 20, Width * 10, Length * 10);
      }
}
