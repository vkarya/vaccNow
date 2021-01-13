package com.xabia.demo.vaccine.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xabia.demo.vaccine.model.Branch;
import com.xabia.demo.vaccine.model.TimeSlot;
import com.xabia.demo.vaccine.model.Vaccine;

@Repository
public class AvailabilityRepository {

    @Autowired
    JdbcTemplate template;

    public List<Branch> getAllBranches(){
        List<Branch> branches = template.query("select branch_id, name, address from branch",(result,rowNum)->new Branch(result.getInt("branch_id"),
                result.getString("name"), result.getString("address")));
        return branches;
    }

    public List<Vaccine> getVaccinesInBranch(int branch_id){
        List<Vaccine> vaccines = template.query("select v.vaccine_id as vaccine_id, v.name as name from vaccine v, branch_vaccine b where v.vaccine_id = b.vaccine_id and b.branch_id = "+branch_id,(result,rowNum)->new Vaccine(result.getInt("vaccine_id"),
                result.getString("name")));
        return vaccines;
    }
    
    public List<TimeSlot> getAvailableTimeSlots(int branch_id){
        List<TimeSlot> timeslots = template.query("select slot_id, branch_id, timeslot from branch_timeslots where is_occupied is false and branch_id="+branch_id,(result,rowNum)->new TimeSlot(
        		result.getInt("branch_id"), result.getInt("slot_id"), result.getString("timeslot")));
        return timeslots;
    }    

}
