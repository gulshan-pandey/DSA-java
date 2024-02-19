class Temp{
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
        String word ="" ;
        String extra ="";
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                word += ch;
            }else extra += ch;
        }
        str = word + extra;
        return str;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
    
	}
	
}