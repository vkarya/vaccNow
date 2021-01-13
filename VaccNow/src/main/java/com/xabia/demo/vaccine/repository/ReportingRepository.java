package com.xabia.demo.vaccine.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xabia.demo.vaccine.model.AppliedVaccination;

@Repository
public class ReportingRepository {

    @Autowired
    JdbcTemplate template;


    public List<AppliedVaccination> appliedvaccination(int branch_id){
        List<AppliedVaccination> appliedVaccination = template.query("select applied_id, branch_id, vaccine_id, timeslot, user_id, is_confirmed, applied_time from applied_vaccination where branch_id="+branch_id,(result,rowNum)->new AppliedVaccination(result.getInt("applied_id"),
        		result.getInt("vaccine_id"),result.getInt("branch_id"),result.getInt("user_id"),result.getString("timeslot"),result.getBoolean("is_confirmed"), result.getDate("applied_time")));
        return appliedVaccination;
    }
    
    public List<AppliedVaccination> appliedvaccinationperday(String date){
    	List<AppliedVaccination> appliedVaccination = template.query("select applied_id, branch_id, vaccine_id, timeslot, user_id, is_confirmed, applied_time from applied_vaccination where applied_time BETWEEN DATE '"+date+"' AND DATE '"+date+"'",(result,rowNum)->new AppliedVaccination(result.getInt("applied_id"),
        		result.getInt("vaccine_id"),result.getInt("branch_id"),result.getInt("user_id"),result.getString("timeslot"),result.getBoolean("is_confirmed"), result.getDate("applied_time")));
        return appliedVaccination;
    }
    
    public List<AppliedVaccination> listAllConfirmedVaccination(String date1, String date2){
        List<AppliedVaccination> appliedVaccination = template.query("select applied_id, branch_id, vaccine_id, timeslot, user_id, is_confirmed, applied_time from applied_vaccination where is_confirmed is true and applied_time BETWEEN DATE '"+date1+"' AND DATE '"+date2+"'",(result,rowNum)->new AppliedVaccination(result.getInt("applied_id"),
        		result.getInt("vaccine_id"),result.getInt("branch_id"),result.getInt("user_id"),result.getString("timeslot"),result.getBoolean("is_confirmed"), result.getDate("applied_time")));
        return appliedVaccination;
    } 
}
