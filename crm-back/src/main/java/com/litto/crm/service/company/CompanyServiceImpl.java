package com.litto.crm.service.company;

import com.litto.crm.entity.CompanyEntity;
import com.litto.crm.repository.CompanyRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private final CompanyRepository companyRepository;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    // =================================================================================================================
    // Override
    // =================================================================================================================

    @Override
    public void create(CompanyEntity entity) {
        companyRepository.save(entity);
    }

    @Override
    public List<CompanyEntity> getAll() {
        return companyRepository.findAll();
    }
}
