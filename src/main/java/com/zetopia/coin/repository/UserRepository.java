package com.zetopia.coin.repository;

import com.zetopia.coin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
