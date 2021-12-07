import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BRReadLines {
	public static void main(String[] args) throws IOException{
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit ");
		
		do {
			str = br.readLine();
			System.out.print(str);
		}while(str!="q");
	}
}