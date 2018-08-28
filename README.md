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