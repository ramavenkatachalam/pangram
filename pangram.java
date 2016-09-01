package guvi;

public class pangram 
{
     public static void main(String[] args) {  
          String str = "The quick brown fox jumps over the lazy dog";  
          System.out.println("To check the given string is pangram:"  
                    + Pangram(str.toLowerCase()));  
     }  
     private static boolean Pangram(String str)
{  	boolean r=true;
          if (str.length() < 26)  
          { 	r=false;
        	  return r;  
          }
          else {  
               for (char ch = 'a'; ch <= 'z'; ch++) {  
                    if (str.indexOf(ch) < 0) {  
                        r= false; 
                        return r;
                    }  
               }  
          }  
          return r;  
     }  
 

}
