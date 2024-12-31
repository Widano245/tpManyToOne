package com.example.manytoone.repositories;

import com.example.manytoone.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command, Long> {
}
