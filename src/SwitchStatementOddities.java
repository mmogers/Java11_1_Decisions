/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Switch Statements
Sub-Topic: Out of Ordinary
*/

public class SwitchStatementOddities {
    public static void main(String[] args) {
        byte[] bytes = {100, 103, 104, 107, 126};
        String caseAssignedValue = "";
        start_for: //a label
        for (var i : bytes) {  // Using LVTI here
            //switch (i * 10) {  // Use an Expressio
            switch (i) { //compiler error - i is byte,
            // but when its multiplied by 10 it is int, and all cases are ints
                //case 1000:
                //case 1030:
                //case 1040:
                //case 1070:
                case 100:
                case 103:
                case 104:
                    //continue; //starts from 107 - the next one in for loop
                    break; // changing from continue to break
                case 107:
                    //caseAssignedValue = "Less than 1100";
                    caseAssignedValue = "Less than 110";
                    break start_for; //add a label to break from for loop
                //case 1260:
                case 126:
                    //caseAssignedValue = "Equal to 1260";
                    caseAssignedValue = "Equal to 126";
                    break;
            }
            System.out.println("Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);


        }
    }
}