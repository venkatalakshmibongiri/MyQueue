class MyQueue {
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> s1  = new Stack<Integer>();

    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
         while(!s.empty()) {
            s1.push(s.pop());
        }
        s1.push(x);
        while(!s1.empty()) {
            s.push(s1.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return s.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.empty();
    }

}

Output__________________________________________________________________________________
input       ["MyQueue","push","push","peek","pop","empty"]
            [[],[1],[2],[],[],[]]
Output      [null,null,null,1,1,false]

