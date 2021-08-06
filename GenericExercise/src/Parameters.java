public class Parameters<A, B>{

    public A first;
    public B second;
    public static void main(String []args){
        Parameters<String,String> storeA = new Parameters<String,String>("20","50");

        System.out.println(" "+storeA.toString());


    }
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    public Parameters(A a, B b){
        first = a;
        second = b;

    }


}
