package com.camendoza94.luminosity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public interface MeasurementRepository extends MongoRepository<Measurement, String> {
    List<Measurement> findByTimestampBetween(@Param("dateInit") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateInit, @Param("dateEnd") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateEnd);
    List<Measurement> findByAlertLevel(@Param("level") String alertLevel);
}
