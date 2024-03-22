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
        <form action="insertrestaurant" method="post">
            <div class="center">
        <fieldset style="width: 400px">
            <legend align="center"> Add Restaurant </legend>
             <table cellspacing="0px" cellpadding="10px">
                <tr>
                    <th>
                        Restaurant Name
                    </th>
                    <td>
                        ::
                    </td>
                    <td>
                        <input type="text" name="restaurant" placeholder="Enter Restaurant Name">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: right">
                        <input type="submit" name="submit" value="ADD NOW">
                    </td>
                    <td style="text-align: left">
                        <button><a href="viewrestaurant.jsp" style="text-decoration: none">VIEW Restaurant</a></button>
                    </td>
                    
                </tr>
            </table>
        </fieldset>
                <br>
                <div align="center">
                    <button><a href="home.jsp" style="text-decoration: none">BACK</a></button>
                </div>
        </div>
        </form>
    </body>
</html>