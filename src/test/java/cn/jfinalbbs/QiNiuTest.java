package cn.jfinalbbs;

import com.qiniu.api.auth.AuthException;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.io.IoApi;
import com.qiniu.api.io.PutExtra;
import com.qiniu.api.rs.PutPolicy;
import org.junit.Test;

/**
 * Created by liuyang on 15/4/13.
 */
public class QiNiuTest {

    @Test
    public void init() throws AuthException {
        String uptoken = new PutPolicy("jfinalbbs").token(new Mac("9g8ftmtOyy4cSWymIAzsG2y3QDtgpvB5PXwVZPDY", "UHQMfXIMwBQAkykO3gwtCn7dnaJWCpUfqKgnlmFl"));
        System.out.println(IoApi.putFile(uptoken, "1429073513468071618.png", "/Users/liuyang/Desktop/100.png", new PutExtra()));
    }

}
