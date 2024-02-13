import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class aa{
    public static void main(String[] args) throws FileNotFoundException {
        
        FileReader fr = new FileReader("/Users/akashsoni/Desktop/aka.txt");

        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close() ;
        fr.close();

    }
}
