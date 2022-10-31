package javaExamples.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaExamples.rentACar.business.abstracts.BrandService;
import javaExamples.rentACar.dataAccess.abstracts.BrandRepository;
import javaExamples.rentACar.entities.concretes.Brand;


@Service
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	
	
	public List<Brand> getAll(){
		// is kurallari
		return brandRepository.getAll();
	
	}


	

}

