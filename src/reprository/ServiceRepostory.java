package reprository;

import java.util.ArrayList;
import java.util.List;

public class ServiceRepostory <T extends Service> {
    private List<T> lists;

    public ServiceRepostory() {
        lists = new ArrayList<>();
    }

    public void add(T element){
        lists.add(element);
    }




}
