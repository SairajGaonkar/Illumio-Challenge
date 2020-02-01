package com.java.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
/*
The main Firewall Class
*/
public class Firewall {

    /*To store all the rules from input file*/
    HashSet<Rules> rule;

    /*Firewall constructor to get input file path*/
    public Firewall(String filePath) throws IOException {
        rule = new HashSet<>();
        fileReader(filePath);
    }

    /*Function reads the input file and populates the set of rules*/
    private void fileReader(String filePath) throws IOException {
        File ruleFile = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(ruleFile));
        String line;
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            rule.add(new Rules(
                                columns[0],
                                columns[1],
                                columns[2],
                                columns[3]
                            ));
        }
    }

    /*Function to check the traffic with given properties matches a rule in rule file
     * @param direction
     * @param protocol
     * @param port
     * @param ipAddress
     * @return boolean
     */

    public boolean accept_packet(String direction, String protocol, int port, String ipAddress) {
        Rules rules = new Rules(direction, protocol, String.valueOf(port), ipAddress);
        Iterator<Rules> ruleIterator = this.rule.iterator();
        while (ruleIterator.hasNext()) {
            if (rules.equals(ruleIterator.next())) {
                return true;
            }
        }

        return false;
    }
}
