public class DataRepresent {

    public static void main(String[] args) {
        // Check our Recap Answers
        // ints have 4 bytes
        int data = 0b01100011;
        System.out.println("Base 10(Decimal Value) is " + data);

        // check shortcuts
        data = 0b00111111;
        System.out.println("Octal "+Integer.toOctalString(data));

        data = 0b00111111;
        System.out.println("Hex "+Integer.toHexString(data));

        intDataType();
        byteDataType();
        longDataType();

    }

    // By default the long data type uses 8 bytes to store the integer using two's complement representation
    // MSB indicates the sign of the number  1 - means neg 0-positive
    // If you intialize a long with a number greater than the Integer.MAX_VALUE than you need  to
    // add L at the end of number
    private static void longDataType() {
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        System.out.println("Max Long "+maxLong);
        maxLong++;
        System.out.println("Max Long ? "+maxLong);

        long num = 2345678912L;
    }
    // By default the byte data type store numbers in the range -128 to 127
    // using two's complement numbers
    public static void byteDataType(){
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;

        System.out.println("Max "+maxByte);
        System.out.println("Min "+minByte);

        // cause overflow add 1 to maxByte
        maxByte++;
        System.out.println("Max is? "+maxByte);

        System.out.println(Integer.toBinaryString(maxByte));

        byte num = (byte) 0b10101010;

    }

    // This method will demo using the int data type
    // int is using 4 bytes to store numbers as two's complement numbers
    public static void intDataType() {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("Max int: " + max);
        System.out.println("Min int: " + min);

        // add 1 to max
        max++;
        System.out.println("Max Int overflowed: "+max);

        // assign a hex number (0x) to the int
        int num = 0xAFFAA23C;
        System.out.println("Num is " + num);

        // assign an octal number (0) to the int
        num = 0721;
        System.out.println("Num is " + num);

        // assign a binary number (0b)
        num = 0b0111000110;
        System.out.println("Num as Binary: " + Integer.toBinaryString(num));
    }

}
