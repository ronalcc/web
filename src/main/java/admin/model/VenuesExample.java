package admin.model;

import java.util.ArrayList;
import java.util.List;

public class VenuesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venues
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venues
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table venues
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public VenuesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table venues
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venues
     *
     * @mbggenerated
     */
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

        public Criteria andVenuesIdIsNull() {
            addCriterion("venues_id is null");
            return (Criteria) this;
        }

        public Criteria andVenuesIdIsNotNull() {
            addCriterion("venues_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenuesIdEqualTo(Integer value) {
            addCriterion("venues_id =", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdNotEqualTo(Integer value) {
            addCriterion("venues_id <>", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdGreaterThan(Integer value) {
            addCriterion("venues_id >", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("venues_id >=", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdLessThan(Integer value) {
            addCriterion("venues_id <", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdLessThanOrEqualTo(Integer value) {
            addCriterion("venues_id <=", value, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdIn(List<Integer> values) {
            addCriterion("venues_id in", values, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdNotIn(List<Integer> values) {
            addCriterion("venues_id not in", values, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdBetween(Integer value1, Integer value2) {
            addCriterion("venues_id between", value1, value2, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("venues_id not between", value1, value2, "venuesId");
            return (Criteria) this;
        }

        public Criteria andVenuesNameIsNull() {
            addCriterion("venues_name is null");
            return (Criteria) this;
        }

        public Criteria andVenuesNameIsNotNull() {
            addCriterion("venues_name is not null");
            return (Criteria) this;
        }

        public Criteria andVenuesNameEqualTo(String value) {
            addCriterion("venues_name =", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameNotEqualTo(String value) {
            addCriterion("venues_name <>", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameGreaterThan(String value) {
            addCriterion("venues_name >", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameGreaterThanOrEqualTo(String value) {
            addCriterion("venues_name >=", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameLessThan(String value) {
            addCriterion("venues_name <", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameLessThanOrEqualTo(String value) {
            addCriterion("venues_name <=", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameLike(String value) {
            addCriterion("venues_name like", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameNotLike(String value) {
            addCriterion("venues_name not like", value, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameIn(List<String> values) {
            addCriterion("venues_name in", values, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameNotIn(List<String> values) {
            addCriterion("venues_name not in", values, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameBetween(String value1, String value2) {
            addCriterion("venues_name between", value1, value2, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuesNameNotBetween(String value1, String value2) {
            addCriterion("venues_name not between", value1, value2, "venuesName");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdIsNull() {
            addCriterion("venuesType_id is null");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdIsNotNull() {
            addCriterion("venuesType_id is not null");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdEqualTo(Integer value) {
            addCriterion("venuesType_id =", value, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdNotEqualTo(Integer value) {
            addCriterion("venuesType_id <>", value, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdGreaterThan(Integer value) {
            addCriterion("venuesType_id >", value, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("venuesType_id >=", value, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdLessThan(Integer value) {
            addCriterion("venuesType_id <", value, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("venuesType_id <=", value, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdIn(List<Integer> values) {
            addCriterion("venuesType_id in", values, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdNotIn(List<Integer> values) {
            addCriterion("venuesType_id not in", values, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdBetween(Integer value1, Integer value2) {
            addCriterion("venuesType_id between", value1, value2, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andVenuestypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("venuesType_id not between", value1, value2, "venuestypeId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(Integer value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(Integer value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(Integer value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(Integer value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(Integer value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<Integer> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<Integer> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(Integer value1, Integer value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(String value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(String value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(String value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(String value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(String value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(String value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLike(String value) {
            addCriterion("start like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotLike(String value) {
            addCriterion("start not like", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<String> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<String> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(String value1, String value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(String value1, String value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(Integer value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(Integer value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(Integer value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(Integer value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(Integer value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(Integer value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<Integer> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<Integer> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(Integer value1, Integer value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(Integer value1, Integer value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venues
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table venues
     *
     * @mbggenerated
     */
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