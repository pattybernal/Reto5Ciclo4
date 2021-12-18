package com.mt.Reto5C4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import com.mt.Reto5C4.crudRepository.GadgetCrudRepository;
import com.mt.Reto5C4.crudRepository.OrderCrudRepository;
import com.mt.Reto5C4.crudRepository.UserCrudRepository;

@Component
@SpringBootApplication
public class Reto5C4 implements CommandLineRunner {

    @Autowired
    private OrderCrudRepository orderInterface;
    @Autowired
    private UserCrudRepository userInterface;
    @Autowired
    private GadgetCrudRepository supplementsInterface;

    public static void main(String[] args) {
        SpringApplication.run(Reto5C4.class, args);
    }

	@Override
    public void run(String... args) throws Exception {
        supplementsInterface.deleteAll();
        userInterface.deleteAll();
        orderInterface.deleteAll();
    }
}
