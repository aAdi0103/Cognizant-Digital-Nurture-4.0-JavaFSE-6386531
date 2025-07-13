package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    public Country getCountry(String code) {
        List<Country> countries = (List<Country>) context.getBean("countryList");

        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        throw new RuntimeException("Country not found for code: " + code);
    }
}
