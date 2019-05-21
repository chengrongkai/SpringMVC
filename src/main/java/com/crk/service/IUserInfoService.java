package com.crk.service;

import com.crk.pojo.Tree;
import com.crk.pojo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by 程荣凯 on 2018/3/11.
 */
@Service
public interface IUserInfoService {
    public void add(UserInfo info);
    public List<HashMap<String,Object>> getGril();
    public List<Tree> getTableInfo();
}
