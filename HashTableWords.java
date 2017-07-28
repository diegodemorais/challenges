import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashTableWords {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        Hashtable<String,Integer> hash = new Hashtable<>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String magazine = in.next();
            hash.put(magazine,hash.get(magazine)==null ? 1 : hash.get(magazine)+1);
        }
        String result = "Yes";
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String ransom = in.next();
            if (hash.containsKey(ransom)) {
                if (hash.get(ransom) < 1)
                    result = "No";
                hash.put(ransom,hash.get(ransom)-1);               
            } else
                result = "No";             
        }
        System.out.println(result);
    }
}
