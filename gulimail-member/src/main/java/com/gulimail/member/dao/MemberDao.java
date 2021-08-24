package com.gulimail.member.dao;

import com.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author skydraggern
 * @email skydraggern@gmail.com
 * @date 2021-08-24 23:37:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
