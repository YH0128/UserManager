package com.demo.model;

import io.jboot.db.annotation.Table;
import com.demo.model.base.BaseRole;

/**
 * Generated by Jboot.
 */
@Table(tableName = "role", primaryKey = "id")
public class Role extends BaseRole<Role> {
	private String ceshi;

	private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getCeshi() {
        return ceshi;
    }

    public void setCeshi(String ceshi) {
        this.ceshi = ceshi;
    }

}
