//----- Lab09 -----
// Q03
package Lab09;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {


        while (!Thread.interrupted()) {
            System.out.println("Thread is running now!");
        }


        System.out.println("Thread is terminated!");
    }
}

class L9Q3 {

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);

        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        t.interrupt();
    }
}