class List {
	int head;
	List rest;
	List(int i, List r) {
		head = i;
		rest = r;
	}
}

class Stack {
	List s;
	void push(int i) {
		s = new List(i, s);
	}
	int pop() {
		int i = s.head;
		s = s.rest;
		return i;
	}
}

public class Zad1 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
