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

package com.navercorp.pinpoint.bootstrap.context;


import com.navercorp.pinpoint.bootstrap.context.scope.TraceScope;
import com.navercorp.pinpoint.common.annotations.InterfaceAudience;

/**
 * 多个Span的集合; 由关联的RPC (Spans)组成. 在同一个trace中的span共享相同的TransactionId。Trace通过SpanId和ParentSpanId整理为继承树结构
 * @author emeroad
 * @author jaehong.kim
 */
public interface Trace extends StackOperation {
    // ----------------------------------------------
    // activeTrace related api
    // TODO extract interface???
    @InterfaceAudience.Private
    long getId();

    @InterfaceAudience.Private
    long getStartTime();

    //------------------------------------------------

    TraceId getTraceId();


    boolean canSampled();

    boolean isRoot();

    boolean isAsync();
    
    SpanRecorder getSpanRecorder();
    
    SpanEventRecorder currentSpanEventRecorder();

    boolean isClosed();

    void close();

    TraceScope getScope(String name);

    TraceScope addScope(String name);
}