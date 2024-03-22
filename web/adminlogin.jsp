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
        <title>JSP Page</title>
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
        <%@include file="navbar.jsp" %>
        <!--<h2>Admin Login</h2>-->
        <form action="validation" method="post">
            
    <div class="center">
        <fieldset style="width: 380px; height: 180px">
            <legend align="center"><strong>Login Here</strong></legend>
        <table cellspacing="0px" cellpadding="15px" >
            <tr>
                <th>
                    UserName
                </th>
                <td>
                    ::
                </td>
                <td>
                    <input type="text" name="admin" placeholder="Enter Name" required>                    
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
                    <input type="password" name="pass" placeholder="Enter Pass" required>
                </td>
            </tr>
            <tr>
                <td colspan="3" align="center">
                    <input type="submit" name="submit" value="Login Now">
                </td>
            </tr>
        </table>
        </fieldset>
        </div>
        </form>
    </body>
</html>
