package com.xabia.demo.vaccine.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xabia.demo.vaccine.repository.VaccinationRepository;
import com.xabia.demo.vaccine.service.VaccinationService;

@Service
public class VaccinationServiceImpl implements VaccinationService {

    @Autowired
    VaccinationRepository vaccinationRepo;
    
    public int schedulevaccination(int branch_id,int vaccine_id,String timeslot, int user_id){
        return vaccinationRepo.schedulevaccination(branch_id, vaccine_id, timeslot, user_id);
    }

	@Override
	public List<String> choosepayment(int user_id) {
		return vaccinationRepo.choosepayment(user_id);
	}

	@Override
	public String scheduleconfirmationemail(int user_id) {
		return vaccinationRepo.scheduleconfirmationemail(user_id);
	}

}

