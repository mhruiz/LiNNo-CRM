package com.litto.crm.service.contact;

import com.litto.crm.entity.ContactEntity;
import java.util.List;

public interface ContactService {

    void create(ContactEntity entity);

    List<ContactEntity> getAll();
}
