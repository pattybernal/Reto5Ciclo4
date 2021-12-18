package com.mt.Reto5C4.repository;

import com.mt.Reto5C4.model.Gadget;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mt.Reto5C4.crudRepository.GadgetCrudRepository;

/**
 * @author  Olga Patricia Bernal
 * @since   2021-12-14
 */
@Repository
public class GadgetRepository {
    
    @Autowired
    private GadgetCrudRepository gadgetCrudRepository;

    public List<Gadget> getAll() {
        return gadgetCrudRepository.findAll();
    }

    public Optional<Gadget> getGadget(int id) {
        return gadgetCrudRepository.findById(id);
    }
    public Gadget create(Gadget gadget) {
        return gadgetCrudRepository.save(gadget);
    }

    public void update(Gadget gadget) {
        gadgetCrudRepository.save(gadget);
    }
    
    public void delete(Gadget gadget) {
        gadgetCrudRepository.delete(gadget);
    }
    
    public List <Gadget> getByPrice (double price){
        return  gadgetCrudRepository.findByPrice(price);
    }
    
    public List<Gadget> getByDescriptionContains(String description){
        return gadgetCrudRepository.findByDescriptionContainingIgnoreCase(description);
    }
    
}
