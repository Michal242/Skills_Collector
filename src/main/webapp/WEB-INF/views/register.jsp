<%--
  Created by IntelliJ IDEA.
  User: michal
  Date: 25.05.2019
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rejestracja</title>
</head>

<body>
<jsp:include page="fragments/header.jsp"/>

<h1>Rejestracja</h1>
<form method="post" action="register">
    <p>Nazwa użytkownika: <input type="text" name="username" required/>
    </p>

    <p>
        Hasło: <input type="password" name="password" required/>
    </p>

    <p>
        Imię: <input type="text" name="firstname"/>
    </p>

    <p>
        Nazwisko: <input type="text" name="lastname"/>
    </p>

    <input type="submit" value="Zarejestruj"/>

</form>


<jsp:include page="fragments/footer.jsp"/>


</body>


</html>