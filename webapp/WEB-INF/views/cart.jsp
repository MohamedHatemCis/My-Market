<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>

<body>
<img class="bg"
          src="https://img.freepik.com/premium-photo/cashew-nuts-miniature-shopping-cart-dark-background_38172-346.jpg">

<div class="empty">
<c:if test="${totalPrice==0}">
    <h1 class="empty-txt">The Cart is empty ... :(  </h2>
 </c:if>
</div>

<c:if test="${totalPrice!=0}">

<div class="title-div">
  <h1 class="title-txt">Your Cart</h1>
</div>

<div class="container">
 <table class="table table-condensed">
    <thead>
      <tr>
        <th>Image</th>
        <th>Name</th>
        <th>Quantity</th>
        <th>Price/Unit</th>
        <th>Item total price</th>
        <th>Action</th>
      </tr>
    </thead>

    <tbody>
    <c:forEach items="${cart_products}" var="product">
    <tr>
        <td>
            <img class="itemImg" src=${product.imgUrl}>
        </td>
        <td class="name">${product.name}</td>
        <td>${product.quantity}</td>
        <td>${product.price}</td>
        <td>${product.price*product.quantity}</td>
        <td>
        <a href="/delete-product?id=${product.id}" class="btn btn-danger">Delete</a>
        </td>
    </tr>
  <br>
    </c:forEach>
    </tbody>
  </table>
</div>
</c:if>

<c:if test="${totalPrice!=0}">
<div class="btn-cont text-center" style="height:10px">
 <a href="/confirm-order" class="btn btn-success">Confirm order <br> ${totalPrice}$</a>
</div>
 </c:if>

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
    .itemImg{
    width:40%;
    height:30%;
    object-fit: contain;
    }
    table {
      table-layout:fixed;
      background-color:white;
     }
    table tbody {
    width:550%;
    height:500px;
    overflow-y:scroll;
    display:block;
     }
     td{width:21%;}
.container {
    background-color:white;
  justify-content: center;
  position: absolute;
  top: 35%;
  left: 10%;
}
.empty {
  justify-content: center;
  position: absolute;
  top: 20%;
  left:35%;
}
.title-div {
  justify-content: center;
  position: absolute;
  left:43%;
  top: 20%;
}
.empty-txt{
color:white;
}
.title-txt{
color:white;
}
.btn-cont{
position: fixed;
 top:90%;
 left: 44%;
}
</style>