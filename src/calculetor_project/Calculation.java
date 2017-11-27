package calculetor_project;

public class Calculation {

    public double addition (String first_operand , String second_operand ){

        double operand1 = 0 , operand2 = 0, summation = 0;

        operand1 = Double.parseDouble(first_operand);
        operand2 = Double.parseDouble(second_operand);
        summation = operand1 + operand2;

        return summation;
    }
    public double subtractionf (String first_operand , String second_operand ){

        double operand1 = 0 , operand2 = 0, subtraction = 0;

        operand1 = Double.parseDouble(first_operand);
        operand2 = Double.parseDouble(second_operand);
        subtraction = operand1 - operand2;

        return subtraction;
    }
    public double  multiplicationf (String first_operand , String second_operand ){

        double operand1 = 0 , operand2 = 0, multiplication = 0;

        operand1 = Double.parseDouble(first_operand);
        operand2 = Double.parseDouble(second_operand);
        multiplication = operand1 * operand2;

        return multiplication;
    }
    public double divitionf (String first_operand , String second_operand ){

        double operand1 = 0 , operand2 = 0, divition = 0;

        operand1 = Double.parseDouble(first_operand);
        operand2 = Double.parseDouble(second_operand);
        try {

            divition = operand1 / operand2;

        }catch (ArithmeticException e){
            System.out.println("Math Error");
        }

        return divition;
    }

    public double powerf(String first_operand , String second_operand){

        double operand1 = 0 , operand2 = 0, power = 1;
        operand1 = Double.parseDouble(first_operand);
        operand2 = Double.parseDouble(second_operand);
        if (operand2 == 0)
            return  power;
        for(int i = 1 ; i<= operand2 ; i++ ){
            power *= operand1;
        }
        return  power;
    }


}
