package com.navercorp.pinpoint.bootstrap.interceptor.registry;

import com.navercorp.pinpoint.bootstrap.interceptor.Interceptor;


/**
 * 拦截器注册适配器，主要用于拦截器与内部id的映射适配
 * @author emeroad
 */
public interface InterceptorRegistryAdaptor {
    /**
     * 注册拦截器类并返回对应的内部id
     * */
    int addInterceptor(Interceptor interceptor);
    /**
     * 根据内部id获取对应的拦截器类
     * */
    Interceptor getInterceptor(int key);
}
