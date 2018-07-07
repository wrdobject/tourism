package com.sdgl.pojo.suppliersfei;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Integer value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Integer value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Integer value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Integer value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Integer> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Integer> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Integer value1, Integer value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNull() {
            addCriterion("img_path is null");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNotNull() {
            addCriterion("img_path is not null");
            return (Criteria) this;
        }

        public Criteria andImgPathEqualTo(String value) {
            addCriterion("img_path =", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotEqualTo(String value) {
            addCriterion("img_path <>", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThan(String value) {
            addCriterion("img_path >", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("img_path >=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThan(String value) {
            addCriterion("img_path <", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThanOrEqualTo(String value) {
            addCriterion("img_path <=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLike(String value) {
            addCriterion("img_path like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotLike(String value) {
            addCriterion("img_path not like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathIn(List<String> values) {
            addCriterion("img_path in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotIn(List<String> values) {
            addCriterion("img_path not in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathBetween(String value1, String value2) {
            addCriterion("img_path between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotBetween(String value1, String value2) {
            addCriterion("img_path not between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNull() {
            addCriterion("supplier_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNotNull() {
            addCriterion("supplier_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeEqualTo(Integer value) {
            addCriterion("supplier_type =", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotEqualTo(Integer value) {
            addCriterion("supplier_type <>", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThan(Integer value) {
            addCriterion("supplier_type >", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_type >=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThan(Integer value) {
            addCriterion("supplier_type <", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_type <=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIn(List<Integer> values) {
            addCriterion("supplier_type in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotIn(List<Integer> values) {
            addCriterion("supplier_type not in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeBetween(Integer value1, Integer value2) {
            addCriterion("supplier_type between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_type not between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andOtherIdIsNull() {
            addCriterion("other_id is null");
            return (Criteria) this;
        }

        public Criteria andOtherIdIsNotNull() {
            addCriterion("other_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtherIdEqualTo(Integer value) {
            addCriterion("other_id =", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotEqualTo(Integer value) {
            addCriterion("other_id <>", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdGreaterThan(Integer value) {
            addCriterion("other_id >", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_id >=", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdLessThan(Integer value) {
            addCriterion("other_id <", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdLessThanOrEqualTo(Integer value) {
            addCriterion("other_id <=", value, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdIn(List<Integer> values) {
            addCriterion("other_id in", values, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotIn(List<Integer> values) {
            addCriterion("other_id not in", values, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdBetween(Integer value1, Integer value2) {
            addCriterion("other_id between", value1, value2, "otherId");
            return (Criteria) this;
        }

        public Criteria andOtherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("other_id not between", value1, value2, "otherId");
            return (Criteria) this;
        }

        public Criteria andImgTypeIsNull() {
            addCriterion("img_type is null");
            return (Criteria) this;
        }

        public Criteria andImgTypeIsNotNull() {
            addCriterion("img_type is not null");
            return (Criteria) this;
        }

        public Criteria andImgTypeEqualTo(Integer value) {
            addCriterion("img_type =", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotEqualTo(Integer value) {
            addCriterion("img_type <>", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeGreaterThan(Integer value) {
            addCriterion("img_type >", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_type >=", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeLessThan(Integer value) {
            addCriterion("img_type <", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeLessThanOrEqualTo(Integer value) {
            addCriterion("img_type <=", value, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeIn(List<Integer> values) {
            addCriterion("img_type in", values, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotIn(List<Integer> values) {
            addCriterion("img_type not in", values, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeBetween(Integer value1, Integer value2) {
            addCriterion("img_type between", value1, value2, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("img_type not between", value1, value2, "imgType");
            return (Criteria) this;
        }

        public Criteria andImgTimeIsNull() {
            addCriterion("img_time is null");
            return (Criteria) this;
        }

        public Criteria andImgTimeIsNotNull() {
            addCriterion("img_time is not null");
            return (Criteria) this;
        }

        public Criteria andImgTimeEqualTo(Date value) {
            addCriterionForJDBCDate("img_time =", value, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("img_time <>", value, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("img_time >", value, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("img_time >=", value, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeLessThan(Date value) {
            addCriterionForJDBCDate("img_time <", value, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("img_time <=", value, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeIn(List<Date> values) {
            addCriterionForJDBCDate("img_time in", values, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("img_time not in", values, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("img_time between", value1, value2, "imgTime");
            return (Criteria) this;
        }

        public Criteria andImgTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("img_time not between", value1, value2, "imgTime");
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