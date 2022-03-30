# 🕸️zhiji-serve

## 📑Schedule
* [x] user
* [ ] blog
* [ ] post
* [ ] * [ ] comment

## 🎠Usage
* 同步maven库
* 配置连接数据库的文件`src/main/resources/application.yml`
  ```yml
  spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://your_sql_location
    username: yoursql_username
    password: yoursql_password

  server:
    port: 8081
  ```
* 数据库内容可以按实体类来配
* 运行即可
