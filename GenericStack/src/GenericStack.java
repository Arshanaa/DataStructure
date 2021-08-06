public class GenericStack <E>{
    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

    public int getSize(){
        return list.size();
    }

    public E peek (){
        return list.get(getSize()-1);
    }

    public void push (E data){
        list.add(data);
    }

    public E pop (){
        E data = list.get(getSize()-1);
        list.remove(getSize()-1);
        return data;
    }

    public String toString(){
        return "Stack :" + list.toString();
    }
}