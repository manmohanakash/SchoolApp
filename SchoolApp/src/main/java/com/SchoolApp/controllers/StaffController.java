package com.SchoolApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolApp.models.Staff;
import com.SchoolApp.services.StaffService;

@RestController
public class StaffController {
	
	@Autowired
	private StaffService StaffService;
	
	@RequestMapping("/staffs")
	public List<Staff> getStaffs(){
		return StaffService.getAllStaff();
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/staff")
	public void addStaff(@RequestBody Staff staff) {
		StaffService.addStaff(staff);
	}
	
	 @RequestMapping("/staff/{staffid}")
	public  Optional<Staff> getStaff(@PathVariable String staffid) {
		return StaffService.getStaff(Integer.parseInt(staffid));
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/staff")
	public void updateStaff(@RequestBody Staff staff) {
		StaffService.updateStaff(staff);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/staff/{staffid}")
	public void updateStaff(@PathVariable String staffid) {
		StaffService.deleteStaff(staffid);
	}

}
