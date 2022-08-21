package houmeWork;

import java.util.Arrays;

public class MyQueue<T> implements MyQueueInt {

    private int maxSize;
    private T[] myQueueArray;
    private int first;
    private int last;
    private int nItem;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        this.myQueueArray = (T[]) new Object[maxSize];
        this.first = 0;
        this.last = -1;
        this.nItem = 0;
    }

    //Вставляет элемент в очередь, если очередь полность заполнена возвращает false
    @Override
    public boolean add(Object o) {
        if (nItem == maxSize) {
            return false;
        } else {
            if (last + 1 == maxSize) {
                last = 0;
            } else {
                last++;
            }
            myQueueArray[last] = (T) o;
            nItem++;
            return true;
        }
    }

    //Возвращает но не удаляет головной элемент очереди возвращает null если очередь пуста
    @Override
    public Object element() {
        if (nItem == 0) {
            return null;
        } else {
            return myQueueArray[first];
        }
    }

    //Возвращает и удаляет головной элемент очереди возвращает null если очередь пуста
    @Override
    public Object remove() {
        if (nItem == 0) {
            return null;
        }

        T temp = myQueueArray[first];
        myQueueArray[first] = null;
        //Если забираем последний элемент очереди сбросить до начальных значений, если не последний меняем значения счетчиков
        if (nItem == 1) {
            this.first = 0;
            this.last = -1;
            this.nItem = 0;
        } else {
            if (first + 1 == maxSize) {
                first = 0;
            } else {
                first++;
            }
            nItem--;
        }
        return temp;
    }

    //Возвращает колличество єлементов в очереди
    @Override
    public int size() {
        return nItem;
    }

    public String toStringAll() {
        return "first=" + first + "; "
                + "last=" + last + "; "
                + "size=" + nItem + ";\n"
                + Arrays.toString(myQueueArray);
    }

    @Override
    public String toString() {
        String result = "";
        if (nItem==0){return "Очередь пуста";}
        if (first>last){
            for (int i=first; i!=maxSize; i++){
                result = result + myQueueArray[i] + "; " ;
            }
            for (int i=0; i<=last; i++){
                result = result + myQueueArray[i] + "; " ;
            }
        }else{
            for (int i=first; i<=last; i++){
                result = result + myQueueArray[i] + "; " ;
            }
        }


        return result;
    }
}
