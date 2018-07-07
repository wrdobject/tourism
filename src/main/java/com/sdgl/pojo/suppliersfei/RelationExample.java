package com.sdgl.pojo.suppliersfei;

import java.util.ArrayList;
import java.util.List;

public class RelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationExample() {
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

        public Criteria andRelationIdIsNull() {
            addCriterion("relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationIdIsNotNull() {
            addCriterion("relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationIdEqualTo(Integer value) {
            addCriterion("relation_id =", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotEqualTo(Integer value) {
            addCriterion("relation_id <>", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThan(Integer value) {
            addCriterion("relation_id >", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_id >=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThan(Integer value) {
            addCriterion("relation_id <", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("relation_id <=", value, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdIn(List<Integer> values) {
            addCriterion("relation_id in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotIn(List<Integer> values) {
            addCriterion("relation_id not in", values, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("relation_id between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_id not between", value1, value2, "relationId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdIsNull() {
            addCriterion("relation_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdIsNotNull() {
            addCriterion("relation_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdEqualTo(Integer value) {
            addCriterion("relation_type_id =", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdNotEqualTo(Integer value) {
            addCriterion("relation_type_id <>", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdGreaterThan(Integer value) {
            addCriterion("relation_type_id >", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_type_id >=", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdLessThan(Integer value) {
            addCriterion("relation_type_id <", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("relation_type_id <=", value, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdIn(List<Integer> values) {
            addCriterion("relation_type_id in", values, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdNotIn(List<Integer> values) {
            addCriterion("relation_type_id not in", values, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("relation_type_id between", value1, value2, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_type_id not between", value1, value2, "relationTypeId");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNull() {
            addCriterion("relation_type is null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIsNotNull() {
            addCriterion("relation_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationTypeEqualTo(Integer value) {
            addCriterion("relation_type =", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotEqualTo(Integer value) {
            addCriterion("relation_type <>", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThan(Integer value) {
            addCriterion("relation_type >", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_type >=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThan(Integer value) {
            addCriterion("relation_type <", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("relation_type <=", value, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeIn(List<Integer> values) {
            addCriterion("relation_type in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotIn(List<Integer> values) {
            addCriterion("relation_type not in", values, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeBetween(Integer value1, Integer value2) {
            addCriterion("relation_type between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_type not between", value1, value2, "relationType");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerIsNull() {
            addCriterion("relation_owner is null");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerIsNotNull() {
            addCriterion("relation_owner is not null");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerEqualTo(Integer value) {
            addCriterion("relation_owner =", value, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerNotEqualTo(Integer value) {
            addCriterion("relation_owner <>", value, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerGreaterThan(Integer value) {
            addCriterion("relation_owner >", value, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation_owner >=", value, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerLessThan(Integer value) {
            addCriterion("relation_owner <", value, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerLessThanOrEqualTo(Integer value) {
            addCriterion("relation_owner <=", value, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerIn(List<Integer> values) {
            addCriterion("relation_owner in", values, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerNotIn(List<Integer> values) {
            addCriterion("relation_owner not in", values, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerBetween(Integer value1, Integer value2) {
            addCriterion("relation_owner between", value1, value2, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationOwnerNotBetween(Integer value1, Integer value2) {
            addCriterion("relation_owner not between", value1, value2, "relationOwner");
            return (Criteria) this;
        }

        public Criteria andRelationNameIsNull() {
            addCriterion("relation_name is null");
            return (Criteria) this;
        }

        public Criteria andRelationNameIsNotNull() {
            addCriterion("relation_name is not null");
            return (Criteria) this;
        }

        public Criteria andRelationNameEqualTo(String value) {
            addCriterion("relation_name =", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameNotEqualTo(String value) {
            addCriterion("relation_name <>", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameGreaterThan(String value) {
            addCriterion("relation_name >", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameGreaterThanOrEqualTo(String value) {
            addCriterion("relation_name >=", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameLessThan(String value) {
            addCriterion("relation_name <", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameLessThanOrEqualTo(String value) {
            addCriterion("relation_name <=", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameLike(String value) {
            addCriterion("relation_name like", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameNotLike(String value) {
            addCriterion("relation_name not like", value, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameIn(List<String> values) {
            addCriterion("relation_name in", values, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameNotIn(List<String> values) {
            addCriterion("relation_name not in", values, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameBetween(String value1, String value2) {
            addCriterion("relation_name between", value1, value2, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationNameNotBetween(String value1, String value2) {
            addCriterion("relation_name not between", value1, value2, "relationName");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneIsNull() {
            addCriterion("relation_phone is null");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneIsNotNull() {
            addCriterion("relation_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneEqualTo(String value) {
            addCriterion("relation_phone =", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneNotEqualTo(String value) {
            addCriterion("relation_phone <>", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneGreaterThan(String value) {
            addCriterion("relation_phone >", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("relation_phone >=", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneLessThan(String value) {
            addCriterion("relation_phone <", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneLessThanOrEqualTo(String value) {
            addCriterion("relation_phone <=", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneLike(String value) {
            addCriterion("relation_phone like", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneNotLike(String value) {
            addCriterion("relation_phone not like", value, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneIn(List<String> values) {
            addCriterion("relation_phone in", values, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneNotIn(List<String> values) {
            addCriterion("relation_phone not in", values, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneBetween(String value1, String value2) {
            addCriterion("relation_phone between", value1, value2, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationPhoneNotBetween(String value1, String value2) {
            addCriterion("relation_phone not between", value1, value2, "relationPhone");
            return (Criteria) this;
        }

        public Criteria andRelationEmailIsNull() {
            addCriterion("relation_email is null");
            return (Criteria) this;
        }

        public Criteria andRelationEmailIsNotNull() {
            addCriterion("relation_email is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEmailEqualTo(String value) {
            addCriterion("relation_email =", value, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailNotEqualTo(String value) {
            addCriterion("relation_email <>", value, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailGreaterThan(String value) {
            addCriterion("relation_email >", value, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailGreaterThanOrEqualTo(String value) {
            addCriterion("relation_email >=", value, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailLessThan(String value) {
            addCriterion("relation_email <", value, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailLessThanOrEqualTo(String value) {
            addCriterion("relation_email <=", value, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailLike(String value) {
            addCriterion("relation_email like", value, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailNotLike(String value) {
            addCriterion("relation_email not like", value, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailIn(List<String> values) {
            addCriterion("relation_email in", values, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailNotIn(List<String> values) {
            addCriterion("relation_email not in", values, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailBetween(String value1, String value2) {
            addCriterion("relation_email between", value1, value2, "relationEmail");
            return (Criteria) this;
        }

        public Criteria andRelationEmailNotBetween(String value1, String value2) {
            addCriterion("relation_email not between", value1, value2, "relationEmail");
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