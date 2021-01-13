package com.xabia.demo.vaccine.service;

import java.util.List;

import com.xabia.demo.vaccine.model.Branch;
import com.xabia.demo.vaccine.model.TimeSlot;
import com.xabia.demo.vaccine.model.Vaccine;


public interface AvailabilityService {

    public List<Branch> getAllBranches();

    public List<Vaccine> getVaccinesInBranch(int branch_id);
    
    public List<TimeSlot> getAvailableTimeSlots(int branch_id);   

}
