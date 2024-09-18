package Hashing;

public class HashFunction {
     public static int hashedDivisionCode(String key) {
         int hashedInt = 0;
         for (int character = 0; character < key.length(); character++) {
             hashedInt += key.charAt(character);
             
         }
        return hashedInt % 13;
    }

    public static int hashedMultipliCode(String key) {
        double goldenRatio = 0.61803398875;
        
         return 0;
    }
}
