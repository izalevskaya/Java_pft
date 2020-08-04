package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {
  Square s = new Square (5);
    Assert.assertEquals(s.area(),25.0);
  }
@Test
  public void testDistance1(){
    Point p1 = new Point(1,1);
    Point p2 = new Point(5,5);
    Assert.assertEquals(p1.distance(p2),5.656854249492381);
}
  @Test
  public void testDistance2(){
    Point p1 = new Point(10,5);
    Point p2 = new Point(5,5);
    Assert.assertEquals(p1.distance(p2),5.0);
  }
  @Test
  public void testDistance3(){
    Point p1 = new Point(2,-2);
    Point p2 = new Point(-3,4);
    Assert.assertEquals(p1.distance(p2),7.810249675906654);
  }
}