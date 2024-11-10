// Link: https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
package Codility.Cyclic_Rotation;

class Solution {
    public static int[] solution(int[] A, int K) {
        if (A.length <= 1 || K == A.length)
            return A;

        int left = 0, right = A.length - 1;
        for (int i = 0; i < K; i++) {
            left = 0;
            while (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
            }
        }

        return A;
    }
}
