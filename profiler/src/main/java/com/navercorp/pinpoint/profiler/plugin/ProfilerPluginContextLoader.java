/*
 * Copyright 2018 NAVER Corp.
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

package com.navercorp.pinpoint.profiler.plugin;

import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPlugin;

import java.util.List;

/**
 * pinpoint 分析插件加载器，用于加载pinpoint的各种插件，注意只是加载，并没有转换（transform）
 * @author HyunGil Jeong
 */
public interface ProfilerPluginContextLoader {

    /**
     * 加载所有插件，因为pinpoint的分析插件都需要实现ProfilerPlugin接口
     * */
    PluginsSetupResult load(List<ProfilerPlugin> profilerPlugins);
}
