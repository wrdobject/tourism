package com.sdgl.pojo;

public class Relation {
    private Integer relation_id;
    private Integer relation_type;
    private Integer relation_type_id;
    private Integer relation_owner;
    private String relation_name;
    private String relation_phone;
    private String relation_email;

    public Relation() {
    }

    public Relation(Integer relation_id, Integer relation_type, Integer relation_type_id, Integer relation_owner, String relation_name, String relation_phone, String relation_email) {
        this.relation_id = relation_id;
        this.relation_type = relation_type;
        this.relation_type_id = relation_type_id;
        this.relation_owner = relation_owner;
        this.relation_name = relation_name;
        this.relation_phone = relation_phone;
        this.relation_email = relation_email;
    }

    public Integer getRelation_id() {
        return relation_id;
    }

    public void setRelation_id(Integer relation_id) {
        this.relation_id = relation_id;
    }

    public Integer getRelation_type() {
        return relation_type;
    }

    public void setRelation_type(Integer relation_type) {
        this.relation_type = relation_type;
    }

    public Integer getRelation_type_id() {
        return relation_type_id;
    }

    public void setRelation_type_id(Integer relation_type_id) {
        this.relation_type_id = relation_type_id;
    }

    public Integer getRelation_owner() {
        return relation_owner;
    }

    public void setRelation_owner(Integer relation_owner) {
        this.relation_owner = relation_owner;
    }

    public String getRelation_name() {
        return relation_name;
    }

    public void setRelation_name(String relation_name) {
        this.relation_name = relation_name;
    }

    public String getRelation_phone() {
        return relation_phone;
    }

    public void setRelation_phone(String relation_phone) {
        this.relation_phone = relation_phone;
    }

    public String getRelation_email() {
        return relation_email;
    }

    public void setRelation_email(String relation_email) {
        this.relation_email = relation_email;
    }
}
