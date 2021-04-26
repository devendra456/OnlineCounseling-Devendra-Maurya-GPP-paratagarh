<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>LogOut</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script>
        function logout()
        {
            window.history.forward();
            window.setTimeout("window.location.href='../login.jsp'",1000);
        }
        </script>
    </head>
    <body onload="logout()" style="background:rosybrown">
        <span style="font-size: 100px;color:white">Loading....</span>
    </body>
</html>
