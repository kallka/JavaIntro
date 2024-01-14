package FreeCodeCamp;
// primitive data types

class Variables {
    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 127; // -128 to 127
        short aSmallNumber = 32767; // -32, 768 to 32,767
        int anInteger = 10; // -2,147,483,648 to 2,147,483,647
        long aLargeNumber = 9223372036854775807L; //- 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        
        // decimal types
        // compiler will automatically treat as double unless append 'F'
        double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38

        // booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        // characters - any unicode sequence
        char copyrightSymbol = '\u00A9';

        System.out.println("This is the copyright symbol: " + copyrightSymbol);
    }
}