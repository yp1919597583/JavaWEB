<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/7
  Time: 1:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String bae = request.getScheme() + "://" + request.getServerName() + ":" +request.getServerPort() + request.getContextPath() + "/";
%>
<base href="<%=bae%>">