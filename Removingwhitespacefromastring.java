package DanmarkRemovingwhitespacefromastring;

public class Removingwhitespacefromastring {

  public static void main(String[] args)
  
  {
  
    String str = " G O O D D A Y";
    
   
    str = str.replaceAll("\\s", ""); 


        System.out.println(str); 

 
  }
}