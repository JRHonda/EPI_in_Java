import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourPointTwoTest {

    @Test
    void swapBits() {
        FourPointTwo fourPointTwo = new FourPointTwo();

        //System.out.println(fourPointTwo.swapBits(10,0,3));
        long result = fourPointTwo.swapBits(-10,0,3);
        System.out.print(result);
        assertTrue(result == -3);
    }
}