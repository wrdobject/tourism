package com.sdgl.pojo.onefei;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoutingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoutingExample() {
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

        public Criteria andRoutingIdIsNull() {
            addCriterion("routing_id is null");
            return (Criteria) this;
        }

        public Criteria andRoutingIdIsNotNull() {
            addCriterion("routing_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingIdEqualTo(Integer value) {
            addCriterion("routing_id =", value, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdNotEqualTo(Integer value) {
            addCriterion("routing_id <>", value, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdGreaterThan(Integer value) {
            addCriterion("routing_id >", value, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("routing_id >=", value, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdLessThan(Integer value) {
            addCriterion("routing_id <", value, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdLessThanOrEqualTo(Integer value) {
            addCriterion("routing_id <=", value, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdIn(List<Integer> values) {
            addCriterion("routing_id in", values, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdNotIn(List<Integer> values) {
            addCriterion("routing_id not in", values, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdBetween(Integer value1, Integer value2) {
            addCriterion("routing_id between", value1, value2, "routingId");
            return (Criteria) this;
        }

        public Criteria andRoutingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("routing_id not between", value1, value2, "routingId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdIsNull() {
            addCriterion("r_basic_id is null");
            return (Criteria) this;
        }

        public Criteria andRBasicIdIsNotNull() {
            addCriterion("r_basic_id is not null");
            return (Criteria) this;
        }

        public Criteria andRBasicIdEqualTo(Integer value) {
            addCriterion("r_basic_id =", value, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdNotEqualTo(Integer value) {
            addCriterion("r_basic_id <>", value, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdGreaterThan(Integer value) {
            addCriterion("r_basic_id >", value, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_basic_id >=", value, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdLessThan(Integer value) {
            addCriterion("r_basic_id <", value, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_basic_id <=", value, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdIn(List<Integer> values) {
            addCriterion("r_basic_id in", values, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdNotIn(List<Integer> values) {
            addCriterion("r_basic_id not in", values, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdBetween(Integer value1, Integer value2) {
            addCriterion("r_basic_id between", value1, value2, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRBasicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_basic_id not between", value1, value2, "rBasicId");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysIsNull() {
            addCriterion("routing_days is null");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysIsNotNull() {
            addCriterion("routing_days is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysEqualTo(Integer value) {
            addCriterion("routing_days =", value, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysNotEqualTo(Integer value) {
            addCriterion("routing_days <>", value, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysGreaterThan(Integer value) {
            addCriterion("routing_days >", value, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("routing_days >=", value, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysLessThan(Integer value) {
            addCriterion("routing_days <", value, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysLessThanOrEqualTo(Integer value) {
            addCriterion("routing_days <=", value, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysIn(List<Integer> values) {
            addCriterion("routing_days in", values, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysNotIn(List<Integer> values) {
            addCriterion("routing_days not in", values, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysBetween(Integer value1, Integer value2) {
            addCriterion("routing_days between", value1, value2, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("routing_days not between", value1, value2, "routingDays");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleIsNull() {
            addCriterion("routing_title is null");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleIsNotNull() {
            addCriterion("routing_title is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleEqualTo(String value) {
            addCriterion("routing_title =", value, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleNotEqualTo(String value) {
            addCriterion("routing_title <>", value, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleGreaterThan(String value) {
            addCriterion("routing_title >", value, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleGreaterThanOrEqualTo(String value) {
            addCriterion("routing_title >=", value, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleLessThan(String value) {
            addCriterion("routing_title <", value, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleLessThanOrEqualTo(String value) {
            addCriterion("routing_title <=", value, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleLike(String value) {
            addCriterion("routing_title like", value, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleNotLike(String value) {
            addCriterion("routing_title not like", value, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleIn(List<String> values) {
            addCriterion("routing_title in", values, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleNotIn(List<String> values) {
            addCriterion("routing_title not in", values, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleBetween(String value1, String value2) {
            addCriterion("routing_title between", value1, value2, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingTitleNotBetween(String value1, String value2) {
            addCriterion("routing_title not between", value1, value2, "routingTitle");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdIsNull() {
            addCriterion("routing_via_id is null");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdIsNotNull() {
            addCriterion("routing_via_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdEqualTo(String value) {
            addCriterion("routing_via_id =", value, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdNotEqualTo(String value) {
            addCriterion("routing_via_id <>", value, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdGreaterThan(String value) {
            addCriterion("routing_via_id >", value, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdGreaterThanOrEqualTo(String value) {
            addCriterion("routing_via_id >=", value, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdLessThan(String value) {
            addCriterion("routing_via_id <", value, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdLessThanOrEqualTo(String value) {
            addCriterion("routing_via_id <=", value, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdLike(String value) {
            addCriterion("routing_via_id like", value, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdNotLike(String value) {
            addCriterion("routing_via_id not like", value, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdIn(List<String> values) {
            addCriterion("routing_via_id in", values, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdNotIn(List<String> values) {
            addCriterion("routing_via_id not in", values, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdBetween(String value1, String value2) {
            addCriterion("routing_via_id between", value1, value2, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingViaIdNotBetween(String value1, String value2) {
            addCriterion("routing_via_id not between", value1, value2, "routingViaId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdIsNull() {
            addCriterion("routing_hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdIsNotNull() {
            addCriterion("routing_hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdEqualTo(Integer value) {
            addCriterion("routing_hotel_id =", value, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdNotEqualTo(Integer value) {
            addCriterion("routing_hotel_id <>", value, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdGreaterThan(Integer value) {
            addCriterion("routing_hotel_id >", value, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("routing_hotel_id >=", value, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdLessThan(Integer value) {
            addCriterion("routing_hotel_id <", value, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("routing_hotel_id <=", value, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdIn(List<Integer> values) {
            addCriterion("routing_hotel_id in", values, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdNotIn(List<Integer> values) {
            addCriterion("routing_hotel_id not in", values, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("routing_hotel_id between", value1, value2, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("routing_hotel_id not between", value1, value2, "routingHotelId");
            return (Criteria) this;
        }

        public Criteria andRoutingContentIsNull() {
            addCriterion("routing_content is null");
            return (Criteria) this;
        }

        public Criteria andRoutingContentIsNotNull() {
            addCriterion("routing_content is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingContentEqualTo(String value) {
            addCriterion("routing_content =", value, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentNotEqualTo(String value) {
            addCriterion("routing_content <>", value, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentGreaterThan(String value) {
            addCriterion("routing_content >", value, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentGreaterThanOrEqualTo(String value) {
            addCriterion("routing_content >=", value, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentLessThan(String value) {
            addCriterion("routing_content <", value, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentLessThanOrEqualTo(String value) {
            addCriterion("routing_content <=", value, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentLike(String value) {
            addCriterion("routing_content like", value, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentNotLike(String value) {
            addCriterion("routing_content not like", value, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentIn(List<String> values) {
            addCriterion("routing_content in", values, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentNotIn(List<String> values) {
            addCriterion("routing_content not in", values, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentBetween(String value1, String value2) {
            addCriterion("routing_content between", value1, value2, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingContentNotBetween(String value1, String value2) {
            addCriterion("routing_content not between", value1, value2, "routingContent");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeIsNull() {
            addCriterion("routing_breakfast_type is null");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeIsNotNull() {
            addCriterion("routing_breakfast_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeEqualTo(String value) {
            addCriterion("routing_breakfast_type =", value, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeNotEqualTo(String value) {
            addCriterion("routing_breakfast_type <>", value, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeGreaterThan(String value) {
            addCriterion("routing_breakfast_type >", value, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeGreaterThanOrEqualTo(String value) {
            addCriterion("routing_breakfast_type >=", value, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeLessThan(String value) {
            addCriterion("routing_breakfast_type <", value, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeLessThanOrEqualTo(String value) {
            addCriterion("routing_breakfast_type <=", value, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeLike(String value) {
            addCriterion("routing_breakfast_type like", value, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeNotLike(String value) {
            addCriterion("routing_breakfast_type not like", value, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeIn(List<String> values) {
            addCriterion("routing_breakfast_type in", values, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeNotIn(List<String> values) {
            addCriterion("routing_breakfast_type not in", values, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeBetween(String value1, String value2) {
            addCriterion("routing_breakfast_type between", value1, value2, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastTypeNotBetween(String value1, String value2) {
            addCriterion("routing_breakfast_type not between", value1, value2, "routingBreakfastType");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceIsNull() {
            addCriterion("routing_breakfast_price is null");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceIsNotNull() {
            addCriterion("routing_breakfast_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceEqualTo(Double value) {
            addCriterion("routing_breakfast_price =", value, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceNotEqualTo(Double value) {
            addCriterion("routing_breakfast_price <>", value, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceGreaterThan(Double value) {
            addCriterion("routing_breakfast_price >", value, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("routing_breakfast_price >=", value, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceLessThan(Double value) {
            addCriterion("routing_breakfast_price <", value, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceLessThanOrEqualTo(Double value) {
            addCriterion("routing_breakfast_price <=", value, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceIn(List<Double> values) {
            addCriterion("routing_breakfast_price in", values, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceNotIn(List<Double> values) {
            addCriterion("routing_breakfast_price not in", values, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceBetween(Double value1, Double value2) {
            addCriterion("routing_breakfast_price between", value1, value2, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingBreakfastPriceNotBetween(Double value1, Double value2) {
            addCriterion("routing_breakfast_price not between", value1, value2, "routingBreakfastPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeIsNull() {
            addCriterion("routing_lunch_type is null");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeIsNotNull() {
            addCriterion("routing_lunch_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeEqualTo(String value) {
            addCriterion("routing_lunch_type =", value, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeNotEqualTo(String value) {
            addCriterion("routing_lunch_type <>", value, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeGreaterThan(String value) {
            addCriterion("routing_lunch_type >", value, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("routing_lunch_type >=", value, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeLessThan(String value) {
            addCriterion("routing_lunch_type <", value, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeLessThanOrEqualTo(String value) {
            addCriterion("routing_lunch_type <=", value, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeLike(String value) {
            addCriterion("routing_lunch_type like", value, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeNotLike(String value) {
            addCriterion("routing_lunch_type not like", value, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeIn(List<String> values) {
            addCriterion("routing_lunch_type in", values, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeNotIn(List<String> values) {
            addCriterion("routing_lunch_type not in", values, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeBetween(String value1, String value2) {
            addCriterion("routing_lunch_type between", value1, value2, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchTypeNotBetween(String value1, String value2) {
            addCriterion("routing_lunch_type not between", value1, value2, "routingLunchType");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceIsNull() {
            addCriterion("routing_lunch_price is null");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceIsNotNull() {
            addCriterion("routing_lunch_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceEqualTo(Double value) {
            addCriterion("routing_lunch_price =", value, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceNotEqualTo(Double value) {
            addCriterion("routing_lunch_price <>", value, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceGreaterThan(Double value) {
            addCriterion("routing_lunch_price >", value, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("routing_lunch_price >=", value, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceLessThan(Double value) {
            addCriterion("routing_lunch_price <", value, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceLessThanOrEqualTo(Double value) {
            addCriterion("routing_lunch_price <=", value, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceIn(List<Double> values) {
            addCriterion("routing_lunch_price in", values, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceNotIn(List<Double> values) {
            addCriterion("routing_lunch_price not in", values, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceBetween(Double value1, Double value2) {
            addCriterion("routing_lunch_price between", value1, value2, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingLunchPriceNotBetween(Double value1, Double value2) {
            addCriterion("routing_lunch_price not between", value1, value2, "routingLunchPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeIsNull() {
            addCriterion("routing_dinner_type is null");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeIsNotNull() {
            addCriterion("routing_dinner_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeEqualTo(String value) {
            addCriterion("routing_dinner_type =", value, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeNotEqualTo(String value) {
            addCriterion("routing_dinner_type <>", value, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeGreaterThan(String value) {
            addCriterion("routing_dinner_type >", value, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("routing_dinner_type >=", value, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeLessThan(String value) {
            addCriterion("routing_dinner_type <", value, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeLessThanOrEqualTo(String value) {
            addCriterion("routing_dinner_type <=", value, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeLike(String value) {
            addCriterion("routing_dinner_type like", value, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeNotLike(String value) {
            addCriterion("routing_dinner_type not like", value, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeIn(List<String> values) {
            addCriterion("routing_dinner_type in", values, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeNotIn(List<String> values) {
            addCriterion("routing_dinner_type not in", values, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeBetween(String value1, String value2) {
            addCriterion("routing_dinner_type between", value1, value2, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerTypeNotBetween(String value1, String value2) {
            addCriterion("routing_dinner_type not between", value1, value2, "routingDinnerType");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceIsNull() {
            addCriterion("routing_dinner_price is null");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceIsNotNull() {
            addCriterion("routing_dinner_price is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceEqualTo(Double value) {
            addCriterion("routing_dinner_price =", value, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceNotEqualTo(Double value) {
            addCriterion("routing_dinner_price <>", value, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceGreaterThan(Double value) {
            addCriterion("routing_dinner_price >", value, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("routing_dinner_price >=", value, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceLessThan(Double value) {
            addCriterion("routing_dinner_price <", value, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceLessThanOrEqualTo(Double value) {
            addCriterion("routing_dinner_price <=", value, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceIn(List<Double> values) {
            addCriterion("routing_dinner_price in", values, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceNotIn(List<Double> values) {
            addCriterion("routing_dinner_price not in", values, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceBetween(Double value1, Double value2) {
            addCriterion("routing_dinner_price between", value1, value2, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDinnerPriceNotBetween(Double value1, Double value2) {
            addCriterion("routing_dinner_price not between", value1, value2, "routingDinnerPrice");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureIsNull() {
            addCriterion("routing_departure is null");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureIsNotNull() {
            addCriterion("routing_departure is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureEqualTo(String value) {
            addCriterion("routing_departure =", value, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureNotEqualTo(String value) {
            addCriterion("routing_departure <>", value, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureGreaterThan(String value) {
            addCriterion("routing_departure >", value, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureGreaterThanOrEqualTo(String value) {
            addCriterion("routing_departure >=", value, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureLessThan(String value) {
            addCriterion("routing_departure <", value, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureLessThanOrEqualTo(String value) {
            addCriterion("routing_departure <=", value, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureLike(String value) {
            addCriterion("routing_departure like", value, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureNotLike(String value) {
            addCriterion("routing_departure not like", value, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureIn(List<String> values) {
            addCriterion("routing_departure in", values, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureNotIn(List<String> values) {
            addCriterion("routing_departure not in", values, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureBetween(String value1, String value2) {
            addCriterion("routing_departure between", value1, value2, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingDepartureNotBetween(String value1, String value2) {
            addCriterion("routing_departure not between", value1, value2, "routingDeparture");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalIsNull() {
            addCriterion("routing_arrival is null");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalIsNotNull() {
            addCriterion("routing_arrival is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalEqualTo(String value) {
            addCriterion("routing_arrival =", value, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalNotEqualTo(String value) {
            addCriterion("routing_arrival <>", value, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalGreaterThan(String value) {
            addCriterion("routing_arrival >", value, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalGreaterThanOrEqualTo(String value) {
            addCriterion("routing_arrival >=", value, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalLessThan(String value) {
            addCriterion("routing_arrival <", value, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalLessThanOrEqualTo(String value) {
            addCriterion("routing_arrival <=", value, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalLike(String value) {
            addCriterion("routing_arrival like", value, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalNotLike(String value) {
            addCriterion("routing_arrival not like", value, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalIn(List<String> values) {
            addCriterion("routing_arrival in", values, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalNotIn(List<String> values) {
            addCriterion("routing_arrival not in", values, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalBetween(String value1, String value2) {
            addCriterion("routing_arrival between", value1, value2, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingArrivalNotBetween(String value1, String value2) {
            addCriterion("routing_arrival not between", value1, value2, "routingArrival");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeIsNull() {
            addCriterion("routing_creation_time is null");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeIsNotNull() {
            addCriterion("routing_creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeEqualTo(Date value) {
            addCriterionForJDBCDate("routing_creation_time =", value, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("routing_creation_time <>", value, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("routing_creation_time >", value, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("routing_creation_time >=", value, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeLessThan(Date value) {
            addCriterionForJDBCDate("routing_creation_time <", value, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("routing_creation_time <=", value, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeIn(List<Date> values) {
            addCriterionForJDBCDate("routing_creation_time in", values, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("routing_creation_time not in", values, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("routing_creation_time between", value1, value2, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("routing_creation_time not between", value1, value2, "routingCreationTime");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleIsNull() {
            addCriterion("routing_creation_people is null");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleIsNotNull() {
            addCriterion("routing_creation_people is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleEqualTo(String value) {
            addCriterion("routing_creation_people =", value, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleNotEqualTo(String value) {
            addCriterion("routing_creation_people <>", value, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleGreaterThan(String value) {
            addCriterion("routing_creation_people >", value, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("routing_creation_people >=", value, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleLessThan(String value) {
            addCriterion("routing_creation_people <", value, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleLessThanOrEqualTo(String value) {
            addCriterion("routing_creation_people <=", value, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleLike(String value) {
            addCriterion("routing_creation_people like", value, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleNotLike(String value) {
            addCriterion("routing_creation_people not like", value, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleIn(List<String> values) {
            addCriterion("routing_creation_people in", values, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleNotIn(List<String> values) {
            addCriterion("routing_creation_people not in", values, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleBetween(String value1, String value2) {
            addCriterion("routing_creation_people between", value1, value2, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingCreationPeopleNotBetween(String value1, String value2) {
            addCriterion("routing_creation_people not between", value1, value2, "routingCreationPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeIsNull() {
            addCriterion("routing_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeIsNotNull() {
            addCriterion("routing_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("routing_modify_time =", value, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("routing_modify_time <>", value, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("routing_modify_time >", value, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("routing_modify_time >=", value, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeLessThan(Date value) {
            addCriterionForJDBCDate("routing_modify_time <", value, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("routing_modify_time <=", value, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("routing_modify_time in", values, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("routing_modify_time not in", values, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("routing_modify_time between", value1, value2, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("routing_modify_time not between", value1, value2, "routingModifyTime");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleIsNull() {
            addCriterion("routing_modify_people is null");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleIsNotNull() {
            addCriterion("routing_modify_people is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleEqualTo(String value) {
            addCriterion("routing_modify_people =", value, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleNotEqualTo(String value) {
            addCriterion("routing_modify_people <>", value, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleGreaterThan(String value) {
            addCriterion("routing_modify_people >", value, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("routing_modify_people >=", value, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleLessThan(String value) {
            addCriterion("routing_modify_people <", value, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleLessThanOrEqualTo(String value) {
            addCriterion("routing_modify_people <=", value, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleLike(String value) {
            addCriterion("routing_modify_people like", value, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleNotLike(String value) {
            addCriterion("routing_modify_people not like", value, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleIn(List<String> values) {
            addCriterion("routing_modify_people in", values, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleNotIn(List<String> values) {
            addCriterion("routing_modify_people not in", values, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleBetween(String value1, String value2) {
            addCriterion("routing_modify_people between", value1, value2, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingModifyPeopleNotBetween(String value1, String value2) {
            addCriterion("routing_modify_people not between", value1, value2, "routingModifyPeople");
            return (Criteria) this;
        }

        public Criteria andRoutingOneIsNull() {
            addCriterion("routing_one is null");
            return (Criteria) this;
        }

        public Criteria andRoutingOneIsNotNull() {
            addCriterion("routing_one is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingOneEqualTo(String value) {
            addCriterion("routing_one =", value, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneNotEqualTo(String value) {
            addCriterion("routing_one <>", value, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneGreaterThan(String value) {
            addCriterion("routing_one >", value, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneGreaterThanOrEqualTo(String value) {
            addCriterion("routing_one >=", value, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneLessThan(String value) {
            addCriterion("routing_one <", value, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneLessThanOrEqualTo(String value) {
            addCriterion("routing_one <=", value, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneLike(String value) {
            addCriterion("routing_one like", value, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneNotLike(String value) {
            addCriterion("routing_one not like", value, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneIn(List<String> values) {
            addCriterion("routing_one in", values, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneNotIn(List<String> values) {
            addCriterion("routing_one not in", values, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneBetween(String value1, String value2) {
            addCriterion("routing_one between", value1, value2, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingOneNotBetween(String value1, String value2) {
            addCriterion("routing_one not between", value1, value2, "routingOne");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoIsNull() {
            addCriterion("routing_two is null");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoIsNotNull() {
            addCriterion("routing_two is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoEqualTo(String value) {
            addCriterion("routing_two =", value, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoNotEqualTo(String value) {
            addCriterion("routing_two <>", value, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoGreaterThan(String value) {
            addCriterion("routing_two >", value, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoGreaterThanOrEqualTo(String value) {
            addCriterion("routing_two >=", value, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoLessThan(String value) {
            addCriterion("routing_two <", value, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoLessThanOrEqualTo(String value) {
            addCriterion("routing_two <=", value, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoLike(String value) {
            addCriterion("routing_two like", value, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoNotLike(String value) {
            addCriterion("routing_two not like", value, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoIn(List<String> values) {
            addCriterion("routing_two in", values, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoNotIn(List<String> values) {
            addCriterion("routing_two not in", values, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoBetween(String value1, String value2) {
            addCriterion("routing_two between", value1, value2, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingTwoNotBetween(String value1, String value2) {
            addCriterion("routing_two not between", value1, value2, "routingTwo");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeIsNull() {
            addCriterion("routing_three is null");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeIsNotNull() {
            addCriterion("routing_three is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeEqualTo(String value) {
            addCriterion("routing_three =", value, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeNotEqualTo(String value) {
            addCriterion("routing_three <>", value, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeGreaterThan(String value) {
            addCriterion("routing_three >", value, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeGreaterThanOrEqualTo(String value) {
            addCriterion("routing_three >=", value, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeLessThan(String value) {
            addCriterion("routing_three <", value, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeLessThanOrEqualTo(String value) {
            addCriterion("routing_three <=", value, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeLike(String value) {
            addCriterion("routing_three like", value, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeNotLike(String value) {
            addCriterion("routing_three not like", value, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeIn(List<String> values) {
            addCriterion("routing_three in", values, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeNotIn(List<String> values) {
            addCriterion("routing_three not in", values, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeBetween(String value1, String value2) {
            addCriterion("routing_three between", value1, value2, "routingThree");
            return (Criteria) this;
        }

        public Criteria andRoutingThreeNotBetween(String value1, String value2) {
            addCriterion("routing_three not between", value1, value2, "routingThree");
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