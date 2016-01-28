package repository;

import java.util.ArrayList;
import java.util.List;

public class ServiceRepository<T extends Service> {
    private List<T> lists;

    public ServiceRepository() {
        lists = new ArrayList<>();
    }

    public List<T> getLists() {
        return lists;
    }

    public void setLists(List<T> lists) {
        this.lists = lists;
    }

    public void add(T element){
        lists.add(element);
    }




}
