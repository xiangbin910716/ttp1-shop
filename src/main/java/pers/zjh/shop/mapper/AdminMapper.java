package pers.zjh.shop.mapper;

import java.util.List;
import pers.zjh.shop.pojo.Admin;
import pers.zjh.shop.pojo.AdminExample;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}