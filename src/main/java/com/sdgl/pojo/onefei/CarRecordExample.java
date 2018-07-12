package com.sdgl.pojo.onefei;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarRecordExample() {
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

        public Criteria andQIdIsNull() {
            addCriterion("q_id is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("q_id is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(Integer value) {
            addCriterion("q_id =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(Integer value) {
            addCriterion("q_id <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(Integer value) {
            addCriterion("q_id >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_id >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(Integer value) {
            addCriterion("q_id <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(Integer value) {
            addCriterion("q_id <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<Integer> values) {
            addCriterion("q_id in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<Integer> values) {
            addCriterion("q_id not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(Integer value1, Integer value2) {
            addCriterion("q_id between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(Integer value1, Integer value2) {
            addCriterion("q_id not between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQRIdIsNull() {
            addCriterion("q_r_id is null");
            return (Criteria) this;
        }

        public Criteria andQRIdIsNotNull() {
            addCriterion("q_r_id is not null");
            return (Criteria) this;
        }

        public Criteria andQRIdEqualTo(Integer value) {
            addCriterion("q_r_id =", value, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdNotEqualTo(Integer value) {
            addCriterion("q_r_id <>", value, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdGreaterThan(Integer value) {
            addCriterion("q_r_id >", value, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_r_id >=", value, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdLessThan(Integer value) {
            addCriterion("q_r_id <", value, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdLessThanOrEqualTo(Integer value) {
            addCriterion("q_r_id <=", value, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdIn(List<Integer> values) {
            addCriterion("q_r_id in", values, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdNotIn(List<Integer> values) {
            addCriterion("q_r_id not in", values, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdBetween(Integer value1, Integer value2) {
            addCriterion("q_r_id between", value1, value2, "qRId");
            return (Criteria) this;
        }

        public Criteria andQRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("q_r_id not between", value1, value2, "qRId");
            return (Criteria) this;
        }

        public Criteria andQCarNameIsNull() {
            addCriterion("q_car_name is null");
            return (Criteria) this;
        }

        public Criteria andQCarNameIsNotNull() {
            addCriterion("q_car_name is not null");
            return (Criteria) this;
        }

        public Criteria andQCarNameEqualTo(String value) {
            addCriterion("q_car_name =", value, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameNotEqualTo(String value) {
            addCriterion("q_car_name <>", value, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameGreaterThan(String value) {
            addCriterion("q_car_name >", value, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("q_car_name >=", value, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameLessThan(String value) {
            addCriterion("q_car_name <", value, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameLessThanOrEqualTo(String value) {
            addCriterion("q_car_name <=", value, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameLike(String value) {
            addCriterion("q_car_name like", value, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameNotLike(String value) {
            addCriterion("q_car_name not like", value, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameIn(List<String> values) {
            addCriterion("q_car_name in", values, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameNotIn(List<String> values) {
            addCriterion("q_car_name not in", values, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameBetween(String value1, String value2) {
            addCriterion("q_car_name between", value1, value2, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQCarNameNotBetween(String value1, String value2) {
            addCriterion("q_car_name not between", value1, value2, "qCarName");
            return (Criteria) this;
        }

        public Criteria andQTypeIsNull() {
            addCriterion("q_type is null");
            return (Criteria) this;
        }

        public Criteria andQTypeIsNotNull() {
            addCriterion("q_type is not null");
            return (Criteria) this;
        }

        public Criteria andQTypeEqualTo(String value) {
            addCriterion("q_type =", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotEqualTo(String value) {
            addCriterion("q_type <>", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeGreaterThan(String value) {
            addCriterion("q_type >", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeGreaterThanOrEqualTo(String value) {
            addCriterion("q_type >=", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLessThan(String value) {
            addCriterion("q_type <", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLessThanOrEqualTo(String value) {
            addCriterion("q_type <=", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeLike(String value) {
            addCriterion("q_type like", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotLike(String value) {
            addCriterion("q_type not like", value, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeIn(List<String> values) {
            addCriterion("q_type in", values, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotIn(List<String> values) {
            addCriterion("q_type not in", values, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeBetween(String value1, String value2) {
            addCriterion("q_type between", value1, value2, "qType");
            return (Criteria) this;
        }

        public Criteria andQTypeNotBetween(String value1, String value2) {
            addCriterion("q_type not between", value1, value2, "qType");
            return (Criteria) this;
        }

        public Criteria andQStartTimeIsNull() {
            addCriterion("q_start_time is null");
            return (Criteria) this;
        }

        public Criteria andQStartTimeIsNotNull() {
            addCriterion("q_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andQStartTimeEqualTo(Date value) {
            addCriterion("q_start_time =", value, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeNotEqualTo(Date value) {
            addCriterion("q_start_time <>", value, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeGreaterThan(Date value) {
            addCriterion("q_start_time >", value, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("q_start_time >=", value, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeLessThan(Date value) {
            addCriterion("q_start_time <", value, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("q_start_time <=", value, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeIn(List<Date> values) {
            addCriterion("q_start_time in", values, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeNotIn(List<Date> values) {
            addCriterion("q_start_time not in", values, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeBetween(Date value1, Date value2) {
            addCriterion("q_start_time between", value1, value2, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("q_start_time not between", value1, value2, "qStartTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeIsNull() {
            addCriterion("q_end_time is null");
            return (Criteria) this;
        }

        public Criteria andQEndTimeIsNotNull() {
            addCriterion("q_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andQEndTimeEqualTo(Date value) {
            addCriterion("q_end_time =", value, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeNotEqualTo(Date value) {
            addCriterion("q_end_time <>", value, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeGreaterThan(Date value) {
            addCriterion("q_end_time >", value, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("q_end_time >=", value, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeLessThan(Date value) {
            addCriterion("q_end_time <", value, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("q_end_time <=", value, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeIn(List<Date> values) {
            addCriterion("q_end_time in", values, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeNotIn(List<Date> values) {
            addCriterion("q_end_time not in", values, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeBetween(Date value1, Date value2) {
            addCriterion("q_end_time between", value1, value2, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("q_end_time not between", value1, value2, "qEndTime");
            return (Criteria) this;
        }

        public Criteria andQPlateNumIsNull() {
            addCriterion("q_plate_num is null");
            return (Criteria) this;
        }

        public Criteria andQPlateNumIsNotNull() {
            addCriterion("q_plate_num is not null");
            return (Criteria) this;
        }

        public Criteria andQPlateNumEqualTo(String value) {
            addCriterion("q_plate_num =", value, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumNotEqualTo(String value) {
            addCriterion("q_plate_num <>", value, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumGreaterThan(String value) {
            addCriterion("q_plate_num >", value, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumGreaterThanOrEqualTo(String value) {
            addCriterion("q_plate_num >=", value, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumLessThan(String value) {
            addCriterion("q_plate_num <", value, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumLessThanOrEqualTo(String value) {
            addCriterion("q_plate_num <=", value, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumLike(String value) {
            addCriterion("q_plate_num like", value, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumNotLike(String value) {
            addCriterion("q_plate_num not like", value, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumIn(List<String> values) {
            addCriterion("q_plate_num in", values, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumNotIn(List<String> values) {
            addCriterion("q_plate_num not in", values, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumBetween(String value1, String value2) {
            addCriterion("q_plate_num between", value1, value2, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPlateNumNotBetween(String value1, String value2) {
            addCriterion("q_plate_num not between", value1, value2, "qPlateNum");
            return (Criteria) this;
        }

        public Criteria andQPriceIsNull() {
            addCriterion("q_price is null");
            return (Criteria) this;
        }

        public Criteria andQPriceIsNotNull() {
            addCriterion("q_price is not null");
            return (Criteria) this;
        }

        public Criteria andQPriceEqualTo(Double value) {
            addCriterion("q_price =", value, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceNotEqualTo(Double value) {
            addCriterion("q_price <>", value, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceGreaterThan(Double value) {
            addCriterion("q_price >", value, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("q_price >=", value, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceLessThan(Double value) {
            addCriterion("q_price <", value, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceLessThanOrEqualTo(Double value) {
            addCriterion("q_price <=", value, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceIn(List<Double> values) {
            addCriterion("q_price in", values, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceNotIn(List<Double> values) {
            addCriterion("q_price not in", values, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceBetween(Double value1, Double value2) {
            addCriterion("q_price between", value1, value2, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQPriceNotBetween(Double value1, Double value2) {
            addCriterion("q_price not between", value1, value2, "qPrice");
            return (Criteria) this;
        }

        public Criteria andQDriverNameIsNull() {
            addCriterion("q_driver_name is null");
            return (Criteria) this;
        }

        public Criteria andQDriverNameIsNotNull() {
            addCriterion("q_driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andQDriverNameEqualTo(String value) {
            addCriterion("q_driver_name =", value, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameNotEqualTo(String value) {
            addCriterion("q_driver_name <>", value, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameGreaterThan(String value) {
            addCriterion("q_driver_name >", value, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("q_driver_name >=", value, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameLessThan(String value) {
            addCriterion("q_driver_name <", value, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameLessThanOrEqualTo(String value) {
            addCriterion("q_driver_name <=", value, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameLike(String value) {
            addCriterion("q_driver_name like", value, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameNotLike(String value) {
            addCriterion("q_driver_name not like", value, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameIn(List<String> values) {
            addCriterion("q_driver_name in", values, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameNotIn(List<String> values) {
            addCriterion("q_driver_name not in", values, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameBetween(String value1, String value2) {
            addCriterion("q_driver_name between", value1, value2, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQDriverNameNotBetween(String value1, String value2) {
            addCriterion("q_driver_name not between", value1, value2, "qDriverName");
            return (Criteria) this;
        }

        public Criteria andQIphoneIsNull() {
            addCriterion("q_iphone is null");
            return (Criteria) this;
        }

        public Criteria andQIphoneIsNotNull() {
            addCriterion("q_iphone is not null");
            return (Criteria) this;
        }

        public Criteria andQIphoneEqualTo(String value) {
            addCriterion("q_iphone =", value, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneNotEqualTo(String value) {
            addCriterion("q_iphone <>", value, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneGreaterThan(String value) {
            addCriterion("q_iphone >", value, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneGreaterThanOrEqualTo(String value) {
            addCriterion("q_iphone >=", value, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneLessThan(String value) {
            addCriterion("q_iphone <", value, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneLessThanOrEqualTo(String value) {
            addCriterion("q_iphone <=", value, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneLike(String value) {
            addCriterion("q_iphone like", value, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneNotLike(String value) {
            addCriterion("q_iphone not like", value, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneIn(List<String> values) {
            addCriterion("q_iphone in", values, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneNotIn(List<String> values) {
            addCriterion("q_iphone not in", values, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneBetween(String value1, String value2) {
            addCriterion("q_iphone between", value1, value2, "qIphone");
            return (Criteria) this;
        }

        public Criteria andQIphoneNotBetween(String value1, String value2) {
            addCriterion("q_iphone not between", value1, value2, "qIphone");
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