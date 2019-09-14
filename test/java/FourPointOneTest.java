import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FourPointOneTest {

    @Test
    void computeParity() {
        FourPointOne fourPointOne = new FourPointOne(2L);
//        assertTrue(fourPointOne.computeParity() == 0);
//        fourPointOne.setTestWord(8L);
       assertTrue(fourPointOne.computeParity() == 1);

        fourPointOne.compareANDbitwise(16,15);
    }

    @Test
    void swapBits() {

    }
}