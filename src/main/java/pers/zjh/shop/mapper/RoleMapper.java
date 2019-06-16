package pers.zjh.shop.mapper;

import java.util.List;
import pers.zjh.shop.pojo.Role;
import pers.zjh.shop.pojo.RoleExample;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}