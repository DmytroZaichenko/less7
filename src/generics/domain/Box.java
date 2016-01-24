package generics.domain;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void print(){
        for (T b:lists) {
            System.out.println(b.toString());
        }
    }

    public void  sort(){
        lists.sort(new Comparator<T>() {
            @Override
            public int compare(T bird1, T bird2) {
                return (bird1.getName().compareTo(bird2.getName()));
            }
        });
    }

}
