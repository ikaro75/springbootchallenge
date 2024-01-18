package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Rule;
import com.example.repository.RuleRepository;



@RestController
@CrossOrigin(origins = "*")
public class RuleController {

    @Autowired
    private RuleRepository ruleRepository;

    @GetMapping
    public List<Rule> getAllRules() {
        return ruleRepository.findAll();
    }

    @PostMapping
    public Rule addRule(@RequestBody Rule rule) {
        return ruleRepository.save(rule);
    }

    // Additional CRUD methods
}