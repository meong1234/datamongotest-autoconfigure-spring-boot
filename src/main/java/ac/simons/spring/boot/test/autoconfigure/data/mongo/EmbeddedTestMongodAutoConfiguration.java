/*
 * Copyright 2016 michael-simons.eu.
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
package ac.simons.spring.boot.test.autoconfigure.data.mongo;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Auto-configuration for an embedded mongod process running during tests.
 *
 * @author Michael J. Simons, 2016-12-08
 * @since 1.5.0
 * @see AutoConfigureEmbeddedTestMongod
 */
@Configuration
@ConditionalOnProperty(prefix = "spring.test.mongod.embedded", name = "enabled", havingValue = "true", matchIfMissing = true)
@ImportAutoConfiguration(EmbeddedMongoAutoConfiguration.class)
public class EmbeddedTestMongodAutoConfiguration {
}
