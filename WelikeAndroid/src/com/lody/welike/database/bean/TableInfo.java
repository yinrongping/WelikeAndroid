package com.lody.welike.database.bean;

import com.lody.welike.database.DataType;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author Lody
 *         储存Table信息
 */
public class TableInfo {

    /**
     * 是否包含ID
     */
    public boolean containID;
    /**
     * 主键字段
     */
    public Field primaryField;

    /**
     * 表名
     */
    public String tableName;

    /**
     * 字段表
     */
    public Map<Field, DataType> fieldToDataTypeMap;

    /**
     * 创建table的语句
     */
    public String createTableStatement;

    /**
     * 是否已经创建
     */
    public boolean isCreate = false;

}
