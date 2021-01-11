package com.xabia.demo.vaccine.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VaccinationRepository {

    @Autowired
    JdbcTemplate template;
    
    public int schedulevaccination(int branch_id,int vaccine_id,String timeslot, int user_id){
        String query = "INSERT INTO `applied_vaccination` (`applied_id`, `branch_id`,`vaccine_id`, `timeslot`, `user_id`, `is_confirmed`, `applied_time`) VALUES(?,?,?,?,?,false,sysdate)";
        return template.update(query, template.getMaxRows()+1,branch_id,vaccine_id,timeslot,user_id);
    }

}
