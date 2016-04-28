
package geom;

public class Square extends PointAndColor {
private int a;
private int x;
private int y;
private String color;


    public Square (int x1, int y1, int a1, String color1){
        super(x1,y1,color1);// конструктор из класса P A C, с вводимыми значениями
        if (a1<=0)
            System.out.println("Квадрат: ошибка!");
        else{
        a = a1;
        }
    }
public Square (){
    x=0;
    y=0;
    a=1;
    color = "red";
}

    public void Squareinfo (){
        System.out.println("Квадрат - Координаты: ("+getX()+";"+getY()+"). Сторона: "+a+". Цвет: "+getColor());
    }
    public void areaSq (){
        int area = a*a;
        System.out.println("Площадь квадрата равна: "+area);
    }
}
