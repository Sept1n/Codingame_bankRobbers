import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long minValue = 0;
        long maxValue = 0;
        int index = 0;
        long singleResult = 0;
        int R = in.nextInt();
        int V = in.nextInt();
        long[] arreyOfRobbers = new long[R];
        for (int i = 0; i < V; i++) {
            int C = in.nextInt();
            int N = in.nextInt();
            singleResult = (long)(Math.pow(10, N) * Math.pow(5, (C-N)));
            for(int j = 0; j < R; j++) {
                if(arreyOfRobbers[j] <= minValue)
                {
                    index = j;
                    minValue = arreyOfRobbers[j];
                }
            }
            arreyOfRobbers[index] += singleResult;
            minValue = arreyOfRobbers[index];
        }


        for(int a = 0; a < arreyOfRobbers.length; a++) {
            if (arreyOfRobbers[a] > maxValue) {
                maxValue = arreyOfRobbers[a];
                index = a;
            }
        }
        System.out.println(arreyOfRobbers[index]);
    }
}