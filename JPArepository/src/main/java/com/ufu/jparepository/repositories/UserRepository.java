package com.ufu.jparepository.repositories;

import com.ufu.jparepository.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    //@Query("SELECT obj FROM User obj WHERE obj.salary >= :minSalary AND obj.salary <= :maxSalary")
    Page<User> findBySalaryBetween(Double minSalary, Double maxSalary, Pageable pageable);

    //@Query("SELECT obj FROM User obj WHERE LOWER(obj.name) LIKE LOWER(CONCAT('%',:name,'%'))")
    //@Query("select u from User u where upper(u.name) like upper(concat('%', ?1, '%'))")
    Page<User> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
