
package geom;

public class Rectangle extends PointAndColor{
private   int a;
private int b;
private int x;
private int y;
private String color;
public Rectangle(int x1, int y1, int a1, int b1, String color1){
    super(x1, y1, color1);
   if (a1<=0 || b1<=0)
            System.out.println("Прямоугольник: ошибка!");
        else {
            a = a1;
            b = b1; 
        }    
   }
public Rectangle(){
 x = 0;
 y = 0;
 a = 1;
 b = 2;
 color = "red";
}
public void areaRec (){
        int area = a*b;
        System.out.println("Площадь прямоугольника равна: "+area);
    }

     public void Rectangleinfo (){
        System.out.println("Прямоугольник - Координаты: ("+getX()+";"+getY()+"). Стороны: AB и BC: "+a+" и "+b+". Цвет: "+getColor());
    }
}
