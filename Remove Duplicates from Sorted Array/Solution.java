class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0, matchCounter = -1, boundaryValue = -99999, currentItem = boundaryValue, pointer = -1;
        for (int i = 0; i < nums.length; i++) {
            if (currentItem != nums[i]) {
                currentItem = nums[i];
                if (pointer != -1) {
                    nums[pointer] = nums[i];
                    pointer++;
                    nums[i] = currentItem;
                }

            } else {
                k++;
                if (pointer == -1) {
                    pointer = i;
                }
                matchCounter++;

            }

        }
        return nums.length - k;
    }
}