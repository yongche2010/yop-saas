package com.yongche.yopsaas.db.dao;

import com.yongche.yopsaas.db.domain.YopsaasKeyword;
import com.yongche.yopsaas.db.domain.YopsaasKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YopsaasKeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    long countByExample(YopsaasKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    int deleteByExample(YopsaasKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    int insert(YopsaasKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    int insertSelective(YopsaasKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    YopsaasKeyword selectOneByExample(YopsaasKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    YopsaasKeyword selectOneByExampleSelective(@Param("example") YopsaasKeywordExample example, @Param("selective") YopsaasKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    List<YopsaasKeyword> selectByExampleSelective(@Param("example") YopsaasKeywordExample example, @Param("selective") YopsaasKeyword.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    List<YopsaasKeyword> selectByExample(YopsaasKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YopsaasKeyword record, @Param("example") YopsaasKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YopsaasKeyword record, @Param("example") YopsaasKeywordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_keyword
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") YopsaasKeywordExample example);
}