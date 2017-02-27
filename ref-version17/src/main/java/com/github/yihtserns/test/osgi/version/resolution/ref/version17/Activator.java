package com.github.yihtserns.test.osgi.version.resolution.ref.version17;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {

    private Logger log = LoggerFactory.getLogger(getClass());

    public void start(BundleContext context) throws Exception {
        log.info("Started: " + getClass());
    }

    public void stop(BundleContext context) throws Exception {
        log.info("Stopped: " + getClass());
    }
}
