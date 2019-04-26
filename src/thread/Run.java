package thread;

/**
 * Created by shijuan on 2019/4/17.
 */
public class Run {
//    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start();
//        System.out.println("运行结束");
//    }

    public static void main(String[] args) {
        Myrunnable myrunnable = new Myrunnable();
        Thread thread = new Thread(myrunnable);
        thread.start();
        System.out.println("运行结束");
    }
}
