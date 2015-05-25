<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url var="reloadUrl" value="/asset-graph" />

<!DOCTYPE html>
<html>
<head>
<jsp:include page="common/head.jsp" />
</head>
<body>

   <jsp:include page="common/navbar.jsp" />

   <div class="container">
      <div class="row">
         <div class="col-md-12">
            <h2 class="section-title">Debugger</h2>
            <p>At any time during the development, you can access the debugger, which provides
          information about how Dandelion processes the current request. As such, feel free to test
          it in any page of the application!</p>
        <p>
          In order to display the debugger, just manually add the
          <code>ddl-debug</code>
          parameter to the current URL.
        </p>
        <p class="text-center">
          <a href="?ddl-debug" class="btn btn-lg btn-primary">Go to <c:url value="/debugger?ddl-debug" /></a>
        </p>
        
         </div>
      </div>
   </div>
</body>
</html>