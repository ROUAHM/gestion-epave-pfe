package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.Enchere;
import com.star.epaves.repos.EnchereRepository;
import com.star.epaves.services.EnchereService;
@Service("EnchereService")
public class EnchereServiceImpl implements EnchereService {
	
		@Autowired EnchereRepository enchererepository ;
		@Override
		public Enchere addenchere (Enchere enchere) {
			return enchererepository.save(enchere) ;
		}
		public Enchere getencherebyid (Long id) {
			return enchererepository.findById(id).get(); 
		}
		@Override
		public void deleteEnchere (Enchere enchere) {
			enchererepository.delete(enchere);
		}

}
