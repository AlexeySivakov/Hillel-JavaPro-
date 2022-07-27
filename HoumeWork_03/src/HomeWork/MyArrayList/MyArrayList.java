package HomeWork.MyArrayList;

import java.util.Arrays;

public class MyArrayList<T> implements InterfaceMyArrayList<T> {
    //размер
    private int size;
    //массив
    private T[] tempMass = (T[]) new Object[0];

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(T element) {
        size++;
        tempMass = Arrays.copyOf(tempMass, size);
        tempMass[size - 1] = element;
    }

    @Override
    public void add(T element, int position) {
        size++;
        T[] Temp = (T[]) new Object[size];
                /*
        System.arrayCopy(from, fromIndex, to, toIndex, count);

        from - массив, который копируем
        to - массив в которой копируем
        fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
        toIndex - индекс в массиве to начиная с которого вставляем элементы
        count - количество элементов которые берем из массива from и вставляем в массив to
        Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.
        */
        System.arraycopy(tempMass, 0, Temp, 0, position);
        Temp[position] = element;
        System.arraycopy(tempMass, position, Temp, position + 1, size - position - 1);
        tempMass = Arrays.copyOf(Temp, size);

    }

    @Override
    public void remove(int position) {
        size--;
        T[] Temp = (T[]) new Object[size];

        System.arraycopy(tempMass, 0, Temp, 0, position);
        System.arraycopy(tempMass, position + 1, Temp, position, size - position);
        tempMass = Arrays.copyOf(Temp, size);
    }

    @Override
    public void clear() {
        tempMass = (T[]) new Object[0];
        size = 0;
    }

    @Override
    public T get(int position) {
        return tempMass[position];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.tempMass);
    }

}
