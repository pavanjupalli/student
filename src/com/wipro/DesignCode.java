package com.wipro;

public class DesignCode {

    private Character designcode;

    private String designation;

    private Integer da;

    public Character getDesigncode() {
        return designcode;
    }

    public void setDesigncode(Character designcode) {
        this.designcode = designcode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getDa() {
        return da;
    }

    public DesignCode() {
    }

    public void setDa(Integer da) {
        this.da = da;
    }

    public DesignCode(Character designcode, String designation, Integer da) {
        this.designcode = designcode;
        this.designation = designation;
        this.da = da;
    }
}
