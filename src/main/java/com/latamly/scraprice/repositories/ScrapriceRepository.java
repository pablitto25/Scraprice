package com.latamly.scraprice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latamly.scraprice.models.ScrapriceModel;

@Repository
public interface ScrapriceRepository extends CrudRepository<ScrapriceModel, Integer>{
    
}
