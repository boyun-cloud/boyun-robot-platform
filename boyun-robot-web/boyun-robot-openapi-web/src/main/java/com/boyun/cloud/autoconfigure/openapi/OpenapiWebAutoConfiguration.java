package com.boyun.cloud.autoconfigure.openapi;


/**
 * @className: com.boyun.cloud.autoconfigure.console.ConsoleWebAutoConfiguration
 * @projectName: 封装BoyunCloud项目-ConsoleWebAutoConfiguration类
 * @module: BoyunCloud项目-ConsoleWebAutoConfiguration类，主要位于BoyunCloud项目Web模块Console工程模块的业务场景
 * @content: ConsoleWebAutoConfiguration类，主要用于完成ConsoleWebAutoConfiguration的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2024-06-19 15:52
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2024 BoyunCloud Systems Incorporated. All rights reserved.
 */

public class OpenapiWebAutoConfiguration {

    private static final int MULTIPLE = 5;

    private static final int ALIVE_TIMEOUT = 30;

    /**
     * 核心线程数：线程池创建时候初始化的线程数
     */
    private final int corePoolSize = Runtime.getRuntime().availableProcessors();

    /**
     * 最大线程数：线程池最大的线程数，只有在缓冲队列满了之后才会申请超过核心线程数的线程
     */
    private final int maxPoolSize = Runtime.getRuntime().availableProcessors() * MULTIPLE;

    /**
     * 缓冲队列：用来缓冲执行任务的队列
     */
    private final int queueCapacity = maxPoolSize * MULTIPLE;

    /**
     * 允许线程的空闲时间(单位：秒)：当超过了核心线程出之外的线程在空闲时间到达之后会被销毁
     */
    private final int keepAliveSeconds = ALIVE_TIMEOUT;


}
