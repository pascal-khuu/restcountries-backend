package co.simplon.restcountries.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.restcountries.entities.Country;
import co.simplon.restcountries.services.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
	this.service = service;

    }

    @GetMapping
    public List<Country> getCountriesName() {
	return service.getCountriesName();
    }
}
