class LRUCache {
    class Node{
        Node prev,next;
        int key,value;
        Node(int _key,int _value){
            key= _key;
            value= _value;
        }
    }
    
    Node head =new Node(0,0);
    Node tail = new Node(0,0);
    Map<Integer,Node> mpp=new HashMap<>();
    int cap;
    public LRUCache(int capacity) {
          cap=capacity;
          head.next=tail;
          tail.prev=head; 
    }
    
    public int get(int key) {
        if(mpp.containsKey(key)){
            Node node=mpp.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(mpp.containsKey(key)){
            //mpp.remove(key);
            remove(mpp.get(key));
        }
        if(mpp.size() == cap){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    public void remove(Node node){
        mpp.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void insert(Node node){
        mpp.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */