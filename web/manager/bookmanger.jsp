<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/10/19
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../common/layui.jsp"%>
<head>
    <title>图书管理</title>
</head>
<body>

<%--body<table>--%>
<%--    ${requestScope.books}--%>
<%--<c:forEach items="${requestScope.books}" var="book">--%>
<%--    <tr>--%>
<%--        <td>${book.Nname}</td>--%>
<%--        <td>${book.author}</td>--%>
<%--        <td>${book.price}</td>--%>
<%--        <td>${book.publish}</td>--%>
<%--    </tr>--%>


<%--</c:forEach>--%>

<%--</table>--%>
<table id="demo" lay-filter="test"></table>

<script src="/layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: 'http://localhost:8080/web书城/manger/bookServlet?action=queryList' //数据接口
            ,parseData:function (res) {
                // 处理返回数据格式不正确
                return {
                    "code":0,
                    "data": res
                }
            }
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'nName', title: '书名', width:'20%', fixed:'left',edit:'text'}
                ,{field: 'author', title: '作者', width:'20%',edit:'text'}
                ,{field: 'price', title: '价格', width:'20%', sort: true,edit: 'text'}
                ,{field: 'publish', title: '出版社', width: '30%',edit: 'text'},
                { title: '操作',align:'center',width: '10%',templet:function(){
                        return  `<div><a href="javascript:;" class="delete"><button class="layui-btn layui-btn-danger layui-btn layui-btn-sm" lay-event="del">删除</button> </a>
                            <a href="javascript:;" class="delete"><button class="layui-btn layui-btn-normal layui-btn-sm" lay-event="del">添加</button> </a>
                        </div>`
                    }
                }
            ]]
        });
    });

</script>
</body>
</html>
