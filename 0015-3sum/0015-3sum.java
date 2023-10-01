class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0)
            return new ArrayList();

        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        for(int index = 0; index < nums.length - 2; index++)
        {
            if(index == 0 || (index > 0 && nums[index] != nums[index - 1]))
            {
                int left = index + 1;
                int right = nums.length - 1;
                while(left < right)
                {
                    int sum = nums[index] + nums[left] + nums[right];
                    if(sum == 0)
                    {
                        ArrayList<Integer> triplet = new ArrayList();
                        triplet.add(nums[index]);
                        triplet.add(nums[left]);
                        triplet.add(nums[right]);
                        result.add(triplet);

                        while(left < right && nums[left] == nums[left + 1])
                            left++;
                        while(left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    }
                    else if(sum < 0)
                        left++;
                    else
                        right--;
                    
                }             
            }
        }
        return result;
    }
}