package ru.pyrinoff.training.algorithms.problem009;

//Complexity O(log(n))
public class PalindromeNumberSolution2FromAnswers implements IPalindromeNumberSolution {

    @Override
    public boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) return false;  //отсекаем случаи, когда точно не палиндром
        int check = 0;
        while (x > check) {                             //делим на 10 до середины
            check = x % 10 + check * 10;
            x /= 10;
        }
        return (x == check || x == check / 10);           //проверяем, что перевернутый конец = началу. Делим на 10 для случая, когда у нас в остатке осталась срединная цифра)
    }

    /*
        Example:
        Initialize check = 0.
        In the while loop:
        x = 12321, check = 0 * 10 + 12321 % 10 = 1, x=1232, 1232 > 1,  loop continues
        x = 1232, check = 1 * 10 + 1232 % 10 = 12,  x=123,  123  > 12, loop continues
        x = 123, check = 12 * 10 + 123 % 10 = 123,  x=12,   12  > 123, loop exit
        x = 12, check = 123
        12 == 123    - false
        12 = 123/10  - true, palindrome
    */

}
