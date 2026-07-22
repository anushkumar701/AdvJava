package General;

import java.util.Scanner;

class emp {
    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("Enter the EID : ");
        int eid = sc.nextInt();
        System.out.println("Enter the Salary : ");
        double sal = sc.nextDouble();
        System.out.println("Enter the experiance (in year) :");
        int exp = sc.nextInt();
        System.out.println("Enter the gender :");
        char gender = sc.next().charAt(0);

        System.out.println("empid :" + eid);
        System.out.println("Salary :" + sal);
        System.out.println("Experiance :" + exp);
        System.out.println("gender :" + gender);
    }
}
