package p2;

import java.util.Arrays;

public class CustomArray<T> {
    private Object[] array;
    private int size;

    public CustomArray() {
        array = new Object[10]; 
        size = 0;
    }
 
    public void add(Object element) {
        ensureCapacity();
        array[size++] = element;
    }

    public void add(T element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " hors limites");
        }

        ensureCapacity();

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " hors limites");
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[--size] = null; 
    }

    public void remove(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                remove(i);
                return; 
            }
        }
    }

    @SuppressWarnings("unchecked")
	public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " hors limites");
        }

        return (T) array[index];
    }

    private void ensureCapacity() {
        if (size == array.length) {
           
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CustomArray<String> customArray = new CustomArray<>();
        customArray.add("Objet1");
        customArray.add("Objet2");
        customArray.add("Objet3");

        System.out.println("Taille du tableau : " + customArray.size());
       
        customArray.add("Objet4");
      
        customArray.add("Objet5", 1);

        System.out.println("Objet à l'indice 2 : " + customArray.get(2));
  
        customArray.remove("Objet2");

        customArray.remove(0);

        System.out.println("Nouvelle taille du tableau : " + customArray.size());
    }
}
