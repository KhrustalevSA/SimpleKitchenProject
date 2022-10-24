package com.simplekitchen.dao.repozitory;

import com.simplekitchen.dto.user.api.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUuid(Long uuid);
    User findByName(String name);
}
