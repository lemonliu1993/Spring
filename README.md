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

在配置文件里配置bean时，有时需要在beande配置里混入系统部署的细节信息(例如：文件路径，数据源配置信息等)。而这些部署细节实际上需要和bean的配置相分离
spring提供了一个PropertyPlaceholderConfigurer的BeanFactory后置处理器，这个处理器允许用户将bean配置的部分内容外移到属性文件中，可以在bean配置文件里使用形式为${var}的变量，PropertyPlaceholderConfigurer从属性文件里加载属性，并使用这些属性来替换变量
Spring还允许在属性文件里使用${propName},以实现属性之间的相互引用。
PS：要导入命名空间


Spring表达式语言：Spel是一个支持运行时查询和操作对象图的强大的表达式语言。
语法类似与EL：SpEL使用#{...}作为定界符，所有在大框号中的字符都将被认为是SpEL。
SpEL为bean的属性进行动态赋值提供了便利
通过SpEL可以实现：
通过bean的id对bean进行引用
调用方法以及引用对象中的属性
计算表达式的值
正则表达式的匹配

SpEL：字面量
字面量的标识：一般不用
SpEL：引用Bean，属性和方法
引用其他对象：
<!--通过value属性和SpEL配置Bean之间的应用关系 -->
<property name="prefix" value="#{prefixGenerator}"></propert>
引用其他对象的属性
调用其他方法，还可以链式操作

bean的生命周期：
Spring IOC容器对bean的生命周期进行管理的过程：
通过构造器或者工厂方法创建bean实例
为bean的属性设置值和对其他bean的引用
将bean实例传递给bean后置处理器depostProcessBeforeInitialization
调用bean的初始化方法
将bean实例传递给bean后置处理器depostProcessAfterInitialization
bean可以使用了
当容器关闭时，调用bean的销毁方法
在bean的声明里设置init-method和destroy-method属性，为bean指定初始化和销毁方法

为什么使用FactoryBean来配置bean?
因为有的时候配置一个bean的时候，需要用到ioc容器中其他bean，这时使用FactoryBean配置最合适
