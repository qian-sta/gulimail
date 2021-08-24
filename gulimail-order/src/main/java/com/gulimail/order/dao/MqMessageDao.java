package com.gulimail.order.dao;

import com.gulimail.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author skydraggern
 * @email skydraggern@gmail.com
 * @date 2021-08-24 23:44:08
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
