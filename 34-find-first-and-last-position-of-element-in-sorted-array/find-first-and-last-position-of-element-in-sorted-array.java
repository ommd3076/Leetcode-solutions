class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if (nums == null || nums.length == 0) return result;
        
        // Find leftmost occurrence
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                // nums[mid] == target, but we need the leftmost
                result[0] = mid;
                right = mid - 1; // continue searching left
            }
        }
        
        // If target not found, return [-1, -1]
        if (result[0] == -1) return result;
        
        // Find rightmost occurrence
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                // nums[mid] == target, keep moving right
                result[1] = mid;
                left = mid + 1;
            }
        }
        
        return result;
    }
}