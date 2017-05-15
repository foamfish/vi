package com.ctrip.framework.cornerstone.helloworld;

import com.ctrip.framework.cornerstone.cacheRefresh.CacheCell;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiang.j on 2016/5/18.
 */
public class TestCache implements CacheCell{

    private String id;
    private Map<String,Object> status = new HashMap<>();
    public TestCache(String id){
        this.id = id;
        status.put("refreshTime",new Date());

    }
    @Override
    public String id() {
        return this.id;
    }

    @Override
    public boolean refresh() {
        status.put("refreshTime",new Date());
        return true;
    }

    @Override
    public Map<String, Object> getStatus() {
        status.put("visitCount",Math.random()*1000);
        return status;
    }
}