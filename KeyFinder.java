import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class KeyFinder {
    public KeyFinder(){
    
        int total = 0;
        try {
            File myObj = new File("data.txt");
            Scanner s = new Scanner(myObj);
            while ( s.hasNextLine() ) {
                String line = s.nextLine();
               //String items[] = line.trim();
                String items[] = line.split(" ");
                for (String Key : items){
                    
                    //System.out.println(Key); 
                   
                }
                System.out.println(items[0]);
                if(items[0].equals("G1")){

                }
                String Key[] = line.split("_");
                for (String Key2 : Key){
                   // System.out.println(Key2); 
                   
                }

                /*if(items[0].equals("G")){
                total += Integer.parseInt(items[1]);
                }*/
                //System.out.println(items[0]);
                // System.out.println(total);
            }
            s.close();
            //return total;
        } catch (FileNotFoundException e) {
            System.out.println("error ");
            e.printStackTrace();
        }
      
        
    }/*
    public static int sum(String key){

        try {
            File myObj = new File("data.txt");
            Scanner s = new Scanner(myObj);
            HashMap<K,V> String,Integer, s = new HashMap<String, Integer>();

            while ( s.hasNext() ) {
                String key = s.next();
                int value = s.nextInt();
                Integer current_value = s.get(key);
                if(current_value != null){
                    s.put(key, current_value + value);
                }else{
                    s.put(key,value);
                }

                
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