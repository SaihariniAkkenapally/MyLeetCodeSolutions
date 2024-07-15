class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = (nums1.length+nums2.length)/2;
        int mid1 = 0, mid2 = 0, i = 0, j = 0;
        for(int count = 0; count <= length; count++)
        {
            mid2 = mid1;
            if(i < nums1.length && j <nums2.length)
            {
                if(nums1[i]<=nums2[j])
                    mid1 = nums1[i++];
                else
                    mid1 = nums2[j++];
            }
            else if(i < nums1.length)
                mid1 = nums1[i++];
            else
                mid1 = nums2[j++];
        }
        if(length%2==0)
            return (mid1+mid2)/2.0;
        else
            return mid1;
    }
}