package net.mobiustesseract.truetest;


public class TrueTest
{
    public Boolean negate(Boolean bool)
    {
        int val = bool ? 1 : -1;
        return Math.negateExact(val) == 1 ? true : false;
    }

    public String reverse(String string)
    {
        char[] reversed = new char[string.length()];

        int x = reversed.length;
        for(char c : string.toCharArray())
        {
            x--;
            reversed[x] = c;
        }

        return new String(reversed);
    }
}
