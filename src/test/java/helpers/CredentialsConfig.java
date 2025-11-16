package helpers;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
public interface CredentialsConfig extends Config {

    @Key("selenoid_login")
    String login();

    @Key("selenoid_password")
    String password();
}