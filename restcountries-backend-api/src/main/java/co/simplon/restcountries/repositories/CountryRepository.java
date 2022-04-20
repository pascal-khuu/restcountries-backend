package co.simplon.restcountries.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.restcountries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

    <T> List<T> findAllProjectedBy(Class<T> type);
}
