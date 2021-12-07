import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CalistirDir {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "dir");
		builder.directory(new File("c:/"));
		Process p = builder.start();
		Scanner s = new Scanner(p.getInputStream()).useDelimiter("\\Z");
		System.out.println(s.next());
	}
}
