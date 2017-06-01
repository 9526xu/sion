package com.lol.sion.core.dao.mapper;

import com.lol.sion.core.dao.dataobject.NasdqEarningDO;
import com.lol.sion.core.dao.query.NasdqEarningQuery;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * MyBatis Mapper for NasdqEarning.
 */
public interface NasdqEarningMapper {
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
    int insertSelective(NasdqEarningDO record);

    /**
     * select by query condition.
     */
    List<NasdqEarningDO> selectByQuery(NasdqEarningQuery query);

    /**
     * select by primary key.
     */
    NasdqEarningDO selectByPrimaryKey(Long id);

    /**
     * update by query condition selective.
     */
    int updateByQuerySelective(@Param("record") NasdqEarningDO record, @Param("query") NasdqEarningQuery query);

    /**
     * update by query condition.
     */
    int updateByQuery(@Param("record") NasdqEarningDO record, @Param("query") NasdqEarningQuery query);

    /**
     * update by primary key selective.
     */
    int updateByPrimaryKeySelective(NasdqEarningDO record);
}