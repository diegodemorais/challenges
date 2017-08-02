import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PriorityQueueHeap {
    private Queue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    private Queue<Integer> high = new PriorityQueue<>();

    
    public void add(int val){
        Queue<Integer> target = low.size() <= high.size() ? low : high;
        target.add(val);
        balance();
    }
    
    public void balance(){
        while(!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()){
            Integer lowHead = low.poll();
            Integer highHead = high.poll();
            low.add(highHead);
            high.add(lowHead);
        }
    }
    
    public double median(){
        return (low.size() == high.size()) ? (low.peek() + high.peek())/2.0 : low.peek();
    }
    
    //static void median(Integer[] array){
        //List<Integer> tree = new LinkedList<>();
        //double median;
        //for(int a : array){
        //    tree.add(a);
        //    int size = tree.size();
        //    if(tree.size()%2==0){
        //        median = ((double) (tree.get((size/2)-1) + tree.get((size/2))) / 2);
        //    } else
        //        median = tree.get(size/2);
        //    System.out.println( median);
        //}
    //}

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            sol.add(in.nextInt());
            System.out.println(sol.median());
        }
    }
}
