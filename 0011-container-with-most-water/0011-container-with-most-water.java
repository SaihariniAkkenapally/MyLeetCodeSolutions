class Solution {
    public int maxArea(int[] height) {
        int maxAmountOfWater = 0;
        int left = 0;
        int right = height.length - 1;
         
        while(left < right)
        {
            maxAmountOfWater = Math.max(maxAmountOfWater, Math.min(height[left], height[right]) * (right - left)); 

            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxAmountOfWater;
    }
}