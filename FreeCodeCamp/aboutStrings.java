package FreeCodeCamp;

class AbooutStrings {
    public static void main(String[] args) {
        char percentSign = '%';
        String nameString = "Someone Lastname";
        System.out.println(percentSign);
        System.out.println(nameString);

        // java uses a portion of memory to store a string. If a string is created using
        // literal String x = "", java will check if the string already exists in the string pool.
        // If a string is created using String x = new String(""), a new object will be created
        // regardless of whether the string exists or not.

        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString2 == objectString1);



    }
}