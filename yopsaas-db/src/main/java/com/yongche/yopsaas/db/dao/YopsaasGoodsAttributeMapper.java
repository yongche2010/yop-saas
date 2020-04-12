package com.yongche.yopsaas.db.dao;

import com.yongche.yopsaas.db.domain.YopsaasGoodsAttribute;
import com.yongche.yopsaas.db.domain.YopsaasGoodsAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YopsaasGoodsAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    long countByExample(YopsaasGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int deleteByExample(YopsaasGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int insert(YopsaasGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int insertSelective(YopsaasGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    YopsaasGoodsAttribute selectOneByExample(YopsaasGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    YopsaasGoodsAttribute selectOneByExampleSelective(@Param("example") YopsaasGoodsAttributeExample example, @Param("selective") YopsaasGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    List<YopsaasGoodsAttribute> selectByExampleSelective(@Param("example") YopsaasGoodsAttributeExample example, @Param("selective") YopsaasGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    List<YopsaasGoodsAttribute> selectByExample(YopsaasGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    YopsaasGoodsAttribute selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") YopsaasGoodsAttribute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    YopsaasGoodsAttribute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    YopsaasGoodsAttribute selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") YopsaasGoodsAttribute record, @Param("example") YopsaasGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") YopsaasGoodsAttribute record, @Param("example") YopsaasGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(YopsaasGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(YopsaasGoodsAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") YopsaasGoodsAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yopsaas_goods_attribute
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}