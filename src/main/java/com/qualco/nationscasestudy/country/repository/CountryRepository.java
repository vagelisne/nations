package com.qualco.nationscasestudy.country.repository;

import com.qualco.nationscasestudy.country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long>  {

    @Query(value = "select new com.qualco.nationscasestudy.country.entity.Country(c.id, c.name, c.area, c.countryCode2) " +
            "from Country c " +
            "order by c.name")
    List<Country> findAllGetNameAndArea();
}
