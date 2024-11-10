package _13_Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        int sum = 0, strSize = s.length();
        Map<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);

        char currChar = ' ';
        char nextChar = ' ';
        int i = 0;

        while (i < strSize) {
            currChar = s.charAt(i);

            if (currChar == 'I' || currChar == 'X' || currChar == 'C') {
                if (i == strSize - 1) {
                    sum += hmap.get(currChar);
                    break;
                } else {
                    nextChar = s.charAt(i + 1);

                    if (hmap.get(nextChar) / hmap.get(currChar) == 5
                            || hmap.get(nextChar) / hmap.get(currChar) == 10) {
                        sum += hmap.get(nextChar) - hmap.get(currChar);
                        i += 2;
                    } else {
                        sum += hmap.get(currChar);
                        i++;
                    }
                }
            } else {
                sum += hmap.get(currChar);
                i++;
            }
        }

        return sum;
    }
}
