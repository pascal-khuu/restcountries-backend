package co.simplon.restcountries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.restcountries.entities.Country;
import co.simplon.restcountries.repositories.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<Country> getCountries() {
	return repository.findAll();
    }

}
