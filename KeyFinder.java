import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class KeyFinder {
    public KeyFinder( ){
    
        //int total = 0;
        try {
            File myObj = new File("data.txt");
            Scanner s = new Scanner(myObj);
            while ( s.hasNextLine() ) {
                String line = s.nextLine();
                
                String items[] = line.split("x");
                /*if(items[0].equals(key)){
                total += Integer.parseInt(items[1]);
                }*/
                System.out.println(items[0]);
            }
            s.close();
            //return total;
        } catch (FileNotFoundException e) {
            System.out.println("error ");
            e.printStackTrace();
        }
      
        
    }
    /*public static int sum(String key){
    
        int total = 0;
        try {
            File myObj = new File("data.txt");
            Scanner s = new Scanner(myObj);
            while ( s.hasNextLine() ) {
                String line = s.nextLine();
                
                if(line.startsWith(KeyWithSign));
                total += line.substring(KeyWithSign.length());
                System.out.println(total);
            }
            s.close();
            return total;
        } catch (FileNotFoundException e) {
            System.out.println("error ");
            e.printStackTrace();
        }
      
        
    }*/

    
    
}