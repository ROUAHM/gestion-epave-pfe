package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.Admin;
import com.star.epaves.repos.AdminRepository;
import com.star.epaves.services.AdminService;
@Service("AdminService")
public class AdminServiceImpl implements AdminService{
	@Autowired AdminRepository adminRepository ;
	@Override
	
	public Admin addadmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin) ;
	}

	@Override
	public Admin getAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdminbyid(Long id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id).get(); 
	}
	@Override
	public void deleteAdmin (Admin admin) {
		adminRepository.delete(admin);
	}


}
