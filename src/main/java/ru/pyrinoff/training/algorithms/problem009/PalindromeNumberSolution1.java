package ru.pyrinoff.training.algorithms.problem009;

//Complexity O(n)
public class PalindromeNumberSolution1 implements IPalindromeNumberSolution {

    @Override
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return isPalindrome(String.valueOf(x));
    }

    public boolean isPalindrome(String string) {
        int length = string.length();
        int mid = length/2;
        for(int i=0;i<mid;i++) { //Перебираем до середины строки (если четное, то возьмет меньшую, т.е. центральную букву трогать не будем)
            if(string.charAt(i)!=string.charAt(length-1-i)) return false;
        }
        return true;
    }

    public boolean isPalindromeShortest(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString().equals(string);
    }

}
