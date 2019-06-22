package pers.zjh.shop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.zjh.shop.pojo.Role;
import pers.zjh.shop.service.RoleService;
import pers.zjh.shop.util.Page;

import java.util.List;

@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping("getRoleList")
    public String list(Model model, Page page){
        // 取数据前设置分页参数
        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Role> roles = roleService.list();
        // 获取数据总记录数
        int total = (int) new PageInfo<>(roles).getTotal();
        // 给分页类设置参数：总页数
        page.setTotal(total);
        model.addAttribute("page",page);
        model.addAttribute("roles",roles);
        return "admin/listRole";
    }

    @RequestMapping("role_delete")
    public String delete(Integer id){
        if (null == id){
            return "fail";
        }
        roleService.delete(id);
        return "redirect:/role/getRoleList";
    }

    /**
     * @Describe    添加管理员用户
     * @param       role,model
     * @return
     */
    @RequestMapping("role_add")
    public String add(Role role,Model model){
        if (null == role){
            return "fail";
        }
        String name = role.getRoleName();
        // 标识数据库中是否已经存在即将添加的name
        boolean isExist = roleService.exist(name);
        if (isExist){
            String s = "角色名已经存在";
            model.addAttribute("message",s);
            return "role/addRole";
        }
        roleService.add(role);
        return "redirect:/role/getRoleList";
    }
}
