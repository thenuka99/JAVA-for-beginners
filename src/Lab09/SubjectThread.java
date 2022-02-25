//----- Lab09 -----
// Q01
package Lab09;

import java.util.Scanner;

public class SubjectThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running.....");
        String subject;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Subject: ");
            subject = scan.nextLine();

            System.out.println("Subject: " + subject);
            try {
            Thread.sleep(3000);
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted!");
            }
        }
        System.out.println("Thread is successfully terminated!");
    }
}

class DemoL9Q1{

    public static void main(String[] args) {
        SubjectThread t = new SubjectThread();
        t.start();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        t.interrupt();
        System.out.println("Main thread terminated!");
    }
}