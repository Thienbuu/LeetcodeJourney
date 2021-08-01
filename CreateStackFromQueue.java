// class MyStack {
    
//     Queue<Integer> q = new LinkedList<Integer>();
//     /** Initialize your data structure here. */
//     int top = 0;
//     int length = 0;
//     public MyStack() {
        
//     }
    
//     /** Push element x onto stack. */
//     public void push(int x) {
//         q.add(x);
//         top = x;
//         length++;
//     }
    
//     /** Removes the element on top of the stack and returns that element. */
//     public int pop() {
//         int temp = length;
//         for (int i = temp; i > 1; i--) {
//             int val = q.poll();
//             q.add(val);
//             top = val;
//         }
//         length--;
//         return q.poll();
//     }
    
//     /** Get the top element. */
//     public int top() {
//         if (!empty()) return top;
//         return -1;
//     }
    
//     /** Returns whether the stack is empty. */
//     public boolean empty() {
//         return q.isEmpty();
//     }
// }

class MyStack {
    
    Queue<Integer> q = new LinkedList<Integer>();
    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        //Move last element to first
        for (int i = 0; i < q.size() - 1; i++) {
            int val = q.poll();
            q.add(val);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
