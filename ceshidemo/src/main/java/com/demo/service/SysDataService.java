package com.demo.service;

import com.jfinal.plugin.activerecord.Page;
import com.demo.model.SysData;
import io.jboot.db.model.Columns;

import java.util.List;

/**
 * @author yh128
 * @className SysDataService
 * @description 系统数据服务接口
 * @createTime 2019/6/11 15:42
 */
public interface SysDataService {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public SysData findById(Object id);


    /**
     * find all model
     *
     * @return all <SysData
     */
    public List<SysData> findAll();


    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(SysData model);


    /**
     * save model to database
     *
     * @param model
     * @return id value if save success
     */
    public Object save(SysData model);


    /**
     * save or update model
     *
     * @param model
     * @return id value if save or update success
     */
    public Object saveOrUpdate(SysData model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(SysData model);


    /**
     * page query
     *
     * @param page
     * @param pageSize
     * @return page data
     */
    public Page<SysData> paginate(int page, int pageSize);


    /**
     * page query by columns
     *
     * @param page
     * @param pageSize
     * @param columns
     * @return page data
     */
    public Page<SysData> paginateByColumns(int page, int pageSize, Columns columns);


    /**
     * page query by columns
     *
     * @param page
     * @param pageSize
     * @param columns
     * @param orderBy
     * @return page data
     */
    public Page<SysData> paginateByColumns(int page, int pageSize, Columns columns, String orderBy);


}