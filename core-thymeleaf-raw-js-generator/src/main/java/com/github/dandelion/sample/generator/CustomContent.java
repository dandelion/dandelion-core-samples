/*
 * [The "BSD licence"]
 * Copyright (c) 2013-2015 Dandelion
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 3. Neither the name of Dandelion nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.github.dandelion.sample.generator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.github.dandelion.core.asset.generator.AssetContent;
import com.github.dandelion.sample.model.Person;

public class CustomContent extends AssetContent {

   private final HttpServletRequest request;
   
   public CustomContent(HttpServletRequest request) {
      this.request = request;
   }

   @Override
   @SuppressWarnings("unchecked")
   public StringBuilder getContent() {
      List<Person> persons = (List<Person>) request.getAttribute("persons");

      StringBuilder htmlList = new StringBuilder("<ul>");
      for (Person p : persons) {
         htmlList.append("<li>").append(p.getFirstName()).append(" ").append(p.getLastName()).append("</li>");
      }
      htmlList.append("</ul>");

      StringBuilder js = new StringBuilder("var div = document.getElementById('msg');");
      js.append("div.innerHTML = '").append(htmlList).append("';");
      return js;
   }
}
