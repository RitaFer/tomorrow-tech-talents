<%@ page import="java.sql.*" %>
<%@ page import="com.ilient.server.*" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.ZoneId" %>
<%@ page import="java.util.Random" %>
<%@ page import="java.awt.datatransfer.DataFlavor" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Verificacao de Existencia</title>
</head>
<body>
<%
    String email = request.getParameter("mail");
    String user = request.getParameter("user");
%>

<%= "O e-mail informado foi: "+email %>
<br>
<%= "O usuário informado foi: "+user %>

<%!
  ResultSet isCreated(String email, String user) {
  String query = "select * from sysaid_user where email_adress = '" + email + "' and user_name = '" + user + "'" ;
  try{
      queryExecuter =  dbConn.prepareStatement(query);
      res = queryExecuter.executeQuery();
      return res;
  } catch(Exception eee){
      IlientConf.logger.error("Problemas na execução do isCreated() -->",eee);
  } return res;
  }
%>
 
O resultado do banco é: <%isCreated(email, user)%>

<%!
    static Integer getRandomToken() {
        Random ran = new Random();
        int token = ran.nextInt(9999 - 1000 + 1);
        return token;
    }

    static LocalDateTimeeId.of("America/Sao_Paulo");
        LocalDateTime lt = Local getTimeToken() {
            ZoneId zid = ZonDateTime.now(zid);
        return lt;
    }
%>

<%! 
    int token = getRandomToken();
    LocalDateTime tokenTime = getTimeToken();
    tokenGenerator(email, user, token, tokenTime);
%>

<%! 
    void tokenGenerator(String email, String user, int token, LocalDateTime tokenTime) {
    String query = "UPDATE sysaid_user set user_cust_token = "+token+", user_cust_token_date = "+tokenTime+" where email_adress = "+email+" and user_name = "+user;
    try{
        queryExecuter =  dbConn.prepareStatement(query);
        res = queryExecuter.executeQuery();
        SendMail.sendMail([email], "Recuperação de Senha", "Insira o token para redefinir uma nova senha ="+token, null, "UTF-8", null, "sysaid774136508_trial", null, null, "LTR");
    } catch(Exception eee){
        IlientConf.logger.error("Problemas na execução do tokenGenerator() -->", eee);
    } return res;
    }

    boolean send = SendMail.sendMail(teste, "RecuperaÃ§Ã£o de Senha", "Insira o token para redefinir uma nova senha ="+String.valueOf(token), null, "UTF-8", null, "sysaid774136508_trial", null, null, "LTR");

%>
</body>
</html>