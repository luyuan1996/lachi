package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andResumenameIsNull() {
            addCriterion("resumename is null");
            return (Criteria) this;
        }

        public Criteria andResumenameIsNotNull() {
            addCriterion("resumename is not null");
            return (Criteria) this;
        }

        public Criteria andResumenameEqualTo(String value) {
            addCriterion("resumename =", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotEqualTo(String value) {
            addCriterion("resumename <>", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameGreaterThan(String value) {
            addCriterion("resumename >", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameGreaterThanOrEqualTo(String value) {
            addCriterion("resumename >=", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLessThan(String value) {
            addCriterion("resumename <", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLessThanOrEqualTo(String value) {
            addCriterion("resumename <=", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameLike(String value) {
            addCriterion("resumename like", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotLike(String value) {
            addCriterion("resumename not like", value, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameIn(List<String> values) {
            addCriterion("resumename in", values, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotIn(List<String> values) {
            addCriterion("resumename not in", values, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameBetween(String value1, String value2) {
            addCriterion("resumename between", value1, value2, "resumename");
            return (Criteria) this;
        }

        public Criteria andResumenameNotBetween(String value1, String value2) {
            addCriterion("resumename not between", value1, value2, "resumename");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBrithdayIsNull() {
            addCriterion("brithday is null");
            return (Criteria) this;
        }

        public Criteria andBrithdayIsNotNull() {
            addCriterion("brithday is not null");
            return (Criteria) this;
        }

        public Criteria andBrithdayEqualTo(Date value) {
            addCriterion("brithday =", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayNotEqualTo(Date value) {
            addCriterion("brithday <>", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayGreaterThan(Date value) {
            addCriterion("brithday >", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayGreaterThanOrEqualTo(Date value) {
            addCriterion("brithday >=", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayLessThan(Date value) {
            addCriterion("brithday <", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayLessThanOrEqualTo(Date value) {
            addCriterion("brithday <=", value, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayIn(List<Date> values) {
            addCriterion("brithday in", values, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayNotIn(List<Date> values) {
            addCriterion("brithday not in", values, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayBetween(Date value1, Date value2) {
            addCriterion("brithday between", value1, value2, "brithday");
            return (Criteria) this;
        }

        public Criteria andBrithdayNotBetween(Date value1, Date value2) {
            addCriterion("brithday not between", value1, value2, "brithday");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andMarriedIsNull() {
            addCriterion("married is null");
            return (Criteria) this;
        }

        public Criteria andMarriedIsNotNull() {
            addCriterion("married is not null");
            return (Criteria) this;
        }

        public Criteria andMarriedEqualTo(Byte value) {
            addCriterion("married =", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotEqualTo(Byte value) {
            addCriterion("married <>", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedGreaterThan(Byte value) {
            addCriterion("married >", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedGreaterThanOrEqualTo(Byte value) {
            addCriterion("married >=", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedLessThan(Byte value) {
            addCriterion("married <", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedLessThanOrEqualTo(Byte value) {
            addCriterion("married <=", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedIn(List<Byte> values) {
            addCriterion("married in", values, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotIn(List<Byte> values) {
            addCriterion("married not in", values, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedBetween(Byte value1, Byte value2) {
            addCriterion("married between", value1, value2, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotBetween(Byte value1, Byte value2) {
            addCriterion("married not between", value1, value2, "married");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andIdaddressIsNull() {
            addCriterion("idaddress is null");
            return (Criteria) this;
        }

        public Criteria andIdaddressIsNotNull() {
            addCriterion("idaddress is not null");
            return (Criteria) this;
        }

        public Criteria andIdaddressEqualTo(String value) {
            addCriterion("idaddress =", value, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressNotEqualTo(String value) {
            addCriterion("idaddress <>", value, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressGreaterThan(String value) {
            addCriterion("idaddress >", value, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressGreaterThanOrEqualTo(String value) {
            addCriterion("idaddress >=", value, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressLessThan(String value) {
            addCriterion("idaddress <", value, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressLessThanOrEqualTo(String value) {
            addCriterion("idaddress <=", value, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressLike(String value) {
            addCriterion("idaddress like", value, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressNotLike(String value) {
            addCriterion("idaddress not like", value, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressIn(List<String> values) {
            addCriterion("idaddress in", values, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressNotIn(List<String> values) {
            addCriterion("idaddress not in", values, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressBetween(String value1, String value2) {
            addCriterion("idaddress between", value1, value2, "idaddress");
            return (Criteria) this;
        }

        public Criteria andIdaddressNotBetween(String value1, String value2) {
            addCriterion("idaddress not between", value1, value2, "idaddress");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNull() {
            addCriterion("educational is null");
            return (Criteria) this;
        }

        public Criteria andEducationalIsNotNull() {
            addCriterion("educational is not null");
            return (Criteria) this;
        }

        public Criteria andEducationalEqualTo(String value) {
            addCriterion("educational =", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotEqualTo(String value) {
            addCriterion("educational <>", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThan(String value) {
            addCriterion("educational >", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalGreaterThanOrEqualTo(String value) {
            addCriterion("educational >=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThan(String value) {
            addCriterion("educational <", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLessThanOrEqualTo(String value) {
            addCriterion("educational <=", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalLike(String value) {
            addCriterion("educational like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotLike(String value) {
            addCriterion("educational not like", value, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalIn(List<String> values) {
            addCriterion("educational in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotIn(List<String> values) {
            addCriterion("educational not in", values, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalBetween(String value1, String value2) {
            addCriterion("educational between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andEducationalNotBetween(String value1, String value2) {
            addCriterion("educational not between", value1, value2, "educational");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Integer value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Integer value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Integer value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Integer value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Integer> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Integer> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Integer value1, Integer value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andBlogIsNull() {
            addCriterion("blog is null");
            return (Criteria) this;
        }

        public Criteria andBlogIsNotNull() {
            addCriterion("blog is not null");
            return (Criteria) this;
        }

        public Criteria andBlogEqualTo(String value) {
            addCriterion("blog =", value, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogNotEqualTo(String value) {
            addCriterion("blog <>", value, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogGreaterThan(String value) {
            addCriterion("blog >", value, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogGreaterThanOrEqualTo(String value) {
            addCriterion("blog >=", value, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogLessThan(String value) {
            addCriterion("blog <", value, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogLessThanOrEqualTo(String value) {
            addCriterion("blog <=", value, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogLike(String value) {
            addCriterion("blog like", value, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogNotLike(String value) {
            addCriterion("blog not like", value, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogIn(List<String> values) {
            addCriterion("blog in", values, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogNotIn(List<String> values) {
            addCriterion("blog not in", values, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogBetween(String value1, String value2) {
            addCriterion("blog between", value1, value2, "blog");
            return (Criteria) this;
        }

        public Criteria andBlogNotBetween(String value1, String value2) {
            addCriterion("blog not between", value1, value2, "blog");
            return (Criteria) this;
        }

        public Criteria andGetIsNull() {
            addCriterion("get is null");
            return (Criteria) this;
        }

        public Criteria andGetIsNotNull() {
            addCriterion("get is not null");
            return (Criteria) this;
        }

        public Criteria andGetEqualTo(Byte value) {
            addCriterion("get =", value, "get");
            return (Criteria) this;
        }

        public Criteria andGetNotEqualTo(Byte value) {
            addCriterion("get <>", value, "get");
            return (Criteria) this;
        }

        public Criteria andGetGreaterThan(Byte value) {
            addCriterion("get >", value, "get");
            return (Criteria) this;
        }

        public Criteria andGetGreaterThanOrEqualTo(Byte value) {
            addCriterion("get >=", value, "get");
            return (Criteria) this;
        }

        public Criteria andGetLessThan(Byte value) {
            addCriterion("get <", value, "get");
            return (Criteria) this;
        }

        public Criteria andGetLessThanOrEqualTo(Byte value) {
            addCriterion("get <=", value, "get");
            return (Criteria) this;
        }

        public Criteria andGetIn(List<Byte> values) {
            addCriterion("get in", values, "get");
            return (Criteria) this;
        }

        public Criteria andGetNotIn(List<Byte> values) {
            addCriterion("get not in", values, "get");
            return (Criteria) this;
        }

        public Criteria andGetBetween(Byte value1, Byte value2) {
            addCriterion("get between", value1, value2, "get");
            return (Criteria) this;
        }

        public Criteria andGetNotBetween(Byte value1, Byte value2) {
            addCriterion("get not between", value1, value2, "get");
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

        public Criteria andJobtypeEqualTo(Integer value) {
            addCriterion("jobtype =", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotEqualTo(Integer value) {
            addCriterion("jobtype <>", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThan(Integer value) {
            addCriterion("jobtype >", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobtype >=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThan(Integer value) {
            addCriterion("jobtype <", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeLessThanOrEqualTo(Integer value) {
            addCriterion("jobtype <=", value, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeIn(List<Integer> values) {
            addCriterion("jobtype in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotIn(List<Integer> values) {
            addCriterion("jobtype not in", values, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeBetween(Integer value1, Integer value2) {
            addCriterion("jobtype between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andJobtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("jobtype not between", value1, value2, "jobtype");
            return (Criteria) this;
        }

        public Criteria andNearjobIsNull() {
            addCriterion("nearjob is null");
            return (Criteria) this;
        }

        public Criteria andNearjobIsNotNull() {
            addCriterion("nearjob is not null");
            return (Criteria) this;
        }

        public Criteria andNearjobEqualTo(String value) {
            addCriterion("nearjob =", value, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobNotEqualTo(String value) {
            addCriterion("nearjob <>", value, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobGreaterThan(String value) {
            addCriterion("nearjob >", value, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobGreaterThanOrEqualTo(String value) {
            addCriterion("nearjob >=", value, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobLessThan(String value) {
            addCriterion("nearjob <", value, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobLessThanOrEqualTo(String value) {
            addCriterion("nearjob <=", value, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobLike(String value) {
            addCriterion("nearjob like", value, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobNotLike(String value) {
            addCriterion("nearjob not like", value, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobIn(List<String> values) {
            addCriterion("nearjob in", values, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobNotIn(List<String> values) {
            addCriterion("nearjob not in", values, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobBetween(String value1, String value2) {
            addCriterion("nearjob between", value1, value2, "nearjob");
            return (Criteria) this;
        }

        public Criteria andNearjobNotBetween(String value1, String value2) {
            addCriterion("nearjob not between", value1, value2, "nearjob");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andJobwantedIsNull() {
            addCriterion("jobwanted is null");
            return (Criteria) this;
        }

        public Criteria andJobwantedIsNotNull() {
            addCriterion("jobwanted is not null");
            return (Criteria) this;
        }

        public Criteria andJobwantedEqualTo(String value) {
            addCriterion("jobwanted =", value, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedNotEqualTo(String value) {
            addCriterion("jobwanted <>", value, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedGreaterThan(String value) {
            addCriterion("jobwanted >", value, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedGreaterThanOrEqualTo(String value) {
            addCriterion("jobwanted >=", value, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedLessThan(String value) {
            addCriterion("jobwanted <", value, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedLessThanOrEqualTo(String value) {
            addCriterion("jobwanted <=", value, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedLike(String value) {
            addCriterion("jobwanted like", value, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedNotLike(String value) {
            addCriterion("jobwanted not like", value, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedIn(List<String> values) {
            addCriterion("jobwanted in", values, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedNotIn(List<String> values) {
            addCriterion("jobwanted not in", values, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedBetween(String value1, String value2) {
            addCriterion("jobwanted between", value1, value2, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andJobwantedNotBetween(String value1, String value2) {
            addCriterion("jobwanted not between", value1, value2, "jobwanted");
            return (Criteria) this;
        }

        public Criteria andStudystartIsNull() {
            addCriterion("studystart is null");
            return (Criteria) this;
        }

        public Criteria andStudystartIsNotNull() {
            addCriterion("studystart is not null");
            return (Criteria) this;
        }

        public Criteria andStudystartEqualTo(Date value) {
            addCriterion("studystart =", value, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartNotEqualTo(Date value) {
            addCriterion("studystart <>", value, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartGreaterThan(Date value) {
            addCriterion("studystart >", value, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartGreaterThanOrEqualTo(Date value) {
            addCriterion("studystart >=", value, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartLessThan(Date value) {
            addCriterion("studystart <", value, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartLessThanOrEqualTo(Date value) {
            addCriterion("studystart <=", value, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartIn(List<Date> values) {
            addCriterion("studystart in", values, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartNotIn(List<Date> values) {
            addCriterion("studystart not in", values, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartBetween(Date value1, Date value2) {
            addCriterion("studystart between", value1, value2, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudystartNotBetween(Date value1, Date value2) {
            addCriterion("studystart not between", value1, value2, "studystart");
            return (Criteria) this;
        }

        public Criteria andStudyoverIsNull() {
            addCriterion("studyover is null");
            return (Criteria) this;
        }

        public Criteria andStudyoverIsNotNull() {
            addCriterion("studyover is not null");
            return (Criteria) this;
        }

        public Criteria andStudyoverEqualTo(Date value) {
            addCriterion("studyover =", value, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverNotEqualTo(Date value) {
            addCriterion("studyover <>", value, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverGreaterThan(Date value) {
            addCriterion("studyover >", value, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverGreaterThanOrEqualTo(Date value) {
            addCriterion("studyover >=", value, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverLessThan(Date value) {
            addCriterion("studyover <", value, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverLessThanOrEqualTo(Date value) {
            addCriterion("studyover <=", value, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverIn(List<Date> values) {
            addCriterion("studyover in", values, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverNotIn(List<Date> values) {
            addCriterion("studyover not in", values, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverBetween(Date value1, Date value2) {
            addCriterion("studyover between", value1, value2, "studyover");
            return (Criteria) this;
        }

        public Criteria andStudyoverNotBetween(Date value1, Date value2) {
            addCriterion("studyover not between", value1, value2, "studyover");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andJobstartIsNull() {
            addCriterion("jobstart is null");
            return (Criteria) this;
        }

        public Criteria andJobstartIsNotNull() {
            addCriterion("jobstart is not null");
            return (Criteria) this;
        }

        public Criteria andJobstartEqualTo(Date value) {
            addCriterion("jobstart =", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartNotEqualTo(Date value) {
            addCriterion("jobstart <>", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartGreaterThan(Date value) {
            addCriterion("jobstart >", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartGreaterThanOrEqualTo(Date value) {
            addCriterion("jobstart >=", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartLessThan(Date value) {
            addCriterion("jobstart <", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartLessThanOrEqualTo(Date value) {
            addCriterion("jobstart <=", value, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartIn(List<Date> values) {
            addCriterion("jobstart in", values, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartNotIn(List<Date> values) {
            addCriterion("jobstart not in", values, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartBetween(Date value1, Date value2) {
            addCriterion("jobstart between", value1, value2, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJobstartNotBetween(Date value1, Date value2) {
            addCriterion("jobstart not between", value1, value2, "jobstart");
            return (Criteria) this;
        }

        public Criteria andJoboverIsNull() {
            addCriterion("jobover is null");
            return (Criteria) this;
        }

        public Criteria andJoboverIsNotNull() {
            addCriterion("jobover is not null");
            return (Criteria) this;
        }

        public Criteria andJoboverEqualTo(Date value) {
            addCriterion("jobover =", value, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverNotEqualTo(Date value) {
            addCriterion("jobover <>", value, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverGreaterThan(Date value) {
            addCriterion("jobover >", value, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverGreaterThanOrEqualTo(Date value) {
            addCriterion("jobover >=", value, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverLessThan(Date value) {
            addCriterion("jobover <", value, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverLessThanOrEqualTo(Date value) {
            addCriterion("jobover <=", value, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverIn(List<Date> values) {
            addCriterion("jobover in", values, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverNotIn(List<Date> values) {
            addCriterion("jobover not in", values, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverBetween(Date value1, Date value2) {
            addCriterion("jobover between", value1, value2, "jobover");
            return (Criteria) this;
        }

        public Criteria andJoboverNotBetween(Date value1, Date value2) {
            addCriterion("jobover not between", value1, value2, "jobover");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyname is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyname =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyname <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyname >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyname >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyname <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyname <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyname like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyname not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyname in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyname not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyname between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyname not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationIsNull() {
            addCriterion("companyinformation is null");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationIsNotNull() {
            addCriterion("companyinformation is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationEqualTo(String value) {
            addCriterion("companyinformation =", value, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationNotEqualTo(String value) {
            addCriterion("companyinformation <>", value, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationGreaterThan(String value) {
            addCriterion("companyinformation >", value, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationGreaterThanOrEqualTo(String value) {
            addCriterion("companyinformation >=", value, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationLessThan(String value) {
            addCriterion("companyinformation <", value, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationLessThanOrEqualTo(String value) {
            addCriterion("companyinformation <=", value, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationLike(String value) {
            addCriterion("companyinformation like", value, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationNotLike(String value) {
            addCriterion("companyinformation not like", value, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationIn(List<String> values) {
            addCriterion("companyinformation in", values, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationNotIn(List<String> values) {
            addCriterion("companyinformation not in", values, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationBetween(String value1, String value2) {
            addCriterion("companyinformation between", value1, value2, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andCompanyinformationNotBetween(String value1, String value2) {
            addCriterion("companyinformation not between", value1, value2, "companyinformation");
            return (Criteria) this;
        }

        public Criteria andWorkinIsNull() {
            addCriterion("workin is null");
            return (Criteria) this;
        }

        public Criteria andWorkinIsNotNull() {
            addCriterion("workin is not null");
            return (Criteria) this;
        }

        public Criteria andWorkinEqualTo(String value) {
            addCriterion("workin =", value, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinNotEqualTo(String value) {
            addCriterion("workin <>", value, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinGreaterThan(String value) {
            addCriterion("workin >", value, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinGreaterThanOrEqualTo(String value) {
            addCriterion("workin >=", value, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinLessThan(String value) {
            addCriterion("workin <", value, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinLessThanOrEqualTo(String value) {
            addCriterion("workin <=", value, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinLike(String value) {
            addCriterion("workin like", value, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinNotLike(String value) {
            addCriterion("workin not like", value, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinIn(List<String> values) {
            addCriterion("workin in", values, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinNotIn(List<String> values) {
            addCriterion("workin not in", values, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinBetween(String value1, String value2) {
            addCriterion("workin between", value1, value2, "workin");
            return (Criteria) this;
        }

        public Criteria andWorkinNotBetween(String value1, String value2) {
            addCriterion("workin not between", value1, value2, "workin");
            return (Criteria) this;
        }

        public Criteria andShowingIsNull() {
            addCriterion("showing is null");
            return (Criteria) this;
        }

        public Criteria andShowingIsNotNull() {
            addCriterion("showing is not null");
            return (Criteria) this;
        }

        public Criteria andShowingEqualTo(String value) {
            addCriterion("showing =", value, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingNotEqualTo(String value) {
            addCriterion("showing <>", value, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingGreaterThan(String value) {
            addCriterion("showing >", value, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingGreaterThanOrEqualTo(String value) {
            addCriterion("showing >=", value, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingLessThan(String value) {
            addCriterion("showing <", value, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingLessThanOrEqualTo(String value) {
            addCriterion("showing <=", value, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingLike(String value) {
            addCriterion("showing like", value, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingNotLike(String value) {
            addCriterion("showing not like", value, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingIn(List<String> values) {
            addCriterion("showing in", values, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingNotIn(List<String> values) {
            addCriterion("showing not in", values, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingBetween(String value1, String value2) {
            addCriterion("showing between", value1, value2, "showing");
            return (Criteria) this;
        }

        public Criteria andShowingNotBetween(String value1, String value2) {
            addCriterion("showing not between", value1, value2, "showing");
            return (Criteria) this;
        }

        public Criteria andTrainstartIsNull() {
            addCriterion("trainstart is null");
            return (Criteria) this;
        }

        public Criteria andTrainstartIsNotNull() {
            addCriterion("trainstart is not null");
            return (Criteria) this;
        }

        public Criteria andTrainstartEqualTo(Date value) {
            addCriterion("trainstart =", value, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartNotEqualTo(Date value) {
            addCriterion("trainstart <>", value, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartGreaterThan(Date value) {
            addCriterion("trainstart >", value, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartGreaterThanOrEqualTo(Date value) {
            addCriterion("trainstart >=", value, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartLessThan(Date value) {
            addCriterion("trainstart <", value, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartLessThanOrEqualTo(Date value) {
            addCriterion("trainstart <=", value, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartIn(List<Date> values) {
            addCriterion("trainstart in", values, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartNotIn(List<Date> values) {
            addCriterion("trainstart not in", values, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartBetween(Date value1, Date value2) {
            addCriterion("trainstart between", value1, value2, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainstartNotBetween(Date value1, Date value2) {
            addCriterion("trainstart not between", value1, value2, "trainstart");
            return (Criteria) this;
        }

        public Criteria andTrainoverIsNull() {
            addCriterion("trainover is null");
            return (Criteria) this;
        }

        public Criteria andTrainoverIsNotNull() {
            addCriterion("trainover is not null");
            return (Criteria) this;
        }

        public Criteria andTrainoverEqualTo(Date value) {
            addCriterion("trainover =", value, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverNotEqualTo(Date value) {
            addCriterion("trainover <>", value, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverGreaterThan(Date value) {
            addCriterion("trainover >", value, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverGreaterThanOrEqualTo(Date value) {
            addCriterion("trainover >=", value, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverLessThan(Date value) {
            addCriterion("trainover <", value, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverLessThanOrEqualTo(Date value) {
            addCriterion("trainover <=", value, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverIn(List<Date> values) {
            addCriterion("trainover in", values, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverNotIn(List<Date> values) {
            addCriterion("trainover not in", values, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverBetween(Date value1, Date value2) {
            addCriterion("trainover between", value1, value2, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainoverNotBetween(Date value1, Date value2) {
            addCriterion("trainover not between", value1, value2, "trainover");
            return (Criteria) this;
        }

        public Criteria andTrainplaceIsNull() {
            addCriterion("trainplace is null");
            return (Criteria) this;
        }

        public Criteria andTrainplaceIsNotNull() {
            addCriterion("trainplace is not null");
            return (Criteria) this;
        }

        public Criteria andTrainplaceEqualTo(String value) {
            addCriterion("trainplace =", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceNotEqualTo(String value) {
            addCriterion("trainplace <>", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceGreaterThan(String value) {
            addCriterion("trainplace >", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceGreaterThanOrEqualTo(String value) {
            addCriterion("trainplace >=", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceLessThan(String value) {
            addCriterion("trainplace <", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceLessThanOrEqualTo(String value) {
            addCriterion("trainplace <=", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceLike(String value) {
            addCriterion("trainplace like", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceNotLike(String value) {
            addCriterion("trainplace not like", value, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceIn(List<String> values) {
            addCriterion("trainplace in", values, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceNotIn(List<String> values) {
            addCriterion("trainplace not in", values, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceBetween(String value1, String value2) {
            addCriterion("trainplace between", value1, value2, "trainplace");
            return (Criteria) this;
        }

        public Criteria andTrainplaceNotBetween(String value1, String value2) {
            addCriterion("trainplace not between", value1, value2, "trainplace");
            return (Criteria) this;
        }

        public Criteria andClass1IsNull() {
            addCriterion("class1 is null");
            return (Criteria) this;
        }

        public Criteria andClass1IsNotNull() {
            addCriterion("class1 is not null");
            return (Criteria) this;
        }

        public Criteria andClass1EqualTo(String value) {
            addCriterion("class1 =", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotEqualTo(String value) {
            addCriterion("class1 <>", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThan(String value) {
            addCriterion("class1 >", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThanOrEqualTo(String value) {
            addCriterion("class1 >=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThan(String value) {
            addCriterion("class1 <", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThanOrEqualTo(String value) {
            addCriterion("class1 <=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1Like(String value) {
            addCriterion("class1 like", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotLike(String value) {
            addCriterion("class1 not like", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1In(List<String> values) {
            addCriterion("class1 in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotIn(List<String> values) {
            addCriterion("class1 not in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1Between(String value1, String value2) {
            addCriterion("class1 between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotBetween(String value1, String value2) {
            addCriterion("class1 not between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClassinformationIsNull() {
            addCriterion("classinformation is null");
            return (Criteria) this;
        }

        public Criteria andClassinformationIsNotNull() {
            addCriterion("classinformation is not null");
            return (Criteria) this;
        }

        public Criteria andClassinformationEqualTo(String value) {
            addCriterion("classinformation =", value, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationNotEqualTo(String value) {
            addCriterion("classinformation <>", value, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationGreaterThan(String value) {
            addCriterion("classinformation >", value, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationGreaterThanOrEqualTo(String value) {
            addCriterion("classinformation >=", value, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationLessThan(String value) {
            addCriterion("classinformation <", value, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationLessThanOrEqualTo(String value) {
            addCriterion("classinformation <=", value, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationLike(String value) {
            addCriterion("classinformation like", value, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationNotLike(String value) {
            addCriterion("classinformation not like", value, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationIn(List<String> values) {
            addCriterion("classinformation in", values, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationNotIn(List<String> values) {
            addCriterion("classinformation not in", values, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationBetween(String value1, String value2) {
            addCriterion("classinformation between", value1, value2, "classinformation");
            return (Criteria) this;
        }

        public Criteria andClassinformationNotBetween(String value1, String value2) {
            addCriterion("classinformation not between", value1, value2, "classinformation");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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