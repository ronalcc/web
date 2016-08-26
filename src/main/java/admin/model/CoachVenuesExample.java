package admin.model;

import java.util.ArrayList;
import java.util.List;

public class CoachVenuesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    public CoachVenuesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
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
     * This method corresponds to the database table coach_venues
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
     * This method corresponds to the database table coach_venues
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coach_venues
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
     * This class corresponds to the database table coach_venues
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

        public Criteria andCoachVenuesIdIsNull() {
            addCriterion("coach_venues_id is null");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdIsNotNull() {
            addCriterion("coach_venues_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdEqualTo(String value) {
            addCriterion("coach_venues_id =", value, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdNotEqualTo(String value) {
            addCriterion("coach_venues_id <>", value, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdGreaterThan(String value) {
            addCriterion("coach_venues_id >", value, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdGreaterThanOrEqualTo(String value) {
            addCriterion("coach_venues_id >=", value, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdLessThan(String value) {
            addCriterion("coach_venues_id <", value, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdLessThanOrEqualTo(String value) {
            addCriterion("coach_venues_id <=", value, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdLike(String value) {
            addCriterion("coach_venues_id like", value, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdNotLike(String value) {
            addCriterion("coach_venues_id not like", value, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdIn(List<String> values) {
            addCriterion("coach_venues_id in", values, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdNotIn(List<String> values) {
            addCriterion("coach_venues_id not in", values, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdBetween(String value1, String value2) {
            addCriterion("coach_venues_id between", value1, value2, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachVenuesIdNotBetween(String value1, String value2) {
            addCriterion("coach_venues_id not between", value1, value2, "coachVenuesId");
            return (Criteria) this;
        }

        public Criteria andCoachIdIsNull() {
            addCriterion("coach_id is null");
            return (Criteria) this;
        }

        public Criteria andCoachIdIsNotNull() {
            addCriterion("coach_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoachIdEqualTo(Integer value) {
            addCriterion("coach_id =", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotEqualTo(Integer value) {
            addCriterion("coach_id <>", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThan(Integer value) {
            addCriterion("coach_id >", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coach_id >=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThan(Integer value) {
            addCriterion("coach_id <", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThanOrEqualTo(Integer value) {
            addCriterion("coach_id <=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdIn(List<Integer> values) {
            addCriterion("coach_id in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotIn(List<Integer> values) {
            addCriterion("coach_id not in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdBetween(Integer value1, Integer value2) {
            addCriterion("coach_id between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coach_id not between", value1, value2, "coachId");
            return (Criteria) this;
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table coach_venues
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
     * This class corresponds to the database table coach_venues
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