package ru.mirea.task1;

public class Var5 {
    public int getFactorial(int x) {
        int res = 1;
        for (int i=1;i<=x;i++) {
            res *= i;
        }
        return res;
    }
}
