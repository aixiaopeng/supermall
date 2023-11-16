package com.supermall.order.dao;

import com.supermall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author dengxin
 * @email dengxin0807@gmail.com
 * @date 2023-11-16 19:34:07
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
