<!--ENROLL NO. : SR21BSIT156
    NAME       : RAJ JIGNESHBHAI SHAH
    CLASS      : SYIT (SEM 3)
    DIV        : B
    FACULTY    : DR. RUPAL MAM
    SUBJECT    : JSP ASS 10
    AIM        : ONLINE FOOD ORDERING SYSTEM
    DATE       : 22/11/2022
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MY ACCOUNT</title>
        <style>
            .center
                {
                    position: absolute;
                    top: 50%;
                    left: 50%;
                    transform: translate(-50%,-50%);
                 }
        </style>
    </head>
    <body>
        <%
                String name=(String)session.getAttribute("name");
                String email=(String)session.getAttribute("email");
                String password=(String)session.getAttribute("password");
            
        %>
         <%@include file="navbar.jsp" %>
        <form action="myaccountupdate" method="post">            
        <div class="center">            
        <fieldset style="width: 400px; text-align: left">            
            <legend align="center">Update Profile</legend>
            <table cellspacing="0px" cellpadding="10px" >
                <tr>
                    <th>
                        Name
                    </th>
                    <td>
                        ::
                    </td>
                    <td>
                        <input type="text" name="name" value="<%=name%>" required>
                    </td>
                </tr>
                <tr>
                    <th>
                        Email
                    </th>
                    <td>
                        ::
                    </td>
                    <td>
                        <input type="email" name="email" value="<%=email%>" required>
                    </td>
                </tr>
                <tr>
                    <th>
                        Password
                    </th>
                    <td>
                        ::
                    </td>
                    <td>
                        <input type="password" name="pass" value="<%=password%>" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center">
                        <input type="submit" name="submit" value="UPDATE">
                    </td>
                </tr>
            </table>            
        </fieldset>
        </div>
        </form>
    </body>
</html>
