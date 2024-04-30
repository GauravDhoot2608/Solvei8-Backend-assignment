package com.traini8.restapiassignment.repositories;

import com.traini8.restapiassignment.models.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainingCenterRepository extends MongoRepository<TrainingCenter,String> {

    List<TrainingCenter> findByAddressCityIgnoreCase(String city);

    List<TrainingCenter> findByAddressStateIgnoreCase(String state);
}
