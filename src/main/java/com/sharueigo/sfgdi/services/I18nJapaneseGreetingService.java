package com.sharueigo.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"JP","default"})
@Service("i18nService")
public class I18nJapaneseGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "世界への挨拶";
    }
}
