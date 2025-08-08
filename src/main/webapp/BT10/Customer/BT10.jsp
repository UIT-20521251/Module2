<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
    <style>
        table { border-collapse: collapse; width: 600px; margin: 20px auto; box-shadow: 0 0 10px #ccc; }
        th, td { border: 1px solid #ccc; padding: 10px; text-align: left; }
        th { background-color: #f2f2f2; text-align: center; }
        img { width: 80px; height: 80px; object-fit: cover; }
    </style>
</head>
<body>
<h2 style="text-align:center;">Danh sách khách hàng</h2>
<table>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customerList}" varStatus="status">
        <tr>
            <td>${customer.getName()}</td>
            <td>${customer.getBirthDate()}</td>
            <td>${customer.getAddress()}</td>
            <td><img src="${customer.getImage()}" alt="avatar"></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
