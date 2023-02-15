<%@ include file="includes/header.jspf" %>

<body>
<img class="bg"
          src="https://images.unsplash.com/photo-1458253756247-1e4ed949191b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8ZGFyayUyMGZvb2QlMjBwaG90b2dyYXBoeXxlbnwwfHwwfHw%3D&w=1000&q=80">

    <div class="jumbotron text-center">
      <h1>Your Order is Done :) </h1>
      <p>With Budget ${totalPrice} $ </p>
      <br>
      <br>
      <p>Nice to see you here  <span class="name">${username} :)</span>  </p>
    </div>

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
 .jumbotron{
 width:100%;
 position: absolute;
  top: 10%;
 }
 .name{
 font-size:1.3em;
 }
 </style>