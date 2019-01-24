package com.demo.example.service;

import com.demo.example.daomain.Happiness;
import org.springframework.stereotype.Service;

@Service
public interface HappinessService {
    /**
     * 查询
     * @param city
     * @return
     * @throws Exception
     */
    public Happiness selectService(String city)throws Exception;

    /**
     * 插入
     * @param city
     * @return
     * @throws Exception
     */
    public Happiness insertService(String city)throws Exception;
}
