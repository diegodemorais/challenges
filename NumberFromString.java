public class NumberFromString {

    public static void main (String[] args) throws java.lang.Exception
    {
        String input = "Em 2015, eu quero saber quanto custa o iPhone 6 -40+30";
        String num="";
        Integer result=0;

        for(int i=0;i< input.length(); i++){
                if (Character.isDigit(input.charAt(i))) {
                    num +=(input.charAt(i));  
                    if (i==input.length()-1) {
                        result += Integer.parseInt(num);
                        num="";     
                    }
                } else {
                    if (!num.equals("")) {
                        result += Integer.parseInt(num);
                        num="";
                    } 
                }
        }
        System.out.println(result);
    }
}
