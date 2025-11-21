package com.inventory.Inventrack.domain.repository.interfaces.customized;

import com.inventory.Inventrack.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
