class Solution {
    public int majorityElement(int[] nums) {
     int minCount=nums.length/2,maxItem=0,maxCount=0;
     for(int i=0;i<nums.length;i++)
     {
         int item=nums[i];
         int count=1;
         for(int j=i+1;j<nums.length;j++)
         {
             if(item==nums[j])
             {
                 count++;
             }
         }
         if(count>minCount && count >maxCount)
         {
             maxCount=count;
             maxItem=item;
         }
     }
     return maxItem;
    }
}