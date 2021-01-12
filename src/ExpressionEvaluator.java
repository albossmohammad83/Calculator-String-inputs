/*
 * Chapter 6 Lab
 * Description: prompt the user to give us one operator and two operands, then we will process the request.
 * Name: Mohammad Abdelrahman
 * ID: 920158652
 * Class: CSC 211-02
 * Semester: fall 2020
 */
import java.util.Scanner;
public class ExpressionEvaluator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //creat an objet input to store the user input
        System.out.println("Welcome to my Expression Evaluator!");
        System.out.println("Enter an operand:");
        double operand1 = input.nextDouble(); // store the user's first operand
        System.out.println("Enter an operand:");
        double operand2 = input.nextDouble(); // store the user's second operand
        System.out.println("Enter an operator (+,-,*,/,^):");
        String operator = input.next();// store the user's operator
        input.close(); // closing scanner
        System.out.println("Checking if '" + operator + "' is a valid operator...");
        if(isValidOperator(operator)){ // check if the user's operator is valid
            System.out.println("'" + operator + "' is a valid operator!");
            System.out.println(getResultText(operand1, operand2, operator)); // get the results for the two operands
        }
        else{ // if the operator is not valid prompt the user
            System.out.println("'" + operator + "' is NOT a valid operator!");
            System.out.println("The operator you entered was not a proper operator");
        }
        System.out.println("Ending program...");
    }

    static boolean isValidOperator(String oper){ // method to check if operator is valid
        switch(oper.charAt(0)){
            case '+' :
            case '-' :
            case '*' :
            case '/' :
            case '^' :
                return true;
            default:
                return false;
        }
    }

    static double add(double oper1, double oper2){ // method to add two operands

        return oper1 + oper2;
    }
    static double subtract(double oper1, double oper2){// method to subtract two operands

        return oper1 - oper2;
    }
    static double multiply(double oper1, double oper2){ // method to multiply two operands

        return oper1 * oper2;
    }
    static double divide(double oper1, double oper2){// method to divide two operands

        return oper1 / oper2;
    }
    static double power(double oper1, double oper2){// method to find power of the two operands

        return Math.pow(oper1,oper2);
    }
    /*
    * method that takes in the 2 operands, operator,
    *  and calculated result and format it into a string with the format:*/
    static String getResultText(double oper1, double oper2, String oper){
        switch(oper.charAt(0)){
            case '+' :
               return oper1 + " " + oper + " " + oper2 + " = " + add(oper1, oper2);
            case '-' :
                return oper1 + " " + oper + " " + oper2 + " = " + subtract(oper1, oper2);
            case '*' :
                return oper1 + " " + oper + " " + oper2 + " = " + multiply(oper1, oper2);
            case '/' :
                return oper1 + " " + oper + " " + oper2 + " = " + divide(oper1, oper2);
            case '^' :
                return oper1 + " " + oper + " " + oper2 + " = " + power(oper1, oper2);
            default:
                return null;
        }
    }
}
