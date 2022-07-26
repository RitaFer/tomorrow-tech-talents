<%-- Token.jsp --%>             <%-- Comment Tag --%>

<%@ page language="java" %>
<%! int i = 0; %>
<%
    out.print("");
    i++;
    out.print("The value of i is now:  " + i);
    out.print("");
    ["'"+i+"'"]
%>

<%--
<%@ page language="java" %>       <%-- Directive Tag --%>

<%! int count = 0; %>             <%-- Declaration Tag --%>
<% count++; %>                    <%-- Scriptlet Tag --%>
Welcome! You are visitor number
<%= count %>                      <%-- Expression Tag --%>
--%>
