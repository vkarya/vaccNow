package com.xabia.demo.vaccine.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xabia.demo.vaccine.model.AppliedVaccination;
import com.xabia.demo.vaccine.model.PaymentOptions;
import com.xabia.demo.vaccine.repository.VaccinationRepository;
import com.xabia.demo.vaccine.util.Utility;

@RestController
@RequestMapping("/vaccnow")
public class VaccinationController {
    @Autowired
    VaccinationRepository vaccinationRepo;

	
    @RequestMapping(value="/schedulevaccination", method = RequestMethod.GET)
    @ResponseBody
    public String schedulevaccination(@RequestParam("vaccine_id") int vaccine_id,@RequestParam("branch_id") int branch_id,
                          @RequestParam("timeslot") String timeslot, @RequestParam("user_id") int user_id){
    	
        if(vaccinationRepo.schedulevaccination(branch_id,vaccine_id,timeslot, user_id) >= 1){
            return "Successfully Scheduled";
        }else{
            return "Something went wrong!";
        }
    }
    
    @RequestMapping(value="/choosepayment", method = RequestMethod.GET)
    @ResponseBody
    public List<String> choosepayment(@RequestParam("user_id") int user_id){
    	
            return PaymentOptions.getPaymentOptions();
    }
    
    @RequestMapping(value="/scheduleconfirmationemail", method = RequestMethod.GET)
    @ResponseBody
    public String scheduleconfirmationemail(@RequestParam("user_id") int user_id){
    	
            return Utility.emailUtility();
    }    
}