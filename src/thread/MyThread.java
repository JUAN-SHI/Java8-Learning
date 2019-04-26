package thread;

/**
 * Created by shijuan on 2019/4/17.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("My Thread");
    }
}
