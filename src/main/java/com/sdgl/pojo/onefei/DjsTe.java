package com.sdgl.pojo.onefei;

import lombok.Data;

import java.util.Date;

@Data
public class DjsTe {
    private Integer qTeamId;

    private String numPeople;

    private Date hairDate;

    private Integer opId;

    private Integer touristId;

    private String qTravel;

    private String qTuanid;

    private String qState;

    private String qTotal;

    private String jietuanxinxi;

    private Date sendDate;

    private String sotuanxinxi;

    private String jietuancheci;

    private String songtuancheci;

    private Integer cheId;

    private Integer cantingId;

    private Integer xianluid;

    private String bei2;

    private String bei3;

    private String jietuandidian;

    private String songtuandidian;

    private Date jietuanDate;

    public Integer getqTeamId() {
        return qTeamId;
    }

    public void setqTeamId(Integer qTeamId) {
        this.qTeamId = qTeamId;
    }

    public String getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(String numPeople) {
        this.numPeople = numPeople == null ? null : numPeople.trim();
    }

    public Date getHairDate() {
        return hairDate;
    }

    public void setHairDate(Date hairDate) {
        this.hairDate = hairDate;
    }

    public Integer getOpId() {
        return opId;
    }

    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    public Integer getTouristId() {
        return touristId;
    }

    public void setTouristId(Integer touristId) {
        this.touristId = touristId;
    }

    public String getqTravel() {
        return qTravel;
    }

    public void setqTravel(String qTravel) {
        this.qTravel = qTravel == null ? null : qTravel.trim();
    }

    public String getqTuanid() {
        return qTuanid;
    }

    public void setqTuanid(String qTuanid) {
        this.qTuanid = qTuanid == null ? null : qTuanid.trim();
    }

    public String getqState() {
        return qState;
    }

    public void setqState(String qState) {
        this.qState = qState == null ? null : qState.trim();
    }

    public String getqTotal() {
        return qTotal;
    }

    public void setqTotal(String qTotal) {
        this.qTotal = qTotal == null ? null : qTotal.trim();
    }

    public String getJietuanxinxi() {
        return jietuanxinxi;
    }

    public void setJietuanxinxi(String jietuanxinxi) {
        this.jietuanxinxi = jietuanxinxi == null ? null : jietuanxinxi.trim();
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getSotuanxinxi() {
        return sotuanxinxi;
    }

    public void setSotuanxinxi(String sotuanxinxi) {
        this.sotuanxinxi = sotuanxinxi == null ? null : sotuanxinxi.trim();
    }

    public String getJietuancheci() {
        return jietuancheci;
    }

    public void setJietuancheci(String jietuancheci) {
        this.jietuancheci = jietuancheci == null ? null : jietuancheci.trim();
    }

    public String getSongtuancheci() {
        return songtuancheci;
    }

    public void setSongtuancheci(String songtuancheci) {
        this.songtuancheci = songtuancheci == null ? null : songtuancheci.trim();
    }

    public Integer getCheId() {
        return cheId;
    }

    public void setCheId(Integer cheId) {
        this.cheId = cheId;
    }

    public Integer getCantingId() {
        return cantingId;
    }

    public void setCantingId(Integer cantingId) {
        this.cantingId = cantingId;
    }

    public Integer getXianluid() {
        return xianluid;
    }

    public void setXianluid(Integer xianluid) {
        this.xianluid = xianluid;
    }

    public String getBei2() {
        return bei2;
    }

    public void setBei2(String bei2) {
        this.bei2 = bei2 == null ? null : bei2.trim();
    }

    public String getBei3() {
        return bei3;
    }

    public void setBei3(String bei3) {
        this.bei3 = bei3 == null ? null : bei3.trim();
    }

    public String getJietuandidian() {
        return jietuandidian;
    }

    public void setJietuandidian(String jietuandidian) {
        this.jietuandidian = jietuandidian == null ? null : jietuandidian.trim();
    }

    public String getSongtuandidian() {
        return songtuandidian;
    }

    public void setSongtuandidian(String songtuandidian) {
        this.songtuandidian = songtuandidian == null ? null : songtuandidian.trim();
    }

    public Date getJietuanDate() {
        return jietuanDate;
    }

    public void setJietuanDate(Date jietuanDate) {
        this.jietuanDate = jietuanDate;
    }

    @Override
    public String toString() {
        return "DjsTe{" +
                "qTeamId=" + qTeamId +
                ", numPeople='" + numPeople + '\'' +
                ", hairDate=" + hairDate +
                ", opId=" + opId +
                ", touristId=" + touristId +
                ", qTravel='" + qTravel + '\'' +
                ", qTuanid='" + qTuanid + '\'' +
                ", qState='" + qState + '\'' +
                ", qTotal='" + qTotal + '\'' +
                ", jietuanxinxi='" + jietuanxinxi + '\'' +
                ", sendDate=" + sendDate +
                ", sotuanxinxi='" + sotuanxinxi + '\'' +
                ", jietuancheci='" + jietuancheci + '\'' +
                ", songtuancheci='" + songtuancheci + '\'' +
                ", cheId=" + cheId +
                ", cantingId=" + cantingId +
                ", xianluid=" + xianluid +
                ", bei2='" + bei2 + '\'' +
                ", bei3='" + bei3 + '\'' +
                ", jietuandidian='" + jietuandidian + '\'' +
                ", songtuandidian='" + songtuandidian + '\'' +
                ", jietuanDate=" + jietuanDate +
                '}';
    }
}