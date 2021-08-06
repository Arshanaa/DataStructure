public class GenericContainer<T>{
    private T t;

    public void add(T t){
        this.t=t;
    }
    public T retrieve(){
        return t;
    }
    public static void main (String []args){
        GenericContainer <Integer> integerContainer = new GenericContainer<Integer>();


        integerContainer.add(new Integer(10));

        System.out.println("The result is : "+integerContainer.retrieve());
    }

}
  