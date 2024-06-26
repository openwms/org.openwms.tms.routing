/*
 * Copyright 2005-2022 the original author or authors.
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
package org.openwms.tms.routing;

import io.interface21.cloud.AmebaCloudModule;
import org.ameba.app.SolutionApp;
import org.openwms.common.comm.CommPackage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

/**
 * A RoutingServiceRunner.
 *
 * @author Heiko Scherrer
 */
@SpringBootApplication(
        scanBasePackageClasses = {
                SolutionApp.class,
                RoutingModuleConfiguration.class,
                AmebaCloudModule.class,
                CommPackage.class
        }
)
@EnableRetry
public class RoutingServiceRunner {

    /**
     * Boot up!
     *
     * @param args Some args
     */
    public static void main(String[] args) {
        var ctx = SpringApplication.run(RoutingServiceRunner.class, args);
        ctx.start();
    }
}
