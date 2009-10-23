<%-- 
    Document   : index
    Created on : 09/09/2009, 19:53:59
    Author     : neritobaldojunior
--%>
<%@page import="java.util.Date" %>
<%@page import="java.util.GregorianCalendar" %>
<%@page import="java.util.Calendar" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TVBA Application</title>
    </head>
    <body>
        <h1>TVBA Application</h1>
        
        <% Calendar calendar = new GregorianCalendar();
           Date trialTime = new Date();
           calendar.setTime(trialTime); %>

        <% String mensagem = "WebService ativo. Iniciado em "+
                calendar.get(calendar.DATE)+"/"+calendar.get(calendar.MONTH) +"/"+
                calendar.get(calendar.YEAR)+" "+calendar.get(calendar.HOUR)+":"+
                calendar.get(calendar.MINUTE)+":"+calendar.get(calendar.SECOND);
        %>
        <%=mensagem%>
    </body>
</html>
