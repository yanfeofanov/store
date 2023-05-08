package sky.pro.store.repository;

import org.springframework.stereotype.Repository;
import sky.pro.store.models.Item;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StoreRepository {

    private int counter = 1;
    private final Map<Integer, Item> store = new HashMap<>();

    @PostConstruct
    public void init(){
    store.put(counter, new Item(counter++,"Колбаса"));
    store.put(counter, new Item(counter++,"Помидоры"));
    store.put(counter, new Item(counter++,"Курица"));
    store.put(counter, new Item(counter++,"Перец"));
    store.put(counter, new Item(counter++,"Приправы"));
    }


    public Item get(int id){
        return store.get(id);
    }


}
