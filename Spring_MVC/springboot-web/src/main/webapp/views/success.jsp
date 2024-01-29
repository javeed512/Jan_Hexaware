<%@page  import="java.time.*" %>

<h1>WELCOME TO JSP</h1>



<%

int x = 99;

   out.println(x);

	LocalDate  date = LocalDate.now();
	
	 out.println(date);

%>