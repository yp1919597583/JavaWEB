package com.zhibo.utils;

import com.zhibo.bean.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
// 可以一次性将请求参数注入到javaBean中
// 将copyParamToBean(Map value, T bean)中的HttpServlet换成map为了web层解耦，其他层也可以注入javaBean
public class javaBean_Utils {
    public  static  <T>T copyParamToBean(Map value, T bean){


        try {
            BeanUtils.populate(bean, value);
            //表单name必须与bean字段名一样
          //  System.out.println(bean);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return  bean;
    }
}
