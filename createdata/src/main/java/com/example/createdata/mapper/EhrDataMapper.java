package com.example.createdata.mapper;

import com.example.createdata.entity.EhrData;
import com.example.createdata.entity.EhrDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EhrDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    int countByExample(EhrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    int deleteByExample(EhrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `ehr_data`",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `ehr_data` (`id`, `cid`, ",
        "`vid`, `name`, `gender`, ",
        "`birthday`, `examdate`, ",
        "`bz8`, `bz10`, `bz11`, ",
        "`bz12`, `bz16`, `bz17`, ",
        "`bz18`, `bz171`, `bz172`, ",
        "`bz173`, `bz174`, `bz175`, ",
        "`bz268`, `bz271`, `bz272`, ",
        "`bz84`, `bz85`, `bz107`, ",
        "`bz108`, `bz109`, `bz110`, ",
        "`bz104`, `bz105`, `bz106`, ",
        "`bz113`, `bz111`, `bz112`, ",
        "`bz103`, `bz120`, `bz119`, ",
        "`bz121`, `bz81`, `bz82`, ",
        "`bz83`)",
        "values (#{id,jdbcType=INTEGER}, #{cid,jdbcType=VARCHAR}, ",
        "#{vid,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{gender,jdbcType=VARCHAR}, ",
        "#{birthday,jdbcType=TIMESTAMP}, #{examdate,jdbcType=TIMESTAMP}, ",
        "#{bz8,jdbcType=VARCHAR}, #{bz10,jdbcType=VARCHAR}, #{bz11,jdbcType=VARCHAR}, ",
        "#{bz12,jdbcType=VARCHAR}, #{bz16,jdbcType=VARCHAR}, #{bz17,jdbcType=VARCHAR}, ",
        "#{bz18,jdbcType=VARCHAR}, #{bz171,jdbcType=VARCHAR}, #{bz172,jdbcType=VARCHAR}, ",
        "#{bz173,jdbcType=VARCHAR}, #{bz174,jdbcType=VARCHAR}, #{bz175,jdbcType=VARCHAR}, ",
        "#{bz268,jdbcType=VARCHAR}, #{bz271,jdbcType=VARCHAR}, #{bz272,jdbcType=VARCHAR}, ",
        "#{bz84,jdbcType=VARCHAR}, #{bz85,jdbcType=VARCHAR}, #{bz107,jdbcType=VARCHAR}, ",
        "#{bz108,jdbcType=VARCHAR}, #{bz109,jdbcType=VARCHAR}, #{bz110,jdbcType=VARCHAR}, ",
        "#{bz104,jdbcType=VARCHAR}, #{bz105,jdbcType=VARCHAR}, #{bz106,jdbcType=VARCHAR}, ",
        "#{bz113,jdbcType=VARCHAR}, #{bz111,jdbcType=VARCHAR}, #{bz112,jdbcType=VARCHAR}, ",
        "#{bz103,jdbcType=VARCHAR}, #{bz120,jdbcType=VARCHAR}, #{bz119,jdbcType=VARCHAR}, ",
        "#{bz121,jdbcType=VARCHAR}, #{bz81,jdbcType=VARCHAR}, #{bz82,jdbcType=VARCHAR}, ",
        "#{bz83,jdbcType=VARCHAR})"
    })
    int insert(EhrData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    int insertSelective(EhrData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    List<EhrData> selectByExample(EhrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`id`, `cid`, `vid`, `name`, `gender`, `birthday`, `examdate`, `bz8`, `bz10`, ",
        "`bz11`, `bz12`, `bz16`, `bz17`, `bz18`, `bz171`, `bz172`, `bz173`, `bz174`, ",
        "`bz175`, `bz268`, `bz271`, `bz272`, `bz84`, `bz85`, `bz107`, `bz108`, `bz109`, ",
        "`bz110`, `bz104`, `bz105`, `bz106`, `bz113`, `bz111`, `bz112`, `bz103`, `bz120`, ",
        "`bz119`, `bz121`, `bz81`, `bz82`, `bz83`",
        "from `ehr_data`",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    EhrData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") EhrData record, @Param("example") EhrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") EhrData record, @Param("example") EhrDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EhrData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_data
     *
     * @mbggenerated
     */
    @Update({
        "update `ehr_data`",
        "set `cid` = #{cid,jdbcType=VARCHAR},",
          "`vid` = #{vid,jdbcType=VARCHAR},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "`gender` = #{gender,jdbcType=VARCHAR},",
          "`birthday` = #{birthday,jdbcType=TIMESTAMP},",
          "`examdate` = #{examdate,jdbcType=TIMESTAMP},",
          "`bz8` = #{bz8,jdbcType=VARCHAR},",
          "`bz10` = #{bz10,jdbcType=VARCHAR},",
          "`bz11` = #{bz11,jdbcType=VARCHAR},",
          "`bz12` = #{bz12,jdbcType=VARCHAR},",
          "`bz16` = #{bz16,jdbcType=VARCHAR},",
          "`bz17` = #{bz17,jdbcType=VARCHAR},",
          "`bz18` = #{bz18,jdbcType=VARCHAR},",
          "`bz171` = #{bz171,jdbcType=VARCHAR},",
          "`bz172` = #{bz172,jdbcType=VARCHAR},",
          "`bz173` = #{bz173,jdbcType=VARCHAR},",
          "`bz174` = #{bz174,jdbcType=VARCHAR},",
          "`bz175` = #{bz175,jdbcType=VARCHAR},",
          "`bz268` = #{bz268,jdbcType=VARCHAR},",
          "`bz271` = #{bz271,jdbcType=VARCHAR},",
          "`bz272` = #{bz272,jdbcType=VARCHAR},",
          "`bz84` = #{bz84,jdbcType=VARCHAR},",
          "`bz85` = #{bz85,jdbcType=VARCHAR},",
          "`bz107` = #{bz107,jdbcType=VARCHAR},",
          "`bz108` = #{bz108,jdbcType=VARCHAR},",
          "`bz109` = #{bz109,jdbcType=VARCHAR},",
          "`bz110` = #{bz110,jdbcType=VARCHAR},",
          "`bz104` = #{bz104,jdbcType=VARCHAR},",
          "`bz105` = #{bz105,jdbcType=VARCHAR},",
          "`bz106` = #{bz106,jdbcType=VARCHAR},",
          "`bz113` = #{bz113,jdbcType=VARCHAR},",
          "`bz111` = #{bz111,jdbcType=VARCHAR},",
          "`bz112` = #{bz112,jdbcType=VARCHAR},",
          "`bz103` = #{bz103,jdbcType=VARCHAR},",
          "`bz120` = #{bz120,jdbcType=VARCHAR},",
          "`bz119` = #{bz119,jdbcType=VARCHAR},",
          "`bz121` = #{bz121,jdbcType=VARCHAR},",
          "`bz81` = #{bz81,jdbcType=VARCHAR},",
          "`bz82` = #{bz82,jdbcType=VARCHAR},",
          "`bz83` = #{bz83,jdbcType=VARCHAR}",
        "where `id` = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EhrData record);

    int batchInsert(List<EhrData> list);
}