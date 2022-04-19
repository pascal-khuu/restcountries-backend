package co.simplon.restcountries.services;

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
    public Country getCountryName() {
	// TODO Auto-generated method stub
	return repository.findbyCountryName();
    }

}
