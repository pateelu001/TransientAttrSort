package com.sample.sort.model.vo;

import com.sample.sort.model.eo.EmployeeImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 12 15:51:21 EDT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeeViewRowImpl extends ViewRowImpl {

    public static final int ENTITY_EMPLOYEE = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        EmployeeId,
        FirstName,
        LastName,
        Email,
        PhoneNumber,
        HireDate,
        JobId,
        Salary,
        CommissionPct,
        ManagerId,
        DepartmentId,
        FullName,
        EmployeeView;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int FULLNAME = AttributesEnum.FullName.index();
    public static final int EMPLOYEEVIEW = AttributesEnum.EmployeeView.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeeViewRowImpl() {
    }

    /**
     * Gets Employee entity object.
     * @return the Employee
     */
    public EmployeeImpl getEmployee() {
        return (EmployeeImpl) getEntity(ENTITY_EMPLOYEE);
    }

    /**
     * Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @return the EMPLOYEE_ID
     */
    public Integer getEmployeeId() {
        return (Integer) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @param value value to set the EMPLOYEE_ID
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for FIRST_NAME using the alias name FirstName.
     * @return the FIRST_NAME
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for FIRST_NAME using the alias name FirstName.
     * @param value value to set the FIRST_NAME
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LAST_NAME using the alias name LastName.
     * @return the LAST_NAME
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName.
     * @param value value to set the LAST_NAME
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for EMAIL using the alias name Email.
     * @return the EMAIL
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for EMAIL using the alias name Email.
     * @param value value to set the EMAIL
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for PHONE_NUMBER using the alias name PhoneNumber.
     * @return the PHONE_NUMBER
     */
    public String getPhoneNumber() {
        return (String) getAttributeInternal(PHONENUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for PHONE_NUMBER using the alias name PhoneNumber.
     * @param value value to set the PHONE_NUMBER
     */
    public void setPhoneNumber(String value) {
        setAttributeInternal(PHONENUMBER, value);
    }

    /**
     * Gets the attribute value for HIRE_DATE using the alias name HireDate.
     * @return the HIRE_DATE
     */
    public Timestamp getHireDate() {
        return (Timestamp) getAttributeInternal(HIREDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for HIRE_DATE using the alias name HireDate.
     * @param value value to set the HIRE_DATE
     */
    public void setHireDate(Timestamp value) {
        setAttributeInternal(HIREDATE, value);
    }

    /**
     * Gets the attribute value for JOB_ID using the alias name JobId.
     * @return the JOB_ID
     */
    public String getJobId() {
        return (String) getAttributeInternal(JOBID);
    }

    /**
     * Sets <code>value</code> as attribute value for JOB_ID using the alias name JobId.
     * @param value value to set the JOB_ID
     */
    public void setJobId(String value) {
        setAttributeInternal(JOBID, value);
    }

    /**
     * Gets the attribute value for SALARY using the alias name Salary.
     * @return the SALARY
     */
    public BigDecimal getSalary() {
        return (BigDecimal) getAttributeInternal(SALARY);
    }

    /**
     * Sets <code>value</code> as attribute value for SALARY using the alias name Salary.
     * @param value value to set the SALARY
     */
    public void setSalary(BigDecimal value) {
        setAttributeInternal(SALARY, value);
    }

    /**
     * Gets the attribute value for COMMISSION_PCT using the alias name CommissionPct.
     * @return the COMMISSION_PCT
     */
    public BigDecimal getCommissionPct() {
        return (BigDecimal) getAttributeInternal(COMMISSIONPCT);
    }

    /**
     * Sets <code>value</code> as attribute value for COMMISSION_PCT using the alias name CommissionPct.
     * @param value value to set the COMMISSION_PCT
     */
    public void setCommissionPct(BigDecimal value) {
        setAttributeInternal(COMMISSIONPCT, value);
    }

    /**
     * Gets the attribute value for MANAGER_ID using the alias name ManagerId.
     * @return the MANAGER_ID
     */
    public Integer getManagerId() {
        return (Integer) getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as attribute value for MANAGER_ID using the alias name ManagerId.
     * @param value value to set the MANAGER_ID
     */
    public void setManagerId(Integer value) {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @return the DEPARTMENT_ID
     */
    public Integer getDepartmentId() {
        return (Integer) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @param value value to set the DEPARTMENT_ID
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FullName.
     * @return the FullName
     */
    public String getFullName() {
        if(this.getFirstName()!= null && this.getLastName()!=null){
            System.out.println("Full name is "+this.getFirstName().concat(" ").concat(this.getLastName()));
            return this.getFirstName().concat(" ").concat(this.getLastName());
        }
        return (String) getAttributeInternal(FULLNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FullName.
     * @param value value to set the  FullName
     */
    public void setFullName(String value) {
        setAttributeInternal(FULLNAME, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link EmployeeView.
     */
    public RowIterator getEmployeeView() {
        return (RowIterator) getAttributeInternal(EMPLOYEEVIEW);
    }
}

