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
        <form action="insert" method="post">            
        <div class="center">            
        <fieldset style="width: 400px; text-align: left">            
            <legend align="center">Register Here</legend>
            <table cellspacing="0px" cellpadding="10px" >
                <tr>
                    <th>
                        Name
                    </th>
                    <td>
                        ::
                    </td>
                    <td>
                        <input type="text" name="name" placeholder="Enter Name" required>
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
                        <input type="email" name="email" placeholder="Enter Mail" required>
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
                        <input type="password" name="pass" placeholder="Enter Password" required>
                    </td>
                </tr>
                <tr>
                    <th>
                        Confirm Password
                    </th>
                    <td>
                        ::
                    </td>
                    <td>
                        <input type="password" name="cpass" placeholder="Enter Confirm Password" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center">
                        <input type="submit" name="submit" value="Register Now">
                    </td>
                </tr>
            </table>            
        </fieldset>
        </div>
        </form>
    </body>
</html>
