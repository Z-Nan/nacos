/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.naming.consistency.ephemeral.distro.newimpl.component;

import com.alibaba.nacos.naming.consistency.ephemeral.distro.newimpl.entity.DistroData;

/**
 * Distro data processor.
 *
 * @author xiweng.yy
 */
public interface DistroDataProcessor {
    
    /**
     * Process type of this processor.
     *
     * @return type of this processor
     */
    String processType();
    
    /**
     * Process received data.
     *
     * @param distroData received data
     */
    void processData(DistroData distroData);
    
    /**
     * Process received verify data.
     *
     * @param distroData verify data
     * @return true if the data is available, otherwise false
     */
    boolean processVerifyData(DistroData distroData);
}
