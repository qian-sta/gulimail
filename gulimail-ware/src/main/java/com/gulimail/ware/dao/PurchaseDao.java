package com.gulimail.ware.dao;

import com.gulimail.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author skydraggern
 * @email skydraggern@gmail.com
 * @date 2021-08-24 23:48:27
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
