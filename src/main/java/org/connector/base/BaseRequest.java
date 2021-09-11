package org.connector.base;

import org.connector.filter.FilterService;
import org.connector.filter.IFilter;
import org.connector.filter.KeyFilter;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class BaseRequest implements IRequest{
    private List<Key> keys;
    private String baseUrl;
    private KeyFilter keyFilter;
    private IFilter filter;

    public BaseRequest(List<Key> keys, String baseUrl) {
        this.keys = keys;
        this.baseUrl = baseUrl;
        this.keyFilter = new KeyFilter();
        filter = new FilterService();
    }

    @Override
    public JSONArray request(String endPoint, List<Parameter> parameters,String method) {
        String key = filter.getToken(keys);
        String strUrl = baseUrl + endPoint + filter.listToString(parameters);

        try {
            URL url = new URL(strUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);
            connection.setRequestProperty("Authorization", key);
            StringBuilder sb = new StringBuilder();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null)
                sb.append(line + "\n");
            JSONObject response = new JSONObject(sb.toString());
            JSONArray arr = response.getJSONArray("data");
            return arr;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return new JSONArray();
        } catch (IOException e) {
            e.printStackTrace();
            return new JSONArray();
        }
    }

    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
