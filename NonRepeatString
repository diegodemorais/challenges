public class NonRepeatString {
    StringBuilder input = new StringBuilder();
   
    NonRepeat(){
        input.append("aAbBABac");
    }
   
    boolean hasNext(){
        if (input.length() == 0)
            return false;
        else
            return true;
    }
   
    Character getNext(){
        Character result = input.charAt(0);
        input.deleteCharAt(0);
        return result;
    }
   
    void printFirst(){
        do {
            String current = getNext().toString();
            if (input.indexOf(current) == -1){
                System.out.println("First non-repeat element is: " +current);
                break;
            }
        } while (hasNext());
    }
   
    public static void main(String[] args) {
        NonRepeat non = new NonRepeat();
        non.printFirst();
       
    }
}
