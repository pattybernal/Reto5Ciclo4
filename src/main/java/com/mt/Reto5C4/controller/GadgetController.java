package com.mt.Reto5C4.controller;

import com.mt.Reto5C4.model.Gadget;
import com.mt.Reto5C4.service.GadgetService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author  Olga Patricia Bernal
 * @since   2021-12-14
 */
@RestController
@RequestMapping("/gadget")
@CrossOrigin("*")
public class GadgetController {
    @Autowired
    private GadgetService gadgetService;
       
    @GetMapping("/all")
    public List<Gadget> getAll() {
        return gadgetService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Gadget> getGadget(@PathVariable("id") Integer id) {
        return gadgetService.getGadget(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget save(@RequestBody Gadget gadget) {
        return gadgetService.save(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget update(@RequestBody Gadget gadget) {
        return gadgetService.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return gadgetService.delete(id);
    }
    
    @GetMapping("/price/{price}")
    public List<Gadget> findByPrice(@PathVariable("price") double price) {
        return gadgetService.getByPrice(price);
    }
    
    @GetMapping("/description/{description}")
    public List<Gadget> findByDescription(@PathVariable("description") String description) {
        return gadgetService.findByDescription(description);
    }  
    
}
