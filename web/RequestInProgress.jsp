<%-- 
    Document   : RequestInProgress
    Created on : Apr 9, 2015, 1:17:24 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Waiting</title>
    </head>
    <body>
        <%! String projectName = ""; String companyName; String rno;%>
        <% projectName = (String) request.getSession().getAttribute("pname"); 
        companyName = (String) request.getSession().getAttribute("cname");
        rno = (String) request.getSession().getAttribute("rnum");%>
        <p> Project Name: <%= projectName%> </p>
        <p> Company: <%= companyName%> </p>
        <p> Project Number: <%= rno%> </p>
        <form action="RequestEdit.jsp">
            <button type="Submit">Edit</button>
        </form>
    </body>
</html>
