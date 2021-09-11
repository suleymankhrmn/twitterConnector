package org.connector.filter;

import org.connector.base.Key;
import org.connector.base.Parameter;

import java.io.UnsupportedEncodingException;
import java.util.List;

public class FilterService implements IFilter{
    @Override
    public String getToken(List<Key> keys) {
        return new KeyFilter().getToken(keys);
    }

    @Override
    public String listToString(List<Parameter> parameters) {
        try {
            return new ParameterFilter().listToString(parameters);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
