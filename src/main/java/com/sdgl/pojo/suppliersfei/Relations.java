package com.sdgl.pojo.suppliersfei;

public class Relations extends RelationKey {
    private Integer relationType;

    private Integer relationOwner;

    private String relationName;

    private String relationPhone;

    private String relationEmail;

    public Integer getRelationType() {
        return relationType;
    }

    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    public Integer getRelationOwner() {
        return relationOwner;
    }

    public void setRelationOwner(Integer relationOwner) {
        this.relationOwner = relationOwner;
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName == null ? null : relationName.trim();
    }

    public String getRelationPhone() {
        return relationPhone;
    }

    public void setRelationPhone(String relationPhone) {
        this.relationPhone = relationPhone == null ? null : relationPhone.trim();
    }

    public String getRelationEmail() {
        return relationEmail;
    }

    public void setRelationEmail(String relationEmail) {
        this.relationEmail = relationEmail == null ? null : relationEmail.trim();
    }

    @Override
    public String toString() {
        return "Relations{" +
                "relationType=" + relationType +
                ", relationOwner=" + relationOwner +
                ", relationName='" + relationName + '\'' +
                ", relationPhone='" + relationPhone + '\'' +
                ", relationEmail='" + relationEmail + '\'' +
                '}';
    }
}