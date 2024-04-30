package com.traini8.restapiassignment.controllers;

import com.traini8.restapiassignment.models.TrainingCenter;
import com.traini8.restapiassignment.payloads.TrainingCenterRequest;
import com.traini8.restapiassignment.services.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService trainingCenterService;

    @PostMapping("/add")
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenterRequest trainingCenterRequest) {
        TrainingCenter trainingCenter = trainingCenterService.createTrainingCenter(trainingCenterRequest);
        return ResponseEntity.ok(trainingCenter);
    }

    @GetMapping("/all")
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state) {

        List<TrainingCenter> trainingCenters = trainingCenterService.getAllTrainingCenters(city,state);
        return ResponseEntity.ok(trainingCenters);
    }
}
