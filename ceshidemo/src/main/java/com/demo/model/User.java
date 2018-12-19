package com.demo.model;

import io.jboot.db.annotation.Table;
import com.demo.model.base.BaseUser;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated by Jboot.
 */
@Table(tableName = "user", primaryKey = "id")
public class User extends BaseUser<User> {

    private Long id;

    private String realName;

    private String address;

    private String telephone;

    private boolean sex;

    private int age;

    private String loginName;

    private String loginPassword;

    public  void  toSet(){
    	super.setAddress(address);
    	super.setLoginName(loginName);
    	super.setLoginPassword(loginPassword);
    	super.setRealName(realName);
    	super.setSex(sex);
    	super.setTelephone(telephone);
    	super.setAge(age);
	}


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }
}
