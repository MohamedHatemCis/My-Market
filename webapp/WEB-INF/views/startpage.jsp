<!DOCTYPE html>
<%@ page import = "net.codejava.service.LoginService" %>

<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>


<body>

        <img class="bg"
          src="https://img5.goodfon.com/wallpaper/nbig/a/12/natiurmort-eda-predmety-posuda-temnyi-fon-kompozitsiia-kapus.jpg">


        <div class="container">
              <h1>We <br>&nbsp;&nbsp;&nbsp; are here for you :) </h1>
        </div>
        <div class="div-button">
       <c:if test="${!LoginService.isLogged}">
               <a href="/login" class="btn btn-primary button1">Start Now</a>
       </c:if>
       <c:if test="${LoginService.isLogged}">
                      <a href="/products" class="btn btn-primary button1">Start Now</a>
              </c:if>
        </div>

</body>

<%@ include file="includes/footer.jspf" %>


<style>

 .bg {
 position:relative;
   opacity: 0.6;
   left: 0;
   top: 0;
   width: 100%;
   height: auto;
   z-index:-1;
 }
div h1{
font-size:3.5em;
color:white
}

.button1 {
background-color:transparent;
border:4px solid DodgerBlue;
border-radius: 10px;
width: 500px;
font-size:1.5em;
}
.div-button{
position: fixed;
top:85%;
left:32%;
}

.container {
  justify-content: center;
   position: fixed;
   top: 50%;
   left: 5%;
}
</style>

