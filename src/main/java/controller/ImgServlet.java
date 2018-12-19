package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

@MultipartConfig
@WebServlet("/imgs")
public class ImgServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(12);

       Part part = req.getPart("file");
/*文件上传后的存储路径和名称*/
        File file = new File("H:\\img\\"+part.getSubmittedFileName());

/*输出流  向指定位置写数据*/
        OutputStream out = new FileOutputStream(file);

/*文件接收*/
        byte [] b = new byte[1024];     //定义每次接收的长度
        InputStream is = part.getInputStream();
        int a =is.read(b,0,b.length);
        while (a!=-1){
            out.write(b);
            a = is.read(b,0,b.length);
        }



    }
}
