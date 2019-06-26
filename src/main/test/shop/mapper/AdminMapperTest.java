package shop.mapper;

import org.junit.Test;
import pers.zjh.shop.mapper.AdminMapper;
import pers.zjh.shop.pojo.Admin;
import shop.base.BaseTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminMapperTest extends BaseTest {
    @Resource
    private AdminMapper adminMapper;

    @Test
    public void testselectByExample() {

//        AdminExample example = new AdminExample();
//        example.setOrderByClause("id desc");
        Map param = new HashMap();
        param.put("name","xiangbin");
        param.put("password","123");
        List<Admin> admins = adminMapper.selectByExample(param);
        System.out.println(admins);


    }

}
