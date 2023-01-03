package com.litto.crm.controller;

import com.litto.crm.entity.ActivityEntity;
import com.litto.crm.payload.ActivityDTO;
import com.litto.crm.service.activity.ActivityService;
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
@RequestMapping("/api/activity")
public class ActivityRestController {

    // =================================================================================================================
    // Variables
    // =================================================================================================================

    private final ActivityService activityService;

    @Autowired
    private ModelMapper modelMapper;

    // =================================================================================================================
    // Constructors
    // =================================================================================================================

    public ActivityRestController(ActivityService activityService) {
        this.activityService = activityService;
    }

    // =================================================================================================================
    // Endpoints
    // =================================================================================================================

    @PostMapping("/create")
    public ResponseEntity<List<ActivityDTO>> create(@RequestBody ActivityDTO dto) {
        // convert DTO to entity
        ActivityEntity entity = modelMapper.map(dto, ActivityEntity.class);
        activityService.create(entity);

        // convert entity to DTO
        List<ActivityDTO> response = activityService.getAll().stream()
                .map(post -> modelMapper.map(post, ActivityDTO.class)).collect(Collectors.toList());

        // return all activities
        return ResponseEntity.ok().body(response);
    }

    @GetMapping()
    public List<ActivityDTO> getAll() {
        return activityService.getAll().stream().map(post -> modelMapper.map(post, ActivityDTO.class))
                .collect(Collectors.toList());
    }
}
