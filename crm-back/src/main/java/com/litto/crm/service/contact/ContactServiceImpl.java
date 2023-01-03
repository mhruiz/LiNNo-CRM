package com.litto.crm.service.contact;

import com.litto.crm.entity.ContactEntity;
import com.litto.crm.repository.ContactRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private ContactRepository contactRepository;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    // =================================================================================================================
    // Override
    // =================================================================================================================

    @Override
    public void create(ContactEntity entity) {
        contactRepository.save(entity);
    }

    @Override
    public List<ContactEntity> getAll() {
        return contactRepository.findAll();
    }
}
