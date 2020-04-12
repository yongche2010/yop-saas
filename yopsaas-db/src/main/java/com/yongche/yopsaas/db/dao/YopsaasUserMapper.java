package com.yongche.yopsaas.db.dao;

import com.yongche.yopsaas.db.domain.YopsaasUser;
import com.yongche.yopsaas.db.domain.YopsaasUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YopsaasUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    long countByExample(YopsaasUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int deleteByExample(YopsaasUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int insert(YopsaasUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int insertSelective(YopsaasUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    YopsaasUser selectOneByExample(YopsaasUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    YopsaasUser selectOneByExampleSelective(@Param("example") YopsaasUserExample example, @Param("selective") YopsaasUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    List<YopsaasUser> selectByExampleSelective(@Param("example") YopsaasUserExample example, @Param("selective") YopsaasUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    List<YopsaasUser> selectByExample(YopsaasUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    YopsaasUser selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") YopsaasUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    YopsaasUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    YopsaasUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YopsaasUser record, @Param("example") YopsaasUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YopsaasUser record, @Param("example") YopsaasUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YopsaasUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YopsaasUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") YopsaasUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_user
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}