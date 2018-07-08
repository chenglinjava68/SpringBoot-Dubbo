# SpringBoot整合Dubbo
一个简单的demo
        
        SpringBoot1.5.10
        Dubbo-SpringBoot-Starter2.0.0
        Zookeeper3.4.11

## 使用
1. 启动zookeeper
2. 启动dubbo-admin客户端(需自己将官方的war放进tomcat的webapps/ROOT下) tomcat端口
3. 启动生产者(dubbo-provider) 端口8081
4. 启动消费者(duboo-consumer) 端口8082

## 验证
浏览器输入: http://127.0.0.1:8082/sayHello/dubbo  
输出String: Hello dubbo
浏览器输入:http://localhost:8082/getCity
输出JSON/对象:
    

    {
        "id": 1,
        "provinceId": 2,
        "cityName": "南昌",
        "description": "是我的故乡"
    }
   
使用duboo的管理平台(dubbo-admin应用放在ROOT下则路径:http://localhost:8088)
查看结果,初始账户为:root/root
