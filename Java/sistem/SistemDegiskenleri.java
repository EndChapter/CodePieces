package info.mc.kitap.sistem;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class SistemDegiskenleri {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "echo", "%KITAPYAZARI%");
		Map<String, String> env = pb.environment();
		env.put("KITAPYAZARI", "Musa Cavus");
		Process p = pb.start();
		Scanner s = new Scanner(p.getInputStream()).useDelimiter("\\z");
		System.out.println(s.next());
	}
}
