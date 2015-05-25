package com.github.dandelion.sample.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.dandelion.core.web.AssetRequestContext;

/**
 * <p>
 * Controller for all examples contained in the sample.
 * </p>
 * 
 * @author Thibault Duchateau
 */
@Controller
@RequestMapping(method = RequestMethod.GET)
public class SampleController {

   @RequestMapping(value = "/")
   public String goToIndex() {
      return "index";
   }

   @RequestMapping(value = "/{page:.*}")
   public String goToPage(@PathVariable String page) {
      return page;
   }

   @RequestMapping(value = "/bundle-graph/using-the-api")
   public String goToBundleGraphUsingTheApiExample(HttpServletRequest request) {
      AssetRequestContext.get(request).addBundle("bundle-using-api");
      return "bundle-graph/using-the-api";
   }

   @RequestMapping(value = "/bundle-graph/{page}")
   public String goToBundleGraphOtherExamples(@PathVariable String page) {
      return "bundle-graph/" + page;
   }
}