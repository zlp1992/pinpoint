/*
 * Copyright 2014 NAVER Corp.
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
package com.navercorp.pinpoint.profiler.objectfactory;

import java.lang.annotation.Annotation;

/**
 * 参数Provider
 * @author Jongho Moon
 *
 */
public interface ArgumentProvider {
    /**
     * 解析参数
     * @param index 参数的位置，即参数在方法中是第几个
     * @param type 参数类型
     * @param annotations 参数上的注解列表
     * */
    Option get(int index, Class<?> type, Annotation[] annotations);
}
