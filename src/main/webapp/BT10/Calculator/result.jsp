<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%
    double num1 = Double.parseDouble(request.getParameter("num1"));
    double num2 = Double.parseDouble(request.getParameter("num2"));
    String op = request.getParameter("op");
    request.setAttribute("num1", num1);
    request.setAttribute("num2", num2);
    request.setAttribute("op", op);
%>

<c:choose>
    <c:when test="${op == 'add'}">
        <c:set var="result" value="${num1 + num2}" />
    </c:when>
    <c:when test="${op == 'sub'}">
        <c:set var="result" value="${num1 - num2}" />
    </c:when>
    <c:when test="${op == 'mul'}">
        <c:set var="result" value="${num1 * num2}" />
    </c:when>
    <c:when test="${op == 'div'}">
        <c:if test="${num2 != 0}">
            <c:set var="result" value="${num1 / num2}" />
        </c:if>
        <c:if test="${num2 == 0}">
            <c:set var="result" value="Cannot divide by zero" />
        </c:if>
    </c:when>
</c:choose>

<h2>Result:</h2>
<h3>Kết quả:</h3>
<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>
<c:if test="${empty error}">
    <p>${firstOperand} ${symbol} ${secondOperand} = ${result}</p>
</c:if>


<a href="index.jsp">Back</a>
</body>
</html>
