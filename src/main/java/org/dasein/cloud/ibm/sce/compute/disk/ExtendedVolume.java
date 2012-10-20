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

package org.dasein.cloud.ibm.sce.compute.disk;

import org.dasein.cloud.compute.Volume;

/**
 * [Class Documentation]
 * <p>Created by George Reese: 7/19/12 10:09 AM</p>
 *
 * @author George Reese
 * @version 2012.02
 * @since 2012.02
 */
public class ExtendedVolume extends Volume {
    public String getRealState() {
        return realState;
    }

    public void setRealState(String realState) {
        this.realState = realState;
    }

    public String realState;

    public ExtendedVolume() { }

}
