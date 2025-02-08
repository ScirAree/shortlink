package org.nageoffer.shortlink.admin.service;

/**
 * @author aree
 * 2025/2/8
 */

import com.baomidou.mybatisplus.extension.service.IService;
import org.nageoffer.shortlink.admin.dao.entity.UserDO;
import org.nageoffer.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {
    /**
     *根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 返回参数实体
     */
    UserRespDTO getUserByUsername(String username);
}
