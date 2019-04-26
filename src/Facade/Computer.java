package Facade;

/**
 * Created by shijuan on 2019/3/23.
 */
public class Computer {
    private  CPU cpu;
    private  Memory memory;
    private  Disk disk;

    public Computer() {
       cpu = new CPU();
       memory = new Memory();
       disk = new Disk();
    }



    public void  start(){
        cpu.start();
        disk.start();
        memory.start();

    }

    public  void  shutDown(){
        cpu.start();
        disk.start();
        memory.shutDown();
    }
}
