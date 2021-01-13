package com.xabia.demo.vaccine.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xabia.demo.vaccine.model.Branch;
import com.xabia.demo.vaccine.model.TimeSlot;
import com.xabia.demo.vaccine.model.Vaccine;
import com.xabia.demo.vaccine.repository.AvailabilityRepository;
//import com.xabia.demo.vaccine.repository.AvailabilityRepository_JPA;
import com.xabia.demo.vaccine.service.AvailabilityService;

@Service
public class AvailabilityServiceImpl implements AvailabilityService {

    @Autowired
    AvailabilityRepository availabilityRepo;

//    @Autowired
//    AvailabilityRepository_JPA jpaRep;
    
    public List<Branch> getAllBranches(){
		/*
		 * List<Branch> listBranch = new ArrayList<Branch>();
		 * jpaRep.findAll().forEach(item->{
		 * 
		 * if(item!=null) { listBranch.add(item); } });
		 */
        return availabilityRepo.getAllBranches(); //JDBCTemplate approach
//        return listBranch;
        
    }

    public List<Vaccine> getVaccinesInBranch(int branch_id){
        return availabilityRepo.getVaccinesInBranch(branch_id);
    }
    
    public List<TimeSlot> getAvailableTimeSlots(int branch_id){
        return availabilityRepo.getAvailableTimeSlots(branch_id);
    }    

}
