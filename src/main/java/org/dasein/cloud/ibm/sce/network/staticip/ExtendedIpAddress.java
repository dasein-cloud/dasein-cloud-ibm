/**
 * Copyright (C) 2012 enStratus Networks Inc
 *
 * ====================================================================
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
 * ====================================================================
 */

package org.dasein.cloud.ibm.sce.network.staticip;

import org.dasein.cloud.network.IpAddress;

/**
 * Extended IP attributes for IBM SmartCloud.
 * <p>Created by George Reese: 7/19/12 11:07 AM</p>
 * @author George Reese
 * @version 2012.04 initial version
 * @since 2012.04
 */
public class ExtendedIpAddress extends IpAddress {
    public String getRealState() {
        return realState;
    }

    public void setRealState(String realState) {
        this.realState = realState;
    }

    private String realState;

    public ExtendedIpAddress() { }
}
