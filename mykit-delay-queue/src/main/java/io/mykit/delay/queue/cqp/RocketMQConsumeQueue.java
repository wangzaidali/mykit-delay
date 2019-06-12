/**
 * Copyright 2019-2999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.delay.queue.cqp;

import io.mykit.delay.common.autoconfigigure.MessageProducer;
import io.mykit.delay.common.exception.ConsumeQueueException;
import io.mykit.delay.queue.core.ConsumeQueueProvider;
import io.mykit.delay.queue.core.Job;
import io.mykit.delay.queue.extension.ExtNamed;

/**
 * @author liuyazhuang
 * @version 1.0.0
 * @date 2019/5/29
 * @description RocketMQ消费队列实现
 */
@ExtNamed("rocketmqCQ")
public class RocketMQConsumeQueue implements ConsumeQueueProvider {

    @Override
    public void init() {

    }

    @Override
    public void consumer(Job job) throws ConsumeQueueException {
        MessageProducer.send(job);
    }

    @Override
    public void destory() {

    }
}
