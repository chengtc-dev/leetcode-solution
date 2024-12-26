/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int num = left + (right - left) / 2;
            int result = guess(num);
            if (result == -1) {
                right = num - 1;
            } else if (result == 1) {
                left = num + 1;
            } else {
                return num;
            }
        }

        return 0;
    }
}