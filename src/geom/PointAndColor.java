package geom;
import java.util.Scanner;
public class PointAndColor {
    private int x;
    private int y;
    private String color;
    
  
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String getColor(){
        return color;
    }

    public PointAndColor(int x1, int y1, String color1){
        x = x1;
        y = y1;
        color = color1;
    }
     public PointAndColor(){
   }
// метод меняет координаты
    public void koord(int xx, int yy){
    x = xx;
    y = yy;
    }
// метод меняет цвет
public void changeColor(String color){
this.color = color;    
}

}
