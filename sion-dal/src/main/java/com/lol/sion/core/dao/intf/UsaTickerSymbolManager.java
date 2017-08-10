package com.lol.sion.core.dao.intf;

import com.lol.sion.core.dao.query.support.PageResult;
import com.lol.sion.core.dao.dataobject.UsaTickerSymbolDO;
import com.lol.sion.core.dao.query.UsaTickerSymbolQuery;

import java.util.List;


/**
 * Manager for UsaTickerSymbol.
 */
public interface UsaTickerSymbolManager {
    /**
     * query count by query condition.
     */
    int countByQuery(UsaTickerSymbolQuery query);

    /**
     * delete by query condition.
     */
    int deleteByQuery(UsaTickerSymbolQuery query);

    /**
     * delete by primary key.
     */
    int deleteByPrimaryKey(UsaTickerSymbolDO record);

    /**
     * insert selective.
     */
    long insertSelective(UsaTickerSymbolDO record);

    /**
     * select by query condition.
     */
    List<UsaTickerSymbolDO> selectByQuery(UsaTickerSymbolQuery query);


    /**
     * select by query condition with page.
     */
    PageResult<UsaTickerSymbolDO> selectByQueryWithPage(UsaTickerSymbolQuery query);

    /**
     * select by primary key.
     */
    UsaTickerSymbolDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective( UsaTickerSymbolDO record,  UsaTickerSymbolQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(UsaTickerSymbolDO record, UsaTickerSymbolQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UsaTickerSymbolDO record);
}