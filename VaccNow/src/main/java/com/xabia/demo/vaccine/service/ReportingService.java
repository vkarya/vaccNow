package com.xabia.demo.vaccine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xabia.demo.vaccine.model.AppliedVaccination;

public interface ReportingService {

    public List<AppliedVaccination> appliedvaccination(int branch_id);
    
    public List<AppliedVaccination> appliedvaccinationperday(String date);
    
    public List<AppliedVaccination> listAllConfirmedVaccination(String date1, String date2);
}
