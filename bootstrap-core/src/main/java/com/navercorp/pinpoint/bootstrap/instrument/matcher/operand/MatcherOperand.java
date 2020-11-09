/*
 * Copyright 2017 NAVER Corp.
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

package com.navercorp.pinpoint.bootstrap.instrument.matcher.operand;

import com.navercorp.pinpoint.common.annotations.InterfaceStability;

/**
 * 匹配操作数
 * @author jaehong.kim
 */
@InterfaceStability.Unstable
public interface MatcherOperand {

    /**
     * 是不是操作符
     * */
    boolean isOperator();

    // for execution plan.
    /**
     * 执行耗时
     * */
    int getExecutionCost();
    /**
     * todo 什么意思？
     * */
    boolean isIndex();

    // this and operand
    /**
     * 与操作
     * */
    MatcherOperand and(MatcherOperand operand);

    // this or operand
    /**
     * 或操作
     * */
    MatcherOperand or(MatcherOperand operand);

    // not this
    /**
     * 非操作
     * */
    MatcherOperand not();
}