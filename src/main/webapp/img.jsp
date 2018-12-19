<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/19 0019
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="imgs" method="post" enctype="multipart/form-data">
        <input type="file" name="file" onchange="change(this)"><img id="img" width="20px" height="20px"> <br>
        <input type="submit" value="提交">
    </form>
    <script type="text/javascript">
        function change(obj) {
            var reader =new FileReader();
                reader.onload=function (e) {
                    var img = document.getElementById("img");   //取图
                    img.src=e.target.result;
                };
                reader.readAsDataURL(obj.files[0]);
        }
    </script>


</body>
</html>
