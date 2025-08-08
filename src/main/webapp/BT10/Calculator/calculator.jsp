<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Calculator - JSTL</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="BT10-Result" method="post">
  Number 1: <input type="number" name="num1" required><br><br>
  Operation:
  <select name="op">
    <option value="add">Addition (+)</option>
    <option value="sub">Subtraction (-)</option>
    <option value="mul">Multiplication (*)</option>
    <option value="div">Division (/)</option>
  </select><br><br>
  Number 2: <input type="number" name="num2" required><br><br>
  <input type="submit" value="Calculate">
</form>
</body>
</html>
