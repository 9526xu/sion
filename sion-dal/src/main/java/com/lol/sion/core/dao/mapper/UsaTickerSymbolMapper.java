package com.lol.sion.core.dao.mapper;

import com.lol.sion.core.dao.dataobject.UsaTickerSymbolDO;
import com.lol.sion.core.dao.query.UsaTickerSymbolQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for UsaTickerSymbol.
 */
public interface UsaTickerSymbolMapper {
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
    int insertSelective(UsaTickerSymbolDO record);

    /**
     * select by query condition.
     */
    List<UsaTickerSymbolDO> selectByQuery(UsaTickerSymbolQuery query);

    /**
     * select by primary key.
     */
    UsaTickerSymbolDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") UsaTickerSymbolDO record, @Param("query") UsaTickerSymbolQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") UsaTickerSymbolDO record, @Param("query") UsaTickerSymbolQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(UsaTickerSymbolDO record);
}