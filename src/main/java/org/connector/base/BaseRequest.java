package org.connector.base;

import org.json.JSONArray;

import java.util.List;

public class BaseRequest implements IRequest{
    private List<Key> keys;
    private String baseUrl;
    private KeyFilter keyFilter;

    public BaseRequest(List<Key> keys, String baseUrl) {
        this.keys = keys;
        this.baseUrl = baseUrl;
        this.keyFilter = new KeyFilter();
    }

    @Override
    public JSONArray request(String endPoint, List<Parameter> parameters) {
        String key = keyFilter.getToken(keys);

        return null;
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
