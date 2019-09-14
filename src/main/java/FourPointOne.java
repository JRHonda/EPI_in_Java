/**
 * Elements of Programming Interviews in Java
 *
 * Question 4.1 - Computing the Parity of a Word
 *
 * The parity of a binary word is 1 if the number of 1s in the word is odd; otherwise, it is 0. For example, the parity
 * of 1011 is 1, and the parity of 10001000 is 0. Parity checks are used to detect single bit errors in data storage
 * and communication.
 *
 * How would you compute the parity of a very large number of 64-bit words?
 */

public class FourPointOne {

    // Fields
    private Long testWord;
    public Long getTestWord() { return this.testWord; }
    public void setTestWord(Long word) { this.testWord = word; }

    FourPointOne(Long word) {
        this.testWord = word;
    }

    //   1001 (9)
    // & 0101 (5)
    // = 0001 (1)
    public void compareANDbitwise(long a, long b) {
//        long result;
//        result |=
        printLine(a & b);
    }

    // Methods
    public int computeParity() {

        System.out.println(Long.toString(testWord.longValue(), 2));
        short result = 0;
        Long x = getTestWord();
        String observe = "";
        String observeTwo = "";
        while (getTestWord() != 0) {
            result ^= (getTestWord() & 1);
            observeTwo += result;
            x >>= 1;
            setTestWord(x);
        }
        return result;
    }

    public <T> void printLine(T content) {
        System.out.println(content);
    }


}
