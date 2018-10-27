class AdjacentCharacter {
    public String solution(String S) {
       StringBuilder transformed = new StringBuilder();
       for(int i=0; i<S.length(); i++) {
    	   if (transformed.length() > 0 && S.charAt(i) == transformed.charAt(transformed.length()-1)) {
    		   transformed.deleteCharAt(transformed.length()-1);
    	   } else {
    		   transformed.append(S.charAt(i));
    	   }
       }
       return transformed.toString();
    }
}
