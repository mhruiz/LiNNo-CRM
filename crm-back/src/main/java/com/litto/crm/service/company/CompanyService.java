package com.litto.crm.service.company;

import com.litto.crm.entity.CompanyEntity;
import java.util.List;

public interface CompanyService {

    void create(CompanyEntity entity);

    List<CompanyEntity> getAll();
}
