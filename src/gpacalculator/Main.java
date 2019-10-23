package gpacalculator;
import gpacalculator.table;
import gpacalculator.input;

import java.util.Scanner;

public class Main {
    public static String[] classes = {"", "", "", ""};
    public static String[] identifiers = {"first", "second", "third" , "fourth"};
    public static String[] class1Grades = {"", "", "", ""};
    public static String[] class2Grades = {"", "", "", ""};
    public static String[] class3Grades = {"", "", "", ""};
    public static String[] class4Grades = {"", "", "", ""};
    public static int index;
    public static int i;
    public static int z;
    public static int quarter;

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        startUp();
        table.makeTable(classes[0], classes[1], classes[2], classes[3], class1Grades, class2Grades, class3Grades, class4Grades);
    }
    /**
     * Goes through a simple startup dialogue.
     */
    public static void startUp() {
        System.out.println("Hello and welcome to the GPA Calculator!");
        System.out.println("Please input 4 of your classes\n(Note, if you had more classes it's okay, just put in your grades in the corresponding slots.)");
        getClassNames();
        System.out.println("Okay, great! Now, lets get your grades in from  your school year!");
        getGrades();

    }
    /**
     * Asks the user for the names of his/her classes.
     */
    public static void getClassNames() {
        index = 0;
        for(i = 0; i < 4; i++) {
            System.out.println("What is the name of your " + identifiers[index] + " class?");
            classes[index] = sc.nextLine();
            index++;
        }
    }
    /**
     * Gets the grades throughout the school year.
     */
    public static void getGrades() {
        quarter = 1;
        index = 0;
        for(z = 0; z < 4; z++) {
            System.out.println("What was your Quarter " + quarter + " grade for " + classes[index] + "?");
            class1Grades[index] = sc.nextLine();
            quarter++;
        }
        quarter = 1;
        index = 1;
        for(z = 0; z < 4; z++) {
            System.out.println("What was your Quarter " + quarter + " grade for " + classes[index] + "?");
            class2Grades[index] = sc.nextLine();
            quarter++;
        }
        quarter = 1;
        index = 2;
        for(z = 0; z < 4; z++) {
            System.out.println("What was your Quarter " + quarter + " grade for " + classes[index] + "?");
            class3Grades[index] = sc.nextLine();
            quarter++;
        }
        quarter = 1;
        index = 3;
        for(z = 0; z < 4; z++) {
            System.out.println("What was your Quarter " + quarter + " grade for " + classes[index] + "?");
            class4Grades[index] = sc.nextLine();
            quarter++;
        }
    }
}