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
        shortDataType();

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
        System.out.println(Long.toBinaryString(num));
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

        System.out.println(createBinaryString(maxByte));

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
        System.out.println("Num as Binary: " + createBinaryString(num));
    }
    
     // This method will demo using the short data type
    //  short is using 2 bytes to store numbers as two's complement numbers
    public static void shortDataType() {
    
        short max = Short.MAX_VALUE;
        short min = Short.MIN_VALUE;

        System.out.println("Max short: " + max);
        System.out.println("Min short: " + min);

        // add 1 to max
        max++;
        System.out.println("Max Short overflowed: "+max);

        // assign a hex number (0x) to the short
        short num = (short) 0xFFAA;
        System.out.println("Num is " + num);

        // assign an octal number (0) to the short
        num = 0721;
        System.out.println("Num is " + num);

        // assign a binary number (0b)
        num = 0b0110111101110001;
        System.out.println("Num as Binary: " + createBinaryString(num));

    }

     // this helper method adds leading 0's to the BinaryString so the BinaryString always has 32 bits
    private static String createBinaryString(int num){
        final int BITS_IN_INT = 32;  // number of bits in a 4 byte primitive int

        String result = Integer.toBinaryString(num); // this method does not return leading 0's

        // so we must add them, create empty zeros string
        String zeros = "";

        // pad leading zeros onto binary string, if result string length is < 32
        for (int i=0; i< BITS_IN_INT - result.length(); i++){
            zeros += "0";
        }
        return zeros + result;
    }

}
