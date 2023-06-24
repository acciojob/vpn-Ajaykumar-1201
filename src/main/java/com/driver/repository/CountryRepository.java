package com.driver.repository;

import com.driver.model.Connection;
import com.driver.model.CountryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Connection, Integer> {

    public CountryName findByCountryName(CountryName countryName);
}
