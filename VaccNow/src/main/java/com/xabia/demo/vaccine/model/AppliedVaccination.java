package com.xabia.demo.vaccine.model;

import java.util.Date;

public class AppliedVaccination {

	private int applied_id;
    private int vaccine_id;
    private int branch_id;
    private int user_id;
    private String timeslot;
    private boolean confirmed;
    private Date applied_time;
    
    public AppliedVaccination() {
    }

    public Date getApplied_time() {
		return applied_time;
	}

	public void setApplied_time(Date applied_time) {
		this.applied_time = applied_time;
	}

	public AppliedVaccination(int applied_id,int vaccine_id,int branch_id,int user_id, String timeslot, boolean confirmed, Date applied_time) {
        this.applied_id = applied_id;
        this.vaccine_id = vaccine_id;
        this.branch_id = branch_id;
        this.user_id = user_id;
        this.timeslot = timeslot;
        this.confirmed = confirmed;
        this.applied_time = applied_time;
    }


	public int getVaccine_id() {
		return vaccine_id;
	}

	public void setVaccine_id(int vaccine_id) {
		this.vaccine_id = vaccine_id;
	}

	public int getApplied_id() {
		return applied_id;
	}

	public void setApplied_id(int applied_id) {
		this.applied_id = applied_id;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}


}
