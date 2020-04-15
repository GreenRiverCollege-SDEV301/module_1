/**
 * This class will store a 16-bit integer and will have methods that allow for the
 * retrieval of a bit's value and the set or unset of a bit's value
 */
public class BitShort {

    private short bits;  // index 0 - 15

    // get(1)
    //     1010 0000 0001 0010 stored in bits
    //                      |
    //index                 1

    /**
     * This method will return true if the bit at the given index is 1 and returns false if 0
     * @param index integer in the range 0 - 15
     * @return true/false
     */
    public boolean get(int index){
         // TODO: add check to see if index between between 0 and 15
         //Create a mask with all zeros except for the bit of interest(index)
         short mask = getMask(index);

         // Bitwise AND & this mask with the data and save the result
         short result = (short)(mask & bits);

         // if bit is set, return true
         if(result != 0)
             return true;

         return false;

    }

    /**
     * Set method sets the bit at index to 1 if value is true and sets the bit to 0 if value is false
     * @param index an integer in the range 0 to 15
     * @param value true - set bit to 1, false - set bit to 0
     */
    public void set(int index, boolean value) {
        short mask = getMask(index);
        // if true - set bit to 1
        if(value) {
            //Bitwise OR | this mask with the data and save the changed data
            bits = (short) (bits | mask);
        } else {  // false - unset  (set to 0)
            // 0000 0000 0000 0010 mask
            // 1111 1111 1111 1101 - invert the mask
            //Create a mask with all ones except for the bit of interest is set to 0
            mask = (short)(~mask);
            //Bitwise AND & this mask with the data and save the changed data
            bits = (short) (bits & mask);
        }
    }

    // Creates a mask with all zeros except for the bit of interest is set to 1
    private short getMask(int index) {
        short mask = 0b0000000000000001;
        // shift the mask left index times
        mask = (short) (mask << index);
        return mask;
    }

}
