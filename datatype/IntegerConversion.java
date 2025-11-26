public class IntegerConversion {
    public static void main(String[] args) {
        // * Integer to String Conversion
        // * Automatic Conversion from byte -> short -> int -> long -> float -> double

        byte byteValue = 100;
        int intValue = byteValue; // * byte to int
        long longValue = intValue; // * int to long
        float floatValue = longValue; // * long to float
        double doubleValue = floatValue; // * float to double

        System.out.println("Byte Value: " + byteValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        // * Manual Conversion from double -> float -> long -> int -> short -> byte
        // ! Note: Be cautious of data loss during manual conversion, especially when converting from larger to smaller data types.
        double doubleVal = 123.45;
        float floatVal = (float) doubleVal; // * double to float
        long longVal = (long) floatVal; // * float to long
        int intVal = (int) longVal; // * long to int
        short shortVal = (short) intVal; // * int to short
        byte byteVal = (byte) shortVal; // * short to byte

        System.out.println("Double Value: " + doubleVal);
        System.out.println("Float Value: " + floatVal);
        System.out.println("Long Value: " + longVal);
        System.out.println("Int Value: " + intVal);
        System.out.println("Short Value: " + shortVal);
        System.out.println("Byte Value: " + byteVal);

        // * Integer to String Conversion
        int number = 500;
        String stringValue = Integer.toString(number); // * int to string
        System.out.println("Number: " + number);
        System.out.println("String Value: " + stringValue);

        // * String to Integer Conversion: parseInt();
        String stringValue2 = "1000";
        int number2 = Integer.parseInt(stringValue2); // * string to int
        System.out.println("String Value: " + stringValue2);
        System.out.println("Number: " + number2);

        // * String to Integer Conversion: valueOf();
        String stringValue3 = "2000";
        int number3 = Integer.valueOf(stringValue3); // * string to int
        System.out.println("String Value: " + stringValue3);
        System.out.println("Number: " + number3);
    }
}