package com.java.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Class to check and validate IpAddress
*/
public class IpAddress {
    private List<Integer> startOfIp;
    private List<Integer> endOfIp;

    /*Checks if the input Ip contains a range of Ip Address or a single Ip Address*/
    public IpAddress(String inputIp) {
        if (inputIp.indexOf('-') != -1) {
            String[] ranges = inputIp.split("-");

            this.startOfIp = Arrays
                            .stream(ranges[0].split("\\."))
                            .map(e -> Integer.parseInt(e))
                            .collect(Collectors.toList());

            this.endOfIp = Arrays
                            .stream(ranges[1].split("\\."))
                            .map(e -> Integer.parseInt(e))
                            .collect(Collectors.toList());
        }
        else {
            this.startOfIp = this.endOfIp = Arrays
                                            .stream(inputIp.split("\\."))
                                            .map(e -> Integer.parseInt(e))
                                            .collect(Collectors.toList());
        }
    }

    /*Validates if the input Ip Address matches Ip Address in rules*/
    public boolean checkIpRange(IpAddress inputIpAddress) {
        for (int i=0; i<4; i++) {
            if (inputIpAddress.startOfIp.get(i) < this.startOfIp.get(i) || inputIpAddress.endOfIp.get(i) > this.endOfIp.get(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "com.java.main.IpAddress{" +
                "startofIp =" + startOfIp +
                ", endofIP =" + endOfIp +
                '}';
    }
}
