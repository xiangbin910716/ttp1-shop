<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/10/18
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>

<div class="workingArea">
    <h1 class="label label-info" >角色管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv" style="margin-top: 100px; margin-left: 50px; margin-right: 50px">
        <table class="table table-bordered table-hover  table-condensed">
            <thead>
                <tr class="success">
                    <th>ID</th>
                    <th>角色名称</th>
                    <th>删除</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${roles}" var="r">
                    <tr>
                        <td>${r.id}</td>
                        <td>${r.name}</td>
                        <td><a deleteLink="true" href="/role/role_delete?id=${r.id}"><span
                                class=" 	glyphicon glyphicon-trash"></span></a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div>
</div>

