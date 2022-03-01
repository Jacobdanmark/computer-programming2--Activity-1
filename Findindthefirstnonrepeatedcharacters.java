package DanmarkFindindthefirstnonrepeatedcharacters;

public class Findindthefirstnonrepeatedcharacters {

  public static void main(String[] args) {

  String inputStr = "Danmark";
  for(char i :inputStr.toCharArray()){
  if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)){
  System.out.println("First non-repeating character is; "+i);
     break;
     }
     }
  }

  }