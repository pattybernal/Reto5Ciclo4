package com.mt.Reto5C4.crudRepository;


import com.mt.Reto5C4.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author  Olga Patricia Bernal
 * @since   2021-12-14
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    Optional<User> findByNameOrEmail(String name, String email);
    //public List <User> findByMonthBirthtDay (String birthday);
    public List<User> findByMonthBirthtDay(String month);
}

