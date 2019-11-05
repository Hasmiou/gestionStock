<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title><fmt:message key="customer.new"/>|Gestion Stocke</title>

  <!-- Custom fonts for this template-->
  <link href="<%= request.getContextPath() %>/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="<%= request.getContextPath() %>/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<%= request.getContextPath() %>/resources/css/sb-admin.css" rel="stylesheet">

</head>

<body id="page-top">

  <!--Top-->
	<%@ include file="/WEB-INF/views/includes/navbar/top.jsp" %>
  <!--./Top-->

  <div id="wrapper">

    <!-- Sidebar -->
    <%@ include file="/WEB-INF/views/includes/sidebar/left.jsp" %>
    <!-- /Sidebar-->

    <div id="content-wrapper">

      <div class="container-fluid">

        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
          <li class="breadcrumb-item">
          <c:url value="/home/" var="home"/>
            <a href="${home}"><fmt:message key="common.dashboard"/></a>
          </li>
          <li class="breadcrumb-item">
          <c:url value="/client/" var="customerList"/>
            <a href="${customerList}"><fmt:message key="customer.list"/></a>
          </li>
          <li class="breadcrumb-item active"><fmt:message key="customer.new"/></li>
        </ol>

        <!-- Page Content -->
        <h1><fmt:message key="customer.new"/></h1>
        <hr>
        <div class="container">
		    <div class="card card-register mx-auto mt-5">
		      <div class="card-header"><fmt:message key="customer.create"/></div>
		      <div class="card-body">
		      	<c:url value="/client/save" var="customerSave"/>
		        <f:form action="${customerSave}" modelAttribute="client" method="post" enctype="multipart/form-data">
		          <div class="form-group">
		            <div class="form-row">
		              <div class="col-md-6">
		                <div class="form-label-group">
		                  <f:input path="prenom" type="text" id="firstName" class="form-control" placeholder="First name" required="required" autofocus="autofocus"/>
		                  <label for="firstName"><fmt:message key="common.firstname"/></label>
		                </div>
		              </div>
		              <div class="col-md-6">
		                <div class="form-label-group">
		                  <f:input path="nom" type="text" id="lastName" class="form-control" placeholder="Last name" required="required"/>
		                  <label for="lastName"><fmt:message key="common.lastname"/></label>
		                </div>
		              </div>
		            </div>
		          </div>
		          <div class="form-group">
		            <div class="form-label-group">
		              <f:input path="email" type="email" id="inputEmail" class="form-control" placeholder="Email address" required="required"/>
		              <label for="inputEmail"><fmt:message key="common.email"/></label>
		            </div>
		          </div>
		          <div class="form-group">
		            <div class="form-row">
		              <div class="col-md-6">
		                <div class="form-label-group">
		                  <f:input path="adresse" type="text" id="inputAddress" class="form-control" placeholder="Adresse" required="required"/>
		                  <label for="inputAddress"><fmt:message key="common.address"/></label>
		                </div>
		              </div>
		              <div class="col-md-6">
		                <div class="form-label-group">
		                  <f:input path="photo" type="file" id="photo" class="form-control" placeholder="Photo"/>
		                  <label for="photo"><fmt:message key="common.photo"/></label>
		                </div>
		              </div>
		            </div>
		          </div>
		          <div class="d-flex justify-content-between">
		          	<a class="btn btn-danger btn-6" href="<c:url value="/client/"/>" tabindex= -1><fmt:message key="common.cancel"/></a>
		          	<button class="btn btn-primary btn-6"><i class="fa fa-save"> </i><fmt:message key="common.save"/></button>
		          </div>
		        </f:form>
		      </div>
		    </div>
		 </div>

      </div>
      <!-- /.container-fluid -->

      <!-- Sticky Footer -->
      <footer class="sticky-footer">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>Copyright © Gestion de stock 2019</span>
          </div>
        </div>
      </footer>

    </div>
    <!-- /.content-wrapper -->

  </div>
  <!-- /#wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="<%= request.getContextPath() %>/resources/#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
          <a class="btn btn-primary" href="">Logout</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="<%= request.getContextPath() %>/resources/vendor/jquery/jquery.min.js"></script>
  <script src="<%= request.getContextPath() %>/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="<%= request.getContextPath() %>/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="<%= request.getContextPath() %>/resources/js/sb-admin.min.js"></script>

</body>

</html>
