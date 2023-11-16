public class Solution {
    public bool IsPalindrome(int x) {
        if (x < 0) return false;
        int reminder = 0,copyX=x;
            Stack<int> stack = new Stack<int>();
            int counter = 0;
            while (copyX > 0)
            {
                reminder = copyX % 10;
                copyX /= 10;
                stack.Push(reminder);
                counter++;
            }
            int reverseX = 0;
            for (int i = 0, j = 1; i < counter; i++)
            {
                reminder = stack.Pop();
                reverseX += reminder * j;
                j *= 10;
            }
            if (x == 0 || x == reverseX) return true;
            return false;
    }
}