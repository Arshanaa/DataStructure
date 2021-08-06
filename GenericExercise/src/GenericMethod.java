public class GenericMethod {
    public static void print(Object[] list){
        for (int i=0; i<list.length; i++)
            System.out.print(list[i] + "");
        System.out.println();
    }

    public static void main(String []args){
        Integer [] intArray = {1,2,3,4,5};
        Double [] doubleArray = {1.1,2.2,3.3,4.4};
        Character [] charArray = {'A','R','C','H','U'};

        print(intArray);
        print(doubleArray);
        print(charArray);

        Integer [] integers = {1,2,3,4,5,6};
        GenericMethod.<Integer>print(integers);

        String [] strings = {"Hello"," world"};
        GenericMethod.<String>print(strings);
    }
}