package com.star.epaves.services;



import com.star.epaves.entities.Admin;
public interface AdminService {
	public Admin addadmin (Admin admin);
	//GETBYID 
		public Admin getAdmin (Admin admin);
		public Admin getAdminbyid(Long id);
		public void deleteAdmin (Admin admin);

}
