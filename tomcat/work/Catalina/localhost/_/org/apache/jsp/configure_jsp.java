/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.75
 * Generated at: 2017-03-15 11:26:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.commons.lang3.StringEscapeUtils;
import org.cmdbuild.services.gis.GisDatabaseService;
import org.cmdbuild.services.SessionVars;
import org.cmdbuild.spring.SpringIntegrationUtils;

public final class configure_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/localizationsJsFiles.jsp", Long.valueOf(1489577085349L));
    _jspx_dependants.put("/WEB-INF/tags/translations/implicit.tld", Long.valueOf(1489577077256L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ftr_005ftranslation_0026_005fkey_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ftr_005ftranslation_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ftr_005ftranslation_0026_005fkey_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	final String lang = SpringIntegrationUtils.applicationContext().getBean(SessionVars.class).getLanguage();
	final String jdbcDriverVersion = GisDatabaseService.getDriverVersion();
	final String extVersion = "4.2.0";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"stylesheets/cmdbuild.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"javascripts/ext-");
      out.print( extVersion );
      out.write("/resources/css/ext-all.css\" />\r\n");
      out.write("\t\t<link rel=\"icon\" type=\"image/x-icon\" href=\"images/favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 0. ExtJS -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascripts/ext-");
      out.print( extVersion );
      out.write("/ext-all.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascripts/ext-");
      out.print( extVersion );
      out.write("-ux/Notification.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 1. Main script -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascripts/cmdbuild/core/LoaderConfig.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascripts/log/log4javascript.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascripts/cmdbuild/core/Message.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 2. Localizations -->\r\n");
      out.write("\t\t");
      out.write("<script type=\"text/javascript\" src=\"javascripts/ext-");
      out.print( extVersion );
      out.write("/locale/ext-lang-");
      out.print( lang );
      out.write(".js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"services/json/utils/gettranslationobject\"></script>\r\n");
      out.write("\r\n");

	if ("it".equals(lang)) {

      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascripts/cmdbuild/locale/it.js\"></script>\r\n");

	} else if ("fr".equals(lang)) {

      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascripts/cmdbuild/locale/fr.js\"></script>\r\n");

	} else {

      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"javascripts/cmdbuild/locale/en.js\"></script>\r\n");

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 3. Runtime configuration -->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tExt.ns('CMDBuild.configuration.runtime');\r\n");
      out.write("\t\t\tCMDBuild.configuration.runtime = Ext.create('CMDBuild.model.core.configuration.runtime.Configure');\r\n");
      out.write("\t\t\tCMDBuild.configuration.runtime.set(CMDBuild.core.constants.Proxy.JDBC_DRIVER_VERSION, '");
      out.print( StringEscapeUtils.escapeEcmaScript(jdbcDriverVersion) );
      out.write("');\r\n");
      out.write("\t\t\tCMDBuild.configuration.runtime.set(CMDBuild.core.constants.Proxy.LANGUAGE, '");
      out.print( StringEscapeUtils.escapeEcmaScript(lang) );
      out.write("');\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascripts/cmdbuild/override/form/field/VTypes.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 4. Modules -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"javascripts/cmdbuild/Configure.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<title>CMDBuild - Configuration</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<a href=\"http://www.cmdbuild.org\" target=\"_blank\"><img src=\"images/logo.jpg\" alt=\"CMDBuild logo\" /></a>\r\n");
      out.write("\t\t\t<div class=\"description\">Open Source Configuration and Management Database</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"left\"><a href=\"http://www.cmdbuild.org\" target=\"_blank\">www.cmdbuild.org</a></div>\r\n");
      out.write("\t\t\t<div id=\"cmdbuild-credits-link\" class=\"center\">");
      if (_jspx_meth_tr_005ftranslation_005f0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("\t\t\t<div class=\"right\"><a href=\"http://www.tecnoteca.com\" target=\"_blank\">Copyright &copy; Tecnoteca srl</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tr_005ftranslation_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tr:translation
    org.cmdbuild.tags.Translation _jspx_th_tr_005ftranslation_005f0 = (org.cmdbuild.tags.Translation) _005fjspx_005ftagPool_005ftr_005ftranslation_0026_005fkey_005fnobody.get(org.cmdbuild.tags.Translation.class);
    boolean _jspx_th_tr_005ftranslation_005f0_reused = false;
    try {
      _jspx_th_tr_005ftranslation_005f0.setPageContext(_jspx_page_context);
      _jspx_th_tr_005ftranslation_005f0.setParent(null);
      // /configure.jsp(62,50) name = key type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tr_005ftranslation_005f0.setKey("common.credits");
      int _jspx_eval_tr_005ftranslation_005f0 = _jspx_th_tr_005ftranslation_005f0.doStartTag();
      if (_jspx_th_tr_005ftranslation_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ftr_005ftranslation_0026_005fkey_005fnobody.reuse(_jspx_th_tr_005ftranslation_005f0);
      _jspx_th_tr_005ftranslation_005f0_reused = true;
    } finally {
      if (!_jspx_th_tr_005ftranslation_005f0_reused) {
        _jspx_th_tr_005ftranslation_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_tr_005ftranslation_005f0);
      }
    }
    return false;
  }
}