public class Solution {
    public string ToLowerCase(string s) {
        string output="";
        char chr;
        foreach(char c in s)
        {
            chr=c;
            int charVal=(int)chr;
            if(charVal>=65 && charVal<=90)
            {
                chr=(char)(chr+32);
            }
            output+=chr;
        }
        return output;
    }
}