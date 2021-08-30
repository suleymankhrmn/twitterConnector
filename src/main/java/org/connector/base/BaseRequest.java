package org.connector.base;

import org.json.JSONArray;

import java.util.List;

public class BaseRequest implements IRequest{
    private List<Key> keys;
    private String baseUrl;

    public BaseRequest(List<Key> keys, String baseUrl) {
        this.keys = keys;
        this.baseUrl = baseUrl;
    }

    @Override
    public JSONArray request(String endPoint, List<Parameter> parameters) {
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
