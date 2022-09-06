package homeworkCreateMyCustomArrraylistWithGenerics;

import java.util.*;
import java.util.stream.Collectors;

public class MyList<T> {
    private static int ARRAY_SIZE;
    private static int INDEX;
    Object[] mainArray = new Object[3];

    public MyList(){
        ARRAY_SIZE = 3;
        INDEX = 0;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < INDEX; i++) {
            if(i<INDEX-1) sb.append("{").append(mainArray[i]).append("}, ");
            else sb.append("{").append(mainArray[i]).append("}");
        }
        return sb.append("]").toString();
    }

    public int size() {
        return INDEX;
    }

    public boolean isEmpty() {
        return INDEX == 0;
    }

    public boolean contains(Object o) {
        for (Object arrObj:mainArray) {
            if (o.equals(arrObj)) return true;
        }
        return false;
    }

    public Object[] toArray() {
        Object[] newArr = new Object[INDEX];
        System.arraycopy(mainArray, 0, newArr, 0, INDEX);
        return newArr;
    }

    public boolean add(Object t) {
        if(ARRAY_SIZE > INDEX){
            mainArray[INDEX] = t;
            INDEX++;
        }else {
            ARRAY_SIZE += 3;
            Object[] newArr = new Object[ARRAY_SIZE];
            if (INDEX >= 0) System.arraycopy(mainArray, 0, newArr, 0, INDEX);
            newArr[INDEX++] = t;
            mainArray = newArr;
        }
        return true;
    }

    public boolean remove(Object o) {
        if(contains(o)){
            Object[] newArr = new Object[INDEX-1];
            int index = indexOf(o);
            for (int i = 0; i < INDEX; i++) {
                if (i < index) newArr[i] = mainArray[i];
                if (i > index) newArr[i-1] = mainArray[i];
            }
            mainArray = newArr;
            INDEX--;
            return true;
        }else return false;
    }

    public boolean containsAll(Collection<?> c) {
        for (Object o:c) {
            if (!contains(o)) return false;
        }
        return true;
    }

    public boolean addAll(Collection<?> c) {
        for (Object o:c)
            add(o);
        return true;
    }


    public boolean removeAll(Collection<?> c) {
        Collection<?> d = c.stream().distinct().toList();
        FIRST_LOOP: for (Object o:d) {
            for (int i = 0; i < INDEX; i++) {
                if(o.equals(mainArray[i]))
                    continue FIRST_LOOP;
            }
            return false;
        }
        for (Object o:d)
            if(contains(o))
                while(contains(o))
                    remove(o);
        return true;
    }

    public void clear() {
        mainArray = new Object[3];
        INDEX = 0;
        ARRAY_SIZE = 3;
    }

    public T get(int index) {
        if (index >= 0 && index <= INDEX) return (T) mainArray[index];
        else return null;
    }

    public T set(int index, T element) {
        if (index >= 0 && index <= INDEX) {
            mainArray[index] = element;
            return element;
        }
        else return null;
    }

    public void add(int index, T element) {
        if (index >= 0 && index <= INDEX) {
            if(ARRAY_SIZE <= INDEX){
                ARRAY_SIZE += 3;
            }
            Object[] newArr = new Object[ARRAY_SIZE];
            for (int i = 0; i <= INDEX; i++) {
                if (i < index) newArr[i] = mainArray[i];
                if (i == index) newArr[i] = element;
                if (i > index) newArr[i] = mainArray[i-1];
            }
            mainArray = newArr;
            INDEX++;
        }else throw new ArrayIndexOutOfBoundsException();
    }

    public T remove(int index) {
        if (index >= 0 && index < INDEX-1) {
            Object[] newArr = new Object[INDEX-1];
            for (int i = 0; i < INDEX; i++) {
                if (i < index) newArr[i] = mainArray[i];
                if (i > index) newArr[i-1] = mainArray[i];
            }
            INDEX--;
            mainArray = new Object[INDEX];
            System.arraycopy(newArr, 0, mainArray,0,INDEX);
            return (T) mainArray[index];
        }
        return null;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < INDEX; i++) {
            if (mainArray[i].equals(o)) return i;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (contains(o)) {
            int last=0;
            for (int i = 0; i < INDEX; i++) {
                if (mainArray[i].equals(o)) last = i;
            }
            return last;
        }else return -1;
    }

    public MyList<T> subList(int fromIndex, int toIndex) {
        MyList<T> sub = new MyList<T>();
        for (int i = fromIndex; i < toIndex; i++) {
            sub.add(mainArray[i]);
        }
        return sub;
    }
}
