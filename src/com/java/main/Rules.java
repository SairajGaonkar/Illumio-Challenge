package com.java.main;

/*
Creates a rule based on input file
 */
public class Rules {
    private String direction;
    private String protocol;
    private Port port;
    private IpAddress ipAddress;

    public Rules(String direction, String protocol, String port, String ip) {
        this.direction = direction;
        this.protocol = protocol;
        this.port = new Port(port);
        this.ipAddress = new IpAddress(ip);
    }

    @Override
    public String toString() {
        return "com.java.main.Rules{" +
                "direction='" + direction + '\'' +
                ", protocol='" + protocol + '\'' +
                ", port=" + port +
                ", ipAddress=" + ipAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }

        Rules inputRules = (Rules) o;

        return (
                inputRules.direction.equals(this.direction) &&
                inputRules.protocol.equals(this.protocol) &&
                inputRules.port.isPortInRange(this.port) &&
                inputRules.ipAddress.checkIpRange(this.ipAddress)
        );


    }
}
