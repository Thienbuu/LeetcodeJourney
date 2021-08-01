class MyQueue {
    //Amotized time explanation: https://stackoverflow.com/questions/200384/constant-amortized-time
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> reversedS = new Stack<Integer>();
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return reversedS.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        //reverse stack and save to reversed Stack
        if (reversedS.empty()) {
            while (!s.empty()) {
                reversedS.push(s.pop());
            }
        }
        return reversedS.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.empty() && reversedS.empty();
    }
}

// class MyQueue {

//     Stack<Integer> s = new Stack<Integer>();
//     Stack<Integer> reversedS = new Stack<Integer>();
//     /** Initialize your data structure here. */
//     public MyQueue() {
        
//     }
    
//     /** Push element x to the back of queue. */
//     public void push(int x) {
//         s.push(x);
//     }
    
//     /** Removes the element from in front of queue and returns that element. */
//     public int pop() {
//         while (!s.empty()) {
//             reversedS.push(s.pop());
//         }
//         int top = reversedS.pop();
//         while (!reversedS.empty()) {
//             s.push(reversedS.pop());
//         }
//         return top;
//     }
    
//     /** Get the front element. */
//     public int peek() {
//         while (!s.empty()) {
//             reversedS.push(s.pop());
//         }
        
//         int top = reversedS.peek();
//         while (!reversedS.empty()) {
//             s.push(reversedS.pop());
//         }
//         return top;
//     }
    
//     /** Returns whether the queue is empty. */
//     public boolean empty() {
//         return s.empty();
//     }
// }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
