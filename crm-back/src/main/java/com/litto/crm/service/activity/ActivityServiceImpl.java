package com.litto.crm.service.activity;

import com.litto.crm.entity.ActivityEntity;
import com.litto.crm.entity.DealEntity;
import com.litto.crm.repository.ActivityRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private final ActivityRepository activityRepository;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    // =================================================================================================================
    // Override
    // =================================================================================================================

    @Override
    public void create(ActivityEntity entity) {
        activityRepository.save(entity);
    }

    @Override
    public List<ActivityEntity> getAll() {
        return activityRepository.findAll();
    }

    @Override
    public void assignDeal(DealEntity entity) {
        //TODO
    }
}
