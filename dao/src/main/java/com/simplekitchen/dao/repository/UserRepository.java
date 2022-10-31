package com.simplekitchen.dao.repository;



import com.simplekitchen.dao.entity.user.UserImpl;
import com.simplekitchen.dao.entity.user.api.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends CrudRepository<UserImpl, Long> {


    Optional<User> findByUuid(Long id);
    List<User> findByNameAndAndSurnameAndPatronymic(String name, String surname, String Patronymic);
}
