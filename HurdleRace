import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HurdleRace {
    
    static int minBeverage(int n, int k, int[] height){
        Arrays.sort(height);
        if (k<height[n-1])
            return height[n-1]-k;
        else
            return 0;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        System.out.println(minBeverage(n,k,height));
    }
}
