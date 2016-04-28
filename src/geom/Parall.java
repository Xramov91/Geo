
package geom;

public class Parall extends PointAndColor {
private int a; 
private int b;
private double alpha;

    public Parall (int x1, int y1, int a1, int b1, double alpha1, String color1){
        super(x1,y1,color1);// конструктор из класса P A C, с вводимыми значениями
        if (a1<=0 || b1<=0 || alpha1<=0)
            System.out.println("Параллелограмм: ошибка!");
        else {
            a = a1;
            b = b1; 
            alpha = alpha1;
        }
    }
    public void Parallinfo (){
        System.out.println("Параллелограмм - Координаты: ("+getX()+";"+getY()+"). Стороны AB и BC: "+a+" и "+b+". Угол: "+alpha+ ".Цвет: "+getColor());
    }
    public void areaPar (){
        double alpharad = (alpha*Math.PI)/180;
        double area = a*b*Math.sin(alpharad);
        System.out.println("Площадь параллелограмма равна: "+area);
    }
}
    
