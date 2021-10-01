public class ReverseQueue {
  Stack<Integer> stack = new Stack<>();
  while(!queue.isEmpty()){
    stack.add(queue.peek());
    queue.remove();
  }
  
  while(!stack.isEmpty) {
    queue.add(stack.peek());
    stack.pop();
  }
} 
