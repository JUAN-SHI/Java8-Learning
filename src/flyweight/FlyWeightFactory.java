package flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by shijuan on 2019/3/23.
 */
public class FlyWeightFactory {
    private static ConcurrentHashMap<String,FlyWeight> allFlyWeight = new ConcurrentHashMap<>();
    public  static FlyWeight getFlyWeight(String name){
        if (allFlyWeight.get(name) == null){
            synchronized (allFlyWeight){
                if (allFlyWeight.get(name) == null){
                    FlyWeight flyWeight = new ConcreteFlyWeight(name);
                    allFlyWeight.put(name,flyWeight);
                }
            }
        }

    return  allFlyWeight.get(name);
    }

}
