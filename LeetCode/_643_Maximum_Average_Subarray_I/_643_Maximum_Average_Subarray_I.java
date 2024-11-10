package _643_Maximum_Average_Subarray_I;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Tính tổng k phần tử đầu tiên
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        int left = 1, right = k;

        // Sliding Window
        while (right < nums.length) {
            sum += nums[right] - nums[left - 1];

            if (sum > max)
                max = sum;

            left++;
            right++;
        }

        return (double) max / k;
    }
}
