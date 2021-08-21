package com.ms.crud.repositories;

import com.ms.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<UserModel, Long> {
}
