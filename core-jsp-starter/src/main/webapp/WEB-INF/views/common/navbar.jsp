<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<a href="https://github.com/dandelion/dandelion-core-samples"> <img
  style="position: fixed; top: 0; left: 0; border: 0; z-index: 1500;"
  src="https://s3.amazonaws.com/github/ribbons/forkme_left_green_007200.png" alt="Fork me on GitHub" />
</a>

<!-- Static navbar -->
<nav class="navbar navbar-default navbar-static-top">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
        data-target="#navbar" aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span
          class="icon-bar"></span> <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="<c:url value="/" />">core-jsp-starter</a>
    </div>
    <div id="navbar" class="navbar-collapse collapse">
      <ul class="nav navbar-nav">
        <li><a href="<c:url value="/asset-bundles" />">Asset bundles</a></li>
        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Interacting
            with the bundle graph <b class="caret"></b>
        </a>
          <ul class="dropdown-menu">
            <li><a href="<c:url value="/bundle-graph" />/using-the-properties-file">Using
                the properties file</a></li>
            <li><a href="<c:url value="/bundle-graph" />/using-the-api">Using the API</a></li>
            <li><a href="<c:url value="/bundle-graph" />/using-the-jsp-taglib">Using the
                JSP taglib</a></li>
          </ul></li>
        <li><a href="<c:url value="/asset-locators" />">Asset locators</a></li>
        <li><a href="<c:url value="/debugger" />">Debugger</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Help
            <b class="caret"></b>
        </a>
          <ul class="dropdown-menu">
            <li><a href="http://dandelion.github.io/components/core">Documentation</a></li>
            <li><a href="http://dandelion-forum.48353.x6.nabble.com/">Forum</a></li>
            <li><a href="https://github.com/dandelion/dandelion-core-samples/issues">Report an
                issue</a></li>
          </ul></li>
      </ul>
    </div>
    <!--/.nav-collapse -->
  </div>
</nav>

</div>