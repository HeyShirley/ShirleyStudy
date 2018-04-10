package basic.注解.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 注解处理器实现
 * Created by zhaoxueyu on 2018/4/9.
 */
public class TableCreator {

    public static void main(String[] args) throws Exception{
        if (args.length < 1){
            System.out.println("arguments: annotated classes");
            System.exit(0);
        }
        for (String className: args){
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);
            if (dbTable == null){
                System.out.println("No DBTable annotations in class " + className);
                continue;
            }
            String tableName = dbTable.name();
            if (tableName.length() < 1)
                tableName = cl.getName().toUpperCase();
            List<String> columnDefs = new ArrayList<String>();
            for (Field field: cl.getDeclaredFields()){
                String columnName = null;
                Annotation[] anns = field.getDeclaredAnnotations();
                if (anns.length < 1){
                    continue;
                }
                if (anns[0] instanceof SQLInteger){
                    SQLInteger sInt = (SQLInteger) anns[0];
                    if (sInt.name().length() < 1){
                        columnName = field.getName().toUpperCase();
                    }
                    else {
                        columnName = sInt.name();
                    }
                    columnDefs.add(columnName + " INT" + getConstraints(sInt.constraints()));
                }
                if (anns[0] instanceof SqlString){
                    SqlString sString = (SqlString) anns[0];
                    if (sString.name().length() < 1){
                        columnName = field.getName().toUpperCase();
                    }
                    else {
                        columnName = sString.name();
                    }
                    columnDefs.add(columnName + " VARCHAR(" + sString.value() + ")" + getConstraints(sString.constraints()));
                }
                StringBuilder createConmmand = new StringBuilder("CREATE TABLE " + tableName + "(");
                for (String columnDef: columnDefs){
                    createConmmand.append("\n   " + columnDef + ",");
                }
                String tableCreate = createConmmand.substring(0, createConmmand.length()-1) + ");";
                System.out.println("Table Creation SQL for " + className + " is :\n" + tableCreate);
            }
        }
    }

    private static String getConstraints(Constraints con){
        String constraints = "";
        if (!con.allowNull()){
            constraints += "NOT NULL";
        }
        if (con.primaryKey()){
            constraints += "PRIMARY KEY";
        }
        if (con.unique()){
            constraints += "UNIQUE";
        }
        return constraints;
    }
}
