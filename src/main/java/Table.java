public class Table<T> {

    public Table() {}
    public void insert(T[] array, T thing) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            
            newArray[i] = array[i];
        }

        newArray[array.length] = thing;

        array = newArray;
    }

    public void remove(T[] array, int index) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < array.length; i++) {
            newArray[i] = array[i + 1]; 
        }

        array = newArray;
    }
}
