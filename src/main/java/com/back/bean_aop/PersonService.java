package com.back.bean_aop;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private long i = 0;
    public long count() {
        return i++;
    }
}
