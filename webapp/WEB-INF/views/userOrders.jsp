<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>


<body>
<div class="jumbotron text-center">
  <h1>Your Orders</h1>
</div>
<div class="container">
 <table class="table table-condensed">
    <thead>
      <tr>
        <th>Order Date</th>
        <th>Total Price</th>
      </tr>
    </thead>

    <tbody>
        <c:forEach items="${orders}" var="order">
        <tr>
           <td>${order.order_date}</td>
           <td>${order.total_price}</td>
        </tr>
             <br>
          </c:forEach>
    </tbody>
  </table>
</div>

</body>
<%@ include file="includes/footer.jspf" %>
