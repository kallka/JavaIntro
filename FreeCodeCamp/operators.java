package FreeCodeCamp;

class Operators {
    public static void main(String[] args) {
        int number1 = 12;
        double doub1 = 12;
        int number2 = 6;
        int number3 = 5;

        // addition
        System.out.println(number1 + number2); //18

        // subtraction
        System.out.println(number1 -  number2); // 6

        // multiplication
        System.out.println(number1 * number2); // 72

        // division
        System.out.println("Div 12/6: " + number1 / number2); // 2
        System.out.println("Div 12/5 (int/int): " + number1 / number3); // incorrect - 2 as it is int/int
        System.out.println("Div 12/5 (double/int): " + doub1/ number3); // correct as one is double

        // modulus (remainder)
        System.out.println(number1 % number2); // 0

        // bitwise operators
    }
}