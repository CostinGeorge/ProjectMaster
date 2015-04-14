<%-- 
    Document   : newjsp
    Created on : Apr 14, 2015, 10:31:07 AM
    Author     : costinmihaita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RequestOverview</title>
    </head>
     <style>
        table, th, td {
        border: 1px solid black;}

       col {
       display: table-column;} 
</style>
    <body>
        <table>
             <colgroup>
                <col span="3" style="background-color:red">
                <col style="background-color:yellow">
             </colgroup>
          <tr>
           <th>Request Number</th>
           <th>Project Name</th>
           <th>Company Name</th>
           <th>Status</th>
         </tr>
          <tr>
           <td>Data from program</td>
           <td>Data from program</td>
            <td>Data from program </td>
            <td>Status of project </td>
          </tr>
         
        </table>
    </body>
</html>
