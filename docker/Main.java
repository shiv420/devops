import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

class Main {

public static void main (String args[]) throws IOException{

    String file = File.separator + "etc" + File.separator + "hosts";
    FileOutputStream fout = null;  
    try{
    
    byte data [] = Files.readAllBytes(Paths.get(file));

    System.out.println(new String(data));
     fout =  new FileOutputStream(new File("data.txt"));
    while (true) {
        byte [] time = LocalDateTime.now().toString().getBytes();
        String finalStr = new String(data) + new String(time) + "\n";

        fout.write(finalStr.getBytes());
         Thread.sleep(1000);
    }
    
        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        fout.close();
    }

}} 
