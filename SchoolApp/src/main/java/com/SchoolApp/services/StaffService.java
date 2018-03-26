package com.SchoolApp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolApp.models.Staff;
import com.SchoolApp.repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository StaffRepository;
	
	
	public List<Staff> getAllStaff(){
		List<Staff> staffs = new ArrayList<Staff>();
		StaffRepository.findAll().forEach(staffs::add);
		return staffs;
	}

	
	public void addStaff(Staff staff) {
		StaffRepository.save(staff);
	}
	
	
	public Optional<Staff> getStaff(int id) {
		return StaffRepository.findById(id);
		}
	
	public void updateStaff(Staff staff) {
		StaffRepository.save(staff);
	}
	
	public void deleteStaff(String id) {
		StaffRepository.deleteById(Integer.parseInt(id));
	}

}

