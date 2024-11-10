package _387_First_Unique_Character_in_a_String;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Đếm tần suất
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 1);

        }

        // Tìm ký tự đầu tiên có tần suất = 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 0) {
                return i;
            }
        }

        return -1;
    }
}
