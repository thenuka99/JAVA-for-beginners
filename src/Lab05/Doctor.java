//----- Lab05 -----
// Q06
package Lab05;

import java.util.Scanner;

public class Doctor {

    double bSal;
    double hRate;

    double getMonthlyPayment(double value) {
        return bSal + hRate * value;
    }
}

class Specialist extends Doctor {
    double channelCharge;
    double allowance;

    @Override
    double getMonthlyPayment(double value) {
        return bSal + allowance + channelCharge * value;
    }
}

class Lab5Q6Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Doctor d = new Doctor();
        Specialist s = new Specialist();

        //Doctor
        System.out.println("----- Doctor -----");
        System.out.print("Enter Basic Salary: ");
        d.bSal = scan.nextDouble();

        System.out.print("Enter Hourly Rate: ");
        d.hRate = scan.nextDouble();

        System.out.print("Enter Value: ");
        System.out.println("Doctor Salary: " + d.getMonthlyPayment(scan.nextDouble()));

        //Specialist
        System.out.println("----- Specialist -----");
        System.out.print("Enter Basic Salary: ");
        s.bSal = scan.nextDouble();

        System.out.print("Enter Hourly Rate: ");
        s.hRate = scan.nextDouble();

        System.out.print("Enter Channel Charge: ");
        s.channelCharge = scan.nextDouble();

        System.out.print("Enter Allowance: ");
        s.allowance = scan.nextDouble();

        System.out.print("Enter Value: ");
        System.out.println("Specialist Salary: " + s.getMonthlyPayment(scan.nextDouble()));
    }
}