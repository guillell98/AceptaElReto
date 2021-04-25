import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class TensionCompensada {
 
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        int n = Integer.parseInt(br.readLine());
        
        String line;
        String[] tension;
        
        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	tension = line.split(" / ");
        	
        	if (Integer.parseInt(tension[0]) >= Integer.parseInt(tension[1])) {
        		System.out.println("BIEN");
        	} else {
        		System.out.println("MAL");
        	}
        }
	}
}
