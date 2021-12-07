import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
public class SistemDegiskenleri {
	public static void main(String[] args) throws IOException{
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "echo", "%KITAPYAZARI%");
		Map<String, String> env = pb.environment();
		env.put("KITAPYAZARI", "MUSA CAVUS");
		Process p = pb.start();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(p.getInputStream()).useDelimiter("\\Z");
		System.out.println(s.next());
	}
}
