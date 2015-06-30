package com.github.dandelion.sample.generator;

import java.util.List;

import com.github.dandelion.core.asset.generator.js.jquery.JQueryContent;
import com.github.dandelion.sample.model.Person;

public class CustomJQueryContent extends JQueryContent {

   public CustomJQueryContent(List<Person> persons) {
      
      StringBuilder htmlList = new StringBuilder("<ul>");
      for (Person p : persons) {
         htmlList.append("<li>").append(p.getFirstName()).append(" ").append(p.getLastName()).append("</li>");
      }
      htmlList.append("</ul>");

      StringBuilder initCode = new StringBuilder();
      initCode.append("$('#msg').append('");
      initCode.append(htmlList);
      initCode.append("');");

      appendToComponentConfiguration(initCode.toString());
   }
}
