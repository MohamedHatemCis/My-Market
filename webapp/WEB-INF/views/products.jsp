<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>


<body>
<img class="bg"
          src="https://media.istockphoto.com/id/902558446/photo/restaurant-gourmet-food-on-dark-background.jpg?s=170667a&w=0&k=20&c=rM-Jl8jf2MObxsPzLGevb2cB8OxVuyDPwsJFK7biNeI=">

<div class="title-div">
  <h1 class="title-txt">Products Page</h1>
</div>
<div class="container">
 <table class="table table-condensed">
    <thead>
      <tr>
        <th>Product image</th>
        <th>Name</th>
        <th>Price</th>
        <th>Action</th>
      </tr>
    </thead>

    <tbody>
        <c:forEach items="${products}" var="product">
        <tr>
           <td>
           <img class="itemImg" src=${product.imgUrl}>
           </td>
           <td>
             <p class="name">${product.name}</p>
           </td>
           <td>${product.price}</td>
           <td>
            <form action="/add-product">
                   <div class="form-group">
                       <input type="text"  name="id" value="${product.id}" hidden  required>
                       <input type="number" class="form-control" name="quantity" style="width: 6.5em" required>
                     </div>
                          <button type="submit" class="btn btn-primary">Add to cart</button>
            </form>
            </td>

            </tr>
             <br>
          </c:forEach>
    </tbody>
  </table>
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
 .title-div {
    justify-content: center;
    position: absolute;
    left:42%;
    top: 20%;
  }

.name{
font-size:1.2em;
vertical-align: middle;
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
width:400%;
height:500px;
overflow-y:scroll;
display:block;
 }
 td{width:25%;}
.container {
  background-color:white;
  justify-content: center;
  position: absolute;
  top: 35%;
  left: 10%;
}
.title-txt{
color:white;
}
</style>