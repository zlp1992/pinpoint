/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.instrument.interceptor;

import com.navercorp.pinpoint.bootstrap.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * 拦截器定义
 * @author Woonduk Kang(emeroad)
 */
public interface InterceptorDefinition {
    /**
     * 获取拦截器基类
     * */
    Class<? extends Interceptor> getInterceptorBaseClass();

    /**
     * 获取实现了基类的自定义拦截器类
     * */
    Class<? extends Interceptor> getInterceptorClass();

    InterceptorType getInterceptorType();

    /**
     * 获取拦截类型
     * */
    CaptureType getCaptureType();

    Method getBeforeMethod();

    Method getAfterMethod();
}
