package generics.domain;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Bird> {

    private T item;
    private List<T> lists;

    public Box() {
        lists = new ArrayList<>();
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void add(T t){
        lists.add(t);
    }

    public void del(T t){
        lists.remove(t);
    }

    public List<T> getLists() {
        return lists;
    }

}
