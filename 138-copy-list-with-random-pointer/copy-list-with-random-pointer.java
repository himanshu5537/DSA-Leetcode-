/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
         HashMap <Node,Node> map=new HashMap<>();
         Node oldtemp=head;
        Node newhead=new Node(oldtemp.val);
        map.put(head,newhead);
        Node newtemp=newhead;
        oldtemp=oldtemp.next;
        while(oldtemp!=null){
            Node copy=new Node(oldtemp.val);
            map.put(oldtemp,copy);
            newtemp.next=copy;
            newtemp=newtemp.next;
            oldtemp=oldtemp.next;
        }
        oldtemp=head;
        newtemp=newhead;
        while(oldtemp!=null){
            newtemp.random=map.get(oldtemp.random);
            oldtemp=oldtemp.next;
            newtemp=newtemp.next;
        }
        return newhead;
    }
}