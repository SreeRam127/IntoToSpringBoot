package com.rockCode.sreeram.firstWeek.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    private DevDB obj;

    String getData(){
        return obj.getData();
    }
}
