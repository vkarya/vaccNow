package com.xabia.demo.vaccine.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xabia.demo.vaccine.model.AppliedVaccination;
import com.xabia.demo.vaccine.repository.ReportingRepository;
import com.xabia.demo.vaccine.service.ReportingService;

@Service
public class ReportingServiceImpl implements ReportingService {

    @Autowired
    ReportingRepository reportingRepo;


    public List<AppliedVaccination> appliedvaccination(int branch_id){
        return reportingRepo.appliedvaccination(branch_id);
    }
    
    public List<AppliedVaccination> appliedvaccinationperday(String date){
        return reportingRepo.appliedvaccinationperday(date);
    }
    
    public List<AppliedVaccination> listAllConfirmedVaccination(String date1, String date2){
        return reportingRepo.listAllConfirmedVaccination(date1, date2);
    } 
}
