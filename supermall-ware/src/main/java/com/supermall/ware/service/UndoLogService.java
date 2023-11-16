package com.supermall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.supermall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author dengxin
 * @email dengxin0807@gmail.com
 * @date 2023-11-16 19:37:29
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

