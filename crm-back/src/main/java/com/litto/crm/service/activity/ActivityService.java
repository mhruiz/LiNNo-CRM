package com.litto.crm.service.activity;

import com.litto.crm.entity.ActivityEntity;
import com.litto.crm.entity.DealEntity;
import java.util.List;

public interface ActivityService {

    void create(ActivityEntity entity);

    List<ActivityEntity> getAll();

    void assignDeal(DealEntity entity);
}
