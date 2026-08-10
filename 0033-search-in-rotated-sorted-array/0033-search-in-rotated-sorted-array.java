class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left side is sorted
            if (nums[left] <= nums[mid]) {

                // Target is present in left sorted part
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } 
                else {
                    left = mid + 1;
                }
            }

            // Right side is sorted
            else {

                // Target is present in right sorted part
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } 
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
    