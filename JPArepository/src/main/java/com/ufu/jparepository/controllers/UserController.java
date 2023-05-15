package com.ufu.jparepository.controllers;

import com.ufu.jparepository.entities.User;
import com.ufu.jparepository.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/users")
@AllArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping(value = "/page")
    public ResponseEntity<Page<User>>findAll(Pageable pageable){
        System.out.println("findAll");
        Page<User>result=repository.findAll(pageable);
        return ResponseEntity.ok(result);
    }
    @GetMapping(value = "/search-salary")
    public ResponseEntity<Page<User>> searchBySalary(@RequestParam(defaultValue = "0") Double minSalary, @RequestParam(defaultValue = "1000000000000") Double maxSalary, Pageable pageable) {
        Page<User> result = repository.findBySalaryBetween(minSalary, maxSalary, pageable);
        return ResponseEntity.ok(result);
    }

    @PostMapping(value = "/search-name")
    public ResponseEntity<Page<User>> searchByName(@RequestParam(defaultValue = "") String name, Pageable pageable) {
        Page<User> result = repository.findByNameContainingIgnoreCase(name, pageable);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

//    @GetMapping
//    public ResponseEntity<List<User>> findAll(){
//        List<User>result=repository.findAll();
//        return ResponseEntity.ok(result);
//    }
}
