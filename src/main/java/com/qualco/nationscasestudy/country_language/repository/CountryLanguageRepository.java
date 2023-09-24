package com.qualco.nationscasestudy.country_language.repository;

import com.qualco.nationscasestudy.country_language.entity.CountryLanguage;
import com.qualco.nationscasestudy.country_language.entity.CountryLanguageId;
import com.qualco.nationscasestudy.language.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {
    List<CountryLanguage> findCountryLanguageByCountry_Id(long countryID);
}
