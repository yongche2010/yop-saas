package com.yongche.yopsaas.db.dao;

import com.yongche.yopsaas.db.domain.YopsaasAftersale;
import com.yongche.yopsaas.db.domain.YopsaasAftersaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YopsaasAftersaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    long countByExample(YopsaasAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int deleteByExample(YopsaasAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int insert(YopsaasAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int insertSelective(YopsaasAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    YopsaasAftersale selectOneByExample(YopsaasAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    YopsaasAftersale selectOneByExampleSelective(@Param("example") YopsaasAftersaleExample example, @Param("selective") YopsaasAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    List<YopsaasAftersale> selectByExampleSelective(@Param("example") YopsaasAftersaleExample example, @Param("selective") YopsaasAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    List<YopsaasAftersale> selectByExample(YopsaasAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    YopsaasAftersale selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") YopsaasAftersale.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    YopsaasAftersale selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    YopsaasAftersale selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YopsaasAftersale record, @Param("example") YopsaasAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YopsaasAftersale record, @Param("example") YopsaasAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YopsaasAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YopsaasAftersale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") YopsaasAftersaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_aftersale
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}