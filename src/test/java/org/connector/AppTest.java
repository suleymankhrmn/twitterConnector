package org.connector;

import static org.junit.Assert.assertTrue;

import org.connector.base.BaseRequest;
import org.connector.base.Key;
import org.connector.base.Parameter;
import org.json.JSONArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void run(){
        List<Key> keys = new ArrayList<>();
        List<Parameter> parameters = new ArrayList<>();
        keys.add(new Key("token","AAAAAAAAAAAAAAAAAAAAADGMNwEAAAAA8gVVbo80D6MyTonfu%2FNTkfagtFI%3DCYvXxvn04ZddWm0TuODYwIJc51eOGqPxbGUepAJFIM3uxKrN00"));
        parameters.add(new Parameter("tweet.fields", "created_at"));
        BaseRequest request = new BaseRequest(keys,"https://api.twitter.com/2");
        String userId = "1367062594222231553";
        String endpoint = "/users/" + userId + "/following";
        JSONArray response = request.request(endpoint,parameters,"GET");
        System.out.println(response);
        assertTrue( true );
    }
}
