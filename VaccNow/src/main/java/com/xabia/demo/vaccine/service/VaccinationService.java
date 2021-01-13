package com.xabia.demo.vaccine.service;

import java.util.List;

public interface VaccinationService {

    int schedulevaccination(int branch_id,int vaccine_id,String timeslot, int user_id);
    
    List<String> choosepayment(int user_id);
    
    String scheduleconfirmationemail(int user_id);

}
