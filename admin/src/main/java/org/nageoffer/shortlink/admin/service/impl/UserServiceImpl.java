package org.nageoffer.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.nageoffer.shortlink.admin.dao.entity.UserDO;
import org.nageoffer.shortlink.admin.dao.mapper.UserMapper;
import org.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import org.nageoffer.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/*
  @author aree
 * 2025/2/8
 */

/**
 * 用户接口实现层
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {


    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 返回参数实体
     */
    @Override
    public UserRespDTO getUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        UserRespDTO result = new UserRespDTO();
        BeanUtils.copyProperties(userDO,result);
        return result;
    }
}
