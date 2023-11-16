class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0,matchPointer=-1,matchCounter=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                k++;
                 if (matchPointer == -1)
                 {
                    matchPointer = i;
                 }
                matchCounter++;
            }
            else
            {
                if(matchPointer>-1)
                {
                    nums[matchPointer]=nums[i];
                    nums[i]=val;
                    if(matchCounter==1)
                    {
                        matchPointer=i;
                    }
                    else
                    {
                        matchPointer++;
                    }
                }
            }
        }
        return nums.length-k;
    }
}