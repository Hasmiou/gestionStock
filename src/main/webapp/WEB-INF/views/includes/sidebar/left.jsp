<ul class="sidebar navbar-nav">
      <li class="nav-item">
      	<c:url value="/home/" var="home"/>
        <a class="nav-link" href="${home}">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <fmt:message key="common.dashboard"/>
        </a>
      </li>
      <li class="nav-item">
      	<c:url value="/article/" var="article"/>
        <a class="nav-link" href="${article}">
          <i class="fa fa-shopping-bag"></i>
          <fmt:message key="common.product"/>
        </a>
      </li>
      <li class="nav-item">
      	<c:url value="/client/" var="client"/>
        <a class="nav-link" href="${client}">
          <i class="fa fa-users"></i>
          <fmt:message key="common.customer"/>
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fa fa-shopping-cart"></i>
          <fmt:message key="common.customer.command"/>
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fa fa-ship"></i>
          <fmt:message key="common.provider"/>
        </a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fa fa-cogs"></i>
          <fmt:message key="common.setting"/>
        </a>
        <div class="dropdown-menu" aria-labelledby="pagesDropdown">
          <!-- <h6 class="dropdown-header">...</h6>-->
          <a class="dropdown-item" href="register.html"><fmt:message key="common.setting.user"/></a>
          <a class="dropdown-item" href="login.html"><fmt:message key="common.setting.category"/></a>
          
          <!-- <div class="dropdown-divider"></div>
          <h6 class="dropdown-header">Other Pages:</h6>-->
        </div>
      </li>
      
    </ul>