package com.xabia.demo.vaccine.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xabia.demo.vaccine.model.Branch;
import com.xabia.demo.vaccine.model.TimeSlot;
import com.xabia.demo.vaccine.model.Vaccine;
import com.xabia.demo.vaccine.service.AvailabilityService;

@RestController
@RequestMapping("/vaccnow")
public class AvailabilityController {
	
    @Autowired
    AvailabilityService availabilityService;

    @RequestMapping(value="/branches", method = RequestMethod.GET)
    @ResponseBody
    public List<Branch> getAllBranches(){
        return availabilityService.getAllBranches();
    }

    @RequestMapping(value="/branches/{branchid}/vaccines", method = RequestMethod.GET)
    @ResponseBody
    public List<Vaccine> getVaccinesInBranch(@PathVariable("branchid") int branch_id){
        return availabilityService.getVaccinesInBranch(branch_id);
    }

	@RequestMapping(value="/branches/{branchid}/availabletimeslot", method = RequestMethod.GET)
	public List<TimeSlot> getAvailableSlotInBranch(@PathVariable("branchid") int branch_id){
		
		return availabilityService.getAvailableTimeSlots(branch_id);
	}
}