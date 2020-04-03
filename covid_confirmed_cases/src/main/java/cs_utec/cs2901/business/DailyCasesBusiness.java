package cs_utec.cs2901.business;

import cs_utec.cs2901.data.DailyCases;
import cs_utec.cs2901.repositories.DailyCasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DailyCasesBusiness {

    @Autowired
    private DailyCasesRepository repository;

    /**
     * Create: Save a new daily case
     * @param newDailyCase
     * @return saved DailyCase
     */
    public DailyCases create(DailyCases newDailyCase){
        return repository.save(newDailyCase);
    }

    /**
     * Read: Get all daily cases
     * @return dailycases
     */
    public List<DailyCases> findAll(){
        List <DailyCases> items = new ArrayList<>();

        for (DailyCases item : repository.findAll()){
            items.add(item);
        }

        return items;
    }

    /**
     * Update: Update an existing daily case
     * @param item
     * @return updated DailyCase
     */
    public DailyCases update(DailyCases item){
        DailyCases a = repository.findById(item.getId()).get();
        if(a != null){
            return repository.save(item);
        }
        return null;
    }

    /**
     * Delete: Delete an existing daily case
     * @param id
     */
    public void delete(Long id){
        repository.deleteById(id);
    }
}
