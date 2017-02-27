package com.github.yihtserns.test.osgi.version.resolution.run;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;

import static org.ops4j.pax.exam.CoreOptions.*;

/**
 *
 * @author yihtserns
 */
@RunWith(PaxExam.class)
public class RunTest {

    @Configuration()
    public Option[] config() {
        return options(
//                mavenBundle("org.slf4j", "slf4j-api", "1.7.2"),
//                mavenBundle("ch.qos.logback", "logback-core", "1.0.8"),
//                mavenBundle("ch.qos.logback", "logback-classic", "1.0.8"),
                mavenBundle("org.slf4j", "slf4j-api", "1.6.4"),
                mavenBundle("ch.qos.logback", "logback-core", "1.0.0"),
                mavenBundle("ch.qos.logback", "logback-classic", "1.0.0"),
                mavenBundle("com.github.yihtserns.test.osgi.version.resolution", "ref-version16", "0.0.1-SNAPSHOT"),
                mavenBundle("com.github.yihtserns.test.osgi.version.resolution", "ref-version17", "0.0.1-SNAPSHOT"));
    }

    @Test
    public void canStart() throws Exception {
    }
}
