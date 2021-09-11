package org.connector.filter;

import org.connector.base.Parameter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public class ParameterFilter {


    public String listToString(List<Parameter> parameters) throws UnsupportedEncodingException {
        if(parameters == null)
            throw new NullPointerException("parameters is not null");
        StringBuilder strParams = new StringBuilder();
        for (Parameter parameter:parameters) {
            if(strParams.length() == 0)
                strParams.append('?');
            else
                strParams.append('&');
            strParams.append(URLEncoder.encode(parameter.getName(),"UTF-8"));
            strParams.append('=');
            strParams.append(URLEncoder.encode(parameter.getValue(),"UTF-8"));
        }
        return strParams.toString();
    }

}
