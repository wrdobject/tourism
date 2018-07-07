package com.sdgl.pojo.suppliersfei;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTicketIdIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(Integer value) {
            addCriterion("ticket_id =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(Integer value) {
            addCriterion("ticket_id <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(Integer value) {
            addCriterion("ticket_id >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_id >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(Integer value) {
            addCriterion("ticket_id <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_id <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<Integer> values) {
            addCriterion("ticket_id in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<Integer> values) {
            addCriterion("ticket_id not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_id not between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNull() {
            addCriterion("ticket_name is null");
            return (Criteria) this;
        }

        public Criteria andTicketNameIsNotNull() {
            addCriterion("ticket_name is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNameEqualTo(String value) {
            addCriterion("ticket_name =", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotEqualTo(String value) {
            addCriterion("ticket_name <>", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThan(String value) {
            addCriterion("ticket_name >", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_name >=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThan(String value) {
            addCriterion("ticket_name <", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLessThanOrEqualTo(String value) {
            addCriterion("ticket_name <=", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameLike(String value) {
            addCriterion("ticket_name like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotLike(String value) {
            addCriterion("ticket_name not like", value, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameIn(List<String> values) {
            addCriterion("ticket_name in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotIn(List<String> values) {
            addCriterion("ticket_name not in", values, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameBetween(String value1, String value2) {
            addCriterion("ticket_name between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketNameNotBetween(String value1, String value2) {
            addCriterion("ticket_name not between", value1, value2, "ticketName");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationIsNull() {
            addCriterion("ticket_abbreviation is null");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationIsNotNull() {
            addCriterion("ticket_abbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationEqualTo(String value) {
            addCriterion("ticket_abbreviation =", value, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationNotEqualTo(String value) {
            addCriterion("ticket_abbreviation <>", value, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationGreaterThan(String value) {
            addCriterion("ticket_abbreviation >", value, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_abbreviation >=", value, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationLessThan(String value) {
            addCriterion("ticket_abbreviation <", value, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("ticket_abbreviation <=", value, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationLike(String value) {
            addCriterion("ticket_abbreviation like", value, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationNotLike(String value) {
            addCriterion("ticket_abbreviation not like", value, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationIn(List<String> values) {
            addCriterion("ticket_abbreviation in", values, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationNotIn(List<String> values) {
            addCriterion("ticket_abbreviation not in", values, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationBetween(String value1, String value2) {
            addCriterion("ticket_abbreviation between", value1, value2, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketAbbreviationNotBetween(String value1, String value2) {
            addCriterion("ticket_abbreviation not between", value1, value2, "ticketAbbreviation");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("ticket_type is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("ticket_type is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(String value) {
            addCriterion("ticket_type =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(String value) {
            addCriterion("ticket_type <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(String value) {
            addCriterion("ticket_type >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_type >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(String value) {
            addCriterion("ticket_type <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(String value) {
            addCriterion("ticket_type <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLike(String value) {
            addCriterion("ticket_type like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotLike(String value) {
            addCriterion("ticket_type not like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<String> values) {
            addCriterion("ticket_type in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<String> values) {
            addCriterion("ticket_type not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(String value1, String value2) {
            addCriterion("ticket_type between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(String value1, String value2) {
            addCriterion("ticket_type not between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketClassIsNull() {
            addCriterion("ticket_class is null");
            return (Criteria) this;
        }

        public Criteria andTicketClassIsNotNull() {
            addCriterion("ticket_class is not null");
            return (Criteria) this;
        }

        public Criteria andTicketClassEqualTo(String value) {
            addCriterion("ticket_class =", value, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassNotEqualTo(String value) {
            addCriterion("ticket_class <>", value, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassGreaterThan(String value) {
            addCriterion("ticket_class >", value, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_class >=", value, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassLessThan(String value) {
            addCriterion("ticket_class <", value, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassLessThanOrEqualTo(String value) {
            addCriterion("ticket_class <=", value, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassLike(String value) {
            addCriterion("ticket_class like", value, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassNotLike(String value) {
            addCriterion("ticket_class not like", value, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassIn(List<String> values) {
            addCriterion("ticket_class in", values, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassNotIn(List<String> values) {
            addCriterion("ticket_class not in", values, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassBetween(String value1, String value2) {
            addCriterion("ticket_class between", value1, value2, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketClassNotBetween(String value1, String value2) {
            addCriterion("ticket_class not between", value1, value2, "ticketClass");
            return (Criteria) this;
        }

        public Criteria andTicketFaxIsNull() {
            addCriterion("ticket_fax is null");
            return (Criteria) this;
        }

        public Criteria andTicketFaxIsNotNull() {
            addCriterion("ticket_fax is not null");
            return (Criteria) this;
        }

        public Criteria andTicketFaxEqualTo(String value) {
            addCriterion("ticket_fax =", value, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxNotEqualTo(String value) {
            addCriterion("ticket_fax <>", value, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxGreaterThan(String value) {
            addCriterion("ticket_fax >", value, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_fax >=", value, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxLessThan(String value) {
            addCriterion("ticket_fax <", value, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxLessThanOrEqualTo(String value) {
            addCriterion("ticket_fax <=", value, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxLike(String value) {
            addCriterion("ticket_fax like", value, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxNotLike(String value) {
            addCriterion("ticket_fax not like", value, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxIn(List<String> values) {
            addCriterion("ticket_fax in", values, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxNotIn(List<String> values) {
            addCriterion("ticket_fax not in", values, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxBetween(String value1, String value2) {
            addCriterion("ticket_fax between", value1, value2, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketFaxNotBetween(String value1, String value2) {
            addCriterion("ticket_fax not between", value1, value2, "ticketFax");
            return (Criteria) this;
        }

        public Criteria andTicketEmailIsNull() {
            addCriterion("Ticket_email is null");
            return (Criteria) this;
        }

        public Criteria andTicketEmailIsNotNull() {
            addCriterion("Ticket_email is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEmailEqualTo(String value) {
            addCriterion("Ticket_email =", value, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailNotEqualTo(String value) {
            addCriterion("Ticket_email <>", value, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailGreaterThan(String value) {
            addCriterion("Ticket_email >", value, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Ticket_email >=", value, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailLessThan(String value) {
            addCriterion("Ticket_email <", value, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailLessThanOrEqualTo(String value) {
            addCriterion("Ticket_email <=", value, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailLike(String value) {
            addCriterion("Ticket_email like", value, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailNotLike(String value) {
            addCriterion("Ticket_email not like", value, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailIn(List<String> values) {
            addCriterion("Ticket_email in", values, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailNotIn(List<String> values) {
            addCriterion("Ticket_email not in", values, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailBetween(String value1, String value2) {
            addCriterion("Ticket_email between", value1, value2, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketEmailNotBetween(String value1, String value2) {
            addCriterion("Ticket_email not between", value1, value2, "ticketEmail");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneIsNull() {
            addCriterion("ticket_phone is null");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneIsNotNull() {
            addCriterion("ticket_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneEqualTo(String value) {
            addCriterion("ticket_phone =", value, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneNotEqualTo(String value) {
            addCriterion("ticket_phone <>", value, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneGreaterThan(String value) {
            addCriterion("ticket_phone >", value, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_phone >=", value, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneLessThan(String value) {
            addCriterion("ticket_phone <", value, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneLessThanOrEqualTo(String value) {
            addCriterion("ticket_phone <=", value, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneLike(String value) {
            addCriterion("ticket_phone like", value, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneNotLike(String value) {
            addCriterion("ticket_phone not like", value, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneIn(List<String> values) {
            addCriterion("ticket_phone in", values, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneNotIn(List<String> values) {
            addCriterion("ticket_phone not in", values, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneBetween(String value1, String value2) {
            addCriterion("ticket_phone between", value1, value2, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketPhoneNotBetween(String value1, String value2) {
            addCriterion("ticket_phone not between", value1, value2, "ticketPhone");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceIsNull() {
            addCriterion("ticket_province is null");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceIsNotNull() {
            addCriterion("ticket_province is not null");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceEqualTo(String value) {
            addCriterion("ticket_province =", value, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceNotEqualTo(String value) {
            addCriterion("ticket_province <>", value, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceGreaterThan(String value) {
            addCriterion("ticket_province >", value, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_province >=", value, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceLessThan(String value) {
            addCriterion("ticket_province <", value, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceLessThanOrEqualTo(String value) {
            addCriterion("ticket_province <=", value, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceLike(String value) {
            addCriterion("ticket_province like", value, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceNotLike(String value) {
            addCriterion("ticket_province not like", value, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceIn(List<String> values) {
            addCriterion("ticket_province in", values, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceNotIn(List<String> values) {
            addCriterion("ticket_province not in", values, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceBetween(String value1, String value2) {
            addCriterion("ticket_province between", value1, value2, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketProvinceNotBetween(String value1, String value2) {
            addCriterion("ticket_province not between", value1, value2, "ticketProvince");
            return (Criteria) this;
        }

        public Criteria andTicketCityIsNull() {
            addCriterion("ticket_city is null");
            return (Criteria) this;
        }

        public Criteria andTicketCityIsNotNull() {
            addCriterion("ticket_city is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCityEqualTo(String value) {
            addCriterion("ticket_city =", value, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityNotEqualTo(String value) {
            addCriterion("ticket_city <>", value, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityGreaterThan(String value) {
            addCriterion("ticket_city >", value, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_city >=", value, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityLessThan(String value) {
            addCriterion("ticket_city <", value, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityLessThanOrEqualTo(String value) {
            addCriterion("ticket_city <=", value, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityLike(String value) {
            addCriterion("ticket_city like", value, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityNotLike(String value) {
            addCriterion("ticket_city not like", value, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityIn(List<String> values) {
            addCriterion("ticket_city in", values, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityNotIn(List<String> values) {
            addCriterion("ticket_city not in", values, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityBetween(String value1, String value2) {
            addCriterion("ticket_city between", value1, value2, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCityNotBetween(String value1, String value2) {
            addCriterion("ticket_city not between", value1, value2, "ticketCity");
            return (Criteria) this;
        }

        public Criteria andTicketCountyIsNull() {
            addCriterion("ticket_county is null");
            return (Criteria) this;
        }

        public Criteria andTicketCountyIsNotNull() {
            addCriterion("ticket_county is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCountyEqualTo(String value) {
            addCriterion("ticket_county =", value, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyNotEqualTo(String value) {
            addCriterion("ticket_county <>", value, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyGreaterThan(String value) {
            addCriterion("ticket_county >", value, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_county >=", value, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyLessThan(String value) {
            addCriterion("ticket_county <", value, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyLessThanOrEqualTo(String value) {
            addCriterion("ticket_county <=", value, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyLike(String value) {
            addCriterion("ticket_county like", value, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyNotLike(String value) {
            addCriterion("ticket_county not like", value, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyIn(List<String> values) {
            addCriterion("ticket_county in", values, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyNotIn(List<String> values) {
            addCriterion("ticket_county not in", values, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyBetween(String value1, String value2) {
            addCriterion("ticket_county between", value1, value2, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketCountyNotBetween(String value1, String value2) {
            addCriterion("ticket_county not between", value1, value2, "ticketCounty");
            return (Criteria) this;
        }

        public Criteria andTicketAddressIsNull() {
            addCriterion("ticket_address is null");
            return (Criteria) this;
        }

        public Criteria andTicketAddressIsNotNull() {
            addCriterion("ticket_address is not null");
            return (Criteria) this;
        }

        public Criteria andTicketAddressEqualTo(String value) {
            addCriterion("ticket_address =", value, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressNotEqualTo(String value) {
            addCriterion("ticket_address <>", value, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressGreaterThan(String value) {
            addCriterion("ticket_address >", value, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_address >=", value, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressLessThan(String value) {
            addCriterion("ticket_address <", value, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressLessThanOrEqualTo(String value) {
            addCriterion("ticket_address <=", value, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressLike(String value) {
            addCriterion("ticket_address like", value, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressNotLike(String value) {
            addCriterion("ticket_address not like", value, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressIn(List<String> values) {
            addCriterion("ticket_address in", values, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressNotIn(List<String> values) {
            addCriterion("ticket_address not in", values, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressBetween(String value1, String value2) {
            addCriterion("ticket_address between", value1, value2, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketAddressNotBetween(String value1, String value2) {
            addCriterion("ticket_address not between", value1, value2, "ticketAddress");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceIsNull() {
            addCriterion("ticket_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceIsNotNull() {
            addCriterion("ticket_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceEqualTo(String value) {
            addCriterion("ticket_introduce =", value, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceNotEqualTo(String value) {
            addCriterion("ticket_introduce <>", value, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceGreaterThan(String value) {
            addCriterion("ticket_introduce >", value, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_introduce >=", value, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceLessThan(String value) {
            addCriterion("ticket_introduce <", value, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceLessThanOrEqualTo(String value) {
            addCriterion("ticket_introduce <=", value, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceLike(String value) {
            addCriterion("ticket_introduce like", value, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceNotLike(String value) {
            addCriterion("ticket_introduce not like", value, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceIn(List<String> values) {
            addCriterion("ticket_introduce in", values, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceNotIn(List<String> values) {
            addCriterion("ticket_introduce not in", values, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceBetween(String value1, String value2) {
            addCriterion("ticket_introduce between", value1, value2, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketIntroduceNotBetween(String value1, String value2) {
            addCriterion("ticket_introduce not between", value1, value2, "ticketIntroduce");
            return (Criteria) this;
        }

        public Criteria andTicketTimeIsNull() {
            addCriterion("ticket_time is null");
            return (Criteria) this;
        }

        public Criteria andTicketTimeIsNotNull() {
            addCriterion("ticket_time is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ticket_time =", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ticket_time <>", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ticket_time >", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ticket_time >=", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeLessThan(Date value) {
            addCriterionForJDBCDate("ticket_time <", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ticket_time <=", value, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ticket_time in", values, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ticket_time not in", values, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ticket_time between", value1, value2, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ticket_time not between", value1, value2, "ticketTime");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerIsNull() {
            addCriterion("ticket_owner is null");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerIsNotNull() {
            addCriterion("ticket_owner is not null");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerEqualTo(Integer value) {
            addCriterion("ticket_owner =", value, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerNotEqualTo(Integer value) {
            addCriterion("ticket_owner <>", value, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerGreaterThan(Integer value) {
            addCriterion("ticket_owner >", value, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_owner >=", value, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerLessThan(Integer value) {
            addCriterion("ticket_owner <", value, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_owner <=", value, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerIn(List<Integer> values) {
            addCriterion("ticket_owner in", values, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerNotIn(List<Integer> values) {
            addCriterion("ticket_owner not in", values, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerBetween(Integer value1, Integer value2) {
            addCriterion("ticket_owner between", value1, value2, "ticketOwner");
            return (Criteria) this;
        }

        public Criteria andTicketOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_owner not between", value1, value2, "ticketOwner");
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