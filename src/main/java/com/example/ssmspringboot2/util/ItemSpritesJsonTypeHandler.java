package com.example.ssmspringboot2.util;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemSpritesJsonTypeHandler implements TypeHandler<Object> {
    @Override
    public Object getResult(ResultSet rs, String columnName) throws SQLException {
        String json = rs.getString(columnName);
        return jsonToObject(json);
    }

    @Override
    public Object getResult(ResultSet rs, int columnIndex) throws SQLException{
        String json = rs.getString(columnIndex);
        return jsonToObject(json);
    }

    @Override
    public Object getResult(CallableStatement cs, int columnIndex) throws SQLException{
        String json = cs.getString(columnIndex);
        return jsonToObject(json);
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        if(parameter == null){
            ps.setString(i, null);
            return;
        }
        String json = JSON.toJSONString(parameter);
        ps.setString(i, json);
    }

    private Object jsonToObject(String json){
        if(json == null){
            return null;
        }
        Class<?> cls = null;
        try {
            cls = Class.forName("com.example.ssmspringboot2.domain.item.ItemSprites");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("序列化成json时找不到指定的类", e);
        }
        Object ob = JSON.parseObject(json, cls);
        return ob;
    }
}
