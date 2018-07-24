package com.demo.springbootdemo.pojo;

import java.io.Serializable;

public class DemoTable implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_table.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_table.demo_name
     *
     * @mbg.generated
     */
    private String demoName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo_table.demo_password
     *
     * @mbg.generated
     */
    private String demoPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_table.id
     *
     * @return the value of demo_table.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_table.id
     *
     * @param id the value for demo_table.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_table.demo_name
     *
     * @return the value of demo_table.demo_name
     *
     * @mbg.generated
     */
    public String getDemoName() {
        return demoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_table.demo_name
     *
     * @param demoName the value for demo_table.demo_name
     *
     * @mbg.generated
     */
    public void setDemoName(String demoName) {
        this.demoName = demoName == null ? null : demoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo_table.demo_password
     *
     * @return the value of demo_table.demo_password
     *
     * @mbg.generated
     */
    public String getDemoPassword() {
        return demoPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column demo_table.demo_password
     *
     * @param demoPassword the value for demo_table.demo_password
     *
     * @mbg.generated
     */
    public void setDemoPassword(String demoPassword) {
        this.demoPassword = demoPassword == null ? null : demoPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_table
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", demoName=").append(demoName);
        sb.append(", demoPassword=").append(demoPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}