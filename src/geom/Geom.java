package geom;

import java.util.Scanner;

public class Geom {
    public static void main(String[] args) {
   Square kv = new Square(5, 5, 7, "red");
   Parall par = new Parall(-5, 1, 2, 5, 75, "Blue");
   Rectangle pr = new Rectangle(-5, 3, 2, 4, "Yellow");
   Circle kr = new Circle(-2, 2, 5, "Green");
   Square kv1 = new Square();
   Rectangle pr1 = new Rectangle();
   //проверка начальных данных
   kv.Squareinfo();
   par.Parallinfo();
   pr.Rectangleinfo();
   kr.Circleinfo();
   kv1.Squareinfo();
   pr1.Rectangleinfo();
   //меняем координаты
    kv.koord(5, 6);
    par.koord(4, 7);
    pr.koord(2, 2);
    kr.koord(4, 4);
   //меняем цвет
   kv.changeColor("black");
   par.changeColor("white");
   pr.changeColor("pink");
   kr.changeColor("orange");
    //проверяем новые значения
   kv.Squareinfo();
   par.Parallinfo();
   pr.Rectangleinfo();
   kr.Circleinfo();
 //вычисляем площади и сразу же выводим на консоль
   kv.areaSq();
   par.areaPar();
   pr.areaRec();
   kr.areaCir();
    }
}
