package com.traini8.restapiassignment.services;

import com.traini8.restapiassignment.models.TrainingCenter;
import com.traini8.restapiassignment.payloads.TrainingCenterRequest;
import com.traini8.restapiassignment.repositories.TrainingCenterRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    public TrainingCenter createTrainingCenter(TrainingCenterRequest trainingCenterRequest){
        ObjectId objectId = new ObjectId();
        TrainingCenter trainingCenter = TrainingCenter.builder()
                .id(objectId.toHexString())
                .centerName(trainingCenterRequest.getCenterName())
                .centerCode(trainingCenterRequest.getCenterCode())
                .address(trainingCenterRequest.getAddress())
                .studentCapacity(trainingCenterRequest.getStudentCapacity())
                .coursesOffered(trainingCenterRequest.getCoursesOffered())
                .createdOn(System.currentTimeMillis())
                .contactEmail(trainingCenterRequest.getContactEmail())
                .contactPhone(trainingCenterRequest.getContactPhone())
                .build();

        // save into DB
        TrainingCenter savedTrainingCenter = trainingCenterRepository.save(trainingCenter);

        return savedTrainingCenter;
    }

    // filter -> get training center by city
    // filter -> get training center by state
    // get all training centers
    public List<TrainingCenter> getAllTrainingCenters(String city, String state) {

        if (city != null && !city.isEmpty()) {
            return trainingCenterRepository.findByAddressCityIgnoreCase(city);
        } else if (state != null && !state.isEmpty()) {
            return trainingCenterRepository.findByAddressStateIgnoreCase(state);
        } else {
            return trainingCenterRepository.findAll();
        }
    }
}