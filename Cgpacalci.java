import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.*;

class Cgpacalci
{
    public static void main(String[] args) {


            int credits1 = 0, credits2 = 0, credits3 = 0, credits4 = 0, credits5 = 0,credits6=0, add_credits;
            float grade_points1 = 0, grade_points2 = 0, grade_points3 = 0, grade_points4 = 0,grade_points6=0,
                    grade_points5 = 0, cgp1, cgp2, cgp3, cgp4, cgp5,cgp6, add_of_cp_1_2,cgpa, gpa;
            int x = 0;



                String msge = "Enter Your Name";
                AtomicReference<String> con1 = new AtomicReference<>(JOptionPane.showInputDialog(msge));
                String c_con1 = con1.get();
                String roll = "Your Register No:";
                AtomicReference<String> roll1 = new AtomicReference<>(JOptionPane.showInputDialog(roll));
                String roll2 = roll1.get();
                float holdgpa = 0;
            while(x<7) {
                System.out.println("\t==============");
                System.out.println("\tGPA CALCULATOR");
                System.out.println("\t==============");
                try {
                    System.out.println("0" + (x + 1) + "-SEMESTER GPA");
                    System.out.println("Student Name: " + c_con1);
                    System.out.println("Register No: " + roll2);
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Credit1:");
                    credits1 = scanner.nextInt();
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Grade points1:");
                    grade_points1 = scanner1.nextFloat();

                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Credit2:");
                    credits2 = scanner2.nextInt();
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Grade points2:");
                    grade_points2 = scanner3.nextFloat();

                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Credit3:");
                    credits3 = scanner4.nextInt();
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Grade points3:");
                    grade_points3 = scanner5.nextFloat();

                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Credit4:");
                    credits4 = scanner6.nextInt();
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.println("Grade points4:");
                    grade_points4 = scanner7.nextFloat();

                    Scanner scanner8 = new Scanner(System.in);
                    System.out.println("Credit5:");
                    credits5 = scanner8.nextInt();
                    Scanner scanner9 = new Scanner(System.in);
                    System.out.println("Grade points5:");
                    grade_points5 = scanner9.nextFloat();

                    Scanner scanner10 = new Scanner(System.in);
                    System.out.println("Credit6:");
                    credits6 = scanner10.nextInt();
                    Scanner scanner11 = new Scanner(System.in);
                    System.out.println("Grade points6:");
                    grade_points6 = scanner11.nextFloat();

                } catch (InputMismatchException e) {
                    System.out.println("enter a valid input");
                }

                // adding of credits
                add_credits = credits1 + credits2 + credits3 + credits4 + credits5 + credits6;
                // multiply the credits with grade points
                cgp1 = credits1 * grade_points1;
                cgp2 = credits2 * grade_points2;
                cgp3 = credits3 * grade_points3;
                cgp4 = credits4 * grade_points4;
                cgp5 = credits5 * grade_points5;
                cgp6 = credits6 * grade_points6;

                add_of_cp_1_2 = cgp1 + cgp2 + cgp3 + cgp4 + cgp5 + cgp6;
                gpa = add_of_cp_1_2 / add_credits;

                System.out.println("your GPA:" + gpa);
                holdgpa = holdgpa + gpa;
                x++;


            }

                 cgpa = holdgpa / 6;
                 System.out.println("CGPA:" + cgpa);




    }
}