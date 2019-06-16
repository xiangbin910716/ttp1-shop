package shop.mapper;

import org.junit.Test;
import pers.zjh.shop.mapper.AdminMapper;
import pers.zjh.shop.pojo.Admin;
import pers.zjh.shop.pojo.AdminExample;
import shop.base.BaseTest;

import javax.annotation.Resource;
import java.util.List;

public class AdminMapperTest extends BaseTest {
    @Resource
    private AdminMapper adminMapper;

    @Test
    public void testselectByExample() {

        AdminExample example = new AdminExample();
        example.setOrderByClause("id desc");
        List<Admin> admins = adminMapper.selectByExample(example);


    }

}
