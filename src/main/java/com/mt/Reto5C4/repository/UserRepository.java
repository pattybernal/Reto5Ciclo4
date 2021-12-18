package com.mt.Reto5C4.repository;

import com.mt.Reto5C4.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mt.Reto5C4.crudRepository.UserCrudRepository;

/**
 * @author  Olga Patricia Bernal
 * @since   2021-12-14
 */
@Repository
/**
 * Repositorio de {USER}
 */
public class UserRepository {
    @Autowired
    /**
     * Metodos Crud USER (MongoDB Repository)
     */
    private UserCrudRepository userCrudRepository;
    /**
     * GET -> Traer todos los usuarios
     */
    public List<User> getAll(){
        return userCrudRepository.findAll();
    }
    /**
     * GET -> Traer usuario por id
     */
    public Optional<User> getUser(Integer id){
        return userCrudRepository.findById(id);
    }
     /**
     * GET -> Verificar la existencia de un email en USERS
     */
    public boolean ExisteEmail(String email){
        Optional<User> usuario = userCrudRepository.findByEmail(email);
         
        return !usuario.isEmpty();
    }
     /**
     * GET -> Autenticacion de usuario (email / password)
     */
    public Optional<User> autenticarUser(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
     /**
     * POST -> Metodo de guardar para USER
     */
    public User save(User user){
        return userCrudRepository.save(user);
    }
     /**
     * PUT -> Metodo actualizar para USER
     */
    public void update(User user){
        userCrudRepository.save(user);
    }
    /**
     * DELETE -> Metodo eliminar para USER
     */
    public void delete(User user){
        userCrudRepository.delete(user);
    }
    /**
     * GET -> Metodo buscar Usuarios por Mes de Cumpleaños (MonthBirthDay)
     */
    public List <User> findByMonthBirthtDay (String birthday){
        return  userCrudRepository.findByMonthBirthtDay(birthday);
    }
    
}
