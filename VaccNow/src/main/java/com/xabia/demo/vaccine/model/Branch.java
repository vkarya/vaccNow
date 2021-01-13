package com.xabia.demo.vaccine.model;

//@Entity
public class Branch {

//	@Id
//	@Column
    private int branch_id;
    private String name;
    private String address;

    public Branch() {
    }

    public Branch(int branch_id, String name, String address) {
        this.branch_id = branch_id;
        this.name = name;
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


}
