package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.UserThirdAccount;
import com.dianrong.common.uniauth.server.data.entity.UserThirdAccountExample;
import com.dianrong.common.uniauth.server.support.audit.MapperAudit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MapperAudit
public interface UserThirdAccountMapper {
  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int countByExample(UserThirdAccountExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int deleteByExample(UserThirdAccountExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int deleteByPrimaryKey(Long id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int insert(UserThirdAccount record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int insertSelective(UserThirdAccount record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  List<UserThirdAccount> selectByExample(UserThirdAccountExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  UserThirdAccount selectByPrimaryKey(Long id);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int updateByExampleSelective(@Param("record") UserThirdAccount record,
      @Param("example") UserThirdAccountExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int updateByExample(@Param("record") UserThirdAccount record,
      @Param("example") UserThirdAccountExample example);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int updateByPrimaryKeySelective(UserThirdAccount record);

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * user_third_account
   *
   * @mbggenerated Tue Jun 06 19:39:54 CST 2017
   */
  int updateByPrimaryKey(UserThirdAccount record);
}
