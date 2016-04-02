<%-- 
    Document   : relatorio_com_parametroù
    Created on : 3-apr-2016, 1.30.30
    Author     : praveen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./ImprimeDepartamentosComParamento">
            <label>Codigo do Departamento</label>
            <input type="text" name="codigo_departamento"/>
            <br/>
            <input type="submit" value="Consultar"/>
        </form>
    </body>
</html>
