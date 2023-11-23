<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Play                  List      List   _a6fc00</name>
   <tag></tag>
   <elementGuidId>d1e8e642-1f5e-4c4d-97be-49ea505abb4c</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>div.gcnSecondaryNavDiv</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='gcn']/div</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>0a33bcb0-3781-4ea3-b950-eff634f93bcb</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>gcnSecondaryNavDiv</value>
      <webElementGuid>de49362e-dfcf-4c53-bbbe-ed4b86243a74</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
      










  
    
      
    
    
  







  


  
    

      
        Play
      

      

      List
      List    

     

     
  





      
      
        
        










  
    
      
    
    
  








    
      
        

          
  Mensajes


        
      
       
    


  function messageButtonClick() {
      var messageBar = dojo.byId(&quot;messageDetailWidget&quot;);
      if (messageBar.style.display==&quot;none&quot;) {
        messageBar.style.display=&quot;block&quot;;
      }
      else {
        messageBar.style.display=&quot;none&quot;;
      }
  }






        
        
        
          
        










  
    
      
    
    
  














  
  
  
    
  
  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    	
    
    
    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      Opciones

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_optionsNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_optionsNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_optionsNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_optionsNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_optionsNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Desconectar Callcenter Agent
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Preferencias
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Documentación
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Acerca de
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Método abreviado
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_optionsNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == 'DIV') {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == 'A')) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  







        
        

  
        


        
  
  
        No hay mensajes recientes en el sistema.

      
      
      
        
          
        










  
    
      
    
    
  














  
  
  
    
  
  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar sitio




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

LP_MAIN_WEBSITE




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_siteNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_siteNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_siteNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_siteNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_siteNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Sitio
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_MAIN_WEBSITE
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_SHOP_APP
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_WAP_SITE
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otro sitio
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_siteNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == 'DIV') {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == 'A')) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar catálogo




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

InternetCatalog




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_catalogNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_catalogNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_catalogNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_catalogNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_catalogNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Catálogo
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otro catálogo
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Restablecer catálogo por defecto
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_catalogNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == 'DIV') {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == 'A')) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar lista de precios




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

MSRP / Sale




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_pricelistNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_pricelistNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_pricelistNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_pricelistNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_pricelistNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Lista de precios
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otra lista de precios
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Restablecer lista de precios por defecto
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_pricelistNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == 'DIV') {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == 'A')) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  







      
    </value>
      <webElementGuid>bb461be3-dbe6-4d4e-a1f2-5dde18de7f37</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;gcn&quot;)/div[@class=&quot;gcnSecondaryNavDiv&quot;]</value>
      <webElementGuid>674d5721-a2ba-4021-89f8-ef877e6d877d</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='gcn']/div</value>
      <webElementGuid>1a50f904-0da7-4320-a8b6-57bb6486e834</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Service Center'])[2]/following::div[2]</value>
      <webElementGuid>c6137594-e36a-4e7d-94f0-e2aa9689d267</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Commerce'])[1]/following::div[2]</value>
      <webElementGuid>ff054f93-86e5-4f24-87cb-8be3f16e9189</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div[2]/div</value>
      <webElementGuid>d8d37462-a45a-4733-9b2b-595c735ab60f</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
      










  
    
      
    
    
  







  


  
    

      
        Play
      

      

      List
      List    

     

     
  





      
      
        
        










  
    
      
    
    
  








    
      
        

          
  Mensajes


        
      
       
    


  function messageButtonClick() {
      var messageBar = dojo.byId(&quot;messageDetailWidget&quot;);
      if (messageBar.style.display==&quot;none&quot;) {
        messageBar.style.display=&quot;block&quot;;
      }
      else {
        messageBar.style.display=&quot;none&quot;;
      }
  }






        
        
        
          
        










  
    
      
    
    
  














  
  
  
    
  
  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    	
    
    
    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      Opciones

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_optionsNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_optionsNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_optionsNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_optionsNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_optionsNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Desconectar Callcenter Agent
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Preferencias
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Documentación
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Acerca de
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Método abreviado
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_optionsNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == &quot; , &quot;'&quot; , &quot;DIV&quot; , &quot;'&quot; , &quot;) {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == &quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;)) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  







        
        

  
        


        
  
  
        No hay mensajes recientes en el sistema.

      
      
      
        
          
        










  
    
      
    
    
  














  
  
  
    
  
  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar sitio




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

LP_MAIN_WEBSITE




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_siteNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_siteNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_siteNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_siteNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_siteNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Sitio
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_MAIN_WEBSITE
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_SHOP_APP
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_WAP_SITE
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otro sitio
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_siteNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == &quot; , &quot;'&quot; , &quot;DIV&quot; , &quot;'&quot; , &quot;) {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == &quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;)) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar catálogo




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

InternetCatalog




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_catalogNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_catalogNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_catalogNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_catalogNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_catalogNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Catálogo
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otro catálogo
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Restablecer catálogo por defecto
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_catalogNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == &quot; , &quot;'&quot; , &quot;DIV&quot; , &quot;'&quot; , &quot;) {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == &quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;)) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar lista de precios




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

MSRP / Sale




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_pricelistNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_pricelistNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_pricelistNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_pricelistNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_pricelistNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Lista de precios
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otra lista de precios
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Restablecer lista de precios por defecto
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_pricelistNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == &quot; , &quot;'&quot; , &quot;DIV&quot; , &quot;'&quot; , &quot;) {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == &quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;)) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  







      
    &quot;) or . = concat(&quot;
      










  
    
      
    
    
  







  


  
    

      
        Play
      

      

      List
      List    

     

     
  





      
      
        
        










  
    
      
    
    
  








    
      
        

          
  Mensajes


        
      
       
    


  function messageButtonClick() {
      var messageBar = dojo.byId(&quot;messageDetailWidget&quot;);
      if (messageBar.style.display==&quot;none&quot;) {
        messageBar.style.display=&quot;block&quot;;
      }
      else {
        messageBar.style.display=&quot;none&quot;;
      }
  }






        
        
        
          
        










  
    
      
    
    
  














  
  
  
    
  
  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    	
    
    
    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      Opciones

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_optionsNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_optionsNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_optionsNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_optionsNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_optionsNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Desconectar Callcenter Agent
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Preferencias
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Documentación
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Acerca de
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Método abreviado
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_optionsNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == &quot; , &quot;'&quot; , &quot;DIV&quot; , &quot;'&quot; , &quot;) {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == &quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;)) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  







        
        

  
        


        
  
  
        No hay mensajes recientes en el sistema.

      
      
      
        
          
        










  
    
      
    
    
  














  
  
  
    
  
  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar sitio




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

LP_MAIN_WEBSITE




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_siteNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_siteNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_siteNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_siteNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_siteNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Sitio
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_MAIN_WEBSITE
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_SHOP_APP
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        LP_WAP_SITE
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otro sitio
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_siteNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == &quot; , &quot;'&quot; , &quot;DIV&quot; , &quot;'&quot; , &quot;) {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == &quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;)) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar catálogo




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

InternetCatalog




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_catalogNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_catalogNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_catalogNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_catalogNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_catalogNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Catálogo
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otro catálogo
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Restablecer catálogo por defecto
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_catalogNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == &quot; , &quot;'&quot; , &quot;DIV&quot; , &quot;'&quot; , &quot;) {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == &quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;)) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  


  
  
  
    
  
  
    
      
    










  
    
      
    
    
  












  
    
      
    
    			  
      
        
        
      










  
    
      
    
    
  












Buscar lista de precios




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  










 

MSRP / Sale




    	
    
    
    			  
      
        
        
      










  
    
      
    
    
  













  
  
    
    
      

    
  



  // Positioning of the nav item popup, based on the location of the container and proximity to the left margin
  function showNavActionPopupMenu(navItemId) {
    var navActionContainerObject = document.getElementById(&quot;navActionContainer_&quot;+navItemId);
    var navActionPopupMenu = document.getElementById(&quot;navActionPopup_&quot;+navItemId);

    if (navActionContainerObject != null &amp;&amp; navActionPopupMenu != null) {
      if (navActionPopupMenu.style.display==&quot;block&quot;) {
        navActionPopupMenu.style.display=&quot;none&quot;;
      }
      else {
        navActionPopupMenu.style.display=&quot;block&quot;;
        var offsetRight = 14;
        var containerRectangle = navActionContainerObject.getBoundingClientRect();
        var popupRectangle = navActionPopupMenu.getBoundingClientRect();
        var popupWidth = popupRectangle.right - popupRectangle.left;
        var leftPixelValue = parseInt(containerRectangle.right - popupWidth + offsetRight);
        
        if (leftPixelValue &lt; 3) {
          navActionPopupMenu.style.left = &quot;3px&quot;;
        }
        else {
          navActionPopupMenu.style.left = leftPixelValue+&quot;px&quot;;
        }
      }
    }
  }


  dojo.addOnLoad(function () {
    var _domIdContainer = &quot;navActionContainer_pricelistNavItem&quot;;
    var _domObjectContainer = document.getElementById(_domIdContainer);
    if (_domObjectContainer != null) {
       _domObjectContainer.onmouseout=showHideNavActionPopup_pricelistNavItem;
    }
  });
  
  // This function is triggered when the mouse leaves the nav container area and tests to see whether the nav popup should
  // be hidden or kept visible. Because we already have code to hide the nav action popup when a user mouses out of the popup, this
  // function specifically addresses the behavior of mousing out of the container without first entering the popup.
  function showHideNavActionPopup_pricelistNavItem(e) {
  
    // If the mouse has left the NavActionContainer, determine whether the NavAction popup is displayed, and if so, 
    // calculate whether the mouse has moved off both elements, thereby triggering the closing of the popup
    var _navActionPopup = document.getElementById(&quot;navActionPopup_pricelistNavItem&quot;);
    var _navItemContainer = document.getElementById(&quot;navActionContainer_pricelistNavItem&quot;);

    if ((_navActionPopup != null) &amp;&amp; (_navActionPopup.style.display==&quot;block&quot;)) {
      var _navItemRectangle = _navItemContainer.getBoundingClientRect();
      var _navPopupRectangle = _navActionPopup.getBoundingClientRect();
      
      var _event = e;
    	if (!e) {
    	  _event = window.event;
    	}

      if (_event.pageY || _event.pageX) {
    		_mouseY = _event.pageY;
    		_mouseX = _event.pageX;
    	}
	    else if (_event.clientY || _event.clientX) {
		    _mouseY = _event.clientY + document.documentElement.scrollTop + document.body.scrollTop;
		    _mouseX = _event.clientX + document.documentElement.scrollLeft + document.body.scrollLeft;
	    }
	    
      //console.debug(&quot;_mouseX=&quot; + _mouseX + &quot;, _mouseY=&quot; + _mouseY + &quot; | C-Top=&quot; + _navItemRectangle.top + &quot;, C-Bottom=&quot; + _navItemRectangle.bottom + &quot;, C-Left=&quot; + _navItemRectangle.left + &quot;, C-Right=&quot; + _navItemRectangle.right + &quot; | P-Top=&quot; + _navPopupRectangle.top + &quot;, P-Bottom=&quot; + _navPopupRectangle.bottom + &quot;, P-Left=&quot; + _navPopupRectangle.left + &quot;, P-Right=&quot; + _navPopupRectangle.right);
      var _topPadding = 11;
      var _leftPadding = 20;
      
      // Target any smaller nav design so that the mouse sensitivity is greater
      if (_navPopupRectangle.top - _navPopupRectangle.bottom &lt; 21) {
        if (_mouseX > _navItemRectangle.right+8) {
          _navActionPopup.style.display=&quot;none&quot;;
        }
        
        if (_mouseY > _navPopupRectangle.top-_topPadding) {
          return;
        }
      }

      if (_mouseX > _navItemRectangle.right) {
        _navActionPopup.style.display=&quot;none&quot;;
      }


      if (_mouseY &lt;  _navItemRectangle.top) {
        _navActionPopup.style.display=&quot;none&quot;;
      }
      
      
      if ((_mouseX &lt; (_navItemRectangle.left+_leftPadding)) &amp;&amp; (_mouseY &lt;  _navItemRectangle.bottom)) {
       _navActionPopup.style.display=&quot;none&quot;;
      }
    }

  }






    
    
  
  
  
  Lista de precios
  
  
  
  
    
     
      
        
      










  
    
      
    
    
  













  
  
    
  
  

  
  

  
  


  
  
    
  
  
    
  

  
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Seleccionar otra lista de precios
      
    
  

  
  


  
  
    
  
  

  
  
    
      
      
      
        Restablecer lista de precios por defecto
      
    
  

  
  


  
  
    
  
  

  
  

  
  
    
  






    
  
  



  dojo.addOnLoad(function () {
    var _domIdPopup = &quot;navActionPopup_pricelistNavItem&quot;;
    var _domObjectPopup = document.getElementById(_domIdPopup);
     _domObjectPopup.onmouseout=checkMouseLocationPopup;
  });

  function checkMouseLocationPopup(e) {
  	// Browser-specifc event handling
  	var _event = e;
  	if (!e) {
  	  _event = window.event;
  	}
  	
  	// Ignore the mouse events for the &lt;div> links in the nav action popup
  	var _target = (window.event) ? _event.srcElement : _event.target;
  	if (_target.nodeName == &quot; , &quot;'&quot; , &quot;DIV&quot; , &quot;'&quot; , &quot;) {
  	  return;
  	}
  	
  	// Check to see whether the mouse actually left the layer
  	var _relatedTarget = (_event.relatedTarget) ? _event.relatedTarget : _event.toElement;
  	if ((_relatedTarget != null) &amp;&amp; (_relatedTarget.nodeName == &quot; , &quot;'&quot; , &quot;A&quot; , &quot;'&quot; , &quot;)) {
  	  return;
  	}
  	this.style.display=&quot;none&quot;;
  }







  







      
    &quot;))]</value>
      <webElementGuid>2ee2493e-4f2e-423a-9b09-b60326f23533</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
