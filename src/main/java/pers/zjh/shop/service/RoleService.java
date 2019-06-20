package pers.zjh.shop.service;

import pers.zjh.shop.pojo.Admin;
import pers.zjh.shop.pojo.Role;

import java.util.List;

/**
 * @Description:    管理员业务逻辑接口
 * @Author: XiangWei
 * @CreateDate: 2018/10/27 13:42
 */

public interface RoleService {

    /**
     * @Describe    添加角色
     * @param       role
     * @return      void
     */
    void add(Role role);

    /**
     * @Describe    根据id 删除角色
     * @param        id
     * @return      void
     */
    void delete(Integer id);

    /**
     * @Describe    更新角色
     * @param        role
     * @return      void
     */
    void update(Role role);

    /**
     * @Describe    根据id 查询角色
     * @param       id
     * @return      Role
     */
    Role get(Integer id);

    /**
     * @Describe    查询所有角色
     * @param
     * @return     List<Role>
     */
    List<Role> list();


    /**
     * @Describe    根据参数name 判断数据库是否存在相同的name 值
     * @param       name
     * @return      boolean
     */
    boolean exist(String name);

}
