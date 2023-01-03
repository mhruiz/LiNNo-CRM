package com.litto.crm.service.deal;

import com.litto.crm.entity.ActivityEntity;
import com.litto.crm.entity.CompanyEntity;
import com.litto.crm.entity.DealEntity;
import com.litto.crm.entity.ContactEntity;
import java.util.List;

public interface DealService {

    void create(DealEntity entity);

    List<DealEntity> getAll();

    void assignPointContact(ContactEntity entity);

    void assignCompany(CompanyEntity entity);

    void assignActivity(ActivityEntity entity);
}
