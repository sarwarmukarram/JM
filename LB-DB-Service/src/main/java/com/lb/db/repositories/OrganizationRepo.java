package com.lb.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lb.db.entities.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, Long> {

}
