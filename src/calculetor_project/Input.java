package calculetor_project;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.io.*;


public class Input {

    Calculation calculation = new Calculation();

    Scanner scanf = new Scanner(System.in);
    public boolean testingCalculator(){

        String operand1 , operand2 , operator ;
        int check;
        NumberFormat formater = new DecimalFormat("#0.00");
        operand1 = scanf.next();
        operator = scanf.next();
        operand2 = scanf.next();

        check = Integer.parseInt(operand1);

        if (check != 0){
            if (operator.contains("+")){
                System.out.println(formater.format(calculation.addition(operand1 , operand2)));
                return true;
            }
            else if (operator.contains("-")){

                System.out.println(formater.format(calculation.subtractionf(operand1 , operand2)));
                return true;


            }else if (operator.contains("/")){

                System.out.println(formater.format(calculation.divitionf(operand1, operand2)));
                return true;


            }else if (operator.contains("*")){

                System.out.println(formater.format(calculation.multiplicationf(operand1 , operand2)));
                return true;

            }else if( operator.contains("^")) {

                System.out.println(formater.format(calculation.powerf(operand1 , operand2)));
                return true;

            }else
                return false;
        }

        return  false;

    }

    public static  void main(String args[]) {

        boolean check;
        Input ob = new Input();
        while (true){

            check = ob.testingCalculator();
            if(!check){
                System.out.println("Bye, now.");
                break;
            }
        }

    }

}
