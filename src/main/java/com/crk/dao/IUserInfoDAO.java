package com.crk.dao;

import com.crk.pojo.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 程荣凯 on 2018/3/11.
 */
public interface IUserInfoDAO {
    public void add(UserInfo info);
    public List<HashMap<String,Object>> getGril();
    public List<HashMap<String,Object>> getTableInfo();
}
