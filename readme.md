# Gson 教程
## 添加依赖
```groovy
implementation 'com.google.code.gson:gson:2.8.5'
```
## 创建实体类
```java
public class Employee {
    @SerializedName("firstName")
    private String firstName;
    private int age;
    private String mail;
//省略构造器 和 toString

    }
```
```java
//生成json
Employee employee = new Employee("yc",30,"qq");
String s = gson.toJson(employee);
Log.d("qq", "onCreate: "+s);
//生成实体
Employee employee= gson.fromJson(json,Employee.class);
```