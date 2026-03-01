package dataStructures.week1_arrays;

public class Hello{
    public static void main(String[] args){
        DynamicArrays arr = new DynamicArrays();

        arr.add("hi");
        arr.add("my");
        arr.add("name");
        arr.add("is");
        arr.add("ny");

        arr.set(4,"david");

        for(int i = 0; i < arr.size; i++){
            System.out.println(arr.get(i));
        }

        System.out.println("Java is working");
    }
}