import java.util.Scanner;

public class java_algos {

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            int bit = binary.charAt(length - 1 - i) - '0';
            decimal += bit * Math.pow(2, i);
        }
        return decimal;
    }

    public static String decimalToHexadecimal(int decimal) {
        String hexDigits = "0123456789ABCDEF";
        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            hexadecimal.insert(0, hexDigits.charAt(decimal % 16));
            decimal /= 16;
        }
        return hexadecimal.length() > 0 ? hexadecimal.toString() : "0";
    }

    public static int hexadecimalToDecimal(String hexadecimal) {
        String hexDigits = "0123456789ABCDEF";
        int decimal = 0;
        int length = hexadecimal.length();
        for (int i = 0; i < length; i++) {
            int value = hexDigits.indexOf(hexadecimal.charAt(length - 1 - i));
            decimal += value * Math.pow(16, i);
        }
        return decimal;
    }

    public static String hexadecimalToBinary(String hexadecimal) {
        int decimal = hexadecimalToDecimal(hexadecimal);
        return decimalToBinary(decimal);
    }

    public static String binaryToHexadecimal(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHexadecimal(decimal);
    }

    public static void main(String[] args) {
        System.out.println("\nDecimal to Binary (10):");
        System.out.println(decimalToBinary(10));

        System.out.println("\nBinary to Decimal (1010):");
        System.out.println(binaryToDecimal("1010"));

        System.out.println("\nDecimal to Hexadecimal (255):");
        System.out.println(decimalToHexadecimal(255));

        System.out.println("\nHexadecimal to Decimal (FF):");
        System.out.println(hexadecimalToDecimal("FF"));

        System.out.println("\nHexadecimal to Binary (FF):");
        System.out.println(hexadecimalToBinary("FF"));

        System.out.println("\nBinary to Hexadecimal (11111111):");
        System.out.println(binaryToHexadecimal("11111111"));
    }
}
