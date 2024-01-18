package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Rule;

public interface RuleRepository extends JpaRepository<Rule, Long> {
    // Custom database queries if needed
}

