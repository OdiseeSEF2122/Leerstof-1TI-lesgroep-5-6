package inheritance.intlist;

public class SortedIntList extends Intlist{

    @Override
    public void add(Integer element) {
        int index = 0;
        for(; index < list.size(); index++){
            if(element <list.get(index)){
                break;
            }
        }

        list.add(index, element);
    }

    // kleine optimalisatie

    @Override
    public Integer findMin() {
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
