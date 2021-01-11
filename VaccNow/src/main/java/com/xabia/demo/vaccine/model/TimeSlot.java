package com.xabia.demo.vaccine.model;

public class TimeSlot {

    private int slot_id;
    private int branch_id;
    private String timeslot;

    public TimeSlot() {
    }

    public TimeSlot(int branch_id, int slot_id, String timeslot) {
        this.branch_id = branch_id;
        this.slot_id = slot_id;
        this.timeslot = timeslot;
    }


	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public int getSlot_id() {
		return slot_id;
	}

	public void setSlot_id(int slot_id) {
		this.slot_id = slot_id;
	}

	public String getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(String timeslot) {
		this.timeslot = timeslot;
	}



}
