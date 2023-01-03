package com.litto.crm.repository;

import com.litto.crm.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

}
