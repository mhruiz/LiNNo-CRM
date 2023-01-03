package com.litto.crm.controller;

import com.litto.crm.entity.CompanyEntity;
import com.litto.crm.payload.CompanyDTO;
import com.litto.crm.service.company.CompanyService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/api/company")
public class CompanyRestController {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private final CompanyService companyService;

    @Autowired
    private ModelMapper modelMapper;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public CompanyRestController(CompanyService companyService) {
        this.companyService = companyService;
    }

    // =================================================================================================================
    // Endpoints
    // =================================================================================================================

    @PostMapping("/create")
    public ResponseEntity<List<CompanyDTO>> create(@RequestBody CompanyDTO dto) {
        // convert DTO to entity
        CompanyEntity entity = modelMapper.map(dto, CompanyEntity.class);
        companyService.create(entity);

        // convert entity to DTO
        List<CompanyDTO> response = companyService.getAll().stream()
                .map(post -> modelMapper.map(post, CompanyDTO.class)).collect(Collectors.toList());

        // return all activities
        return ResponseEntity.ok().body(response);
    }

    @GetMapping()
    public List<CompanyDTO> getAll() {
        return companyService.getAll().stream().map(post -> modelMapper.map(post, CompanyDTO.class))
                .collect(Collectors.toList());
    }

}
