class MyCircularDeque {
    int[] dq;
    int front;
    int rear;
    int currsize;
    int size;
    public MyCircularDeque(int k) {
        size=k;
        dq=new int[k];
        front=0;
        rear=0;
        currsize=0;
    }
    
    public boolean insertFront(int value) {
        if(currsize==size){
            return false;
        }
        front=(front-1+size)%size;
         dq[front]=value;
        currsize++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(currsize==size){
            return false;
        }
        dq[rear]=value;
        rear=(rear+1)%size;
        currsize++;
        return true;
    }
    
    public boolean deleteFront() {
        if(currsize==0){
            return false;
        }
        front=(front+1)%size;
        currsize--;
        return true;
    }
    
    public boolean deleteLast() {
           if(currsize==0){
            return false;
        }
        rear=(rear-1+size)%size;
        currsize--;
        return true;
    }
    
    public int getFront() {
        if(currsize==0){
            return -1;
        }
        return dq[front];
    }
    
    public int getRear() {
        if(currsize==0){
            return -1;
        }
        return dq[(rear-1+size)%size];
    }
    
    public boolean isEmpty() {
        return(currsize==0); 
    }
    
    public boolean isFull() {
        return (currsize==size);
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */