package com.gulimail.coupon.dao;

import com.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author skydraggern
 * @email skydraggern@gmail.com
 * @date 2021-08-24 23:33:00
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
