<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>码蚁商城</title>
    <!--链接外部样式-->
    <link rel="stylesheet" href="style/headerStyle.css">
    <!--设置标签图标-->
    <link href="favicon.ico" rel="shortcut icon">
    <link rel="stylesheet" href="style/index.css">
    <link rel="stylesheet" href="style/footerStyle.css">

</head>
<body>

<%@ include file="header.jsp" %>

<!--中部搜索-->
<div class="header_center">
    <!--版心-->
    <div class="h_c_center">

        <!--左侧logo-->
        <div class="h_c_logo">
            <img src="images/log.png" alt="">
        </div>

        <!--中部搜索-->
        <div class="h_c_search">

            <form action="#">
                <input type="text" placeholder="请输入想要的宝贝..." class="s_input">
                <input type="submit" value="搜索" class="s_button">
            </form>

            <div class="hot">
                <a href="#">新款连衣裙</a>
                <a href="#">四件套</a>
                <a href="#">潮流T恤</a>
                <a href="#">时尚女鞋</a>
                <a href="#">短裤半身裙</a>
            </div>
        </div>
        <!--右部二维码-->
        <div class="h_c_code">
            <img src="images/pcode.png" alt="">
        </div>
    </div>
</div>

<!--导航-->
 <div id="nav">
     <ul>
         <li><a href="#">首页</a></li>
         <li><a href="goods_list.jsp">电脑办公</a></li>
         <li><a href="#">家具家居</a></li>
         <li><a href="#">鲜果时光</a></li>
         <li><a href="#">图书音像</a></li>
         <li><a href="#">母婴孕婴</a></li>
     </ul>
 </div>   

</div>

<!--广告页-->
<div id="ad">
    <img src="images/goods/ad.jpg" alt="">
</div>

<!--秒杀-->
<div id="ms">
    <div class="ms_title">
        <span>码蚁秒杀</span>
        <span>总有你想不到的低价</span>
    </div>

    <div class="ms_body">
        <ul>
            <li>
                <a href="detail.jsp">
                    <img src="images/goods/good1.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods2.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods3.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods4.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods5.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
        </ul>
    </div>
</div>

<!--热买商品-->
<div id="hot_goods">
    <h3 class="hot_goods_title">热卖商品</h3>
    <div class="hot_goods_body">
        <ul>
            <li>
                <a href="">
                    <img src="images/goods/goods6.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods7.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods8.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods9.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods10.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods11.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods12.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods13.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
            <li>
                <a href="">
                    <img src="images/goods/goods14.png" alt="">
                    <p>小米（MI）小米净化器2智能家用卧室空气净化器除甲醛雾霾P</p>
                    <i class="yuan">￥</i><span class="price">599</span>
                </a>
            </li>
        </ul>

    </div>
</div>

<%@ include file="footer.jsp" %>


</html>


