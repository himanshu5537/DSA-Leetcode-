class MyCircularQueue {
    int[] queue;
    int front;
    int rear;
    int cap;
    int currsize;
    public MyCircularQueue(int k) {
        cap=k;
        queue=new int[k];
        front=0;
        rear=0;
        currsize=0;
    }
    public boolean enQueue(int value) {
        if(currsize==cap){
            return false;
        }
        queue[rear]=value;
        rear=(rear+1)%cap;
        currsize++;
        return true;
    }
    
    public boolean deQueue() {
        if(currsize==0){
            return false;
        }
        front=(front+1)%cap;
        currsize--;
        return true;
    }
    
    public int Front() {
          if(currsize==0){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
          if(currsize==0){
            return -1;
        }
        return queue[(rear-1+cap)%cap];
    }
    
    public boolean isEmpty() {
        return currsize==0;
    }
    
    public boolean isFull() {
        return currsize==cap;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */