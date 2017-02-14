package com.example.zew.demo2.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.zew.demo2.R;

/**
 * Created by zew on 16/11/21.
 */
public class ThirdAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdact);
        show();

    }

    private void show() {
//        try {
//
//        }catch (Exception e){
//
//        }
//        URL url = new URL("http://localhost:8080/TestHttpURLConnectionPro.do");
//        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
//
//        // 设置是否向httpUrlConnection输出，因为这个是post请求，参数要放在
//        // http正文内，因此需要设为true, 默认情况下是false;
//        urlConn.setDoOutput(true);
//
//        // 设置是否从httpUrlConnection读入，默认情况下是true;
//        urlConn.setDoInput(true);
//
//        // Post 请求不能使用缓存
//        urlConn.setUseCaches(false);
//
//        // 设定传送的内容类型是可序列化的<a href="http://lib.csdn.net/base/javase" class='replace_word' title="Java SE知识库" target='_blank' style='color:#df3434; font-weight:bold;'>Java</a>对象
//        // (如果不设此项,在传送序列化对象时,当WEB服务默认的不是这种类型时可能抛java.io.EOFException)
//        urlConn.setRequestProperty("Content-type","application/x-java-serialized-object");
//
//        // 设定请求的方法为"POST"，默认是GET
//        urlConn.setRequestMethod("POST");
//
//        // 连接，上面对urlConn的所有配置必须要在connect之前完成，
//        urlConn.connect();
//
//        // 此处getOutputStream会隐含的进行connect (即：如同调用上面的connect()方法，
//        // 所以在开发中不调用上述的connect()也可以)。
//        OutputStream outStrm = urlConn.getOutputStream();
//
//        // 现在通过输出流对象构建对象输出流对象，以实现输出可序列化的对象。
//        ObjectOutputStream oos = new ObjectOutputStream(outStrm);
//
//        // 向对象输出流写出数据，这些数据将存到内存缓冲区中
//        oos.writeObject(new String("我是<a href="http://lib.csdn.net/base/softwaretest" class='replace_word' title="软件测试知识库" target='_blank' style='color:#df3434; font-weight:bold;'>测试</a>数据"));
//
//        // 刷新对象输出流，将任何字节都写入潜在的流中（些处为ObjectOutputStream）
//        oos.flush();
//
//        // 关闭流对象。此时，不能再向对象输出流写入任何数据，先前写入的数据存在于内存缓冲区中,
//        // 再调用下边的getInputStream()函数时才把准备好的http请求正式发送到服务器
//        oos.close();
//
//        // 调用HttpURLConnection连接对象的getInputStream()函数,
//        // 将内存缓冲区中封装好的完整的HTTP请求电文发送到服务端。
//        InputStream inStrm = urlConn.getInputStream(); // <===注意，实际发送请求的代码段就在这里
//
////----------------------------------
//    /*
//     * Post传参的方法
//     */
//        OutputStream os = urlConn.getOutputStream();
//        String param = new String();
//        param = "CorpID=123&LoginName=qqq&name=" + URLEncoder.encode("汉字","GBK"); ;
//        os.write(param.getBytes());
//
////----------------------------------
//    /*
//     * 超时设置，防止 网络异常的情况下，可能会导致程序僵死而不继续往下执行
//     */
//
////        //JDK 1.5以前的版本，只能通过设置这两个系统属性来控制网络超时:
////        //连接主机的超时时间（单位：毫秒）
////        System.setProperty("sun<a href="http://lib.csdn.net/base/dotnet" class='replace_word' title=".NET知识库" target='_blank' style='color:#df3434; font-weight:bold;'>.NET</a>.client.defaultConnectTimeout", "30000");
////        //从主机读取数据的超时时间（单位：毫秒）
////        System.setProperty("sun<a href="http://lib.csdn.net/base/dotnet" class='replace_word' title=".NET知识库" target='_blank' style='color:#df3434; font-weight:bold;'>.Net</a>.client.defaultReadTimeout", "30000");
//
//        //在JDK 1.5以后可以这样来设置超时时间
//        HttpURLConnection urlCon = (HttpURLConnection)url.openConnection();
//        urlCon.setConnectTimeout(30000);
//        urlCon.setReadTimeout(30000);
    }
}
