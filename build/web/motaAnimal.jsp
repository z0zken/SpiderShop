<%-- 
    Document   : BlockAn
    Created on : Feb 13, 2023, 10:30:00 PM
    Author     : ADMIN
--%>

<%@page import="Control.GetInfor"%>
<%@page import="java.util.Random"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Ani"%>
<%@page import="model.Ani"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap-5.0.2-dist/css/bootstrap.min.css"/>
        <script src="bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet" href="bootstrap-5.0.2-dist/css/bootstrap.min.css">
        <script src="bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
        <!--        <link rel="stylesheet" href="newcss.css"/>-->
        <!-- style option select size -->
        <style>
            body{
                margin: 0;
            }
            select {
                -webkit-appearance: none;
                -moz-appearance: none;
                -ms-appearance: none;
                appearance: none;
                outline: 0;
                box-shadow: none;
                border: 0 !important;
                background: gray;
                background-image: none;
            }

            .select {
                position: relative;
                display: flex;
                width: 50%;
                height: 3em;
                margin-bottom: 1%;
                line-height: 3;
                background: #fff;
                overflow: hidden;
                border-radius: .25em;
            }
            select {
                flex: 1;
                padding: 0 .5em;
                color: #fff;
                cursor: pointer;
            }
            /* thiết kế dấu mũi tên */
            .select::after {
                content: '\25BC';
                position: absolute;
                top: 0;
                right: 0;
                padding: 0 1em;
                background: grey;
                cursor: pointer;
                pointer-events: none;
                -webkit-transition: .25s all ease;
                -o-transition: .25s all ease;
                transition: .25s all ease;
                color: white;
            }
            /* Transition */
            .select:hover::after {
                color: Gainsboro;
            }
        </style>
        <!-- style relative product -->
        <style>
            .thumbex .thumbnail {
                overflow: hidden;
                width: 100%;
                min-width: 250px;
                max-width: 400px;
                height: 268px;
                position: relative;
                opacity: 0.88;
                backface-visibility: hidden;
                transition: all 0.4s ease-out;
            }
            .thumbex .thumbnail img {
                position: absolute;
                z-index: 1;
                left: 50%;
                top: 50%;
                height: 112.5%;
                width: auto;
                transform: translate(-50%, -50%);
                backface-visibility: hidden;
            }
            .thumbex {
                margin: 0 0 3% 0%;
                width: 100%;
                min-width: 250px;
                max-width: 400px;
                -webkit-flex: 1;
                -ms-flex: 1;
                flex: 1;
                overflow: hidden;
                outline-offset: -15px;
                border-radius: 5px;
            }
            .thumbex .thumbnail span {
                position: absolute;
                z-index: 2;
                top: 5%;
                background: rgba(0, 0, 0, 0.7);
                padding: 50%;
                margin: 0;
                text-align: center;
                color: white;
                letter-spacing: 0.2px;
                transition: all 0.3s ease-out;
            }
            .thumbex .thumbnail:hover {
                backface-visibility: hidden;
                transform: scale(1.1, 1.1);
                opacity: 1;
            }
            .thumbex .thumbnail:hover span {
                opacity: 0;
            }
            .thumbex .thumbnail label h4{
                position: absolute;
                background: gray;
                opacity: 50%;
                z-index: 2;
                top: 83%;
                left: 0;
                right: 0;
                background: rgba(0, 0, 0, 0.7);
                padding: 15px 0.5% 15px 0.5%;
                text-align: center;
                font-size: 15px;
                color: white;
                font-weight:100;
                font-family: "Raleway", sans-serif;
            }
            #name-price{
                color: white;
                text-align: center;
                opacity: 1;
            }
            .product-gallery img{
                width: 100%;
            }
            .product-image-detail{
                margin-left: 1%;
            }
            .product-gallery, .product-gallery__thumbs{
                margin:5px;
            }
            .product-gallery__thumbs-container{
                align-items: center;
                background-position: center;
                overflow: hidden;
            }

            .heading-title{
                margin-bottom: 5%;
            }
            .row{
                margin-top: 7px;
            }

        </style>

        <!-- style header -->
        <style>
            .ho:hover {
                color: aqua;
                text-decoration: underline;
            }
            /* header */
            .searchbar {
                margin-bottom: auto;
                margin-top: auto;
                height: 50px;
                background-color: #353b48;
                border-radius: 30px;
                padding: 10px;
            }

            .search_input {
                color: white;
                border: 0;
                outline: 0;
                background: none;
                width: 0;
                caret-color: transparent;
                line-height: 30px;
                transition: width 0.4s linear;
            }

            .searchbar:hover > .search_input {
                padding: 0 10px;
                width: 250px;
                caret-color: red;
                transition: width 0.4s linear;
            }

            .searchbar:hover > .search_icon {
                background: white;
                color: #e74c3c;
            }

            .search_icon {
                height: 30px;
                width: 40px;
                float: right;
                display: flex;
                justify-content: center;
                align-items: center;
                border-radius: 50%;
                color: white;
                text-decoration: none;
            }
            ul {
                display: flex;
                text-align: center;
                list-style: none;
            }
            .opa {
                width: 100%;
                height: 30%;
                background: rgba(0, 0, 0, 0.6);
            }
            ul li {
            }
            .bg-light {
                background-color: #212529 !important;
            }
            .nav {
                text-align: center;
            }
            .nav-link {
                color: white;
                /* border: solid 5px; */
            }
            .dropdown:hover .dropdown-content {
                display: block;
                position: fixed;
                z-index: 50;
                background: rgb(33, 37, 41);
            }
            .dropdown:not(:hover) .dropdown-content {
                display: none;
            }
            .dropdown-item {
                color: white;
            }
            .navbar-nav .nav-item :hover .nav-link {
                color: yellow;
            }
            .navbar-nav .nav-item :not(:hover) .nav-link {
                color: white;
            }
            .dropdown-item .submit-item {
                background: transparent;
                border: none;
                color: white;
            }
            .nav-item .submit-item {
                background: transparent;
                border: none;
                color: white;
            }
            /*  .carousel {
                     width: 640px;
                    height: 360px;
                  }*/
            .carousel-inner > .item > img {
                object-fit: cover;
            }
            /*.carousel-inner > .item > img, .carousel-inner > .item > a > img {
                      width: 100%;
                  }*/
            .carousel-control :hover .carousel-control {
                color: black;
            }
        </style>
        <!-- BIGCSS -->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <!-- style footer -->
        <style>
            .ho:hover {
                color: aqua;
                text-decoration: underline;
            }
            /* header */
            .searchbar {
                margin-bottom: auto;
                margin-top: auto;
                height: 50px;
                background-color: #353b48;
                border-radius: 30px;
                padding: 10px;
            }

            .search_input {
                color: white;
                border: 0;
                outline: 0;
                background: none;
                width: 0;
                caret-color: transparent;
                line-height: 30px;
                transition: width 0.4s linear;
            }

            .searchbar:hover > .search_input {
                padding: 0 10px;
                width: 250px;
                caret-color: red;
                transition: width 0.4s linear;
            }

            .searchbar:hover > .search_icon {
                background: white;
                color: #e74c3c;
            }

            .search_icon {
                height: 30px;
                width: 40px;
                float: right;
                display: flex;
                justify-content: center;
                align-items: center;
                border-radius: 50%;
                color: white;
                text-decoration: none;
            }
            ul {
                display: flex;
                text-align: center;
                list-style: none;
            }
            .opa {
                width: 100%;
                height: 30%;
                background: rgba(0, 0, 0, 0.6);
            }
            ul li {
            }
            .bg-light {
                background-color: #212529 !important;
            }
            .nav {
                text-align: center;
            }
            .nav-link {
                color: white;
                /* border: solid 5px; */
            }
            .dropdown:hover .dropdown-content {
                display: block;
                position: fixed;
                z-index: 50;
                background: rgb(33, 37, 41);
            }
            .dropdown:not(:hover) .dropdown-content {
                display: none;
            }
            .dropdown-item {
                color: white;
            }
            .navbar-nav .nav-item :hover .nav-link {
                color: yellow;
            }
            .navbar-nav .nav-item :not(:hover) .nav-link {
                color: white;
            }
            .dropdown-item .submit-item {
                background: transparent;
                border: none;
                color: white;
            }
            .nav-item .submit-item {
                background: transparent;
                border: none;
                color: white;
            }
            /*  .carousel {
                     width: 640px;
                    height: 360px;
                  }*/
            .carousel-inner > .item > img {
                object-fit: cover;
            }
            /*.carousel-inner > .item > img, .carousel-inner > .item > a > img {
                      width: 100%;
                  }*/
            .carousel-control :hover .carousel-control {
                color: black;
            }
        </style>
        <!-- BIGCSS -->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
    </head>
    <body style="display: block;">
        <div>
            <header style="position: fixed; z-index: 50; background: #5a5a5a; width: 100%">
                <div class="row">
                    <div class="col-md-6">
                        <marquee behavior="scroll" direction="left" style="color: rgb(91, 231, 89); font-weight: bold"
                                 >🔥10% Discount when sending feedback about the product 🔥</marquee
                        >
                    </div>
                    <!-- PHONE -->
                    <div style="display: inline" class="col-md-2">
                        <i style="font-size: 24px" class="fa fa-phone rung"></i>
                        <span>0668xxx</span>
                    </div>
                    <!-- SIGN IN /OUT -->
                    <div style="" class="col-md-4 float-right">
                        <button style="border-radius: 10px; margin-top: 2%; padding-top: 5px">
                            <a href="#" style="text-decoration: none; color: black"><i class="fa-solid fa-user"></i></a>
                        </button>
                        <button style="font-weight: bold; border-radius: 10px; margin-top: 2%; padding-top: 5px; padding-bottom: px">
                            Cart <img class="rung" src="image/iconshop.png" alt="iconcart" style="width: 20px; height: 20px" />
                        </button>
                    </div>
                </div>
                <div style="text-align: center">
                    <span style="font-size: 50px; font-weight: bold; color: burlywood">IRCN V Shop </span
                    ><i class="fa-sharp fa-regular fa-circle-quarters"></i>
                </div>
                <div>
                    <nav class="navbar navbar-expand-sm bg-light justify-content-center">
                        <ul class="navbar-nav" style="font-weight: bold">
                            <li class="nav-item">
                                <a class="nav-link container-fluid" style="text-decoration: underline" href="home.jsp">Home</a>
                            </li>
                            <li class="nav-item dropdown" style="text-align: center">
                                <span class="nav-link container-fluid"> Animals <i class="fa-solid fa-caret-down"></i> </span>
                                <ul class="dropdown-content dropdown-toggle-split">
                                    <li>
                                        <a class="dropdown-item" href="#">
                                            <form action="SendToAnimal">
                                                <input class="submit-item" type="submit" value="Spider" name="animal"/>
                                                <!-- <i  class="fa fa-phone"></i> -->
                                            </form>
                                        </a>
                                    </li>
                                    <li><a class="dropdown-item" href="#">
                                            <form action="SendToAnimal">
                                                <input class="submit-item" type="submit" value="Frog" name='animal'/>
                                                <!-- <i  class="fa fa-phone"></i> -->
                                            </form>
                                        </a></li>
                                    <li><a class="dropdown-item" href="#">
                                            <form action="SendToAnimal">
                                                <input class="submit-item" type="submit" value="Scorpion" name='animal'/>
                                                <!-- <i  class="fa fa-phone"></i> -->
                                            </form>
                                        </a></li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link container-fluid" href="#">Information</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link container-fluid" href="#">News</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link container-fluid" href="#">Contact</a>
                            </li>
                            <li class="nav-item" style="margin-left: 20px">
                                <form class="d-flex">
                                    <div class="d-flex justify-content-center h-100">
                                        <div class="searchbar">
                                            <input class="search_input" type="text" name="" placeholder="Search..." />
                                            <a href="#" class="search_icon"><i class="fas fa-search rung"></i></a>
                                        </div>
                                    </div>
                                </form>
                            </li>
                        </ul>
                    </nav>
                </div>
            </header>
            <div class="row slide" style="margin-top: -4px">
                <div id="demo" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-indicators">
                        <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
                        <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
                        <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
                    </div>

                    <!-- The slideshow/carousel -->
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img src="image/shop.png" alt="Spider" class="d-block" style="width: 100%" />
                            <div class="carousel-caption">
                                <h3></h3>
                                <p></p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="image/1.png" alt="Chicago" class="d-block" style="width: 100%" />
                            <div class="carousel-caption">
                                <h3></h3>
                                <p></p>
                            </div>
                        </div>
                        <div class="carousel-item">
                            <img src="image/2.png" alt="New York" class="d-block" style="width: 100%" />
                            <div class="carousel-caption">
                                <h3></h3>
                                <p></p>
                            </div>
                        </div>
                    </div>

                    <!-- Left and right controls/icons -->
                    <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
                        <span class="carousel-control-prev-icon"></span>
                        <span class="sr-only">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
                        <span class="carousel-control-next-icon"></span>
                        <span class="sr-only">Previous</span>
                    </button>
                </div>
            </div>
        </div>
        <div class="row product-detail-wrapper" style="margin-top: 10%;">
            <div class="row product-detail-main pr_style_01">

                <div class="col-md-7 col-sm-12 col-xs-12" >
                    <!-- style slider -->
                    <style>


                        * {
                            box-sizing: border-box;
                        }

                        img {
                            vertical-align: middle;
                        }

                        /* Position the image container (needed to position the left and right arrows) */
                        .container {
                            position: relative;
                            padding-right: 0;
                            width: 95%;
                        }

                        /* Hide the images by default */
                        .mySlides {
                            display: block;
                            height: 100%;
                        }
                        /* Add a pointer when hovering over the thumbnail images */
                        .cursor {
                            cursor: pointer;
                        }

                        /* Next & previous buttons */
                        .prev,
                        .next {
                            cursor: pointer;
                            position: absolute;
                            top: 40%;
                            width: auto;
                            padding: 16px;
                            margin-top: -50px;
                            color: white;
                            font-weight: bold;
                            font-size: 20px;
                            border-radius: 0 3px 3px 0;
                            user-select: none;
                            -webkit-user-select: none;
                        }

                        /* Position the "next button" to the right */
                        .next {
                            right: 0;
                            border-radius: 3px 0 0 3px;
                        }

                        /* On hover, add a black background color with a little bit see-through */
                        .prev:hover,
                        .next:hover {

                        }

                        /* Number text (1/3 etc) */
                        .numbertext {
                            color: #f2f2f2;
                            font-size: 12px;
                            padding: 8px 12px;
                            position: absolute;
                            top: 0;
                            width: 100%;
                            height: 100%;
                        }

                        /* Container for image text */


                        .row:after {
                            content: "";
                            display: table;
                            clear: both;
                        }

                        /* Six columns side by side */
                        .column {
                            float: left;
                            width: 16.66%;
                        }

                        /* Add a transparency effect for thumnbail images */
                        .demo {
                            opacity: 0.6;
                        }

                        .active,
                        .demo:hover {
                            opacity: 1;
                        }
                    </style>



                    <div class="container">
                        <div class="mySlides">
                            <div class="numbertext">1 / 3</div>
                            <img src="${ani.getImg_url().get(0)}" style="object-fit: cover; height: 100vw; width: 100%; max-height: 800px;  ">
                        </div>

                        <div class="mySlides">
                            <div class="numbertext">2 / 3</div>
                            <img src="${ani.getImg_url().get(1)}" style="object-fit: cover; height: 100vw; width: 100%;  max-height: 800px;  ">
                        </div>

                        <div class="mySlides">
                            <div class="numbertext">3 / 3</div>
                            <img src="${ani.getImg_url().get(2)}" style="object-fit: cover; height: 100vw; width: 100%;  max-height: 800px; ">
                        </div>



                        <a class="prev" onclick="plusSlides(-1)">❮</a>
                        <a class="next" onclick="plusSlides(1)">❯</a>



                        <div class="row">
                            <div class="column">
                                <img class="demo cursor" src="${ani.getImg_url().get(0)}" style="object-fit: cover;height: 100%; width: 100%; max-height: 100px;" onclick="currentSlide(1)" alt="img1">
                            </div>
                            <div class="column">
                                <img class="demo cursor" src="${ani.getImg_url().get(1)}" style="object-fit: cover;height: 100%; width: 100%;max-height: 100px; " onclick="currentSlide(2)" alt="img2">
                            </div>
                            <div class="column">
                                <img class="demo cursor" src="${ani.getImg_url().get(2)}" style="object-fit: cover;height: 100%; width: 100%;max-height: 100px;" onclick="currentSlide(3)" alt="img3">
                            </div>

                        </div>
                    </div>
                    <!-- script slider -->
                    <script>
                        let slideIndex = 1;
                        showSlides(slideIndex);

                        function plusSlides(n) {
                            showSlides(slideIndex += n);
                        }

                        function currentSlide(n) {
                            showSlides(slideIndex = n);
                        }

                        function showSlides(n) {
                            let i;
                            let slides = document.getElementsByClassName("mySlides");
                            let dots = document.getElementsByClassName("demo");
                            let captionText = document.getElementById("caption");
                            if (n > slides.length) {
                                slideIndex = 1
                            }
                            if (n < 1) {
                                slideIndex = slides.length
                            }
                            for (i = 0; i < slides.length; i++) {
                                slides[i].style.display = "none";
                            }
                            for (i = 0; i < dots.length; i++) {
                                dots[i].className = dots[i].className.replace(" active", "");
                            }
                            slides[slideIndex - 1].style.display = "block";
                            dots[slideIndex - 1].className += " active";
                            //captionText.innerHTML = dots[slideIndex-1].alt;
                        }
                    </script>

                </div>
                <div class="col-md-5 col-sm-12 col-xs-12 product-content-desc" id="detail-product" style="margin-top: 10px;" >
                    <!-- describe animal -->
                    <form action="addcart">
                        
                        <div class="product-title">
                            <button type="button" style="border: none; background-color: #fff;" name="id" value="${ani.getId_ani()}"><h1>${ani.getName_ani()}</h1></button>
                            
                        </div>


                        <div class="select_wrapper clearfix  col-12">

                            <div id="variant-swatch-0" class="swatch clearfix col-6" data-option="option1" data-option-index="0" style="width: 100%;">
                                <div class="header hide">Select size:</div>

                                <div class="select">
                                    <select name="type_ani">
                                        <option selected value="Sling">Sling</option>
                                        <option value="Semi li-mature">Semi li-mature</option>
                                        <option value="Mature-Male">Mature-Male</option>
                                        <option value="Mature-Female">Mature-Female</option>
                                    </select>
                                </div>

                            </div>

                            <div class="product-action-bottom visible-xs col-6">
                                <span class="money">
                                    ${ani.getPrice()[0]}
                                </span>
                                <div class="input" style="background-color:rgb(255, 255, 255);" style="display: flex; align-items: center;">
                                    <!-- style  add quantity and money-->
                                    <style>
                                        input{
                                            margin: 2%;
                                        }
                                        .input_num{
                                            width: 50%;
                                            height: 40px;
                                        }

                                    </style>

                                    <div class="input_num">
                                        <input type="number" name="num" min="0" maxlength="3" value="1">
                                    </div>


                                </div>
                                <style>
                                    #add-to-cartbottom{
                                        text-align: center;
                                        background-color: #0693cd;
                                        border: 0;
                                        border-radius: 5px;
                                        cursor: pointer;
                                        color: #fff;
                                        font-size:16px;
                                        font-weight: bold;
                                        line-height: 1.4;
                                        padding: 10px;
                                        width: 100%;
                                    }
                                    #add-to-cartbottom:hover{
                                        opacity: 0.7;
                                    }
                                </style>
                                
                                <button type="submit" id="add-to-cartbottom" class="add-to-cartProduct add-cart-bottom button dark addtocart-modal" name="id" value="${ani.getId_ani()}">Thêm vào giỏ</button>                                
                            </div>

                            <div class="product-description">	
                                <div class="title-bl">
                                    <h2>Describe</h2>
                                    ${describe}
                                </div>							
                                <div class="description-content">
                                    <div class="description-productdetail">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>

            </div>

            <div>
                <div class="heading-title text-center" style="margin-top: 2%; margin-bottom: 2%">
                    <!-- relative product -->
                    <h1>Sản phẩm cùng loại</h1>
                </div>
                <%
                    ArrayList<Ani> std
                            = (ArrayList<Ani>) request.getAttribute("AniListData");
                    System.out.println("length: " + std.size());
                    //s.getImg_url().get(0)
                    //-
//                for (int i = 0; i <= std.size(); i++) {
//                    System.out.println("img: " + std.get(i).getImg_url().get(0));
//                }

                    try {

                    } catch (Exception e) {
                    }
                    int a = new Random().nextInt(std.size());
                    int b = new Random().nextInt(std.size());
                    int c = new Random().nextInt(std.size());
                    int d = new Random().nextInt(std.size());
                    if (a == b || a == c || a == d || b == c || b == d || c == d) {
                        a = new Random().nextInt(std.size());
                        b = new Random().nextInt(std.size());
                        c = new Random().nextInt(std.size());
                        d = new Random().nextInt(std.size());
                    }

                %>

                <div class="content-product-list row" style="margin-left: 4%; ">
                    <div class="col-md-3 col-sm-6 col-xs-6 pro-loop">
                        <div class=".ani-block">
                            <%try {
                            %>
                            <jsp:include page="ContentSubJSP/BlockAn.jsp" >
                                <jsp:param name="id" value="<%=std.get(a).getId_ani()%>" />

                                <jsp:param name="img_link1" value="<%=std.get(a).getImg_url().get(0)%>" />

                                <jsp:param name="img_link2" value="<%=std.get(a).getImg_url().get(1)%>" />

                                <jsp:param name="price" value="<%=std.get(a).getPrice()[0]%>" />

                                <jsp:param name="name" value="<%=std.get(a).getName_ani()%>" />

                            </jsp:include>
                            <%} catch (Exception e) {
                                    System.out.println("this is id wrong: " + std.get(1).getId_ani());
                                }%>

                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6 col-xs-6 pro-loop">
                        <div class=".ani-block">
                            <%try {
                            %>
                            <jsp:include page="ContentSubJSP/BlockAn.jsp" >
                                <jsp:param name="id" value="<%=std.get(b).getId_ani()%>" />
                                <jsp:param name="img_link1" value="<%=std.get(b).getImg_url().get(0)%>" />

                                <jsp:param name="img_link2" value="<%=std.get(b).getImg_url().get(1)%>" />

                                <jsp:param name="price" value="<%=std.get(b).getPrice()[0]%>" />

                                <jsp:param name="name" value="<%=std.get(b).getName_ani()%>" />

                            </jsp:include>
                            <%} catch (Exception e) {
                                    System.out.println("this is id wrong: " + std.get(1).getId_ani());
                                }%>

                        </div>
                    </div>   
                    <div class="col-md-3 col-sm-6 col-xs-6 pro-loop">
                        <div class=".ani-block">
                            <%try {
                            %>
                            <jsp:include page="ContentSubJSP/BlockAn.jsp" >
                                <jsp:param name="id" value="<%=std.get(c).getId_ani()%>" />
                                <jsp:param name="img_link1" value="<%=std.get(c).getImg_url().get(0)%>" />

                                <jsp:param name="img_link2" value="<%=std.get(c).getImg_url().get(1)%>" />

                                <jsp:param name="price" value="<%=std.get(c).getPrice()[0]%>" />

                                <jsp:param name="name" value="<%=std.get(c).getName_ani()%>" />

                            </jsp:include>
                            <%} catch (Exception e) {
                                    System.out.println("this is id wrong: " + std.get(1).getId_ani());
                                }%>

                        </div>
                    </div>    
                    <div class="col-md-3 col-sm-6 col-xs-6 pro-loop">
                        <div class=".ani-block">
                            <%try {
                            %>
                            <jsp:include page="ContentSubJSP/BlockAn.jsp" >
                                <jsp:param name="id" value="<%=std.get(d).getId_ani()%>" />
                                <jsp:param name="img_link1" value="<%=std.get(d).getImg_url().get(0)%>" />

                                <jsp:param name="img_link2" value="<%=std.get(d).getImg_url().get(1)%>" />

                                <jsp:param name="price" value="<%=std.get(d).getPrice()[0]%>" />

                                <jsp:param name="name" value="<%=std.get(d).getName_ani()%>" />

                            </jsp:include>
                            <%} catch (Exception e) {
                                    System.out.println("this is id wrong: " + std.get(1).getId_ani());
                                }%>

                        </div>
                    </div>    
                </div>
            </div>
            <footer class="footer bg-white" style="margin-top: 50px;">

                <div class="mid-footer">
                    <div class="container">
                        <div class="row">
                            <div class="col-xs-12 col-md-6 col-lg-3 footer-click">
                                <iframe
                                    src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d630.8556871040286!2d108.26099002634841!3d15.968867651905276!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1svi!2s!4v1676466633527!5m2!1svi!2s"
                                    width="250"
                                    height="200"
                                    style="border: 0"
                                    allowfullscreen=""
                                    loading="lazy"
                                    referrerpolicy="no-referrer-when-downgrade"
                                    ></iframe>
                            </div>
                            <div class="col-xs-12 col-md-6 col-lg-3 footer-click">
                                <h4 class="title-menu clicked">
                                    Contact Information <i class="fa fa-angle-down d-md-none d-inline-block"></i>
                                </h4>
                                <b>Address: </b>Đà Nẵng <br />
                                <b>Phone: </b> 09830668xxx<br />
                                <b>Email: </b> admin@ircnvstore.vn
                                <br />
                                <br />
                            </div> 


                            <div class="col-xs-12 col-md-6 col-lg-2 footer-click">
                                <h4 class="title-menu clicked">Policy <i class="fa fa-angle-down d-md-none d-inline-block"></i></h4>
                                <a href="" style="text-decoration: none; color: black;" class="ho">Return Policy</a></br>
                                <a href="" style="text-decoration: none; color: black;"class="ho">Terms Of Use</a></br>
                                <a href="" style="text-decoration: none; color: black;"class="ho">Security</a></br>
                                <a href="" style="text-decoration: none; color: black;"class="ho">Privacy</a>


                            </div>
                            <div class="col-xs-12 col-md-6 col-lg-4 footer-click">
                                <div class="social-footer">

                                    <iframe                src="https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2FIRCNVShop&tabs=%20messages&width=340&height=200&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId"
                                                           width="340"
                                                           height="200"
                                                           style="border: none; overflow: hidden"
                                                           scrolling="no"
                                                           frameborder="0"
                                                           allowfullscreen="true"
                                                           allow="autoplay; clipboard-write; encrypted-media; picture-in-picture; web-share"
                                                           ></iframe>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="bg-footer-bottom copyright clearfix py-2">
                    <div class="container">
                        <div class="row">
                            <div id="copyright" class="col-lg-12 col-md-12 col-xs-12 fot_copyright text-center " >
                                <span class="wsp"> © The Coppyright by IRCNVSHOP </span>
                            </div>
                        </div>

                        <a href="index.html" id="back-to-top" class="backtop back-to-top show end" title="Ontoppage"
                           ><i class="fa fa-angle-up" aria-hidden="true"></i
                            ></a>
                    </div>
                </div>
            </footer>
    </body>
</html>
