package uce.ona.jorge.config;
import org.wildfly.swarm.spi.meta.PackageFractionDetector;

public class detector extends PackageFractionDetector {

    public detector() {
        anyPackageOf("org.eclipse.microprofile.config");
    }

    @Override
    public String artifactId() {
        return "microprofile-config";
    }
}