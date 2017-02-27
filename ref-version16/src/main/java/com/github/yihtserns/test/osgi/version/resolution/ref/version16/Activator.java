package com.github.yihtserns.test.osgi.version.resolution.ref.version16;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author yihtserns
 */
public class Activator implements BundleActivator {

    private Logger log = LoggerFactory.getLogger(getClass());

    public void start(BundleContext context) throws Exception {
        log.info("Started: " + getClass());
    }

    public void stop(BundleContext context) throws Exception {
        log.info("Stopped: " + getClass());
    }

}
