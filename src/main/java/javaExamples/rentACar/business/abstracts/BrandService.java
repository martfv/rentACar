package javaExamples.rentACar.business.abstracts;

import java.util.List;

import javaExamples.rentACar.entities.concretes.Brand;

public interface BrandService {
	List<Brand> getAll();
}
