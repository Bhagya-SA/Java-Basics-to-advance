public class DataTypesDemo {
    public static void main(String[] args) {
        
        // Primitive Data Types

        // Integer types
        byte byteValue = 127;                 // 1 byte
        short shortValue = 32000;             // 2 bytes
        int intValue = 2147483647;            // 4 bytes
        long longValue = 9223372036854775807L;// 8 bytes

        // Floating-point types
        float floatValue = 3.14f;             // 4 bytes
        double doubleValue = 3.1415926535;    // 8 bytes

        // Character
        char charValue = 'A';                 // 2 bytes (Unicode)

        // Boolean
        boolean booleanValue = true;          // 1 bit (JVM-dependent)

        // Printing primitive types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        // Non-Primitive / Reference Data Types

        // String (sequence of characters)
        String stringValue = "Hello, Java!";
        
        // Array
        int[] intArray = {1, 2, 3, 4, 5};

        // Object (using a built-in class)
        Object obj = new Object();

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + stringValue);
        System.out.print("Array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nObject: " + obj.toString());

        // Wrapper Classes (Optional, showing use with primitives)
        Integer wrappedInt = Integer.valueOf(intValue);
        Double wrappedDouble = Double.valueOf(doubleValue);
        Boolean wrappedBoolean = Boolean.valueOf(booleanValue);

        System.out.println("\nWrapper Classes:");
        System.out.println("Integer: " + wrappedInt);
        System.out.println("Double: " + wrappedDouble);
        System.out.println("Boolean: " + wrappedBoolean);
    }
}
