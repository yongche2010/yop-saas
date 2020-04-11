package com.yongche.yopsaas.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yongche.yopsaas.db.domain.LitemallAdmin;
import com.yongche.yopsaas.db.domain.LitemallAdminExample;

public interface LitemallAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    long countByExample(LitemallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int insert(LitemallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int insertSelective(LitemallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    LitemallAdmin selectOneByExample(LitemallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    LitemallAdmin selectOneByExampleSelective(@Param("example") LitemallAdminExample example, @Param("selective") LitemallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    List<LitemallAdmin> selectByExampleSelective(@Param("example") LitemallAdminExample example, @Param("selective") LitemallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    List<LitemallAdmin> selectByExample(LitemallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    LitemallAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    LitemallAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    LitemallAdmin selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallAdmin record, @Param("example") LitemallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallAdmin record, @Param("example") LitemallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_admin
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}