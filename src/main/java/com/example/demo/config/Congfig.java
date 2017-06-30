package com.example.demo.config;

import com.example.demo.filter.ZuulFilter;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/6/30 0030.
 */
@Configuration
public class Congfig {
     ZuulFilter myFilter(){
         return  new ZuulFilter();
     }
}
