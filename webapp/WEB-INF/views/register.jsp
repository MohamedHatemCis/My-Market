<%@ include file="includes/header.jspf" %>
<%@ include file="includes/navbar.jspf" %>


<body>
 <div class="col-med-12">
      <form id="regForm" modelAttribute="user" action="register" method="post">
            <div class="col-sm-5 form-group">
             <label for="username">Username</label>
             <input id="username" type="text" name="username" class="form-control">
            </div>

            <div class="col-sm-5 form-group">
            <label for="password">Password</label>
            <input id="password" type="password" name="password" class="form-control">
            </div>
              <div class="row">
              <div class="col-xs-12">
                    <button class="btn btn-success" type="submit">Register</button>
            </div>
          </div>
        </form>
    </div>
</body>

<%@ include file="includes/footer.jspf" %>



<style>
.row{
margin:0px 2%;
}


</style>