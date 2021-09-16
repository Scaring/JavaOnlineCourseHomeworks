package module_10.task3;

class Wrapper<T extends Shape> {
    private T value;
    
    public Wrapper(T value){
        this.value = value;
    }
    
    public T getValue(){
        return value;
    }
    
    public void setValue(T value){
        this.value = value;
    }
}