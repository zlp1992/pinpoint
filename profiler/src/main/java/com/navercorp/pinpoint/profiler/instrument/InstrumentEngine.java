/*
 * Copyright 2017 NAVER Corp.
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
package com.navercorp.pinpoint.profiler.instrument;


import com.navercorp.pinpoint.bootstrap.instrument.InstrumentClass;
import com.navercorp.pinpoint.bootstrap.instrument.InstrumentContext;
import com.navercorp.pinpoint.bootstrap.instrument.NotFoundInstrumentException;

import java.security.ProtectionDomain;
import java.util.jar.JarFile;

/**
 * 字节码插装引擎
 * @author Jongho Moon
 *
 */
public interface InstrumentEngine {

    InstrumentClass getClass(InstrumentContext instrumentContext, ClassLoader classLoader, String classInternalName, ProtectionDomain protectionDomain, byte[] classFileBuffer) throws NotFoundInstrumentException;

    void appendToBootstrapClassPath(JarFile jarFile);
}
