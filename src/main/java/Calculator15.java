public class Calculator15 {
    /*Create a class Calculator with three fields: double operand1, double operand2 and String operator. Add a constructor that sets all three fields.
    In this class, add an operate method that will check what operator is ("+", "-", "x" or "/") and executes the correct operation, returning the result.
    Add a main method to this class so that you can write a few sample cases and print the results.*/

    double operand1;
    double operand2;
    String operator;

    public double Method(double firstOne, double secondOne, String operator) {
        this.operand1 = firstOne;
        this.operand2 = secondOne;
        this.operator = operator;

        if (operator.equals("+")) {
            return (firstOne + secondOne);
        }
        if (operator.equals("-")) {
            return (firstOne - secondOne);
        }
        if (operator.equals("*")) {
            return (firstOne * secondOne);
        }
        if (operator.equals("/")) {
            return (firstOne / secondOne);
        }
        return(0);
    }

        public static void main (String[]args){
        Calculator15 calculate = new Calculator15();
            System.out.println(calculate.Method(10,5,"+"));
        }
    }