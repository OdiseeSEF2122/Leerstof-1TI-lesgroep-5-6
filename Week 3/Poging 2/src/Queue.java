import java.util.ArrayList;

public class Queue {

    ArrayList<Integer> storedElement = new ArrayList<>();
    private int maxSize = 5;

    public Queue(){
    }

    public Queue(int maxSize){
        this.maxSize = maxSize;
    }

    public void store(Integer element){
        if(storedElement.size() < maxSize) {
            storedElement.add(element);
        }
    }

    public Integer release(){
        if(storedElement.isEmpty()){
            return null;
        }

        Integer tmp = storedElement.get(0);
        storedElement.remove(0);
        return tmp;
    }
}
