package ru.stqa.pft.sandbox;

public class MyFirstProg {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alexei");
    hello("Irina");

    Square s = new Square(5);
    System.out.println ("Площадь квадрата со стороной " + s.l + " = " + s.area() );

    Rectangle r = new Rectangle(4,6);
    System.out.println ("Площадь прямоугольника со стороной " + r.a + " и " + r.b + " = "+r.area());

    Point p = new Point(1,1, 5,5);
    System.out.println ("Расстояние между точками "+distance(p));


  }

  public static void hello (String somebody) {
    System.out.println("Hello,"+somebody + "!");

  }

  public static double distance (Point p){
    return Math.sqrt((p.x2 - p.x1) * (p.x2 - p.x1) + (p.y2 - p.y1) * (p.y2 - p.y1));
  }

  }