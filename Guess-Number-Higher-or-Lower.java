/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return \t     -1 if num is higher than the picked number
 *\t\t\t      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left=1;
        int right=n;
        while(left<=right)
        {
            int guess_No=left+(right-left)/2;
            int vol=guess(guess_No);
            if(vol==0)
            {
                return guess_No;
            }
            else if(vol==-1)
            {
                right=guess_No-1;
            }
            else if(vol==1)
            {
                left=guess_No+1;
            }
        }
        return -1;
    }
}