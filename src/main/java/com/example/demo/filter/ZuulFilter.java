package com.example.demo.filter;
/**
 * Created by Administrator on 2017/6/30 0030.
 */
public class ZuulFilter  extends com.netflix.zuul.ZuulFilter {

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        return null;
    }
}
