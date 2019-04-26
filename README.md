# Java8-Learning
# JAVA8新特性
### Optionals：
Optional不是函数式接口，而是用于防止NullPointEXception的漂亮工具。Optional是一个简单的容器，其值可能是null或者不是null。在Java8之前一般某个函数应该返回非空对象但是有时却什么也没有返回，而在Java8中，应该返回Option而不是null

### Streams（流）
表示应用在一组元素上一次执行的操作序列。Stream操作分为中间操作或者最终操作两种，最终操作返回一特定类型的计算结果，而中间操作返回Stream本身，这样你就可以将多个操作依次串行起来。Stream的创建需要指定一个数据源。

### Filter（过滤）
过滤通过一个predicate接口来过滤并只保留符合条件的元素，该操作属于中间操作，所以我们可以在过滤后的结果来应用其他Stream操作（比如forEach）。forEach需要一个函数来对过滤后的元素依次执行。forEach是一个最终操作，所以我们不能在forEach之后来执行其他Stream操作。
```
StringList
    .stream()
    .sorted()
    .filter((s)->s.startWith("a"))
    .forEach(System out::println);
```

### Sorted(排序)
排序是一个中间操作，返回C的是排序好后的Stream。如果你不指定一个自定义的Comparator则会使用默认排序。
```
StringList
      .stream()
      .map(String::toUpperCase)
      .sorted((a,b))->b.compareTo(a))
      .forEach(System.out::println);
```

### Math(匹配)
所有的匹配操作都是最终操作，并返回一Boolean类型的值。

### Count（计数）
计数是一个最终操作，返回Stream中元素的个数，返回值类型是long
```
long startWithB = 
        stringList
                .stream()
                .filter((s)->s.startsWith("b"))
                .count();
sout(startWithB)
```
### Reduce(规约)
这是一个最终操作，允许通过指定的函数来讲Stream中的多个元素规约为一个元素，规约后的结果是通过Optional接口表示的：
```
Optonal<String> reduced = 
   stringList
            .stream()
            .sorted()
            .reduce((s1,s2)->s1+"#"+s2);
reduced.ifPresent(System.out::println);
```
### Parallel Streams(并行流)
实例如何通过并行Stream来提升性能：
创建一个没有重复元素的大表：
```
int  max = 1000000;
List<String> values = new ArrayList<max>;
for(int i = 0;i<max;i++){
    UUID uuid = UUID.randomUUID();
    values.add(uuid.toString())
}
```
### Sequential Sort(串行排序)
```
//串行排序
long t0=System.nanoTime();
long count = values.stream().sorted().count();
sout(count);

long t1=System.nanoTime();
long millis = TimeUnit.NANOSECONDS.toMillis(t1-t0);
System.out.println(String.format("sequential sort took: %d ms", millis));
```

### Parallel Streams(并行排序)
```
long t0 = System.nanoTime();
long count = values.parallelStream().sorted().count();
System.out.println(count);
```
并行的时间比串行的快

### Maps
Map类型不支持Streams,Map接口本身没有可用的Stream()方法，但是可以在键，值上创建专门的流或者通过map.keyset().stream,map.values().stream()和map.entrySet().stream()
* put与putIfAbsent区别：put在放入数据时，如果放入数据的key已经存在Map中，最后放入的数据会覆盖之前存在的数据，而putIfAbsent在放入数据时，如果存在重复的key,那么putIfAbsent不会放入值。
putIfAbsent如果传入key对应的Value已经存在，就返回存在的Value，不进行替换。如果不存在，就添加key和Value，返回null。
* computeIfAbsent方法
如果指定的key不存在，则通过指定的K ->V计算出新的值设置为Key的值
```
map.computeIfAbsent(1,key->key+"computed");
存在key为1，则不进行计算，输出值a
若不存在key为1，则输出1computed
```
* computeIfPresent方法
```
如果指定的key存在，则根据旧的key和Value计算新的值newValue
如果newValue不为null，则设置key新的值为newValue
如果newValue为null，则删除该key的值
map.computeIfPresent((1,(key,value)->(key+1)+Value)；
//存在key为1，则根据旧的key和Value计算新的值，输出2a
//如果key为2不存在，根据旧的key和huvalue计算得到null，删除该值，输出null。
```
### Date API（日期相关API）
* Clock 类提供了访问当前日期和时间的方法，Clock是时区敏感的，可以用来取代System.currentTimeMillis()来获取当前的微秒数。某一个特定的时间点也可以使用Instant类来表示，Instant类也可以用来创建旧版本的java.util.Date对象。
* 在新的API中时区使用ZoneLd来表示。时区可以很方便的使用静态方法Of来获取到。抽象类ZoneId表示一个区域标识符它有一个名为getAvailableZoneIds的静态方法，它返回所有区域标识符。
* jdk1.8中新增了LocalDate与LocalDateTime等类来解决日期处理方法，同时引入了一个新的类DateTimeFormatter来解决日期格式化问题。可以使用Instant代替Date，LocalDateTime代替Calendar，DateTimeFormatter代替SimpleDateFormat.
### Clock
Clock类提供了访问当前日期和时间的方法，clock是时区敏感的，可以用来取代System.currentTimeMillis()来获取当前的 wei'miao'微秒数。某一个特定的时间点s也可以使用Instans类来表示，Instant类也可以用来创建旧版本的java.util.Date 对象。
```
 Clock clock = Clock.systemDefaultZone();
long millis = clock.millis();
System.out.println(millis);
Instant instant = clock.instant();
System.out.println(instant);
Date legacyDate = Date.from(instant);
System.out.println(legacyDate);
输出：        
1556092594400
2019-04-24T07:56:34.400Z
Wed Apr 24 15:56:34 CST 2019
```

### Timezones（时区）
在新API时区使用Zoneld来表示。时区可以很方便的使用静态方法of 来获取。抽象类ZoneLd一个区域标识
符，它有一个名为getAvailableZoneIds的静态方法，它返回所以区域标识符
```
 System.out.println(ZoneId.getAvailableZoneIds());
 ZoneId zoneId = ZoneId.of("Europe/Berlin");
 ZoneId zoneId1 = ZoneId.of("Brazil/East");
System.out.println(zoneId.getRules());
System.out.println(zoneId1.getRules());
```
### LocalTime（本地时间）
LocalTime定义了一个没有时区信息的时间，例如晚上10点或者17：30：15。下面的例子使用前面代码创建的时区创建了两个本地时间。之后比较时间并以小时和分钟为单位计算两个时间的时间差：
```
 LocalTime now1 = LocalTime.now(zoneId);
LocalTime now2 = LocalTime.now(zoneId1);
System.out.println(now1.isBefore(now2));
long hoursBetWeen = ChronoUnit.HOURS.between(now1,now2);
long minutesBetween = ChronoUnit.MINUTES.between(now1,now2);
System.out.println(hoursBetWeen);
System.out.println(minutesBetween);

false
-4
-299
```
LocalTime 提供了多种工厂方法来简化对象的创建，包括解析时间字符串.
```
LocalTime late = LocalTime.of(23,59,59);
System.out.println(late);
DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
LocalTime localTime = LocalTime.parse("13:57",dateTimeFormatter);

23:59:59
13:57
```
### LocalDate(本地日期)
LocalDate表示了一个确切的日期，比如2014-03-11.该对象值是不可变的，用起来和LocalTime基本一致
下面的例子展示了如何给Date对象加减天/月/年。另外要注意的是这些对象是不可变的，操作返回的总是一个新实例。
```
LocalDate today = LocalDate.now();//获取现在的日期
System.out.println("今天的日期："+today);
LocalDate tomorrow = today.plus(1,ChronoUnit.DAYS);
System.out.println("明天的日期： "+tomorrow);
LocalDate yesterday = tomorrow.minusDays(2);
System.out.println("昨天的日期： "+yesterday);
LocalDate independenceDay = LocalDate.of(2019,Month.MARCH,12);
DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
System.out.println("今天是周几： "+dayOfWeek);

今天的日期：2019-04-25
明天的日期： 2019-04-26
昨天的日期： 2019-04-24
今天是周几： TUESDAY
```

