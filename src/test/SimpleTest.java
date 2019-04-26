package test;

import org.junit.Test;
import springIoc.Car;
import springIoc.SimpleIOC;
import springIoc.Wheel;

/**
 * Created by shijuan on 2019/3/26.
 */
public class SimpleTest {
    @Test
    public void test() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("src/springIoc/ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
