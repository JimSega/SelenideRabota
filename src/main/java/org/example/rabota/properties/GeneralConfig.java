package org.example.rabota.properties;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:general.properties"
})
public interface GeneralConfig extends Config {
    @Key("url.base")
    String url();

    String userName();
    @Key("url.resume")
    String resume();
    String firstName();
    String lastName();
    String year();
}
