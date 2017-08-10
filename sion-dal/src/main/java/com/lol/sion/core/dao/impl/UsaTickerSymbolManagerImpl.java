package com.lol.sion.core.dao.impl;

import com.lol.sion.core.dao.query.support.PageResult;
import com.lol.sion.core.dao.dataobject.UsaTickerSymbolDO;
import com.lol.sion.core.dao.query.UsaTickerSymbolQuery;
import com.lol.sion.core.dao.mapper.ext.UsaTickerSymbolExtMapper;
import com.lol.sion.core.dao.intf.UsaTickerSymbolManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Manager for UsaTickerSymbol.
 */

@Component
public class UsaTickerSymbolManagerImpl implements UsaTickerSymbolManager{
    protected Logger log = LoggerFactory.getLogger(this.getClass());

    
    @Autowired
    protected UsaTickerSymbolExtMapper usaTickerSymbolExtMapper;
    /**
     * query count by query condition.
     */
    @Override
    public int countByQuery(UsaTickerSymbolQuery query){
        return usaTickerSymbolExtMapper.countByQuery(query);
    }

    /**
     * delete by query condition.
     */
    @Override
    public int deleteByQuery(UsaTickerSymbolQuery query){
        return usaTickerSymbolExtMapper.deleteByQuery(query);
    }

    /**
     * delete by primary key.
     */
    @Override
    public int deleteByPrimaryKey(UsaTickerSymbolDO record){
        return usaTickerSymbolExtMapper.deleteByPrimaryKey(record);
    }

    /**
     * insert selective.
     */
    @Override
    public long insertSelective(UsaTickerSymbolDO record){
        return usaTickerSymbolExtMapper.insertSelective(record);
    }

    /**
     * select by query condition.
     */
    @Override
    public List<UsaTickerSymbolDO> selectByQuery(UsaTickerSymbolQuery query){
        return usaTickerSymbolExtMapper.selectByQuery(query);
    }

    /**
     * select by query condition with page.
    */
    @Override
    public PageResult<UsaTickerSymbolDO> selectByQueryWithPage(UsaTickerSymbolQuery query) {
        PageResult<UsaTickerSymbolDO> result = new PageResult<UsaTickerSymbolDO>();
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
    public UsaTickerSymbolDO selectByPrimaryKey(Long id){
        return usaTickerSymbolExtMapper.selectByPrimaryKey(id);
    }

    /**
     * update by query condition selective.
     */
    @Override
    public int updateByQuerySelective( UsaTickerSymbolDO record,  UsaTickerSymbolQuery query){
        return usaTickerSymbolExtMapper.updateByQuerySelective(record,  query);
    }

    /**
     * update by query condition.
     */
    @Override
    public int updateByQuery( UsaTickerSymbolDO record,  UsaTickerSymbolQuery query){

        return usaTickerSymbolExtMapper.updateByQuery(record, query);
    }

    /**
     * update by primary key selective.
     */
    @Override
    public int updateByPrimaryKeySelective(UsaTickerSymbolDO record){
        return usaTickerSymbolExtMapper.updateByPrimaryKeySelective(record);
    }
}