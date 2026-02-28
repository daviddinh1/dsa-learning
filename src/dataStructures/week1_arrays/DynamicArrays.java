package dataStructures.week1_arrays;

public class DynamicArrays{
    Object[] data;
    int size;
    int capacity = 2;

    public DynamicArrays(){
        size = 0;
        data = new Object[capacity];
    }

    public void resize(){
        Object[] tmp = new Object[capacity*2];

        for(int i = 0; i<data.length; i++){
            tmp[i] = data[i];
        }

        data = tmp;
        capacity = capacity *2;
    }

    public void add(Object element){
        if(size == capacity){
            resize();
        }
        data[size] = element;
        size++;
    }

    public Object get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        return data[index];
    }

    public void set(int index, Object value){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        data[index] = value;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        for(int i = index; i < size - 1; i++){
            data[i] = data[i+1];
        }
        
        size--;

    }
    
}