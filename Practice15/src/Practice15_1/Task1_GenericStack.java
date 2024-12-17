package Practice15_1;

public class Task1_GenericStack<E> {
    private E[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public Task1_GenericStack() {
        array = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int getSize() {
        return size;
    }


    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return array[size - 1];
    }

    public void push(E o) {
        if (size == array.length) {
            resize();
        }
        array[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        E o = array[--size];
        array[size] = null;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = array.length * 2; // Новый размер массива
        E[] newArray = (E[]) new Object[newCapacity]; // Создание нового массива
        System.arraycopy(array, 0, newArray, 0, size); // Копирование элементов в новый массив
        array = newArray; // Замена старого массива на новый
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}