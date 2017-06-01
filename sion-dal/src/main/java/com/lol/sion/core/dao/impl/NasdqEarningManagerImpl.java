package com.lol.sion.core.dao.impl;

import com.lol.sion.core.dao.query.support.PageResult;
import com.lol.sion.core.dao.dataobject.NasdqEarningDO;
import com.lol.sion.core.dao.query.NasdqEarningQuery;
import com.lol.sion.core.dao.mapper.ext.NasdqEarningExtMapper;
import com.lol.sion.core.dao.intf.NasdqEarningManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for NasdqEarning.
 */

@Component
public class NasdqEarningManagerImpl implements NasdqEarningManager{
    protected Logger log = LoggerFactory.getLogger(this.getClass());

    
    @Autowired
    protected NasdqEarningExtMapper nasdqEarningExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(NasdqEarningQuery query){
        return nasdqEarningExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(NasdqEarningQuery query){
        return nasdqEarningExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(NasdqEarningDO record){
        return nasdqEarningExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(NasdqEarningDO record){
        return nasdqEarningExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<NasdqEarningDO> selectByQuery(NasdqEarningQuery query){
        return nasdqEarningExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<NasdqEarningDO> selectByQueryWithPage(NasdqEarningQuery query) {
        PageResult<NasdqEarningDO> result = new PageResult<NasdqEarningDO>();
        result.setPageSize(query.getPageSize());
        result.setPageNo(query.getPageNo());
        result.setTotalCount(this.countByQuery(query));
        result.setResult(this.selectByQuery(query));
        return result;
    }

    /**
     * select by primary key.
     */
    @Override
    public NasdqEarningDO selectByPrimaryKey(Long id){
        return nasdqEarningExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( NasdqEarningDO record,  NasdqEarningQuery query){
        return nasdqEarningExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( NasdqEarningDO record,  NasdqEarningQuery query){

        return nasdqEarningExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(NasdqEarningDO record){
        return nasdqEarningExtMapper.updateByPrimaryKeySelective(record);
    }
}