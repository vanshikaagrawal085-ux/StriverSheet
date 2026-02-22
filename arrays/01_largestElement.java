class Solution {
    public int largestElement(int[] nums) {
    int n = nums.length;
    int largest=0;
    for(int i=0; i<n; i++){
        if(largest<nums[i]){
            largest = nums[i];
        }
    }
    return largest;
    }
}
