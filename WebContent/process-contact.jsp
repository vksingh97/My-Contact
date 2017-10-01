<%@page import="mycontact.allmethods.MyContactMethods"%>
<%@page import="mycontact.entity.Contact"%>
<%

String first_name=request.getParameter("first_name");
String last_name=request.getParameter("last_name");
String email=request.getParameter("email");
String mobile=request.getParameter("mobile");
String state=request.getParameter("state");


Contact contact=new Contact();

contact.setFirst_name(first_name);
contact.setLast_name(last_name);
contact.setEmail(email);
contact.setMobile(Long.parseLong(mobile));
contact.setState(state);

new MyContactMethods().checkContact(contact);
response.sendRedirect("hompage.jsp");
%>