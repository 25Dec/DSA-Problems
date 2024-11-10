// Link: https://app.codility.com/programmers/lessons/1-iterations/binary_gap/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solution(int N) {
        if (N <= 4)
            return 0;

        // Từ N -> Nhị phân
        List<Integer> arrList = new ArrayList<>();

        int copyOfN = N;
        while (copyOfN != 0) {
            arrList.add(copyOfN % 2);
            copyOfN /= 2;
        }
        Collections.reverse(arrList);

        // Sliding Window
        int left = 0, right = 1, max = 0, count = 0;

        while (right < arrList.size()) {
            if (arrList.get(right) == 0)
                count++;
            else {
                left = right;
                max = Math.max(max, count);
                count = 0;
            }

            right++;
        }

        return max;
    }
}
