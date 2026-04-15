package dataStructures.week5_hashMaps;

public class HashMap{
    Node[] buckets;
    int capacity = 16;

    public HashMap(){
        buckets = new Node[capacity];
    }

    //put
    public void put(Object key, Object value){
        int hash = Math.abs(key.hashCode()) % capacity;

        Node currNode = buckets[hash];

        while(currNode != null && !currNode.key.equals(key)){
            currNode = currNode.next;
        }

        if(currNode == null){
            Node newNode = new Node(key,value,buckets[hash]);
            buckets[hash] = newNode;
        }else{
            currNode.value = value;
        }

    }

    //get
    public Object get(Object key){
        int hash = Math.abs(key.hashCode()) % capacity;

        Node currNode = buckets[hash];

        while(currNode != null && !currNode.key.equals(key)){
            currNode = currNode.next;
        }

        if(currNode != null){
            return currNode.value;
        }else{
            throw new RuntimeException("cannot find value");
        }
    }
    

    //remove
    public void remove(Object key){
        int hash = Math.abs(key.hashCode()) % capacity;

        Node currNode = buckets[hash];
        Node prevNode = null;

        while (currNode != null && !currNode.key.equals(key)) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        if(currNode == null) throw new RuntimeException("cannot find value");
        
        if(prevNode == null){
            buckets[hash] = currNode.next;
        }
        else if(currNode != null){
            prevNode.next = currNode.next;
        }
    }

    static class Node{
        Object key;
        Object value;
        Node next;

        public Node(Object key, Object value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}

