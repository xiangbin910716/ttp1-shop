package pers.zjh.shop.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pers.zjh.shop.mapper.RoleMapper;
import pers.zjh.shop.pojo.Role;
import pers.zjh.shop.pojo.RoleExample;
import pers.zjh.shop.pojo.Role;

import pers.zjh.shop.service.RoleService;

import java.util.List;

/**
 * @Description:    管理员业务逻辑接口实现层
 * @Author: Zhujinghui
 * @CreateDate: 2018/10/27 14:05
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    /**
     * @Describe    添加管理员
     * @param       role
     * @return      void
     */
    @Override
    public void add(Role role) {

        roleMapper.insert(role);
    }

    /**
     * @Describe    根据id 删除管理员
     * @param        id
     * @return      void
     */
    @Override
    public void delete(Integer id) {
        
        roleMapper.deleteByPrimaryKey(id);
    }

    /**
     * @Describe    更新管理员信息
     * @param       role
     * @return      void
     */
    @Override
    public void update(Role role) {
        roleMapper.updateByPrimaryKeySelective(role);
    }

    /**
     * @Describe    根据id 查询管理员
     * @param       id
     * @return      role
     */
    @Override
    public Role get(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    /**
     * @Describe    查询所有管理员
     * @param
     * @return      List<role>
     */
    @Override
    public List<Role> list() {
        RoleExample example = new RoleExample();
        example.setOrderByClause("id desc");
        List<Role> roles = roleMapper.selectByExample(example);
        return roles;
    }


    /**
     * @Describe    根据参数name 判断数据库是否存在相同的name 值
     * @param       name
     * @return      boolean
     */
    @Override
    public boolean exist(String name) {
        RoleExample example = new RoleExample();
        example.createCriteria().andNameEqualTo(name);
        List<Role> roles = roleMapper.selectByExample(example);
        if(roles.isEmpty()){
            return false;
        }
        return true;
    }

}
