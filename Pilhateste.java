import java.util.Stack;

public class Pilhateste {

	public static void main(String[] args) {
		
		Pilha pilha1 = new Pilha();
		
		pilha1.push("Aninha");
		System.out.println(pilha1);
		
		pilha1.push("Borges");
		System.out.println(pilha1);
		
		String r1 = pilha1.pop();
		System.out.println(r1);
		
		String r2 = pilha1.pop();
		System.out.println(r2);
		
		System.out.println(pilha1.vazia());
		pilha1.push("Ana");
		System.out.println(pilha1.vazia());
		
		System.out.println(pilha1);
		
		Stack<String> stack = new Stack<String>();
		stack.push("Aninha");
		stack.push("Ana");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		String name = stack.peek();
		System.out.println(name);
		System.out.println(stack);
	}
}
