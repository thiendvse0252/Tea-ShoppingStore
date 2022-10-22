<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page | Milk Tea 47</title>
    </head>
    <body>
        <h1>Error: <%= session.getAttribute("ERROR") %> </h1>
                
    </body>
</html>
