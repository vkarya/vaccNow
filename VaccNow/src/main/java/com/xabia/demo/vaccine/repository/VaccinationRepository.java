package com.xabia.demo.vaccine.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xabia.demo.vaccine.model.PaymentOptions;
import com.xabia.demo.vaccine.util.Utility;

@Repository
public class VaccinationRepository {

    @Autowired
    JdbcTemplate template;
    
    public int schedulevaccination(int branch_id,int vaccine_id,String timeslot, int user_id){
        String query = "INSERT INTO `applied_vaccination` (`branch_id`,`vaccine_id`, `timeslot`, `user_id`, `is_confirmed`, `applied_time`) VALUES(?,?,?,?,false,sysdate)";
        template.update(query,branch_id,vaccine_id,timeslot,user_id);
        
        query = "UPDATE branch_timeslots set is_occupied=true where timeslot=? and branch_id=?";
        
        return template.update(query,timeslot,branch_id);
    }

	public List<String> choosepayment(int user_id) {
		return PaymentOptions.getPaymentOptions();
	}

	public String scheduleconfirmationemail(int user_id) {
		return Utility.emailUtility();
	}
}
