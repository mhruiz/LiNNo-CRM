package com.litto.crm.controller;

import com.litto.crm.entity.ContactEntity;
import com.litto.crm.payload.ContactDTO;
import com.litto.crm.service.contact.ContactService;
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
@RequestMapping("/api/pointcontact")
public class ContactRestController {
// =================================================================================================================
    // Variables
    // =================================================================================================================

    private final ContactService pointContactService;

    @Autowired
    private ModelMapper modelMapper;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public ContactRestController(ContactService pointContactService) {
        this.pointContactService = pointContactService;
    }

    // =================================================================================================================
    // Endpoints
    // =================================================================================================================

    @PostMapping("/create")
    public ResponseEntity<List<ContactDTO>> create(@RequestBody ContactDTO dto) {
        // convert DTO to entity
        ContactEntity entity = modelMapper.map(dto, ContactEntity.class);
        pointContactService.create(entity);

        // convert entity to DTO
        List<ContactDTO> response = pointContactService.getAll().stream()
                .map(post -> modelMapper.map(post, ContactDTO.class)).collect(Collectors.toList());

        // return all activities
        return ResponseEntity.ok().body(response);
    }

    @GetMapping()
    public List<ContactDTO> getAll() {
        return pointContactService.getAll().stream().map(post -> modelMapper.map(post, ContactDTO.class))
                .collect(Collectors.toList());
    }
}
