class MinStack {
    Stack <Long>stck;   
    long minvalue=Integer.MAX_VALUE;
    public MinStack() {
        stck=new Stack<>();
    }
    
    public void push(int value) {
        if(stck.isEmpty()){
            stck.push((long)value);
            minvalue=value;
        }
        else if(value<minvalue){
            long val1=2L*value-minvalue;
            stck.push(val1);
            minvalue=value;
        }
        else{
            stck.push((long)value);
        }
    }
    
    public void pop() {
        if (stck.isEmpty()){
            return;
        }
        if(stck.peek()<minvalue){
            minvalue=2*minvalue-stck.peek();
             stck.pop();
        }
        else{
            stck.pop();
        }
    }
    
    public int top() {
        if(stck.peek()<minvalue){
            return (int)minvalue;
        }
        else{
            return stck.peek().intValue();
        }
    }
    
    public int getMin() {
        return (int)minvalue;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */