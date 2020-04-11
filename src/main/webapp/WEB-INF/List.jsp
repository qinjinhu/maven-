<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <a href="getUsers">点我</a>
     <table>
       <tr>
          <td>uid</td>
          <td>uname</td>
          <td>usex</td>
          <td>ubirthday</td>
       </tr>
       <c:forEach items="${user}" var="users">
       <%-- <tr>
          <td>${users.uid}</td>
          <td>${users.uname}</td>
          <td>${users.usex}</td>
          <td><fmt:formatDate value="${users.ubirthday}" pattern="yyyy-MM-dd"/></td>
       </tr> --%>
       <tr>
          <td>${users.Id}</td>
          <td>${users.LoginName}</td>
          <td>${users.Password}</td>
          <td>${users.IsLockout}</td>
       </tr>
       </c:forEach>
     </table>
</body>
</html>