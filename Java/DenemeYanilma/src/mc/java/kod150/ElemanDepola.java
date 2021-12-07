package mc.java.kod150;

import java.util.HashMap;
import java.util.Map;

public class ElemanDepola {
	public static void main(String args[]) {
		Map<String, String> str = new HashMap<String, String>();
		str.put("bir", "Ankara");
		str.put("iki", "Konya");
		str.put("uc", "Istanbul");
		str.put("dort", "Izmir");
		str.put("bes", "Balikesir");
		str.put(null, "Kayseri");
		System.out.println(str.get("bes"));
		System.out.println(str.get(null));
		System.out.println(str.get("alti"));
	}
}
