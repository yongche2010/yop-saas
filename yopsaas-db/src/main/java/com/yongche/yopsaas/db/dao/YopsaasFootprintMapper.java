package com.yongche.yopsaas.db.dao;

import com.yongche.yopsaas.db.domain.YopsaasFootprint;
import com.yongche.yopsaas.db.domain.YopsaasFootprintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YopsaasFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    long countByExample(YopsaasFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int deleteByExample(YopsaasFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int insert(YopsaasFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int insertSelective(YopsaasFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    YopsaasFootprint selectOneByExample(YopsaasFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    YopsaasFootprint selectOneByExampleSelective(@Param("example") YopsaasFootprintExample example, @Param("selective") YopsaasFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    List<YopsaasFootprint> selectByExampleSelective(@Param("example") YopsaasFootprintExample example, @Param("selective") YopsaasFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    List<YopsaasFootprint> selectByExample(YopsaasFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    YopsaasFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") YopsaasFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    YopsaasFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    YopsaasFootprint selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YopsaasFootprint record, @Param("example") YopsaasFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YopsaasFootprint record, @Param("example") YopsaasFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YopsaasFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YopsaasFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") YopsaasFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_footprint
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}