package com.sdgl.pojo.onefei;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DjsTeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DjsTeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andQTeamIdIsNull() {
            addCriterion("q_team_id is null");
            return (Criteria) this;
        }

        public Criteria andQTeamIdIsNotNull() {
            addCriterion("q_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andQTeamIdEqualTo(Integer value) {
            addCriterion("q_team_id =", value, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdNotEqualTo(Integer value) {
            addCriterion("q_team_id <>", value, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdGreaterThan(Integer value) {
            addCriterion("q_team_id >", value, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_team_id >=", value, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdLessThan(Integer value) {
            addCriterion("q_team_id <", value, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("q_team_id <=", value, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdIn(List<Integer> values) {
            addCriterion("q_team_id in", values, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdNotIn(List<Integer> values) {
            addCriterion("q_team_id not in", values, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("q_team_id between", value1, value2, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andQTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("q_team_id not between", value1, value2, "qTeamId");
            return (Criteria) this;
        }

        public Criteria andNumPeopleIsNull() {
            addCriterion("num_people is null");
            return (Criteria) this;
        }

        public Criteria andNumPeopleIsNotNull() {
            addCriterion("num_people is not null");
            return (Criteria) this;
        }

        public Criteria andNumPeopleEqualTo(String value) {
            addCriterion("num_people =", value, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleNotEqualTo(String value) {
            addCriterion("num_people <>", value, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleGreaterThan(String value) {
            addCriterion("num_people >", value, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("num_people >=", value, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleLessThan(String value) {
            addCriterion("num_people <", value, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleLessThanOrEqualTo(String value) {
            addCriterion("num_people <=", value, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleLike(String value) {
            addCriterion("num_people like", value, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleNotLike(String value) {
            addCriterion("num_people not like", value, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleIn(List<String> values) {
            addCriterion("num_people in", values, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleNotIn(List<String> values) {
            addCriterion("num_people not in", values, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleBetween(String value1, String value2) {
            addCriterion("num_people between", value1, value2, "numPeople");
            return (Criteria) this;
        }

        public Criteria andNumPeopleNotBetween(String value1, String value2) {
            addCriterion("num_people not between", value1, value2, "numPeople");
            return (Criteria) this;
        }

        public Criteria andHairDateIsNull() {
            addCriterion("hair_date is null");
            return (Criteria) this;
        }

        public Criteria andHairDateIsNotNull() {
            addCriterion("hair_date is not null");
            return (Criteria) this;
        }

        public Criteria andHairDateEqualTo(Date value) {
            addCriterionForJDBCDate("hair_date =", value, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hair_date <>", value, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateGreaterThan(Date value) {
            addCriterionForJDBCDate("hair_date >", value, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hair_date >=", value, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateLessThan(Date value) {
            addCriterionForJDBCDate("hair_date <", value, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hair_date <=", value, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateIn(List<Date> values) {
            addCriterionForJDBCDate("hair_date in", values, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hair_date not in", values, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hair_date between", value1, value2, "hairDate");
            return (Criteria) this;
        }

        public Criteria andHairDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hair_date not between", value1, value2, "hairDate");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNull() {
            addCriterion("op_id is null");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNotNull() {
            addCriterion("op_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpIdEqualTo(Integer value) {
            addCriterion("op_id =", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotEqualTo(Integer value) {
            addCriterion("op_id <>", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThan(Integer value) {
            addCriterion("op_id >", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_id >=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThan(Integer value) {
            addCriterion("op_id <", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThanOrEqualTo(Integer value) {
            addCriterion("op_id <=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdIn(List<Integer> values) {
            addCriterion("op_id in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotIn(List<Integer> values) {
            addCriterion("op_id not in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdBetween(Integer value1, Integer value2) {
            addCriterion("op_id between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("op_id not between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andTouristIdIsNull() {
            addCriterion("tourist_id is null");
            return (Criteria) this;
        }

        public Criteria andTouristIdIsNotNull() {
            addCriterion("tourist_id is not null");
            return (Criteria) this;
        }

        public Criteria andTouristIdEqualTo(Integer value) {
            addCriterion("tourist_id =", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdNotEqualTo(Integer value) {
            addCriterion("tourist_id <>", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdGreaterThan(Integer value) {
            addCriterion("tourist_id >", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tourist_id >=", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdLessThan(Integer value) {
            addCriterion("tourist_id <", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdLessThanOrEqualTo(Integer value) {
            addCriterion("tourist_id <=", value, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdIn(List<Integer> values) {
            addCriterion("tourist_id in", values, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdNotIn(List<Integer> values) {
            addCriterion("tourist_id not in", values, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdBetween(Integer value1, Integer value2) {
            addCriterion("tourist_id between", value1, value2, "touristId");
            return (Criteria) this;
        }

        public Criteria andTouristIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tourist_id not between", value1, value2, "touristId");
            return (Criteria) this;
        }

        public Criteria andQTravelIsNull() {
            addCriterion("q_travel is null");
            return (Criteria) this;
        }

        public Criteria andQTravelIsNotNull() {
            addCriterion("q_travel is not null");
            return (Criteria) this;
        }

        public Criteria andQTravelEqualTo(String value) {
            addCriterion("q_travel =", value, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelNotEqualTo(String value) {
            addCriterion("q_travel <>", value, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelGreaterThan(String value) {
            addCriterion("q_travel >", value, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelGreaterThanOrEqualTo(String value) {
            addCriterion("q_travel >=", value, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelLessThan(String value) {
            addCriterion("q_travel <", value, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelLessThanOrEqualTo(String value) {
            addCriterion("q_travel <=", value, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelLike(String value) {
            addCriterion("q_travel like", value, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelNotLike(String value) {
            addCriterion("q_travel not like", value, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelIn(List<String> values) {
            addCriterion("q_travel in", values, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelNotIn(List<String> values) {
            addCriterion("q_travel not in", values, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelBetween(String value1, String value2) {
            addCriterion("q_travel between", value1, value2, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTravelNotBetween(String value1, String value2) {
            addCriterion("q_travel not between", value1, value2, "qTravel");
            return (Criteria) this;
        }

        public Criteria andQTuanidIsNull() {
            addCriterion("q_tuanid is null");
            return (Criteria) this;
        }

        public Criteria andQTuanidIsNotNull() {
            addCriterion("q_tuanid is not null");
            return (Criteria) this;
        }

        public Criteria andQTuanidEqualTo(String value) {
            addCriterion("q_tuanid =", value, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidNotEqualTo(String value) {
            addCriterion("q_tuanid <>", value, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidGreaterThan(String value) {
            addCriterion("q_tuanid >", value, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidGreaterThanOrEqualTo(String value) {
            addCriterion("q_tuanid >=", value, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidLessThan(String value) {
            addCriterion("q_tuanid <", value, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidLessThanOrEqualTo(String value) {
            addCriterion("q_tuanid <=", value, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidLike(String value) {
            addCriterion("q_tuanid like", value, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidNotLike(String value) {
            addCriterion("q_tuanid not like", value, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidIn(List<String> values) {
            addCriterion("q_tuanid in", values, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidNotIn(List<String> values) {
            addCriterion("q_tuanid not in", values, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidBetween(String value1, String value2) {
            addCriterion("q_tuanid between", value1, value2, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQTuanidNotBetween(String value1, String value2) {
            addCriterion("q_tuanid not between", value1, value2, "qTuanid");
            return (Criteria) this;
        }

        public Criteria andQStateIsNull() {
            addCriterion("q_State is null");
            return (Criteria) this;
        }

        public Criteria andQStateIsNotNull() {
            addCriterion("q_State is not null");
            return (Criteria) this;
        }

        public Criteria andQStateEqualTo(String value) {
            addCriterion("q_State =", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateNotEqualTo(String value) {
            addCriterion("q_State <>", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateGreaterThan(String value) {
            addCriterion("q_State >", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateGreaterThanOrEqualTo(String value) {
            addCriterion("q_State >=", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateLessThan(String value) {
            addCriterion("q_State <", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateLessThanOrEqualTo(String value) {
            addCriterion("q_State <=", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateLike(String value) {
            addCriterion("q_State like", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateNotLike(String value) {
            addCriterion("q_State not like", value, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateIn(List<String> values) {
            addCriterion("q_State in", values, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateNotIn(List<String> values) {
            addCriterion("q_State not in", values, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateBetween(String value1, String value2) {
            addCriterion("q_State between", value1, value2, "qState");
            return (Criteria) this;
        }

        public Criteria andQStateNotBetween(String value1, String value2) {
            addCriterion("q_State not between", value1, value2, "qState");
            return (Criteria) this;
        }

        public Criteria andQTotalIsNull() {
            addCriterion("q_total is null");
            return (Criteria) this;
        }

        public Criteria andQTotalIsNotNull() {
            addCriterion("q_total is not null");
            return (Criteria) this;
        }

        public Criteria andQTotalEqualTo(String value) {
            addCriterion("q_total =", value, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalNotEqualTo(String value) {
            addCriterion("q_total <>", value, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalGreaterThan(String value) {
            addCriterion("q_total >", value, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalGreaterThanOrEqualTo(String value) {
            addCriterion("q_total >=", value, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalLessThan(String value) {
            addCriterion("q_total <", value, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalLessThanOrEqualTo(String value) {
            addCriterion("q_total <=", value, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalLike(String value) {
            addCriterion("q_total like", value, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalNotLike(String value) {
            addCriterion("q_total not like", value, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalIn(List<String> values) {
            addCriterion("q_total in", values, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalNotIn(List<String> values) {
            addCriterion("q_total not in", values, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalBetween(String value1, String value2) {
            addCriterion("q_total between", value1, value2, "qTotal");
            return (Criteria) this;
        }

        public Criteria andQTotalNotBetween(String value1, String value2) {
            addCriterion("q_total not between", value1, value2, "qTotal");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiIsNull() {
            addCriterion("jietuanxinxi is null");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiIsNotNull() {
            addCriterion("jietuanxinxi is not null");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiEqualTo(String value) {
            addCriterion("jietuanxinxi =", value, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiNotEqualTo(String value) {
            addCriterion("jietuanxinxi <>", value, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiGreaterThan(String value) {
            addCriterion("jietuanxinxi >", value, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiGreaterThanOrEqualTo(String value) {
            addCriterion("jietuanxinxi >=", value, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiLessThan(String value) {
            addCriterion("jietuanxinxi <", value, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiLessThanOrEqualTo(String value) {
            addCriterion("jietuanxinxi <=", value, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiLike(String value) {
            addCriterion("jietuanxinxi like", value, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiNotLike(String value) {
            addCriterion("jietuanxinxi not like", value, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiIn(List<String> values) {
            addCriterion("jietuanxinxi in", values, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiNotIn(List<String> values) {
            addCriterion("jietuanxinxi not in", values, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiBetween(String value1, String value2) {
            addCriterion("jietuanxinxi between", value1, value2, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuanxinxiNotBetween(String value1, String value2) {
            addCriterion("jietuanxinxi not between", value1, value2, "jietuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNull() {
            addCriterion("send_date is null");
            return (Criteria) this;
        }

        public Criteria andSendDateIsNotNull() {
            addCriterion("send_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateEqualTo(Date value) {
            addCriterion("send_date =", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotEqualTo(Date value) {
            addCriterion("send_date <>", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThan(Date value) {
            addCriterion("send_date >", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("send_date >=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThan(Date value) {
            addCriterion("send_date <", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateLessThanOrEqualTo(Date value) {
            addCriterion("send_date <=", value, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateIn(List<Date> values) {
            addCriterion("send_date in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotIn(List<Date> values) {
            addCriterion("send_date not in", values, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateBetween(Date value1, Date value2) {
            addCriterion("send_date between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSendDateNotBetween(Date value1, Date value2) {
            addCriterion("send_date not between", value1, value2, "sendDate");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiIsNull() {
            addCriterion("sotuanxinxi is null");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiIsNotNull() {
            addCriterion("sotuanxinxi is not null");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiEqualTo(String value) {
            addCriterion("sotuanxinxi =", value, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiNotEqualTo(String value) {
            addCriterion("sotuanxinxi <>", value, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiGreaterThan(String value) {
            addCriterion("sotuanxinxi >", value, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiGreaterThanOrEqualTo(String value) {
            addCriterion("sotuanxinxi >=", value, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiLessThan(String value) {
            addCriterion("sotuanxinxi <", value, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiLessThanOrEqualTo(String value) {
            addCriterion("sotuanxinxi <=", value, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiLike(String value) {
            addCriterion("sotuanxinxi like", value, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiNotLike(String value) {
            addCriterion("sotuanxinxi not like", value, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiIn(List<String> values) {
            addCriterion("sotuanxinxi in", values, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiNotIn(List<String> values) {
            addCriterion("sotuanxinxi not in", values, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiBetween(String value1, String value2) {
            addCriterion("sotuanxinxi between", value1, value2, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andSotuanxinxiNotBetween(String value1, String value2) {
            addCriterion("sotuanxinxi not between", value1, value2, "sotuanxinxi");
            return (Criteria) this;
        }

        public Criteria andJietuancheciIsNull() {
            addCriterion("Jietuancheci is null");
            return (Criteria) this;
        }

        public Criteria andJietuancheciIsNotNull() {
            addCriterion("Jietuancheci is not null");
            return (Criteria) this;
        }

        public Criteria andJietuancheciEqualTo(String value) {
            addCriterion("Jietuancheci =", value, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciNotEqualTo(String value) {
            addCriterion("Jietuancheci <>", value, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciGreaterThan(String value) {
            addCriterion("Jietuancheci >", value, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciGreaterThanOrEqualTo(String value) {
            addCriterion("Jietuancheci >=", value, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciLessThan(String value) {
            addCriterion("Jietuancheci <", value, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciLessThanOrEqualTo(String value) {
            addCriterion("Jietuancheci <=", value, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciLike(String value) {
            addCriterion("Jietuancheci like", value, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciNotLike(String value) {
            addCriterion("Jietuancheci not like", value, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciIn(List<String> values) {
            addCriterion("Jietuancheci in", values, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciNotIn(List<String> values) {
            addCriterion("Jietuancheci not in", values, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciBetween(String value1, String value2) {
            addCriterion("Jietuancheci between", value1, value2, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andJietuancheciNotBetween(String value1, String value2) {
            addCriterion("Jietuancheci not between", value1, value2, "jietuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciIsNull() {
            addCriterion("songtuancheci is null");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciIsNotNull() {
            addCriterion("songtuancheci is not null");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciEqualTo(String value) {
            addCriterion("songtuancheci =", value, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciNotEqualTo(String value) {
            addCriterion("songtuancheci <>", value, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciGreaterThan(String value) {
            addCriterion("songtuancheci >", value, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciGreaterThanOrEqualTo(String value) {
            addCriterion("songtuancheci >=", value, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciLessThan(String value) {
            addCriterion("songtuancheci <", value, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciLessThanOrEqualTo(String value) {
            addCriterion("songtuancheci <=", value, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciLike(String value) {
            addCriterion("songtuancheci like", value, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciNotLike(String value) {
            addCriterion("songtuancheci not like", value, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciIn(List<String> values) {
            addCriterion("songtuancheci in", values, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciNotIn(List<String> values) {
            addCriterion("songtuancheci not in", values, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciBetween(String value1, String value2) {
            addCriterion("songtuancheci between", value1, value2, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andSongtuancheciNotBetween(String value1, String value2) {
            addCriterion("songtuancheci not between", value1, value2, "songtuancheci");
            return (Criteria) this;
        }

        public Criteria andCheIdIsNull() {
            addCriterion("Che_id is null");
            return (Criteria) this;
        }

        public Criteria andCheIdIsNotNull() {
            addCriterion("Che_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheIdEqualTo(Integer value) {
            addCriterion("Che_id =", value, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdNotEqualTo(Integer value) {
            addCriterion("Che_id <>", value, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdGreaterThan(Integer value) {
            addCriterion("Che_id >", value, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Che_id >=", value, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdLessThan(Integer value) {
            addCriterion("Che_id <", value, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdLessThanOrEqualTo(Integer value) {
            addCriterion("Che_id <=", value, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdIn(List<Integer> values) {
            addCriterion("Che_id in", values, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdNotIn(List<Integer> values) {
            addCriterion("Che_id not in", values, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdBetween(Integer value1, Integer value2) {
            addCriterion("Che_id between", value1, value2, "cheId");
            return (Criteria) this;
        }

        public Criteria andCheIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Che_id not between", value1, value2, "cheId");
            return (Criteria) this;
        }

        public Criteria andCantingIdIsNull() {
            addCriterion("Canting_id is null");
            return (Criteria) this;
        }

        public Criteria andCantingIdIsNotNull() {
            addCriterion("Canting_id is not null");
            return (Criteria) this;
        }

        public Criteria andCantingIdEqualTo(Integer value) {
            addCriterion("Canting_id =", value, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdNotEqualTo(Integer value) {
            addCriterion("Canting_id <>", value, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdGreaterThan(Integer value) {
            addCriterion("Canting_id >", value, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Canting_id >=", value, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdLessThan(Integer value) {
            addCriterion("Canting_id <", value, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdLessThanOrEqualTo(Integer value) {
            addCriterion("Canting_id <=", value, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdIn(List<Integer> values) {
            addCriterion("Canting_id in", values, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdNotIn(List<Integer> values) {
            addCriterion("Canting_id not in", values, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdBetween(Integer value1, Integer value2) {
            addCriterion("Canting_id between", value1, value2, "cantingId");
            return (Criteria) this;
        }

        public Criteria andCantingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Canting_id not between", value1, value2, "cantingId");
            return (Criteria) this;
        }

        public Criteria andXianluidIsNull() {
            addCriterion("xianluid is null");
            return (Criteria) this;
        }

        public Criteria andXianluidIsNotNull() {
            addCriterion("xianluid is not null");
            return (Criteria) this;
        }

        public Criteria andXianluidEqualTo(Integer value) {
            addCriterion("xianluid =", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidNotEqualTo(Integer value) {
            addCriterion("xianluid <>", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidGreaterThan(Integer value) {
            addCriterion("xianluid >", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidGreaterThanOrEqualTo(Integer value) {
            addCriterion("xianluid >=", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidLessThan(Integer value) {
            addCriterion("xianluid <", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidLessThanOrEqualTo(Integer value) {
            addCriterion("xianluid <=", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidIn(List<Integer> values) {
            addCriterion("xianluid in", values, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidNotIn(List<Integer> values) {
            addCriterion("xianluid not in", values, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidBetween(Integer value1, Integer value2) {
            addCriterion("xianluid between", value1, value2, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidNotBetween(Integer value1, Integer value2) {
            addCriterion("xianluid not between", value1, value2, "xianluid");
            return (Criteria) this;
        }

        public Criteria andBei2IsNull() {
            addCriterion("Bei2 is null");
            return (Criteria) this;
        }

        public Criteria andBei2IsNotNull() {
            addCriterion("Bei2 is not null");
            return (Criteria) this;
        }

        public Criteria andBei2EqualTo(String value) {
            addCriterion("Bei2 =", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotEqualTo(String value) {
            addCriterion("Bei2 <>", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2GreaterThan(String value) {
            addCriterion("Bei2 >", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2GreaterThanOrEqualTo(String value) {
            addCriterion("Bei2 >=", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2LessThan(String value) {
            addCriterion("Bei2 <", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2LessThanOrEqualTo(String value) {
            addCriterion("Bei2 <=", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2Like(String value) {
            addCriterion("Bei2 like", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotLike(String value) {
            addCriterion("Bei2 not like", value, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2In(List<String> values) {
            addCriterion("Bei2 in", values, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotIn(List<String> values) {
            addCriterion("Bei2 not in", values, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2Between(String value1, String value2) {
            addCriterion("Bei2 between", value1, value2, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei2NotBetween(String value1, String value2) {
            addCriterion("Bei2 not between", value1, value2, "bei2");
            return (Criteria) this;
        }

        public Criteria andBei3IsNull() {
            addCriterion("Bei3 is null");
            return (Criteria) this;
        }

        public Criteria andBei3IsNotNull() {
            addCriterion("Bei3 is not null");
            return (Criteria) this;
        }

        public Criteria andBei3EqualTo(String value) {
            addCriterion("Bei3 =", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotEqualTo(String value) {
            addCriterion("Bei3 <>", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3GreaterThan(String value) {
            addCriterion("Bei3 >", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3GreaterThanOrEqualTo(String value) {
            addCriterion("Bei3 >=", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3LessThan(String value) {
            addCriterion("Bei3 <", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3LessThanOrEqualTo(String value) {
            addCriterion("Bei3 <=", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3Like(String value) {
            addCriterion("Bei3 like", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotLike(String value) {
            addCriterion("Bei3 not like", value, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3In(List<String> values) {
            addCriterion("Bei3 in", values, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotIn(List<String> values) {
            addCriterion("Bei3 not in", values, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3Between(String value1, String value2) {
            addCriterion("Bei3 between", value1, value2, "bei3");
            return (Criteria) this;
        }

        public Criteria andBei3NotBetween(String value1, String value2) {
            addCriterion("Bei3 not between", value1, value2, "bei3");
            return (Criteria) this;
        }

        public Criteria andJietuandidianIsNull() {
            addCriterion("jietuandidian is null");
            return (Criteria) this;
        }

        public Criteria andJietuandidianIsNotNull() {
            addCriterion("jietuandidian is not null");
            return (Criteria) this;
        }

        public Criteria andJietuandidianEqualTo(String value) {
            addCriterion("jietuandidian =", value, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianNotEqualTo(String value) {
            addCriterion("jietuandidian <>", value, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianGreaterThan(String value) {
            addCriterion("jietuandidian >", value, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianGreaterThanOrEqualTo(String value) {
            addCriterion("jietuandidian >=", value, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianLessThan(String value) {
            addCriterion("jietuandidian <", value, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianLessThanOrEqualTo(String value) {
            addCriterion("jietuandidian <=", value, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianLike(String value) {
            addCriterion("jietuandidian like", value, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianNotLike(String value) {
            addCriterion("jietuandidian not like", value, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianIn(List<String> values) {
            addCriterion("jietuandidian in", values, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianNotIn(List<String> values) {
            addCriterion("jietuandidian not in", values, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianBetween(String value1, String value2) {
            addCriterion("jietuandidian between", value1, value2, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuandidianNotBetween(String value1, String value2) {
            addCriterion("jietuandidian not between", value1, value2, "jietuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianIsNull() {
            addCriterion("songtuandidian is null");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianIsNotNull() {
            addCriterion("songtuandidian is not null");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianEqualTo(String value) {
            addCriterion("songtuandidian =", value, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianNotEqualTo(String value) {
            addCriterion("songtuandidian <>", value, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianGreaterThan(String value) {
            addCriterion("songtuandidian >", value, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianGreaterThanOrEqualTo(String value) {
            addCriterion("songtuandidian >=", value, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianLessThan(String value) {
            addCriterion("songtuandidian <", value, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianLessThanOrEqualTo(String value) {
            addCriterion("songtuandidian <=", value, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianLike(String value) {
            addCriterion("songtuandidian like", value, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianNotLike(String value) {
            addCriterion("songtuandidian not like", value, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianIn(List<String> values) {
            addCriterion("songtuandidian in", values, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianNotIn(List<String> values) {
            addCriterion("songtuandidian not in", values, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianBetween(String value1, String value2) {
            addCriterion("songtuandidian between", value1, value2, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andSongtuandidianNotBetween(String value1, String value2) {
            addCriterion("songtuandidian not between", value1, value2, "songtuandidian");
            return (Criteria) this;
        }

        public Criteria andJietuanDateIsNull() {
            addCriterion("jietuan_date is null");
            return (Criteria) this;
        }

        public Criteria andJietuanDateIsNotNull() {
            addCriterion("jietuan_date is not null");
            return (Criteria) this;
        }

        public Criteria andJietuanDateEqualTo(Date value) {
            addCriterion("jietuan_date =", value, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateNotEqualTo(Date value) {
            addCriterion("jietuan_date <>", value, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateGreaterThan(Date value) {
            addCriterion("jietuan_date >", value, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("jietuan_date >=", value, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateLessThan(Date value) {
            addCriterion("jietuan_date <", value, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateLessThanOrEqualTo(Date value) {
            addCriterion("jietuan_date <=", value, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateIn(List<Date> values) {
            addCriterion("jietuan_date in", values, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateNotIn(List<Date> values) {
            addCriterion("jietuan_date not in", values, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateBetween(Date value1, Date value2) {
            addCriterion("jietuan_date between", value1, value2, "jietuanDate");
            return (Criteria) this;
        }

        public Criteria andJietuanDateNotBetween(Date value1, Date value2) {
            addCriterion("jietuan_date not between", value1, value2, "jietuanDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}