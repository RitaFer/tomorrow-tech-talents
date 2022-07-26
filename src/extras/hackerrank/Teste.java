package extras.hackerrank;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.util.EntityUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Teste {
    class Globals {
        static String userName = "";
        static String cell = "";
        static String idWhatsApp = "";
    }

    String xpto = obj.getId();
    String xpto2 = Globals.userName;
    String xpto3 = Globals.cell;
    String xpto4 = Globals.idWhatsApp;

    getUserInfo(xpto, xpto2, xpto3);

    public void getUserInfo(String id, String userName, String cell){
        String query = "SELECT user_name, cell_phone FROM sysaid_user WHERE ref_id = '"+id+"'";
        queryExecuter = dbConn.prepareStatement(query);
        res = queryExecuter.executeQuery();
        while (res.next()) {
            userName = res.getString("user_name");
            cell = res.getString("cell_phone");
            verifyNumber(cell, userName);
        }
    }

    public void verifyNumber(String cell, String userName){
        HttpClient httpClient = HttpClientBuilder.create().build();
        try {
            HttpGet get = new HttpGet("https://api.omnie.chat/core/v2/api/wa-number-check/"+cell);
            get.addHeader("access-token", "62bde9dbd53afe9fe99c667e");
            HttpResponse response = httpClient.execute(get);
            HttpEntity entity = response.getEntity();
            String responseGet = EntityUtils.toString(entity);
            JsonNode json = new ObjectMapper().readTree(responseGet);
            String status = json.get("status").asText();
            out.append(status);
            if(status.equals("VALID_WA_NUMBER")){
                out.append("Deu certo aqui");
            }
        } catch(Exception eexx){
            com.ilient.server.IlientConf.logger.error("Problem on " + eexx);
        }
    }
}