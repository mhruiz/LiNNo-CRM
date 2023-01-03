package com.litto.crm.controller;

import com.litto.crm.entity.DealEntity;
import com.litto.crm.payload.DealDTO;
import com.litto.crm.service.deal.DealService;
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
@RequestMapping("/api/deal")
public class DealRestController {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private final DealService dealService;

    @Autowired
    private ModelMapper modelMapper;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public DealRestController(DealService dealService) {
        this.dealService = dealService;
    }

    // =================================================================================================================
    // Endpoints
    // =================================================================================================================

    @PostMapping("/create")
    public ResponseEntity<List<DealDTO>> create(@RequestBody DealDTO dto) {
        // convert DTO to entity
        DealEntity entity = modelMapper.map(dto, DealEntity.class);
        dealService.create(entity);

        // convert entity to DTO
        List<DealDTO> response = dealService.getAll().stream()
                .map(post -> modelMapper.map(post, DealDTO.class)).collect(Collectors.toList());

        // return all activities
        return ResponseEntity.ok().body(response);
    }

    @GetMapping()
    public List<DealDTO> getAll() {
        return dealService.getAll().stream().map(post -> modelMapper.map(post, DealDTO.class))
                .collect(Collectors.toList());
    }
}
