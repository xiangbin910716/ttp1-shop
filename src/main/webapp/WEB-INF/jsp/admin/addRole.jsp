<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/10/18
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@include file="../include/admin/adminHeader.jsp"%>

<script>
    $(function() {
        $("#addForm").submit(function() {
            if (!checkEmpty("role_name", "角色名称"))
                return false;
            // if (!checkEmpty("type", "角色"))
            //     return false;
            // if (!checkEmpty("password", "密码"))
            //     return false;
            return true;
        });
    });
    $(function(){
        <c:if test="${!empty message}">
            $(".errorMessage").html("${message}");
        </c:if>
    });
</script>

<div class="panel panel-warning addDiv" style="margin-top: 100px; margin-left: 50px; margin-right: 50px">
    <div class="panel-heading">新增角色</div>

    <div class="addErrorMessageDiv">
        <div class="alert alert-info">
            <span class="errorMessage"></span>
        </div>
    </div>

    <div class="panel-body">
        <form method="post" id="addForm" action="/role/role_add">
            <table class="addTable">
                <tr>
                    <td>ID</td>
                    <td><input id="id" name="id" type="Integer"
                               class="form-control"></td>
                </tr>
                <tr>
                    <td>角色名称</td>
                    <td><input id="roleName" name="roleName" type="text"
                               class="form-control"></td>
                </tr>

                <tr class="submitTR">
                    <td colspan="2" align="center">
                        <button type="submit" class="btn btn-success">提 交</button>
                        <button type="reset" class="btn btn-primary">重置</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>