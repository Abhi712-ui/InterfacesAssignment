package InterfacesAssignment;
import java.awt.*;
public class DrawShapes {
      public static void main(String[] args){
            DrawingPanel panel = new DrawingPanel(500,500); 
            Graphics g = panel.getGraphics();
            EquilateralTriangle eq = new EquilateralTriangle(5);
            Rectangle rec = new Rectangle(5, 10);
            Circle circ = new Circle(5);
            Triangle tri = new Triangle(5, 10);
            Shapes[] shap = { rec, circ, tri, eq };
            for(Shapes shape : shap){
                  System.out.println("Area:");
                  System.out.println(shape.getArea());
                  System.out.println("Perimeter");
                  System.out.println(shape.getPerimeter());
                  shape.Draw(g);
            }
      }
}
