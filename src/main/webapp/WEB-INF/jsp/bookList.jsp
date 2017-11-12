<%--
  Created by IntelliJ IDEA.
  User: suyoun
  Date: 2017. 11. 8.
  Time: PM 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>BookList</h2>
<table border="1" cellspacing="0">
    <caption>book list Sample</caption>
    <colgroup>
       <col width="*" />
       <col width="10%" />
       <col width="15%" />
       <col width="10%" />
       <col width="10%" />
       <col width="10%" />
    </colgroup>
    <thead>
        <tr>
            <th scope="col">title</th>
            <th scope="col">isbn</th>
            <th scope="col">writer</th>
            <th scope="col">pag</th>
            <th scope="col">price</th>
            <th scope="col">publish_date</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.title}</td>
                <td>${list.isbn}</td>
                <td>${list.writer}</td>
                <td>${list.pag}</td>
                <td>${list.price}</td>
                <td>${list.publish_date}</td>
            </tr>
        </c:forEach>
    </tbody>

</table>
</body>
</html>
