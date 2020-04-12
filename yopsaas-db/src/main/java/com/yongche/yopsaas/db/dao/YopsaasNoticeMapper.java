package com.yongche.yopsaas.db.dao;

import com.yongche.yopsaas.db.domain.YopsaasNotice;
import com.yongche.yopsaas.db.domain.YopsaasNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YopsaasNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    long countByExample(YopsaasNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    int deleteByExample(YopsaasNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    int insert(YopsaasNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    int insertSelective(YopsaasNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    YopsaasNotice selectOneByExample(YopsaasNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    YopsaasNotice selectOneByExampleSelective(@Param("example") YopsaasNoticeExample example, @Param("selective") YopsaasNotice.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    List<YopsaasNotice> selectByExampleSelective(@Param("example") YopsaasNoticeExample example, @Param("selective") YopsaasNotice.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    List<YopsaasNotice> selectByExample(YopsaasNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YopsaasNotice record, @Param("example") YopsaasNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YopsaasNotice record, @Param("example") YopsaasNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") YopsaasNoticeExample example);
}