//----- Lab09 -----
// Q02
package Lab09;

public class MultiThread extends Thread {
    String threadName;
    MultiThread t;

    MultiThread(String name) {
        this.threadName = name;
        System.out.println("Creating Thread: " + name);
    }

    @Override
    public void run() {
        System.out.println("Running Thread: " + this.threadName);
        for (int i = 0; i < 5; i++) {
            if (i == 3 && t != null) {
                t.interrupt();
            }
            System.out.println("threadName: " + this.threadName + " Count: " + (i + 1));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread:" + threadName + " is Interrupted!");
            }
        }
        System.out.println("Thread:" + threadName + " is Terminated!");

    }
}

class L9Q2 {

    public static void main(String[] args) {
        MultiThread t1 = new MultiThread("Thread number one");
        MultiThread t2 = new MultiThread("Thread number two");

        t1.start();
        t2.t = t1;
        t2.start();
        System.out.println("Main Thread Terminated!");
    }
}