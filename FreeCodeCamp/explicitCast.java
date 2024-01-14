package FreeCodeCamp;
// A double cannot be automatically converted to an int as the int is smaller.
// However, by explicitly casting the double as an int (see parantheses), we are
// able to make this conversion in java.

class ExplicitCast {
    public static void main(String[] args) {
        double aDouble = 20.8;
        int castInt = (int)aDouble;

        System.out.println("I have explicitly cast a double as an int: " + castInt);
    }
}