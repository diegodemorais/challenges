import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class PedrasHashSet {

    static int elementosComuns(String[] pedras, int n){
        if(pedras==null) return 0;
        List<Set<Character>> list = new ArrayList<>();
        for (String pedra : pedras) {
            Set<Character> set = new HashSet<>();
            for (char e : pedra.toCharArray()) {
                set.add(e);
            }
            list.add(set);
        }
        
        for (int i=1;i<list.size();i++)
            list.get(0).retainAll(list.get(i));
        
        return list.get(0).size();
        
    }
    
    public static void main(String[] args) {
        int n = 3;
        String[] pedras = {"aabecd", "abcde", "eca"};
        
        System.out.println(elementosComuns(pedras,n));
        
    }
    
}
