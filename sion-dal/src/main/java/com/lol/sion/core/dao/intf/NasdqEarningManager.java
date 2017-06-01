package com.lol.sion.core.dao.intf;

import com.lol.sion.core.dao.query.support.PageResult;
import com.lol.sion.core.dao.dataobject.NasdqEarningDO;
import com.lol.sion.core.dao.query.NasdqEarningQuery;

import java.util.List;


/**
 * Manager for NasdqEarning.
 */
public interface NasdqEarningManager {
    /**
     * query count by query condition.
     */
    int countByQuery(NasdqEarningQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(NasdqEarningQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(NasdqEarningDO record);

    /**
     * insert selective.
     */
    long insertSelective(NasdqEarningDO record);

    /**
     * select by query condition.
     */
    List<NasdqEarningDO> selectByQuery(NasdqEarningQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<NasdqEarningDO> selectByQueryWithPage(NasdqEarningQuery query);

    /**
     * select by primary key.
     */
    NasdqEarningDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective( NasdqEarningDO record,  NasdqEarningQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(NasdqEarningDO record, NasdqEarningQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(NasdqEarningDO record);
}