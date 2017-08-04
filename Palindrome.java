package mercadolivre;

public class Palindrome {
    public int countSufixos(String str){
        int result = 0;
        int posFinal = str.length();
        StringBuilder suf = new StringBuilder();        
        StringBuilder pre = new StringBuilder();                
        for(int i=0; i<posFinal; i++){
            pre.append(str.charAt(i));            
            suf.append(str.charAt(posFinal-i-1));
            if ( suf.toString().equals(pre.toString()) )
                result++;                
        }
        return result;
    }
    
    public static void main(String[] args){
        Sufixos suf = new Sufixos();
        int n = 2;
        String[] str = {"socorrammesubinoonibusemmarrocos","aa"};
        
        for(String s : str)
            System.out.println(suf.countSufixos(s));
    }   
}
