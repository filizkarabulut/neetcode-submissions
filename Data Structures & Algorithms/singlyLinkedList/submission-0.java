class LinkedList {
    private class Node {
        int val;
        Node next;

        Node (int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node cur = head;

        for (int i=0; i<index; i++) {
            cur = cur.next;
        }

        return cur.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        
        newNode.next = head;
        head = newNode;

        if (size==0) {
            tail = newNode;
        }
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);

        if (size==0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        
        tail = newNode;
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        
        if (index==0) {
            head = head.next;

            if (size==1) {
                tail = null;
            }
        } else {
            Node cur = head;
            for (int i=0; i<index-1; i++) {
                cur = cur.next;
            }
            cur.next = cur.next.next;

            if (index == size - 1) {
                tail = cur;
            }
        }

        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>(size);
        Node cur = head;
        
        while (cur != null) {
            values.add(cur.val);
            cur = cur.next;
        }

        return values;
    }
}
