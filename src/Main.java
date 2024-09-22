public class Main {
    public static void main(String[] args) {
        // declaring variables
        int intOperandA = 16;
        int intOperandB = 1;
        int intSum = 32;
        int intProduct = 64;
        int intDifference = 128;
        int intQuotient = 256;
        int intModulo = 512;
        double doubleOperandA = 3.5;
        double doubleOperandB = 16.4;
        double doubleSum = 32.78;
        double doubleProduct = 64.96;
        double doubleDifference = 128.55;
        double doubleQuotient = 256.78;
        double doubleModulo = 512.24;
        int childrenInFamily = 3;
        boolean isItRaining = false; // will it ever?
        double gallonGasPrice = 3.11;
        int favoriteNumber = 95;
        double shoeSize = 10.5;
        String birthMonth = "September";
        String fullName = "Joshua David Blank";

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandB % intOperandA;
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The remainder using ints of " + intOperandB + " " + intOperandA + " is " + intModulo);
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The remainder using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleModulo);
    }
}