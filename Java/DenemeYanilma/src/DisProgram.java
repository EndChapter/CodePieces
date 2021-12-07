import java.io.IOException;

public class DisProgram {
	public static void main(String[] args) throws IOException {
		new ProcessBuilder("cmd", "/c", "start", "/B", "mailTo:info@javakitabi.com").start();
	}
}
