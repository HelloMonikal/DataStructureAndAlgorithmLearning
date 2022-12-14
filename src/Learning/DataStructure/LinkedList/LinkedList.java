package Learning.DataStructure.LinkedList;

public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this(e,null);
        }

        public Node(){
            this(null,null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }
//    类变量/成员变量
    private Node dummyHead;
    int size;

    public LinkedList(){
        dummyHead = new Node(null,null);
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }



    public void add(int index, E e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed, Illegal index");

            Node prev = dummyHead;
            for(int i = 0; i < index; i++)
                prev = prev.next;
            prev.next = new Node(e,prev.next);
            size ++;

    }

    public void addFirst(E e){
        add(0,e);
    }

    public void addLast(E e){
        add(size,e);
    }

    public E get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed, Illegal index");

        Node cur = dummyHead.next;
        for(int i = 0;i< index;i++)
            cur = cur.next;
        return cur.e;

    }
    public E getFist(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }


    public void set(int index, E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed, Illegal index");
        Node cur = dummyHead.next;
        for(int i = 0; i < index; i++)
            cur = cur.next;
        cur.e = e;
    }

    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed, Illegal index");
        Node prev = dummyHead;
        for(int i = 0; i < index; i++)
            prev = prev.next;
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size --;

        return retNode.e;
    }
    public E removeFist(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }


    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();

        Node cur = dummyHead.next;
        while (cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("Null");
        return  res.toString();
    }
}
