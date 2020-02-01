package com.java.test;

import com.java.main.Firewall;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FirewallTester {
    Firewall firewall;

    @Before
    public void setUp() throws IOException {
        firewall = new Firewall("input.csv");
    }

    @Test
    public void test1() {
        assertEquals(true, firewall.accept_packet("inbound", "tcp", 80, "192.168.12.10"));
    }

    @Test
    public void test2() {
        assertEquals(true, firewall.accept_packet("inbound", "udp", 85, "192.168.1.1"));
    }

    @Test
    public void test3() {
        assertEquals(false, firewall.accept_packet("outbound", "tcp", 65536, "192.168.1000.11"));
    }

    @Test
    public void test4() {
        assertEquals(false, firewall.accept_packet("outbound", "udp", 100, "52.12.21.91"));
    }
}
