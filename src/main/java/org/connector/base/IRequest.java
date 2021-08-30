package org.connector.base;

import org.json.JSONArray;

import java.util.List;

public interface IRequest {
    JSONArray request(String endPoint, List<Parameter> parameters);
}
