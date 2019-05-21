package com.crk.service;

import com.crk.dao.IUserInfoDAO;
import com.crk.pojo.Tree;
import com.crk.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by 程荣凯 on 2018/3/11.
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    @Resource
    IUserInfoDAO userInfoDAO;
    private IUserInfoDAO dao;

    public void add(UserInfo info) {
        dao.add(info);
    }

    public List<HashMap<String, Object>> getGril() {
        return userInfoDAO.getGril();
    }

    public List<Tree> getTableInfo() {
        List<HashMap<String, Object>> list = userInfoDAO.getTableInfo();
        List<Tree> treeList = new ArrayList<Tree>();
        Set<String> tableNameSet = new HashSet<String>();
        for (int i=0;i<list.size();i++){
            HashMap<String, Object> temp = list.get(i);
            String tableName = temp.get("tableName").toString();
            String columnName = temp.get("columnName").toString();
            String comment = temp.get("comment").toString();
            String dataType = temp.get("dataType").toString();
            if (tableNameSet.contains(tableName)){

                Tree tree = new Tree();
                tree.setId(columnName);
                tree.setPid(tableName);
                tree.setName(comment);
                tree.setDataType(dataType);
                treeList.add(tree);
            }else{
                tableNameSet.add(tableName);
                Tree tree = new Tree();
                tree.setId(tableName);
                tree.setPid("-1");
                tree.setName(comment);
                tree.setDataType(dataType);
                treeList.add(tree);
            }
        }
        return treeList;
    }

    public IUserInfoDAO getDao() {
        return dao;
    }
    public void setDao(IUserInfoDAO dao) {
        this.dao = dao;
    }
}
