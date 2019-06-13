import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.net.InetAddress;
import java.net.Socket;
import java.net.*;
import java.io.IOException;
import org.snmp4j.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CameraStatus {

    public boolean isReachable(){
        String addr = "172.16.30.106";
        int openPort = 22;   // openPort =  22 - ssh, 80 or 443 - webserver, 25 - mailserver etc.
        int timeOutMillis = 2000;

        try {
            try (Socket soc = new Socket()) {
                soc.connect(new InetSocketAddress(addr, openPort), timeOutMillis);
            }
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    @Test
    public void testReachable(){

        assertEquals("Error!!!",true,isReachable());


    }



}





