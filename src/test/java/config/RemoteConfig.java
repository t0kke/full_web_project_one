package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:remote.properties"
})
public interface RemoteConfig extends Config {
    @Key("base.url")
    String webBaseUrl();

    @Key("selenoid.driver.user")
    String selenoidDriverUser();

    @Key("selenoid.driver.password")
    String selenoidDriverPassword();
}
