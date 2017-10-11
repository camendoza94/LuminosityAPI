package com.camendoza94.luminosity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public interface ObservationRepository extends MongoRepository<Observation, String> {
    List<Observation> findByTimestampBetween(@Param("dateInit") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateInit, @Param("dateEnd") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateEnd);
    List<Observation> findByAlertLevel(@Param("level") String alertLevel);
}
