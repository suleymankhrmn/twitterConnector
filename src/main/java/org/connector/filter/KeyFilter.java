package org.connector.filter;

import org.connector.base.Key;

import java.util.List;
import java.util.Optional;

public class KeyFilter {

    /**
     *
     * @param keys String
     * @return String
     */
    public String getToken(List<Key> keys){
       Optional<Key> findKey = keys.stream().filter(key -> key.getName().equals("token")).findFirst();
       return findKey.get().getValue();
    }
}
