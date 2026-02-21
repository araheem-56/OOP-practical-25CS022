//25CS022
package com.company;
import java.util.Scanner;
public class scan {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter university name: ");
        String uni = a.nextLine();
        System.out.println("Enter department name: ");
        String dept = a.nextLine();
        System.out.println("Enter number of students: ");
        int q = a.nextInt();
        for (int i=1;i<=q;i++){
            System.out.println("Roll No for Student "+i+" : 25CS0"+2*i);
        }

    }
}
