class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=m-1,y=n-1,z=(m+n)-1;
        if(x>=0 && y>=0 && nums1[x]<nums2[0])
        {
            for(int i=0;i<n;i++)
            {
                nums1[m+i]=nums2[i];
            }
        }
        else  
        {
            while( y>=0)
            {
                if(x>=0 && nums1[x]>nums2[y])
                {
                    nums1[z]=nums1[x];
                    z--;
                    x--;

                }
                else
                {
                    nums1[z]=nums2[y];
                    z--;
                    y--;
                }
            }
           
        }
    }
}