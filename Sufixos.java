package mercadolivre;

public class Sufixos {
   
    static public int countSufixos(String str){
        int result=0;
        for(int i=0;i<str.length();i++){
            result+=charsPalindrome(str,i);
            //System.out.println(str.substring(str.length()-1 - i) + " (" + (str.substring(0,i+1)) + ") >>> " + charsPalindrome(str,i));
        }
        return result;
    }
   
    static public int charsPalindrome(String str, int count){
        int ini;
        for (ini=0;ini<=count;ini++) {
            if (str.charAt(ini) != str.charAt(str.length()-1-count+ini))
                return ini;
        }
        return ini;
    }
   
    public static void main(String args[] ) throws Exception {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        String[] str = new String[t];

        int t = 2;
        String[] str = {"aababa","aa"};
        for(int i=0; i<t; i++){
            System.out.println(countSufixos(str[i]));

        }
    }
}
