class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int mid = n / 2, left = 0, right = n - 1;
        while(left <= right) {
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }

        return -1;
    }
}
