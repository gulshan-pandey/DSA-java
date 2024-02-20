class Temp{

	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
        int z=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='s'){
             z++;
            }
        }
        
        return z;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}