
package geom;

public class Circle extends PointAndColor{
private int rad;
public Circle(int x1, int y1, int rad, String color1){
    super(x1,y1,color1);
    if (rad<=0)
            System.out.println("Круг: ошибка!");
        else {
            this.rad = rad;
        }
}    
public void areaCir (){
        double area = rad*Math.PI;
        System.out.println("Площадь круга равна: "+area);
    }
 public void Circleinfo (){
        System.out.println("Круг - Координаты: ("+getX()+";"+getY()+"). Радиус: "+rad+". Цвет: "+getColor());
    }
}
