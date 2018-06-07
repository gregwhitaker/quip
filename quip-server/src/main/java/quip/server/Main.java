/*
 * Copyright 2018 Greg Whitaker
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

package quip.server;

import com.github.gregwhitaker.ratpack.error.ErrorModule;
import quip.server.api.ApiModule;
import quip.server.api.ApiRoutes;
import ratpack.guice.Guice;
import ratpack.server.BaseDir;
import ratpack.server.RatpackServer;

public class Main {

    public static void main(String... args) throws Exception {
        RatpackServer.start(s -> s
                .serverConfig(c -> c
                        .yaml("config.yml")
                        .baseDir(BaseDir.find())
                        .build()
                )
                .registry(Guice.registry(b -> b
                        .module(ErrorModule.class)
                        .module(ApiModule.class))
                )
                .handlers(c -> c
                        .insert(ApiRoutes.class)
                )
        );
    }
}
