# spring

ApplicationContext在初始化上下文时就实例化所有单例的Bean。

Spring支持3中依赖注入的方式
属性注入
构造器注入
工厂方法注入(很少使用，不推荐)

属性注入即通过setter方法注入Bean的属性值或依赖对象
属性注入是实际应用中最常用的注入方式。

构造方法注入：
construct-arg没有name属性

如果有特殊字符如<>，用<![CDATA[]]>包含

在属性注入时，变量名一样不行，还要方法名也一样，比如有List<Car> cars,而getset方法是car,会报错

bean之间的关系：继承，依赖。配置上的继承

bean的作用域：singleton；prototype；web环境作用域
prototype：每次向容器获取bean，都会产生一个新的bean