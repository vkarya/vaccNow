package com.xabia.demo.vaccine.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xabia.demo.vaccine.model.AppliedVaccination;
import com.xabia.demo.vaccine.repository.ReportingRepository;

@RestController
@RequestMapping("/vaccnow")
public class ReportingController {
    @Autowired
    ReportingRepository reportingRepo;

    @RequestMapping(value="/branches/{branchid}/appliedvaccination", method = RequestMethod.GET)
    @ResponseBody
    public List<AppliedVaccination> appliedvaccination(@PathVariable("branchid") int branch_id){
        return reportingRepo.appliedvaccination(branch_id);
    }

    @RequestMapping(value="/appliedvaccinationperday/{date}", method = RequestMethod.GET)
	public List<AppliedVaccination> appliedvaccinationperday(@PathVariable("date") String date){
		
		return reportingRepo.appliedvaccinationperday(date);
	}
	
    @RequestMapping(value="/listallconfirmedvaccination/{date1}/{date2}", method = RequestMethod.GET)
	public List<AppliedVaccination> listAllConfirmedVaccination(@PathVariable("date1") String date1, @PathVariable("date2") String date2){
		
		return reportingRepo.listAllConfirmedVaccination(date1, date2);
	}
}