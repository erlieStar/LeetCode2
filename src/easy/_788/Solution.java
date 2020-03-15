package easy._788;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int rotatedDigits(int N) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(8, 8);
        map.put(2, 5);
        map.put(5, 2);
        map.put(6, 9);
        map.put(9, 6);
        int total = 0;
        for (int i = 1; i <= N; i++) {
            int M = i;
            boolean flag = true;
            int tempNum = 0;
            int mul = 1;
            while (M != 0) {
                int num = M % 10;
                Integer mapNum = map.get(num);
                if (mapNum == null) {
                    flag = false;
                    break;
                }
                tempNum = tempNum + mapNum * mul;
                mul *= 10;
                M /= 10;
            }
            if (flag && tempNum != i) {
                total++;
            }
        }
        return total;
    }
}
