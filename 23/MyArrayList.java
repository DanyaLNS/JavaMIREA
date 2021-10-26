import java.util.Arrays;

public class MyArrayList{
    private int size; 
    private int[] array;
    
    public MyArrayList(){
        // Создаем пустой эррэй лист
        array = new int[size];
    }
    public MyArrayList(int[] e){
        // Создаем массив, в который засовываем все элементы коллекции
        array = new int[e.length];
        for(int i=0; i<e.length; i++){
            array[i] = e[i];
        }
    }
    public MyArrayList(int capacity){
        // Создаем эррей лист на сапасити элементов
        array = new int[size];
    }

    public void add(int index, int obj){
        // по индексу индекс вставляем объект 
        if(index>=0){
            if(index<array.length){
                int[] copy = array;
                array = new int[copy.length+1];
                for(int i = 0; i<index; i++){
                    array[i] = copy[i];
                }
                for(int i = index; i<array.length; i++){
                    array[i] = copy[i-1];
                }
                array[index] = obj;
            }
            else{
                int[] copy = array;
                array = new int[index+1];
                for (int i = 0; i<copy.length; i++){
                    array[i] = copy[i];
                }
                array[index] = obj;
            }
        }
    }

    public boolean addAll(int index, int[] col){
        // добавляем по индексу все элементы коллекции, если в результате список изменен - возращаем 1, иначе - 0
        if(index+col.length>array.length){
            int[] copy = array;
            array = new int[index+col.length];
            for (int i = 0; i<copy.length; i++){
                array[i] = copy[i];
            }
            for(int i = index; i<col.length; i++){
                array[index]=col[i];
                index++;
            }
            return true;
        }
        else{
            for(int i = 0; i<col.length; i++){
                array[index]=col[i];
                index++;
            }
            return false;
        }
    }

    public Object get(int index){
        // Возвращаем элемент по индексу
        return array[index];
    }

    public int lastIndexOf(int obj){
        // возврат последнего вхождения элемента обж, если не найден - возвращаем -1
        for(int i = array.length-1; i>0; i--){
            if(array[i] == obj){
                return i;
            }
        }
        return -1;
    }

    public Object remove(int index){
        // удаляет объект по индексу, возвращает этот элемент
        Object obj = array[index];
        for(int i = index; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        int[] copy = array;
        array = new int[copy.length-1];
        for (int i = 0; i<array.length; i++){
            array[i] = copy[i];
        }
        return obj;
    }

    public int set(int index, int obj){
        // Присваивает значение объекта Е элементу по индексу
        if(index >= 0 && index < array.length){
            array[index]=obj;
        }
        return obj;
    }

    public void sort(){
        // Сортирует список с помощью компаратора комп
        Arrays.sort(array);

    }
    
    public int[] subList(int start, int end){
        // возвращает от начала до конца 
        int[] sublist = new int[end - start+1];
        
        for(int i = 0; i <= end-start; i++){
            sublist[i] = array[i+start];
        }
        return sublist;
    }

    public void print(){
        for(int i = 0; i<array.length; i++){
            System.out.print(String.valueOf(array[i]) + ' ');
        }
        System.out.println();
    }
}
