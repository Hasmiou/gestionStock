<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="true" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	String local ="fr_FR";
	//if(!session.getAttribute("local").toString().equals(null)){
	//	local = session.getAttribute("local").toString();
	//}
%>

<!--<fmt:setLocale value="$(local)"/>
<fmt:bundle basename="com.stock.i18n.applicationresources"></fmt:bundle>-->