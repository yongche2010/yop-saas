package com.yongche.yopsaas.db.dao;

import com.yongche.yopsaas.db.domain.YopsaasNoticeAdmin;
import com.yongche.yopsaas.db.domain.YopsaasNoticeAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YopsaasNoticeAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    long countByExample(YopsaasNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    int deleteByExample(YopsaasNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    int insert(YopsaasNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    int insertSelective(YopsaasNoticeAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    YopsaasNoticeAdmin selectOneByExample(YopsaasNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    YopsaasNoticeAdmin selectOneByExampleSelective(@Param("example") YopsaasNoticeAdminExample example, @Param("selective") YopsaasNoticeAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    List<YopsaasNoticeAdmin> selectByExampleSelective(@Param("example") YopsaasNoticeAdminExample example, @Param("selective") YopsaasNoticeAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    List<YopsaasNoticeAdmin> selectByExample(YopsaasNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YopsaasNoticeAdmin record, @Param("example") YopsaasNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YopsaasNoticeAdmin record, @Param("example") YopsaasNoticeAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_notice_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") YopsaasNoticeAdminExample example);
}