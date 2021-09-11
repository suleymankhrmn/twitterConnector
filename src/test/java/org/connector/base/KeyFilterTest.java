package org.connector.base;

import org.connector.filter.KeyFilter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeyFilterTest {

    @Test
    void getToken() {
        List<Key> keys = new ArrayList<>();
        Key key = new Key("token","mmmqqqmm");
        keys.add(key);
        KeyFilter keyFilter = new KeyFilter();
        String findKey = keyFilter.getToken(keys);
        assertEquals(key.getValue(),findKey);

    }
}