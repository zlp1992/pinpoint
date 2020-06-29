/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.bootstrap.interceptor;

/**
 * 用于处理拦截器方法发生的异常，我们插入了before、after方法，如果这些方法发生异常而不处理，
 * 那将影响到原始方法体的执行逻辑，因此有必要对拦截器方法发生的异常做处理
 * @author Woonduk Kang(emeroad)
 */
public interface ExceptionHandler {
    void handleException(Throwable t);
}
