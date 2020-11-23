import java.util.Arrays;

public class MyList<E> {
    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        element = new Object[capacity];
    }

    private void ensureCapa(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element,newSize);
    }
    public void add(int index, E e){
        if(size > element.length){
            ensureCapa();
        }
        element[size++] = e;
    }
    public E remove(int index){
        E temp;
        if (index > size){
            throw new UnsupportedOperationException();
        }else{
            temp = element[index];
            for (int i = index; i < size; i++) {

            }
        }
        return temp;
    }
}
