/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SMS;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author Kiran
 */
public class Sms {
    

    public static final String ACCOUNT_SID = "ACdfeb38dde54b640596eeaf6da2f75eda";
    public static final String AUTH_TOKEN = "f33f2bae6d9e77e91332e7e9d77e2c35";
    public final String fromNum = "+17622310070";
    public String toNum;
    public String body;

    public Sms(String toNum, String body) {
        this.toNum = toNum;
        this.body = body;
        try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("Body", body));
            params.add(new BasicNameValuePair("To", toNum));
            params.add(new BasicNameValuePair("From", fromNum));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message);
        } catch (TwilioRestException e) {
            System.out.println(e);
        }
    }
    
   
}
