<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 07/04/2026
  Time: 3:41 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>

<h3>Xin chào, ${loggedUser}! Vai trò: ${role}</h3>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Product</th>
        <th>Total</th>
        <th>Date</th>
    </tr>

    <c:forEach var="o" items="${orders}">
        <tr>
            <td>${o.id}</td>
            <td>${o.product}</td>
            <td>
                <c:out value="${o.total}"></c:out>
            </td>
            <td>
                <fmt:formatDate value="${o.date}" pattern="dd/MM/yyyy"/>
            </td>
        </tr>
    </c:forEach>
</table>

<p>Tổng lượt xem: ${totalViewCount}</p>

<a href="logout">Đăng xuất</a>

</body>
</html>
