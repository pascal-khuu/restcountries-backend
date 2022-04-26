package co.simplon.restcountries.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "capital")
    private String capital;

    @Column(name = "area")
    private float area;

    @Column(name = "population")
    private int population;

    @Column(name = "flag")
    private String flag;

    @Column(name = "map")
    private String map;

    @Column(name = "iso_code")
    private String isoCode;

    @Column(name = "latitude")
    private float latitude;

    @Column(name = "longitude")
    private float longitude;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getCountryName() {
	return countryName;
    }

    public void setCountryName(String countryName) {
	this.countryName = countryName;
    }

    public String getCapital() {
	return capital;
    }

    public void setCapital(String capital) {
	this.capital = capital;
    }

    public float getArea() {
	return area;
    }

    public void setArea(float area) {
	this.area = area;
    }

    public int getPopulation() {
	return population;
    }

    public void setPopulation(int population) {
	this.population = population;
    }

    public String getFlag() {
	return flag;
    }

    public void setFlag(String flag) {
	this.flag = flag;
    }

    public String getMap() {
	return map;
    }

    public void setMap(String map) {
	this.map = map;
    }

    public String getIsoCode() {
	return isoCode;
    }

    public void setIsoCode(String isoCode) {
	this.isoCode = isoCode;
    }

    public float getLatitude() {
	return latitude;
    }

    public void setLatitude(float latitude) {
	this.latitude = latitude;
    }

    public float getLongitude() {
	return longitude;
    }

    public void setLongitude(float longitude) {
	this.longitude = longitude;
    }

    @Override
    public String toString() {
	return "Country [id=" + id + ", countryName=" + countryName + ", capital=" + capital + ", area=" + area
		+ ", population=" + population + ", flag=" + flag + ", map=" + map + ", isoCode=" + isoCode
		+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    public Country() {

    }

    public Country(Long id, String countryName, String capital, float area, int population, String flag, String map,
	    String isoCode, float latitude, float longitude) {
	super();
	this.id = id;
	this.countryName = countryName;
	this.capital = capital;
	this.area = area;
	this.population = population;
	this.flag = flag;
	this.map = map;
	this.isoCode = isoCode;
	this.latitude = latitude;
	this.longitude = longitude;
    }

}
