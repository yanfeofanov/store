package sky.pro.store.service;

import org.springframework.stereotype.Service;
import sky.pro.store.component.Box;
import sky.pro.store.models.Item;
import sky.pro.store.repository.StoreRepository;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class StoreService {

    private final Box box;
    private final StoreRepository storeRepository;

    public StoreService(Box box, StoreRepository storeRepository) {
        this.box = box;
        this.storeRepository = storeRepository;
    }

    public void add(Set<Integer> id){
        box.add(id);
    }
    public List<Item> get(){
        return box.get().stream()
                .map(storeRepository::get)
                .collect(Collectors.toList());
    }
}
