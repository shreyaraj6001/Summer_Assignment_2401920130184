class Solution {
    public void moveZeroes(int[] nums) {
       int index = 0;

        // Non-zero elements ko aage laagaya hai
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Baaki positions par 0 fill kiya hai
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}  
