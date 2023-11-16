class Solution {
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=merge(nums1,nums2);
        int len=merged.length;
        if(len%2==1)
            return merged[len/2];
        return (merged[(len/2)-1]+merged[(len/2)])/2.0;
    }
    private int[] merge(int[] a,int[] b)
    {
        int newLen=a.length+b.length;
        int[] c=new int[newLen];
        int pointerA=0,pointerB=0;
        int arrayCounter=a.length>b.length?a.length:b.length;
        for(int i=0;i<newLen;i++)
        {
            if(pointerA==a.length)
            {
                c[i]=b[pointerB];
                pointerB++;
                continue;
            }
            else if(pointerB==b.length)
            {
                c[i]=a[pointerA];
                pointerA++;
                continue;
            }
            else if(a[pointerA]<=b[pointerB])
            {
                c[i]=a[pointerA];
                pointerA++;
            }
            else
            {
                c[i]=b[pointerB];
                pointerB++;
            }

        }
        return c;
    }
}