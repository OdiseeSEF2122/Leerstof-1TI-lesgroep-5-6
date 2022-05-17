package inheritance.intlist;

import java.util.ArrayList;

public class Intlist {

    protected ArrayList<Integer> list = new ArrayList<>();

    public void add(Integer element){
        list.add(element);
    }

    public Integer remove(int index){
        if(list.size() <= index) {
            return null;
        }
        return list.remove(index);
    }

    public Integer findMin(){
        if(list.isEmpty()){
            return null;
        }

        int minimum = Integer.MAX_VALUE;
        for(int element: list){
            if(element < minimum){
                minimum = element;
            }
        }

        return minimum;

    }
}
