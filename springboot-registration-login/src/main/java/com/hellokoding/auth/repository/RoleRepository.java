package com.hellokoding.auth.repository;

import com.hellokoding.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}

/*
 * Spring Data JPA Repositories Spring Data JPA Repositories help you reduce
 * boilerplate code required to implement data access layers for various
 * persistence stores such as MySQL and PostgreSQL
 * 
 * They provide some CRUD functions to query, create, update and delete against
 * the underlying database such as findAll, findById, save, saveAll, delete and
 * deleteAll
 */
