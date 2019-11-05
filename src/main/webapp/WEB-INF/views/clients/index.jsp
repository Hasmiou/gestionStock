<%@page import="com.stock.entities.Client"%>
<%@ include file="/WEB-INF/views/includes/includes.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Clients | Gestion Stock</title>

  <!-- Custom fonts for this template-->
  <link href="<%= request.getContextPath() %>/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="<%= request.getContextPath() %>/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="<%= request.getContextPath() %>/resources/css/sb-admin.css" rel="stylesheet">

  <!-- Page level plugin CSS-->
  <link href="<%= request.getContextPath() %>/resources/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
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
          <li class="breadcrumb-item active"><fmt:message key="common.customer"/></li>
        </ol>

        <!-- Page Content -->
        <h1><fmt:message key="customer.list"/></h1>
        <hr>
        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
        	<c:url value="/client/new/" var="newClient"/>
        	<li><a href="${newClient}">
        		<i class="fas fa-plus"></i>
        		<fmt:message key="common.new"/>
        		</a>
        	</li>&nbsp;|&nbsp;
        	<li><a href="">
        		<i class="fa fa-download"></i>
        		<fmt:message key="common.export"/>
        		</a>
        	</li>&nbsp;|&nbsp;
        	<li><a href="">
        		<i class="fa fa-upload"></i>
        		<fmt:message key="common.import"/>
        		</a>
        	</li>
        </ol>
        
         <!-- DataTables Example -->
        <div class="card mb-3">
          <div class="card-header">
            <i class="fas fa-table"></i>
            	<fmt:message key="customer.list"/>
            </div>
          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                  <tr>
                    <th><fmt:message key="common.firstname"/></th>
                    <th><fmt:message key="common.lastname"/></th>
                    <th><fmt:message key="common.email"/></th>
                    <th><fmt:message key="common.address"/></th>
                    <th><fmt:message key="common.action"/></th>
                  </tr>
                </thead>
                <tfoot>
                  <tr>
                    <th><fmt:message key="common.firstname"/></th>
                    <th><fmt:message key="common.lastname"/></th>
                    <th><fmt:message key="common.email"/></th>
                    <th><fmt:message key="common.address"/></th>
                    <th><fmt:message key="common.action"/></th>
                  </tr>
                </tfoot>
                <tbody>
                  <c:forEach items="${clients}" var="client">
	                  <tr>
	                    <td>${client.getNom()}</td>
	                    <td>${client.getPrenom()}</td>
	                    <td>${client.getEmail()}</td>
	                    <td>${client.getAdresse()}</td>
	                    <td>
			        		<a href="" alt="Edit" title="Edit">
				        		<i class="fa fa-edit"></i>
			        		</a>&nbsp;|&nbsp;
			        		<a href="" alt="Delete" title="Delete">
				        		<i class="fa fa-trash text-danger"></i>
			        		</a>
	                    </td>
	                  </tr>
                  </c:forEach>
                </tbody>
              </table>
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
          <a class="btn btn-primary" href="<%= request.getContextPath() %>/resources/login.html">Logout</a>
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

  <!-- Page level plugin JavaScript-->
  <script src="<%= request.getContextPath() %>/resources/vendor/datatables/jquery.dataTables.js"></script>
  <script src="<%= request.getContextPath() %>/resources/vendor/datatables/dataTables.bootstrap4.js"></script>

  <!-- Demo scripts for this page-->
  <script src="<%= request.getContextPath() %>/resources/js/demo/datatables-demo.js"></script>
  
  
</body>

</html>
