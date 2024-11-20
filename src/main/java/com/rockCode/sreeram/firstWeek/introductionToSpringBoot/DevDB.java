package com.rockCode.sreeram.firstWeek.introductionToSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class DevDB implements DB {
    public String getData(){
        return "This is Development env";
    }
}
