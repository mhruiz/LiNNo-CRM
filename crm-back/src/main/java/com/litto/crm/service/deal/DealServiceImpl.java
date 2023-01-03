package com.litto.crm.service.deal;

import com.litto.crm.entity.ActivityEntity;
import com.litto.crm.entity.CompanyEntity;
import com.litto.crm.entity.DealEntity;
import com.litto.crm.entity.ContactEntity;
import com.litto.crm.repository.DealRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DealServiceImpl implements DealService {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private DealRepository dealRepository;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public DealServiceImpl(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    // =================================================================================================================
    // Override
    // =================================================================================================================

    @Override
    public void create(DealEntity entity) {
        dealRepository.save(entity);
    }

    @Override
    public List<DealEntity> getAll() {
        return dealRepository.findAll();
    }

    @Override
    public void assignPointContact(ContactEntity entity) {
        //TODO
    }

    @Override
    public void assignCompany(CompanyEntity entity) {
        //TODO
    }

    @Override
    public void assignActivity(ActivityEntity entity) {
        //TODO
    }
}
