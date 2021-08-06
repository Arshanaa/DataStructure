public class GenericQueue <E> {
    private java.util.LinkedList <E> list = new java.util.LinkedList <E>();

    public int getSize(){
        return list.size();
    }

    public void enqueue (E data){
        list.addLast(data);
    }

    public E dequeue (){
        return list.removeFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return "Queue : " + list.toString();
    }

}
