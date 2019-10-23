package gpacalculator;
/**
 * This class contains functions that will return outputs from given inputs.
 */
public class input {
    /**
     * This returns a letter grade to it's GPA numerical value.
     * @param letter
     * @return
     */
    public static double letterToNumberNormal(String letter) {
        if(letter.equals("A+")) {
            return 4.0;
        } else if (letter.equals("A")) {
            return 4.0;
        } else if(letter.equals("A-")) {
            return 3.7;
        } else if(letter.equals("B+")) {
            return 3.3;
        } else if(letter.equals("B")) {
            return 3.0;
        } else if(letter.equals("B-")) {
            return 2.7;
        } else if(letter.equals("C+")) {
            return 2.3;
        } else if(letter.equals("C")) {
            return 2.0;
        } else if(letter.equals("C-")) {
            return 1.7;
        } else if(letter.equals("D+")) {
            return 1.3;
        } else if(letter.equals("D")) {
            return 1.0;
        } else if(letter.equals("D-")){
            return 0.7;
        } else {
            return 0.0;
        }
    }
    /**
     * This returns a letter grade to its Honors GPA numerical value.
     * @param letter
     * @return
     */
    public static double letterToNumberHonors(String letter) {
        if(letter.equals("A+")) {
            return 4.5;
        } else if (letter.equals("A")) {
            return 4.5;
        } else if(letter.equals("A-")) {
            return 4.2;
        } else if(letter.equals("B+")) {
            return 3.8;
        } else if(letter.equals("B")) {
            return 3.5;
        } else if(letter.equals("B-")) {
            return 3.2;
        } else if(letter.equals("C+")) {
            return 2.8;
        } else if(letter.equals("C")) {
            return 2.5;
        } else if(letter.equals("C-")) {
            return 2.2;
        } else if(letter.equals("D+")) {
            return 1.8;
        } else if(letter.equals("D")) {
            return 1.5;
        } else if(letter.equals("D-")) {
            return 1.2;
        } else {
            return 0.0;
        }
    }
    /**
     * This returns a letter grade to its AP GPA numerical value;
     * @param letter
     * @return
     */
    public static double letterToNumberAP(String letter) {
        if(letter.equals("A+")) {
            return 5.0;
        } else if(letter.equals("A")) {
            return 5.0;
        } else if(letter.equals("A-")) {
            return 4.7;
        } else if(letter.equals("B+")) {
            return 4.3;
        } else if(letter.equals("B")) {
            return 4;
        } else if(letter.equals("B-")) {
            return 3.7;
        } else if(letter.equals("C+")) {
            return 3.3;
        } else if(letter.equals("C")) {
            return 3.0;
        } else if(letter.equals("C-")) {
            return 2.7;
        } else if(letter.equals("D+")) {
            return 2.3;
        } else if(letter.equals("D")) {
            return 2.0;
        } else if(letter.equals("D-")) {
            return 1.7;
        } else {
            return 0.0;
        }
    }
    /**
     * This takes a GPA number and returns a grade scale letter.
     * @param number
     * @return
     */
    public static String numberToLetterNormal(double number) {
        if(number == 4.0) {
            return "A";
        } else if (number == 3.7) {
            return "A-";
        } else if (number == 3.3) {
            return "B+";
        } else if (number == 3.0) {
            return "B";
        } else if (number == 2.7) {
            return "B-";
        } else if (number == 2.3) {
            return "C+";
        } else if (number == 2.0) {
            return "C";
        } else if (number == 1.7) {
            return "C-";
        } else if (number == 1.3) {
            return "D+";
        } else if (number == 1.0) {
            return "D";
        } else if (number == 0.7) {
            return "D-";
        } else {
            return "F";
        }
    }
    /**
     * This returns a percentage grade to it's GPA numerical value.
     * @param percent
     * @return
     */
    public static double percentToNumberNormal(int percent) {
        if((percent <= 100 || percent >= 97) || (percent <= 96 || percent >= 93 )) {
            return 4.0;
        } else if(percent <= 92 && percent >= 90) {
            return 3.7;
        } else if(percent <= 89 && percent >= 87) {
            return 3.3;
        } else if(percent <= 86 && percent >= 83) {
            return 3.0;
        } else if(percent <= 82 && percent >= 80) {
            return 2.7;
        } else if(percent <= 79 && percent >= 77) {
            return 2.3;
        } else if(percent <= 76 && percent >= 73) {
            return 2.0;
        } else if(percent <= 72 && percent >= 70) {
            return 1.7;
        } else if(percent <= 69 && percent >= 67) {
            return 1.3;
        } else if(percent <= 66 && percent >= 65) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
}