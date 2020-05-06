
import java.util.Random;


public class Password {
    
     String numbers = "0123456789";
     String alpha_lower = "abcdefghijklmnopqrstuvwxyz";
     String alpha_upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     String symbols = "!@#$%^&*_=+-/.?<>)";
     String all = numbers + alpha_lower + alpha_upper + symbols;
    
     public  char[] passwordGenerator(){
         Random random = new Random();
         char[] pass = new char[16];
         for(int i = 0; i<16; i++){
             pass[i] =  all.charAt(random.nextInt(all.length()));
         }
        return pass;
         
     }
    
}
