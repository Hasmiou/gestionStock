<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="true" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	String locale = "fr_FR";
	//if(!session.getAttribute("local").toString().equals(null)){
	//	local = session.getAttribute("local").toString();
	//}
%>

<fmt:setLocale value="${locale}"/>
<fmt:bundle basename="i18n.applicationResources"/>