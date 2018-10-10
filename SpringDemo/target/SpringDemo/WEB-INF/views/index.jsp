<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
 <head>
   <title>Spring Demo</title>
 </head>
 <body>
<h2>User Data</h2>
 <form:form action="login" modelAttribute="user" method="POST">
     <form:label path="username">Name</form:label>
     <form:input path="username" /> <br><br>
     <form:label path="password">Password</form:label>
     <form:input path="password" />
<input type="submit" value="Submit"/>
</form:form>
   </body>
  </html>