package org.connector.filter;

import org.connector.base.Key;
import org.connector.base.Parameter;

import java.util.List;

public interface IFilter {
    String getToken(List<Key> keys);
    String listToString(List<Parameter> parameters);
}
