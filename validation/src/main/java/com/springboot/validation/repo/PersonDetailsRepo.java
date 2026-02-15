package com.springboot.validation.repo;

import com.springboot.validation.entity.PersonDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDetailsRepo extends JpaRepository<PersonDetailsEntity,Long> {
}
