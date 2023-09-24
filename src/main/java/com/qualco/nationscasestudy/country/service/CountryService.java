package com.qualco.nationscasestudy.country.service;

import com.qualco.nationscasestudy.country.entity.Country;
import com.qualco.nationscasestudy.country.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Component
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<Country> getCountriesWithArea() {
        return countryRepository.findAllGetNameAndArea();
    }
}
