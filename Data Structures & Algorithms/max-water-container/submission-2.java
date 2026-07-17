class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int n = heights.length, start = 0, end = n - 1;
        while( start < end) {
            if(heights[start] < heights[end]) {
                res = Math.max(res, heights[start] * (end - start));
                start++;
            } else {
                res = Math.max(res, heights[end] * (end - start));
                end--;
            }
        }

        return res;
    }
}
