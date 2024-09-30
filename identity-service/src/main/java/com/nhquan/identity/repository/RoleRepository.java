package com.nhquan.identity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhquan.identity.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}
