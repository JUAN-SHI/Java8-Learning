package test;

import BridgePattern.Color;
import BridgePattern.Pen;
import BridgePattern.XMLUtilPen;
import adaptee.M2DataAdapter2;
import adaptee.M5DataLine;
import adaptee.M5DataLineAdapter;
import adaptee.Target;
import factory.*;
import org.junit.Test;
import product.*;

/**
 * Created by shijuan on 2019/3/19.
 */
public class FactoryTest {

  @Test
    public void test(){
//      //获取circle的对象，并调用它的draw方法
//      Shape circle =  ShapeFactory.getShape("CIRCLE");
//     circle.drow();
//
//     Shape square  = (Shape) ShapeFactory2.getClass(Square.class);
//     square.drow();
//
//
//
//     Factory factory = new CircleFactory();
//     Shape shape = factory.getShape();
//     shape.drow();
//
//    Factory2 factory2 = new AKFactory();
//     Bullet bullet = factory2.productBullet();
//     bullet.load();
//     Gun gun =  factory2.productGun();
//     gun.shooting();
//
//
//      Builder builder = new ConcreteBuilder();
//      Director director = new Director(builder);
//     Product product=  director.construct();
//
//        MealA mealA = new MealA();
//        MealB mealB = new MealB();
//        MealDirector mealDirectorA = new MealDirector(mealA);
//        Meal A = mealDirectorA.construct();
//        System.out.println(A);
//
//        MealDirector mealDirectorB = new MealDirector(mealB);
//        Meal B = mealDirectorB.construct();
//        System.out.println(B);
//
//
//        //适配器测试
//      Target target = new M5DataLine();
//      target.connection();
//      Target adapter = new M5DataLineAdapter();
//      adapter.connection();
//
//
//      //类适配器测试
//      Target target1 = new M2DataAdapter2(new M5DataLine());
//      target1.connection();


      //组合适配器
      Color color;
      Pen pen;
      color = (Color) XMLUtilPen.getBean("color");
      pen = (Pen) XMLUtilPen.getBean("pen");
      pen.setColor(color);
      pen.draw("鲜花");


  };



}
