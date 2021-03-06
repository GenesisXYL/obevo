/**
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.gs.obevo.db.apps.reveng;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class TableSyncherTest {

    @Test
    public void testSyncSchemaTables() throws Exception {
        TableSyncher.main(("-dbMergeConfigFile " +
                "src/test/resources/scenariotests/reveng-merge/merge-config-with-correction.txt " +
                "-outputDir ./target/merge/unittest").split(" "));
    }
}
