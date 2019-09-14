/**
 *  Elements of Programming Interviews in Java
 *
 *  Question 4.2 - Swap Bits
 *
 *  Given a 64 bit integer, swap bits at indices i and j.
 */

public class FourPointTwo {


    FourPointTwo() {

    }

    // Time complexity O(1)
    public long swapBits(long value, int i, int j) {

        long copyOfValue = value;
        int valueAtSmallerIndex;
        int valueAtGreaterIndex;
        int smallerIndex = (i < j) ? i : j;
        int greaterIndex = (i < j) ? j : i;

        value >>>= smallerIndex;
        if ((value &  1) == 1) { valueAtSmallerIndex = 1; }
        else { valueAtSmallerIndex = 0; }

        value >>>= (greaterIndex - smallerIndex);
        if ((value & 1) == 1) { valueAtGreaterIndex = 1; }
        else { valueAtGreaterIndex = 0; }

        if (valueAtSmallerIndex == valueAtGreaterIndex) { return copyOfValue; }
        else {
            //swap bits
            long compareValue = (long) (Math.pow(2,smallerIndex) + Math.pow(2,greaterIndex));
            copyOfValue ^= compareValue;
            return copyOfValue;
        }
    }



}
