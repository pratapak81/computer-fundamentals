package com.nsc.designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * In proxy pattern, a class represents functionality of another class. Simply, proxy means an object representing another object.
 * In proxy pattern, we create object having original object to interface its functionality to outer world.
 * <p>
 * According to GoF, a Proxy Pattern "provides the control for accessing the original object"
 * So, we can perform many operations like hiding the information of original object, on demand loading etc.
 * <p>
 * Proxy pattern is also known as Surrogate or Placeholder.
 */
public class ProxyInternet implements Internet {

    private final Internet realInternet = new RealInternet();
    private static final List<String> bannedSites = new ArrayList<>();

    static {
        bannedSites.add("abc.com");
        bannedSites.add("xyz.com");
        bannedSites.add("pqr.com");
        bannedSites.add("lmn.com");
    }

    @Override
    public void connectTo(String serverHost) throws IllegalAccessException {
        if (bannedSites.contains(serverHost)) {
            throw new IllegalAccessException(serverHost + " is banned");
        } else {
            realInternet.connectTo(serverHost);
        }
    }
}
