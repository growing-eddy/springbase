环境需要
jdk8
tomcat1.8

项目根路径为 ：/base

启动后访问地址：
http://localhost:8080/base/home/index
自动启动页面：
http://localhost:8080/base/

项目目标：
使用基础的XML配置spring，可以了解其原理；


遇到问题的解决方式：
https://o-u-u.com/?p=196

# xml aop没有生效
解决：
https://blog.csdn.net/yj1499945/article/details/86679432
contextConfigLocation 看来 我没有理解 springmvc 两个配置加载的顺序；
-- 要注意spring配置和MVC的配置
解答： https://blog.csdn.net/qq_35571554/article/details/82464236
正常情况下，Spring的配置文件扫描service层和dao层，springmvc扫描controller
