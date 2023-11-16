public class Solution {
     public  bool WordPattern(string pattern, string s)
        {
         
           string[] wordArray = s.Split(' ');
            if (wordArray.Length != pattern.Length) return false;
            Dictionary<string, int> map = new Dictionary<string, int>();
            for (int i = 0; i < pattern.Length; i++)
            {
                int patternIndex = pattern.IndexOf(pattern[i]);
                
                if ((patternIndex>-1  && wordArray[patternIndex]!=wordArray[i])
                    ||(map.ContainsKey(wordArray[i])&& pattern[map[wordArray[i]]]!= pattern[i]))
                {
                    return false;
                }
                if (!map.ContainsKey(wordArray[i]))
                    map[wordArray[i]] = i;
            }

            return true;

        }
}