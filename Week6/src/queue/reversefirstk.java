package queue;
	
import java.util.*;

public class reversefirstk {
  public static void reverseKElements(Queue<Integer> queue, int k) {
    if (k > queue.size()) {
      System.out.println("Error: k exceeds the size of the queue.");
      return;
    }
    
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < k; i++) {
      stack.push(queue.remove());
    }
    
    while (!stack.isEmpty()) {
      queue.add(stack.pop());
    }
    
    System.out.println(queue);
  }
  
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    int k = 3;
    reverseKElements(queue, k);
  }
}
