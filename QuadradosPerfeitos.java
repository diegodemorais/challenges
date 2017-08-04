import java.util.HashMap;
import java.util.Map;


public class QuadradosPerfeitos {
    Map<Integer,Boolean> map;
    
    public QuadradosPerfeitos(){
        map =  new HashMap<>();
    }

    public int countQuadradosPerfeitos(int ini, int fim){
        int result = 0;
        for (int i=ini;i<=fim;i++)
            if (isQuadradoPerfeito(i))
                result++;
        return result;
    }
    
    public boolean isQuadradoPerfeito(int n){
        if (map.containsKey(n))
            return (map.get(n));
        else {
            double raiz = Math.sqrt(n);
            int raizInt = (int) raiz;
            boolean perfeito = (raizInt == raiz);
            map.put(n, perfeito);
            return perfeito;            
        }

    }
   
    public static void main(String[] args){
        QuadradosPerfeitos q = new QuadradosPerfeitos();
        
        int n = 2;
        int[] a = {4,81};
        int[] b = {21,28};
        int[] c = {1,150};        
        
        System.out.println(q.countQuadradosPerfeitos(a[0],a[1]));
        System.out.println(q.countQuadradosPerfeitos(b[0],b[1]));
        System.out.println(q.countQuadradosPerfeitos(c[0],c[1]));        
    }
    
}
