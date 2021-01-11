package com.xabia.demo.vaccine.model;

public class Vaccine {

    private int vaccine_id;
    private String name;

    public Vaccine() {
    }

    public Vaccine(int vaccine_id, String name) {
        this.vaccine_id = vaccine_id;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public int getVaccine_id() {
		return vaccine_id;
	}

	public void setVaccine_id(int vaccine_id) {
		this.vaccine_id = vaccine_id;
	}


}
