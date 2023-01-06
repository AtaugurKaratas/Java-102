public class MyList<T>{
    private Object[] data;

    public MyList() {
        this.data = new Object[10];
    }
    public MyList(int capacity){
        this.data = new Object[capacity];
    }

    public int size() {
        int temp = 0;
        for(Object x: data){
            if(x != null)
                temp++;
        }
        return temp;
    }

    public int getCapacity(){
        return this.data.length;
    }

    public void add(T data){
        if(size() >= this.data.length)
        {
            T[] array = (T[]) this.data;
            this.data = new Object[size()*2];
            for(Object temp: array){
                this.data[size()] = temp;
            }
            this.data[size()] = data;
        } else {
            this.data[size()] = data;
        }
    }

    public Object get(int index){
        return data[index];
    }

    public Object remove(int index){
        Object removedValue = data[index];
        if(data[index] == null)
            return null;
        else{
            for(int i = index; i < size(); i++){
                Object temp = (Object) data[i+1];
                data[i] = temp;
                data[i+1] = null;
            }
        }
        return removedValue;
    }

    public void set(int index, T data){
        this.data[index] = data;
    }

    public String toString(){
        String result = "[";
        int temp = 1;
        for(Object x: data){
            if(x != null)
                result +=  x;
            if(temp < size() && x != null) {
                result += ",";
                temp++;
            }
        }
        result += "]";
        return result;
    }

    public int indexOf(T data){
        int temp = 0;
        for(Object o: this.data){
            if(o == data){
                return temp;
            }
            temp++;
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int temp = 0;
        int result = -1;
        for(Object o: this.data){
            if(o == data){
                result = temp;
            }
            temp++;
        }
        if(result != -1){
            return result;
        }
        return -1;
    }

    public boolean isEmpty(){
        for(Object o: data){
            if(o != null)
                return false;
        }
        return true;
    }
    public T[] toArray(){
        T[] array = (T[]) data;
        return array;
    }
    public void clear(){
        int temp = size();
        for(int i = 0; i <= temp; i++){
            data[i] = null;
        }
    }

    public MyList<T> sublist(int start, int finish){
        MyList<T> list = new MyList<>();
        for(int i = start; i <= finish; i++){
            list.add((T) this.get(i));
        }
        return list;
    }
    public boolean contains(T data){
        for(Object o: this.data){
            if(o == data)
                return true;
        }
        return false;
    }
}
