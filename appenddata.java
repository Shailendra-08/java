import java.io.BufferedWriter;
import java.io.FileWriter;

public class appenddata {
    public static void main(String[] args) {
        String filepath ="index.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath,true));

            String data = "These is the data need to be append in the file";

            writer.append(data);
            writer.newLine();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
            
        }
        

        
    }
    
}
