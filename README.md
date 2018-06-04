<font color=#0099dd size=5 face="黑体">1.新建项目</font><br>
![图一](1.jpg)<br>
选择Spring Initializr<br>
选择默认default选项<br>
点击Next<br>
<br>
![图二](2.png)<br>
在Artifact中命名<br>
点击Next<br>
<br>
![图三](3.jpg)<br>
在web中选择web<br>
<br>
![图四](4.png)<br>
在SQL中选择JPA和MySQL<br>
点击Next后新建项目<br>
<br>
<font color=#0099dd size=5 face="黑体">2.配置数据库</font><br>
![图五](5.png)<br>
将下载的hibernate.cfg.xml和application.properties放置在以下目录，并覆盖目录中原有的application.properties<br>
src\main\resources<br>
<br>
修改application.properties中的数据库名,username和password(不宜观看)<br>
<br>
![图六](6.png)<br>
修改hibernate.cfg.xml中的数据库名（我的数据库名为webpj）<br>
<br>
![图七](7.png)<br>
点击右上角Create Hibernate facet...<br>
<br>
菜单栏->View->Tool Windows->Database<br>
![图八](8.png)<br>
点击图中加号“+“ -> Data Source -> MySQL
<br>
![图九](9.png)<br>
输入Database,User和Password，点击Test Connection<br>
提示success后点击OK<br>
<br>
![图十](10.png)<br>
右侧出现数据库信息<br>
在以下路径（src\main\java.com.example.你的项目名）新建文件夹(文件夹指的是Package) model，用来安置数据库对应的实体类<br>
菜单栏View->Tool Windows -> Persistence<br>
<br>
![图十一](11.png)<br>
![图十二](12.png)<br>
此处右键 -> Generate Persistence Mapping ->By DataBase Schema<br>
<br>
![图十三](13.png)<br>
Choose Data Source的选项中有刚刚设置的数据库，选之<br>
Package中手动选择刚刚新建的model处路径<br>
选中表中所有属性（展开看）<br>
<br>
![图十四](14.jpg)<br>
点击OK<br>
在model文件夹下可以看到自动生成的类<br>
<br>
<font color=#0099dd size=5 face="黑体">3.配置后端</font><br>
在以下路径（src\main\java.com.example.你的项目名）新建文件夹(文件夹指的是Package) Config，放置下载的文件CorsConfig，用于跨域访问（不需要改动)<br>
<br>
接下来以book为例，写一个get方法：<br>
在以下路径（src\main\java.com.example.你的项目名）新建文件夹(文件夹指的是Package) DAO，在里面新建一个BookRepository类,在代码中改变其为接口，并且extends JpaRepository<Book,Integer>，其中Integer不能改变，是和数据库中表的id相关，这样每次save的时候id都是自动分配的（因此id需要改成int类型）<br>
如下：<br>
![图十五](15.png)<br>
<br>
在以下路径（src\main\java.com.example.你的项目名）新建文件夹(文件夹指的是Package) Service，在里面新建一个BookService类,在代码中改变其为接口.在这里声明之后要用的自定义函数<br>
如下:<br>
![图十六](16.png)<br>
<br>
在以下 （注意这里的路径！） 路径（src\main\java.com.example.你的项目名\Service）新建文件夹(文件夹指的是Package) ServiceImpl，在里面新建一个BookServiceImpl类,在这里定义之前在BookService中声明的函数<br>
为其添加注解@Service并且实现BookService类<br>
有个BookRepository类的成员，为其添加@Autowired实现自动装配<br>
用注解Override来复写之前在BookService中声明的函数，可以用很多BookRepository中自动实现的函数，如findById之类的
如下:<br>
![图十七](17.png)<br>
<br>
在以下路径（src\main\java.com.example.你的项目名）新建文件夹(文件夹指的是Package) Controller，在里面新建一个BookController类,用于接收前端发来的请求<br>
为其添加注解@Controller<br>
有个BookService类的成员，为其添加@Autowired实现自动装配<br>
以图中形式实现处理请求的函数,如果请求带有参数，将GetMapping注解改为PostMapping注解，在函数中添加类似为@RequestParam("bookname") String bookname的参数（后见前端发送post请求的格式）<br>
![图十八](18.png)<br>
<br>
点击运行，打开网页http://localhost:8080/book/all（/book/all对应于BookController中处理事务的地址）
![图十九](19.png)<br>
<br>
<font color=#0099dd size=5 face="黑体">4.前端使用</font><br>
首先要在前端的项目目录下 npm install jquery --save<br>
在使用时先 import $ from 'jquery'<br>
<br>
用法如图，和前面写的后端相对应。函数中在用后端的response做点事<br>
![图二十](20.png)<br>
<br>

最后，简单展示一下post情况下的前后端（后端bookService中的函数需要自己实现，如上文示范）:<br>
前端：<br>
第一个参数是访问地址，第二个参数是map键值对，键是和后端获取时对应的，值是前端代码中的变量，第三个参数是得到后端返回值后进行操作的函数<br>
![图二十一](21.png)<br>
<br>
后端：<br>
有特定的格式接受参数，注意键要与前端传过来的对应<br>
![图二十二](22.png)<br>
<br>
(还有一种得到参数和写回的方法与web作业第二次迭代相同,用HttpServlet。图如下：)<br>
![图二十三](23.png)<br>
<br>






