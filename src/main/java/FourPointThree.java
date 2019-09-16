import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FourPointThree {

    public long reverseBits(long value) {
        Map<Integer, Long> map = new HashMap<>();

        long[] res = {0};

        int counter = 0;
        while (value != 0) {
            if ((value & 1) == 0) { map.put(counter++, (long) 0); }
            if ((value & 1) == 1) { map.put(counter++, (long) 1); }
            value >>>= 1;
        }

        map.forEach((inty, longy) -> res[0] += Math.pow(2, map.size() - 1 - inty) * longy);
        System.out.println(res[0]);
        return res[0];
    }
}