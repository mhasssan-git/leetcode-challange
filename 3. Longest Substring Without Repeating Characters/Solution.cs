public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int longestLen=s.Length==0?0:1;
        string subStr="";
        for(int i=0;i<s.Length-1 && s.Length>1;i++)
        {
            subStr+=s[i];
            for(int j=i+1;j<s.Length;j++)
            {
                if(subStr.Contains(s[j]))
                {
                    subStr="";
                    break;
                };
                subStr+=s[j];
                longestLen=subStr.Length>longestLen?subStr.Length:longestLen;
            }
        }
        return longestLen;
    }
}