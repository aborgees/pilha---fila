import java.util.LinkedList;
import java.util.Queue;

public class Filateste {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Ana");
		fila.adiciona("Caroline");
		System.out.println(fila);
		
		String x1 = fila.remove();
		
		System.out.println(x1);
		System.out.println(fila);
		
		Queue<String> Fila = new LinkedList<String>();
		
		Fila.add("Ana");
		String x2 = Fila.poll();
		System.out.println(x2);
	}
}
