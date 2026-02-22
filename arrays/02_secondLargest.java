class Solution {
    public int secondLargestElement(int[] nums) {
    int n = nums.length;
    int largest = 0;
    int Slargest = 0;
    for(int i=0; i<n; i++){
        if(largest<nums[i]){
            Slargest = largest;
            largest = nums[i];
        }
        else if(nums[i]>Slargest && nums[i]<largest){
            Slargest = nums[i];
        }
    } return (Slargest == 0) ? -1 : Slargest ;
}
}
