<%-- 
    Document   : logout
    Created on : Aug 6, 2019, 11:30:16 PM
    Author     : nadir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    <script>
        function logout()
        {
            window.history.forward();
            window.setTimeout("window.location.href='../index.jsp'",1000);
        }
        </script>
    </head>
    <body onload="logout()" style="background: saddlebrown">
        <span style="font-size: 100px;color: whitesmoke">Loading...</span>
    </body>
</html>
