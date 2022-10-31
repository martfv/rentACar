package javaExamples.rentACar.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import javaExamples.rentACar.entities.concretes.Brand;


@Repository
public interface BrandRepository {
	List<Brand> getAll();



}
