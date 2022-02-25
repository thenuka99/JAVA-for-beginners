//----- Lab10 -----
// Q04
package Lab09;

public class Count {

    synchronized void printCount(int n) {
        System.out.println("Thread Started...");

        for (int i = 0; i < 5; i++) {
            System.out.println("Count Value: " + (i * n));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }

        }
        System.out.println("Thread terminated!");
    }
}

class Thread01 extends Thread{
    Count c;
    Thread01(Count c){
        this.c = c;
    }

    @Override
    public void run() {
        c.printCount(10);
    }
}

class Thread02 extends Thread{
    Count c;
    Thread02(Count c){
        this.c = c;
    }

    @Override
    public void run() {
        c.printCount(100);
    }
}

class L9Q4{
    public static void main(String[] args) {
        Count ct = new Count();

        Thread01 t1 = new Thread01(ct);
        Thread02 t2 = new Thread02(ct);

        t1.start();
        t2.start();

    }
}