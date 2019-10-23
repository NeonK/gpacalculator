package gpacalculator;
/**
 * This class provides methods to organize the table.
 */
public class table {
    // Global Variables
    // School Class Names
    public static String class1;
    public static String class2;
    public static String class3;
    public static String class4;

    // School Class Letter Grades
    public static String[] class1Letter = {"  ", "  ", "  ", "  "};
    public static String[] class2Letter = {"  ", "  ", "  ", "  "};
    public static String[] class3Letter = {"  ", "  ", "  ", "  "};
    public static String[] class4Letter = {"  ", "  ", "  ", "  "};

    // GPA's
    public static double gpaQuarter1;
    public static double gpaQuarter2;
    public static double gpaQuarter3;
    public static double gpaQuarter4;
    public static double gpaFinal;

    // The table
    public static String tableLine1;
    public static String tableLine2;
    public static String tableLine3;
    public static String tableLine4;
    public static String tableLine5;
    public static String tableLine6;
    public static String tableLine7;
    public static String tableLine8;
    public static String tableLine9;
    public static String class1Space;
    public static String class2Space;
    public static String class3Space;
    public static String class4Space;
    public static int index;
    public static int spacing;
    public static int lineLength;
    public static int i;

    public static void makeTable(String class1, String class2, String class3, String class4, String[] class1grades, String[] class2grades, String[] class3grades, String[] class4grades) {
        // This finds which class has the longest name length
        if(class1.length() > class2.length()) {
            spacing = class1.length();
            if(class1.length() > class3.length()) {
                spacing = class1.length();
                if(class1.length() > class4.length()) {
                    spacing = class1.length();
                } else {
                    spacing = class4.length();
                }
            } else {
                spacing = class3.length();
                if(class3.length() > class4.length()) {
                    spacing = class3.length();
                } else {
                    spacing = class4.length();
                }
            }
        } else {
            spacing = class2.length();
            if(class2.length() > class3.length()) {
                spacing = class2.length();
                if(class2.length() > class4.length()) {
                    spacing = class2.length();
                } else {
                    spacing = class4.length();
                }
            } else {
                spacing = class3.length();
                if(class3.length() > class4.length()) {
                    spacing = class3.length();
                } else {
                    spacing = class4.length();
                }
            }
        }
        // The length of the lines are then set to 22 + the length of the name of the longest class.
        lineLength = 22 + spacing;
        for(i = 0; i < lineLength; i++) {
            tableLine1 = tableLine1 + "-";
        }
        // Since tableLine3, 5, 7, and 9 are identical they are set to each other.
        tableLine3 = tableLine1;
        tableLine5 = tableLine1;
        tableLine7 = tableLine1;
        tableLine9 = tableLine1;

        // This determines how much space is between the end of the class name and the first vertical line.
        for(i = 0; i < ((spacing - class1.length()) + 1); i++) {
            class1Space = class1Space + " ";
        }
        index = 0;
        // If the grades are only once character long, a space is added to them.
        for(i = 0; i < 4; i++) {
            if(class1grades[index].length() == 1) {
                class1grades[index] = class1grades[index] + " ";
                index++;
            }
        }
        tableLine2 = class1 + class1Space + "| " + class1grades[0] + " | " + class1grades[1] + " | " + class1grades[2] + " | " + class1grades[3] + " |";

        // This determines how much space is between the end of the class name and the first vertical line.
        for(i = 0; i < ((spacing - class2.length()) + 1); i++) {
            class2Space = class2Space + " ";
        }
        index = 0;
        // If the grades are only once character long, a space is added to them.
        for(i = 0; i < 4; i++) {
            if(class2grades[index].length() == 1) {
                class2grades[index] = class2grades[index] + " ";
                index++;
            }
        }
        tableLine4 = class2 + class2Space + "| " + class2grades[0] + " | " + class2grades[1] + " | " + class2grades[2] + " | " + class2grades[3] + " |";

        // This determines how much space is between the end of the class name and the first vertical line.
        for(i = 0; i < ((spacing - class3.length()) + 1); i++) {
            class3Space = class3Space + " ";
        }
        index = 0;
        // If the grades are only once character long, a space is added to them.
        for(i = 0; i < 4; i++) {
            if(class3grades[index].length() == 1) {
                class3grades[index] = class3grades[index] + " ";
                index++;
            }
        }
        tableLine6 = class3 + class3Space + "| " + class3grades[0] + " | " + class3grades[1] + " | " + class3grades[2] + " | " + class3grades[3] + " |";

        // This determines how much space is between the end of the class name and the first vertical line.
        for(i = 0; i < ((spacing - class4.length()) + 1); i++) {
            class4Space = class4Space + " ";
        }
        index = 0;
        // If the grades are only once character long, a space is added to them.
        for(i = 0; i < 4; i++) {
            if(class4grades[index].length() == 1) {
                class4grades[index] = class4grades[index] + " ";
                index++;
            }
        }
        tableLine8 = class4 + class4Space + "| " + class4grades[0] + " | " + class4grades[1] + " | " + class4grades[2] + " | " + class4grades[3] + " |";
    }

    public static void printTable() {
        System.out.println(tableLine1);
        System.out.println(tableLine2);
        System.out.println(tableLine3);
        System.out.println(tableLine4);
        System.out.println(tableLine5);
        System.out.println(tableLine6);
        System.out.println(tableLine7);
        System.out.println(tableLine8);
        System.out.println(tableLine9);
    }
}