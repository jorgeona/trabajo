package uce.ona.jorge.config;

import org.wildfly.swarm.config.MicroprofileConfig;
import org.wildfly.swarm.spi.api.Fraction;
import org.wildfly.swarm.spi.api.annotations.Configurable;
import org.wildfly.swarm.spi.api.annotations.DeploymentModule;
import org.wildfly.swarm.spi.api.annotations.MarshalDMR;
import org.wildfly.swarm.spi.api.annotations.WildFlyExtension;

@WildFlyExtension(module = "org.wildfly.extension.microprofile.config")
@MarshalDMR
@DeploymentModule(name = "org.eclipse.microprofile.config.api")
@Configurable("thorntail.microprofile.config")
public class config extends MicroprofileConfig<config> implements Fraction<config> {

    public config() {
    }
}