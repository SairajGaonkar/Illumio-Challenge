package com.java.main;

/*Class to check and validate Port number*/

public class Port {
    private int startOfPort;
    private int endOfPort;

    public Port(String port) {
        if (port.indexOf('-') != -1) {
            startOfPort = Integer.parseInt(port.split("-")[0]);
            endOfPort = Integer.parseInt(port.split("-")[1]);
        }
        else {
            startOfPort = Integer.parseInt(port);
            endOfPort = Integer.parseInt(port);
        }
    }

    public boolean isPortInRange(Port port) {
        return port.startOfPort >= this.startOfPort && port.endOfPort <= this.endOfPort;
    }
}
