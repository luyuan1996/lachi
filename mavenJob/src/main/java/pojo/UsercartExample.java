package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsercartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsercartExample() {
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeid is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeid is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(String value) {
            addCriterion("resumeid =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(String value) {
            addCriterion("resumeid <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(String value) {
            addCriterion("resumeid >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(String value) {
            addCriterion("resumeid >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(String value) {
            addCriterion("resumeid <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(String value) {
            addCriterion("resumeid <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLike(String value) {
            addCriterion("resumeid like", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotLike(String value) {
            addCriterion("resumeid not like", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<String> values) {
            addCriterion("resumeid in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<String> values) {
            addCriterion("resumeid not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(String value1, String value2) {
            addCriterion("resumeid between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(String value1, String value2) {
            addCriterion("resumeid not between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("jobid is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobid is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(String value) {
            addCriterion("jobid =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(String value) {
            addCriterion("jobid <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(String value) {
            addCriterion("jobid >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(String value) {
            addCriterion("jobid >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(String value) {
            addCriterion("jobid <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(String value) {
            addCriterion("jobid <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLike(String value) {
            addCriterion("jobid like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotLike(String value) {
            addCriterion("jobid not like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<String> values) {
            addCriterion("jobid in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<String> values) {
            addCriterion("jobid not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(String value1, String value2) {
            addCriterion("jobid between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(String value1, String value2) {
            addCriterion("jobid not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("jobname is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobname is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobname =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobname <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobname >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobname >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobname <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobname <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobname like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobname not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobname in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobname not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobname between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobname not between", value1, value2, "jobname");
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

        public Criteria andByreadIsNull() {
            addCriterion("byread is null");
            return (Criteria) this;
        }

        public Criteria andByreadIsNotNull() {
            addCriterion("byread is not null");
            return (Criteria) this;
        }

        public Criteria andByreadEqualTo(Byte value) {
            addCriterion("byread =", value, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadNotEqualTo(Byte value) {
            addCriterion("byread <>", value, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadGreaterThan(Byte value) {
            addCriterion("byread >", value, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadGreaterThanOrEqualTo(Byte value) {
            addCriterion("byread >=", value, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadLessThan(Byte value) {
            addCriterion("byread <", value, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadLessThanOrEqualTo(Byte value) {
            addCriterion("byread <=", value, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadIn(List<Byte> values) {
            addCriterion("byread in", values, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadNotIn(List<Byte> values) {
            addCriterion("byread not in", values, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadBetween(Byte value1, Byte value2) {
            addCriterion("byread between", value1, value2, "byread");
            return (Criteria) this;
        }

        public Criteria andByreadNotBetween(Byte value1, Byte value2) {
            addCriterion("byread not between", value1, value2, "byread");
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

        public Criteria andBydownloadIsNull() {
            addCriterion("bydownload is null");
            return (Criteria) this;
        }

        public Criteria andBydownloadIsNotNull() {
            addCriterion("bydownload is not null");
            return (Criteria) this;
        }

        public Criteria andBydownloadEqualTo(Byte value) {
            addCriterion("bydownload =", value, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadNotEqualTo(Byte value) {
            addCriterion("bydownload <>", value, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadGreaterThan(Byte value) {
            addCriterion("bydownload >", value, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadGreaterThanOrEqualTo(Byte value) {
            addCriterion("bydownload >=", value, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadLessThan(Byte value) {
            addCriterion("bydownload <", value, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadLessThanOrEqualTo(Byte value) {
            addCriterion("bydownload <=", value, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadIn(List<Byte> values) {
            addCriterion("bydownload in", values, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadNotIn(List<Byte> values) {
            addCriterion("bydownload not in", values, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadBetween(Byte value1, Byte value2) {
            addCriterion("bydownload between", value1, value2, "bydownload");
            return (Criteria) this;
        }

        public Criteria andBydownloadNotBetween(Byte value1, Byte value2) {
            addCriterion("bydownload not between", value1, value2, "bydownload");
            return (Criteria) this;
        }

        public Criteria andByviewIsNull() {
            addCriterion("byview is null");
            return (Criteria) this;
        }

        public Criteria andByviewIsNotNull() {
            addCriterion("byview is not null");
            return (Criteria) this;
        }

        public Criteria andByviewEqualTo(Byte value) {
            addCriterion("byview =", value, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewNotEqualTo(Byte value) {
            addCriterion("byview <>", value, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewGreaterThan(Byte value) {
            addCriterion("byview >", value, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewGreaterThanOrEqualTo(Byte value) {
            addCriterion("byview >=", value, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewLessThan(Byte value) {
            addCriterion("byview <", value, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewLessThanOrEqualTo(Byte value) {
            addCriterion("byview <=", value, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewIn(List<Byte> values) {
            addCriterion("byview in", values, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewNotIn(List<Byte> values) {
            addCriterion("byview not in", values, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewBetween(Byte value1, Byte value2) {
            addCriterion("byview between", value1, value2, "byview");
            return (Criteria) this;
        }

        public Criteria andByviewNotBetween(Byte value1, Byte value2) {
            addCriterion("byview not between", value1, value2, "byview");
            return (Criteria) this;
        }

        public Criteria andViewtimeIsNull() {
            addCriterion("viewtime is null");
            return (Criteria) this;
        }

        public Criteria andViewtimeIsNotNull() {
            addCriterion("viewtime is not null");
            return (Criteria) this;
        }

        public Criteria andViewtimeEqualTo(Date value) {
            addCriterion("viewtime =", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeNotEqualTo(Date value) {
            addCriterion("viewtime <>", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeGreaterThan(Date value) {
            addCriterion("viewtime >", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("viewtime >=", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeLessThan(Date value) {
            addCriterion("viewtime <", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeLessThanOrEqualTo(Date value) {
            addCriterion("viewtime <=", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeIn(List<Date> values) {
            addCriterion("viewtime in", values, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeNotIn(List<Date> values) {
            addCriterion("viewtime not in", values, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeBetween(Date value1, Date value2) {
            addCriterion("viewtime between", value1, value2, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeNotBetween(Date value1, Date value2) {
            addCriterion("viewtime not between", value1, value2, "viewtime");
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