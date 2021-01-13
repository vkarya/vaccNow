package com.xabia.demo.vaccine.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.xabia.demo.vaccine.service.VaccinationService;

@RestController
@RequestMapping("/vaccnow")
public class VaccinationController {
    @Autowired
    VaccinationService vaccinationService;

	
    @RequestMapping(value="/schedulevaccination", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity schedulevaccination(@RequestBody Map<String, Object> userMap){
    	
        if(vaccinationService.schedulevaccination((Integer)userMap.get("branch_id"),(Integer)userMap.get("vaccine_id"),(String)userMap.get("timeslot"), (Integer)userMap.get("user_id")) >= 1){
            return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
        }else{
        	return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @RequestMapping(value="/choosepayment", method = RequestMethod.GET)
    @ResponseBody
    public List<String> choosepayment(@RequestParam("user_id") int user_id){
    	
            return vaccinationService.choosepayment(user_id);
    }
    
    @RequestMapping(value="/scheduleconfirmationemail", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public String scheduleconfirmationemail(@RequestBody Map<String, Integer> userMap){
            return vaccinationService.scheduleconfirmationemail(userMap.get("user_id"));
    }    
}