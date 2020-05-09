import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class KeyFinder {
    public static int sum(String key){
        int total = 0;
        try {
            File myObj = new File("data.txt");
            Scanner s = new Scanner(myObj);
            while ( s.hasNextLine() ) {
                String line = s.nextLine();
                String items[] = line.split(" ");
                if(items[0].equals(key));
                total += Integer.parseInt(items[1]);
        
            }
            myObj.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
      
        return total;
    }
    
    
}