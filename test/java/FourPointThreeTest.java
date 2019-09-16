import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FourPointThreeTest {

    @Test
    void reverseBits() {
        FourPointThree fourPointThree = new FourPointThree();
        long result = fourPointThree.reverseBits(16);
        System.out.println(result);
        assertTrue(result == 1);
    }
}