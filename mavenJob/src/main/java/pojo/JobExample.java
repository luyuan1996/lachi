package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(String value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(String value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(String value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(String value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(String value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(String value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLike(String value) {
            addCriterion("com_id like", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotLike(String value) {
            addCriterion("com_id not like", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<String> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<String> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(String value1, String value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(String value1, String value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andFreshIsNull() {
            addCriterion("fresh is null");
            return (Criteria) this;
        }

        public Criteria andFreshIsNotNull() {
            addCriterion("fresh is not null");
            return (Criteria) this;
        }

        public Criteria andFreshEqualTo(Byte value) {
            addCriterion("fresh =", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotEqualTo(Byte value) {
            addCriterion("fresh <>", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshGreaterThan(Byte value) {
            addCriterion("fresh >", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshGreaterThanOrEqualTo(Byte value) {
            addCriterion("fresh >=", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLessThan(Byte value) {
            addCriterion("fresh <", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLessThanOrEqualTo(Byte value) {
            addCriterion("fresh <=", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshIn(List<Byte> values) {
            addCriterion("fresh in", values, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotIn(List<Byte> values) {
            addCriterion("fresh not in", values, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshBetween(Byte value1, Byte value2) {
            addCriterion("fresh between", value1, value2, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotBetween(Byte value1, Byte value2) {
            addCriterion("fresh not between", value1, value2, "fresh");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNull() {
            addCriterion("jobtype is null");
            return (Criteria) this;
        }

        public Criteria andJobtypeIsNotNull() {
            addCriterion("jobtype is not null");
            return (Criteria) this;
        }

        public Criteria andJobtypeEqualTo(String value) {
            addCriterion("jobtype =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(String value) {
            addCriterion("jobtype <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(String value) {
            addCriterion("jobtype >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(String value) {
            addCriterion("jobtype >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(String value) {
            addCriterion("jobtype <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(String value) {
            addCriterion("jobtype <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLike(String value) {
            addCriterion("jobtype like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotLike(String value) {
            addCriterion("jobtype not like", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<String> values) {
            addCriterion("jobtype in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<String> values) {
            addCriterion("jobtype not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(String value1, String value2) {
            addCriterion("jobtype between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(String value1, String value2) {
            addCriterion("jobtype not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNull() {
            addCriterion("workplace is null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIsNotNull() {
            addCriterion("workplace is not null");
            return (Criteria) this;
        }

        public Criteria andWorkplaceEqualTo(String value) {
            addCriterion("workplace =", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotEqualTo(String value) {
            addCriterion("workplace <>", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThan(String value) {
            addCriterion("workplace >", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceGreaterThanOrEqualTo(String value) {
            addCriterion("workplace >=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThan(String value) {
            addCriterion("workplace <", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLessThanOrEqualTo(String value) {
            addCriterion("workplace <=", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceLike(String value) {
            addCriterion("workplace like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotLike(String value) {
            addCriterion("workplace not like", value, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceIn(List<String> values) {
            addCriterion("workplace in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotIn(List<String> values) {
            addCriterion("workplace not in", values, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceBetween(String value1, String value2) {
            addCriterion("workplace between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andWorkplaceNotBetween(String value1, String value2) {
            addCriterion("workplace not between", value1, value2, "workplace");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNull() {
            addCriterion("workexperience is null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNotNull() {
            addCriterion("workexperience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceEqualTo(String value) {
            addCriterion("workexperience =", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotEqualTo(String value) {
            addCriterion("workexperience <>", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThan(String value) {
            addCriterion("workexperience >", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("workexperience >=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThan(String value) {
            addCriterion("workexperience <", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThanOrEqualTo(String value) {
            addCriterion("workexperience <=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLike(String value) {
            addCriterion("workexperience like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotLike(String value) {
            addCriterion("workexperience not like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIn(List<String> values) {
            addCriterion("workexperience in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotIn(List<String> values) {
            addCriterion("workexperience not in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceBetween(String value1, String value2) {
            addCriterion("workexperience between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotBetween(String value1, String value2) {
            addCriterion("workexperience not between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNull() {
            addCriterion("jobtitle is null");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNotNull() {
            addCriterion("jobtitle is not null");
            return (Criteria) this;
        }

        public Criteria andJobtitleEqualTo(String value) {
            addCriterion("jobtitle =", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotEqualTo(String value) {
            addCriterion("jobtitle <>", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThan(String value) {
            addCriterion("jobtitle >", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("jobtitle >=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThan(String value) {
            addCriterion("jobtitle <", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThanOrEqualTo(String value) {
            addCriterion("jobtitle <=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLike(String value) {
            addCriterion("jobtitle like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotLike(String value) {
            addCriterion("jobtitle not like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleIn(List<String> values) {
            addCriterion("jobtitle in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotIn(List<String> values) {
            addCriterion("jobtitle not in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleBetween(String value1, String value2) {
            addCriterion("jobtitle between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotBetween(String value1, String value2) {
            addCriterion("jobtitle not between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andInformationIsNull() {
            addCriterion("information is null");
            return (Criteria) this;
        }

        public Criteria andInformationIsNotNull() {
            addCriterion("information is not null");
            return (Criteria) this;
        }

        public Criteria andInformationEqualTo(String value) {
            addCriterion("information =", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotEqualTo(String value) {
            addCriterion("information <>", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThan(String value) {
            addCriterion("information >", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationGreaterThanOrEqualTo(String value) {
            addCriterion("information >=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThan(String value) {
            addCriterion("information <", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLessThanOrEqualTo(String value) {
            addCriterion("information <=", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationLike(String value) {
            addCriterion("information like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotLike(String value) {
            addCriterion("information not like", value, "information");
            return (Criteria) this;
        }

        public Criteria andInformationIn(List<String> values) {
            addCriterion("information in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotIn(List<String> values) {
            addCriterion("information not in", values, "information");
            return (Criteria) this;
        }

        public Criteria andInformationBetween(String value1, String value2) {
            addCriterion("information between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andInformationNotBetween(String value1, String value2) {
            addCriterion("information not between", value1, value2, "information");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNull() {
            addCriterion("opendate is null");
            return (Criteria) this;
        }

        public Criteria andOpendateIsNotNull() {
            addCriterion("opendate is not null");
            return (Criteria) this;
        }

        public Criteria andOpendateEqualTo(Date value) {
            addCriterion("opendate =", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotEqualTo(Date value) {
            addCriterion("opendate <>", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThan(Date value) {
            addCriterion("opendate >", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateGreaterThanOrEqualTo(Date value) {
            addCriterion("opendate >=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThan(Date value) {
            addCriterion("opendate <", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateLessThanOrEqualTo(Date value) {
            addCriterion("opendate <=", value, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateIn(List<Date> values) {
            addCriterion("opendate in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotIn(List<Date> values) {
            addCriterion("opendate not in", values, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateBetween(Date value1, Date value2) {
            addCriterion("opendate between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andOpendateNotBetween(Date value1, Date value2) {
            addCriterion("opendate not between", value1, value2, "opendate");
            return (Criteria) this;
        }

        public Criteria andByemailIsNull() {
            addCriterion("byemail is null");
            return (Criteria) this;
        }

        public Criteria andByemailIsNotNull() {
            addCriterion("byemail is not null");
            return (Criteria) this;
        }

        public Criteria andByemailEqualTo(Byte value) {
            addCriterion("byemail =", value, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailNotEqualTo(Byte value) {
            addCriterion("byemail <>", value, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailGreaterThan(Byte value) {
            addCriterion("byemail >", value, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailGreaterThanOrEqualTo(Byte value) {
            addCriterion("byemail >=", value, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailLessThan(Byte value) {
            addCriterion("byemail <", value, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailLessThanOrEqualTo(Byte value) {
            addCriterion("byemail <=", value, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailIn(List<Byte> values) {
            addCriterion("byemail in", values, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailNotIn(List<Byte> values) {
            addCriterion("byemail not in", values, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailBetween(Byte value1, Byte value2) {
            addCriterion("byemail between", value1, value2, "byemail");
            return (Criteria) this;
        }

        public Criteria andByemailNotBetween(Byte value1, Byte value2) {
            addCriterion("byemail not between", value1, value2, "byemail");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleIsNull() {
            addCriterion("relationpeople is null");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleIsNotNull() {
            addCriterion("relationpeople is not null");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleEqualTo(String value) {
            addCriterion("relationpeople =", value, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleNotEqualTo(String value) {
            addCriterion("relationpeople <>", value, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleGreaterThan(String value) {
            addCriterion("relationpeople >", value, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleGreaterThanOrEqualTo(String value) {
            addCriterion("relationpeople >=", value, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleLessThan(String value) {
            addCriterion("relationpeople <", value, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleLessThanOrEqualTo(String value) {
            addCriterion("relationpeople <=", value, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleLike(String value) {
            addCriterion("relationpeople like", value, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleNotLike(String value) {
            addCriterion("relationpeople not like", value, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleIn(List<String> values) {
            addCriterion("relationpeople in", values, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleNotIn(List<String> values) {
            addCriterion("relationpeople not in", values, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleBetween(String value1, String value2) {
            addCriterion("relationpeople between", value1, value2, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationpeopleNotBetween(String value1, String value2) {
            addCriterion("relationpeople not between", value1, value2, "relationpeople");
            return (Criteria) this;
        }

        public Criteria andRelationemailIsNull() {
            addCriterion("relationemail is null");
            return (Criteria) this;
        }

        public Criteria andRelationemailIsNotNull() {
            addCriterion("relationemail is not null");
            return (Criteria) this;
        }

        public Criteria andRelationemailEqualTo(String value) {
            addCriterion("relationemail =", value, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailNotEqualTo(String value) {
            addCriterion("relationemail <>", value, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailGreaterThan(String value) {
            addCriterion("relationemail >", value, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailGreaterThanOrEqualTo(String value) {
            addCriterion("relationemail >=", value, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailLessThan(String value) {
            addCriterion("relationemail <", value, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailLessThanOrEqualTo(String value) {
            addCriterion("relationemail <=", value, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailLike(String value) {
            addCriterion("relationemail like", value, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailNotLike(String value) {
            addCriterion("relationemail not like", value, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailIn(List<String> values) {
            addCriterion("relationemail in", values, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailNotIn(List<String> values) {
            addCriterion("relationemail not in", values, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailBetween(String value1, String value2) {
            addCriterion("relationemail between", value1, value2, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationemailNotBetween(String value1, String value2) {
            addCriterion("relationemail not between", value1, value2, "relationemail");
            return (Criteria) this;
        }

        public Criteria andRelationqqIsNull() {
            addCriterion("relationqq is null");
            return (Criteria) this;
        }

        public Criteria andRelationqqIsNotNull() {
            addCriterion("relationqq is not null");
            return (Criteria) this;
        }

        public Criteria andRelationqqEqualTo(String value) {
            addCriterion("relationqq =", value, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqNotEqualTo(String value) {
            addCriterion("relationqq <>", value, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqGreaterThan(String value) {
            addCriterion("relationqq >", value, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqGreaterThanOrEqualTo(String value) {
            addCriterion("relationqq >=", value, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqLessThan(String value) {
            addCriterion("relationqq <", value, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqLessThanOrEqualTo(String value) {
            addCriterion("relationqq <=", value, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqLike(String value) {
            addCriterion("relationqq like", value, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqNotLike(String value) {
            addCriterion("relationqq not like", value, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqIn(List<String> values) {
            addCriterion("relationqq in", values, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqNotIn(List<String> values) {
            addCriterion("relationqq not in", values, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqBetween(String value1, String value2) {
            addCriterion("relationqq between", value1, value2, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationqqNotBetween(String value1, String value2) {
            addCriterion("relationqq not between", value1, value2, "relationqq");
            return (Criteria) this;
        }

        public Criteria andRelationphoneIsNull() {
            addCriterion("relationphone is null");
            return (Criteria) this;
        }

        public Criteria andRelationphoneIsNotNull() {
            addCriterion("relationphone is not null");
            return (Criteria) this;
        }

        public Criteria andRelationphoneEqualTo(String value) {
            addCriterion("relationphone =", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneNotEqualTo(String value) {
            addCriterion("relationphone <>", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneGreaterThan(String value) {
            addCriterion("relationphone >", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneGreaterThanOrEqualTo(String value) {
            addCriterion("relationphone >=", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneLessThan(String value) {
            addCriterion("relationphone <", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneLessThanOrEqualTo(String value) {
            addCriterion("relationphone <=", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneLike(String value) {
            addCriterion("relationphone like", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneNotLike(String value) {
            addCriterion("relationphone not like", value, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneIn(List<String> values) {
            addCriterion("relationphone in", values, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneNotIn(List<String> values) {
            addCriterion("relationphone not in", values, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneBetween(String value1, String value2) {
            addCriterion("relationphone between", value1, value2, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationphoneNotBetween(String value1, String value2) {
            addCriterion("relationphone not between", value1, value2, "relationphone");
            return (Criteria) this;
        }

        public Criteria andRelationaddressIsNull() {
            addCriterion("relationaddress is null");
            return (Criteria) this;
        }

        public Criteria andRelationaddressIsNotNull() {
            addCriterion("relationaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRelationaddressEqualTo(String value) {
            addCriterion("relationaddress =", value, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressNotEqualTo(String value) {
            addCriterion("relationaddress <>", value, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressGreaterThan(String value) {
            addCriterion("relationaddress >", value, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressGreaterThanOrEqualTo(String value) {
            addCriterion("relationaddress >=", value, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressLessThan(String value) {
            addCriterion("relationaddress <", value, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressLessThanOrEqualTo(String value) {
            addCriterion("relationaddress <=", value, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressLike(String value) {
            addCriterion("relationaddress like", value, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressNotLike(String value) {
            addCriterion("relationaddress not like", value, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressIn(List<String> values) {
            addCriterion("relationaddress in", values, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressNotIn(List<String> values) {
            addCriterion("relationaddress not in", values, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressBetween(String value1, String value2) {
            addCriterion("relationaddress between", value1, value2, "relationaddress");
            return (Criteria) this;
        }

        public Criteria andRelationaddressNotBetween(String value1, String value2) {
            addCriterion("relationaddress not between", value1, value2, "relationaddress");
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