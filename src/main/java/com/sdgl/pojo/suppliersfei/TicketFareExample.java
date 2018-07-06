package com.sdgl.pojo.suppliersfei;

import java.util.ArrayList;
import java.util.List;

public class TicketFareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketFareExample() {
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

        public Criteria andTicketFareIdIsNull() {
            addCriterion("ticket_fare_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdIsNotNull() {
            addCriterion("ticket_fare_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdEqualTo(Integer value) {
            addCriterion("ticket_fare_id =", value, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdNotEqualTo(Integer value) {
            addCriterion("ticket_fare_id <>", value, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdGreaterThan(Integer value) {
            addCriterion("ticket_fare_id >", value, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_fare_id >=", value, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdLessThan(Integer value) {
            addCriterion("ticket_fare_id <", value, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_fare_id <=", value, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdIn(List<Integer> values) {
            addCriterion("ticket_fare_id in", values, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdNotIn(List<Integer> values) {
            addCriterion("ticket_fare_id not in", values, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdBetween(Integer value1, Integer value2) {
            addCriterion("ticket_fare_id between", value1, value2, "ticketFareId");
            return (Criteria) this;
        }

        public Criteria andTicketFareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_fare_id not between", value1, value2, "ticketFareId");
            return (Criteria) this;
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

        public Criteria andTicketFareTypeIsNull() {
            addCriterion("ticket_fare_type is null");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeIsNotNull() {
            addCriterion("ticket_fare_type is not null");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeEqualTo(Integer value) {
            addCriterion("ticket_fare_type =", value, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeNotEqualTo(Integer value) {
            addCriterion("ticket_fare_type <>", value, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeGreaterThan(Integer value) {
            addCriterion("ticket_fare_type >", value, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_fare_type >=", value, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeLessThan(Integer value) {
            addCriterion("ticket_fare_type <", value, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_fare_type <=", value, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeIn(List<Integer> values) {
            addCriterion("ticket_fare_type in", values, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeNotIn(List<Integer> values) {
            addCriterion("ticket_fare_type not in", values, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeBetween(Integer value1, Integer value2) {
            addCriterion("ticket_fare_type between", value1, value2, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_fare_type not between", value1, value2, "ticketFareType");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayIsNull() {
            addCriterion("ticket_fare_costed_pay is null");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayIsNotNull() {
            addCriterion("ticket_fare_costed_pay is not null");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayEqualTo(Double value) {
            addCriterion("ticket_fare_costed_pay =", value, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayNotEqualTo(Double value) {
            addCriterion("ticket_fare_costed_pay <>", value, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayGreaterThan(Double value) {
            addCriterion("ticket_fare_costed_pay >", value, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayGreaterThanOrEqualTo(Double value) {
            addCriterion("ticket_fare_costed_pay >=", value, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayLessThan(Double value) {
            addCriterion("ticket_fare_costed_pay <", value, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayLessThanOrEqualTo(Double value) {
            addCriterion("ticket_fare_costed_pay <=", value, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayIn(List<Double> values) {
            addCriterion("ticket_fare_costed_pay in", values, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayNotIn(List<Double> values) {
            addCriterion("ticket_fare_costed_pay not in", values, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayBetween(Double value1, Double value2) {
            addCriterion("ticket_fare_costed_pay between", value1, value2, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareCostedPayNotBetween(Double value1, Double value2) {
            addCriterion("ticket_fare_costed_pay not between", value1, value2, "ticketFareCostedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayIsNull() {
            addCriterion("ticket_fare_listed_pay is null");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayIsNotNull() {
            addCriterion("ticket_fare_listed_pay is not null");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayEqualTo(Double value) {
            addCriterion("ticket_fare_listed_pay =", value, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayNotEqualTo(Double value) {
            addCriterion("ticket_fare_listed_pay <>", value, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayGreaterThan(Double value) {
            addCriterion("ticket_fare_listed_pay >", value, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayGreaterThanOrEqualTo(Double value) {
            addCriterion("ticket_fare_listed_pay >=", value, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayLessThan(Double value) {
            addCriterion("ticket_fare_listed_pay <", value, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayLessThanOrEqualTo(Double value) {
            addCriterion("ticket_fare_listed_pay <=", value, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayIn(List<Double> values) {
            addCriterion("ticket_fare_listed_pay in", values, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayNotIn(List<Double> values) {
            addCriterion("ticket_fare_listed_pay not in", values, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayBetween(Double value1, Double value2) {
            addCriterion("ticket_fare_listed_pay between", value1, value2, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareListedPayNotBetween(Double value1, Double value2) {
            addCriterion("ticket_fare_listed_pay not between", value1, value2, "ticketFareListedPay");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerIsNull() {
            addCriterion("ticket_fare_owner is null");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerIsNotNull() {
            addCriterion("ticket_fare_owner is not null");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerEqualTo(Integer value) {
            addCriterion("ticket_fare_owner =", value, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerNotEqualTo(Integer value) {
            addCriterion("ticket_fare_owner <>", value, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerGreaterThan(Integer value) {
            addCriterion("ticket_fare_owner >", value, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_fare_owner >=", value, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerLessThan(Integer value) {
            addCriterion("ticket_fare_owner <", value, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_fare_owner <=", value, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerIn(List<Integer> values) {
            addCriterion("ticket_fare_owner in", values, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerNotIn(List<Integer> values) {
            addCriterion("ticket_fare_owner not in", values, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerBetween(Integer value1, Integer value2) {
            addCriterion("ticket_fare_owner between", value1, value2, "ticketFareOwner");
            return (Criteria) this;
        }

        public Criteria andTicketFareOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_fare_owner not between", value1, value2, "ticketFareOwner");
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