package mc.java.kod150;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
	public static void main(String args[]) {
		Queue<String> q1 = new LinkedList<String>();
		q1.offer("Kartal");
		q1.offer("kalkar");
		q1.offer("dal");
		q1.offer("sarkar");
		q1.offer("dal");
		q1.offer("dal sarkar");
		q1.poll();
		q1.offer("Kartal kalkar");
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		
	}
}
