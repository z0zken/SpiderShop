<!DOCTYPE html>

<html>
  <head>
    <title>IRCN V - Exotic pets shop</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
      integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <link rel="stylesheet" href="https://cdn.leanhduc.pro.vn/utilities/animation/shake-effect/style.css" />
    <!-- Bootstrap -->
    <link href="bootstrap-5.0.2-dist/css/bootstrap.min.css" rel="stylesheet" />
    <script src="bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js"></script>
    <!-- BIGCSS -->
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
  <body>
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
              <a class="nav-link container-fluid" style="text-decoration: underline" href="#">Home</a>
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
    <div class="slide" style="margin-top: -4px">
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
  </body>
</html>
