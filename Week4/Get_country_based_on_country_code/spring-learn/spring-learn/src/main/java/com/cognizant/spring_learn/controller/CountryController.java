package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CountryController {

    ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
    Country country = (Country)context.getBean("country");

    @GetMapping("/country")
    public Country setCountryIndia(){
        return country;
    }

    @GetMapping("/countries")
    public ArrayList<Country> getAllCountries(){
        ArrayList<Country> countries = (ArrayList<Country>)context.getBean("countryList");
        return countries;
    }

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code){
     return countryService.getCountry(code);
    }

}
