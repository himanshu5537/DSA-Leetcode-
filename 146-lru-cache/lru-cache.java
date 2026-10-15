class LRUCache {
    class Node{
        Node next;
        Node prev;
        int key;
        int val;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    void remove(Node temp){
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
     void add(Node temp){
        head.next.prev=temp;
        temp.next=head.next;
        head.next=temp;
        temp.prev=head;

    }
    int n;
    Node head;
    Node tail;
    HashMap<Integer,Node>map;

    public LRUCache(int capacity) {
        n=capacity;
       map= new HashMap<>();
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
        Node node=map.get(key);
        remove(node);
        add(node);
        return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            remove(node);
            add(node);
            return;
        }
            Node temp=new Node(key,value);
            map.put(key,temp);
            if(map.size()>n){
                Node node1=tail.prev;
                remove(node1);
                map.remove(node1.key);
            }
        add(temp);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */