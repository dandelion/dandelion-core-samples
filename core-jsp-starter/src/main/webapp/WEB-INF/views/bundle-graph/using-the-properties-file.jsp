<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dandelion" uri="http://github.com/dandelion"%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="../common/head.jsp" />
<dandelion:bundle includes="bundle-using-taglib" />
<dandelion:asset jsExcludes="" />
</head>
<body>

  <jsp:include page="../common/navbar.jsp" />

  <div class="container">

    <div class="row">
      <div class="col-md-12">
        <h2 class="section-title">Interacting with the bundle graph</h2>
        <h3>Using the properties file</h3>
        <p>
          The
          <code>dandelion.properties</code>
          file allows you to interact with the asset graph in multiple ways:
        </p>
        <ul>
          <li>You can include (or exclude) one or more bundles permanently using respectively
            the <code>bundle.includes</code> (or <code>bundle.excludes</code>) configuration
            property
          </li>
          <li>You can also excludes JS or CSS files permanently using both <code>asset.js.excludes</code>
            and <code>asset.css.excludes</code></li>
        </ul>
        <p>
          For example in this current application, the
          <code>dandelion.properties</code>
          file contains the following configuration:
        </p>
        <pre>
bundle.includes=app,bootstrap3
</pre>
        <p>
          This means that both <i>sample</i> and <i>bootstrap2</i> bundles will be loaded
          permanently, i.e. in all pages.
        </p>
      </div>
    </div>

  </div>
</body>
</html>