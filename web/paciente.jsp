<%-- 
    Document   : paciente
    Created on : 31/09/2022, 2:00:10 a. m.
    Author     : Yessid Murcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Consultar Paciente</title>
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet" />
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
    </head>

    <body>
        <header class="masthead">
            <div class="container px-4 px-lg-5 d-flex h-100 align-items-center justify-content-center">
                <div class="d-flex justify-content-center">
                    <div class="text-center">
                        <h1 class="text-white-50 mx-auto mt-2 mb-2">Paciente <%out.println(request.getParameter("namePaciente")); %></h1>
                        <p class="text-white-50 mx-auto mt-2 mb-2">
                            <%@page   import="base.Patients"%>
                            <%@page   import="base.Doctors"%>
                            <%@page   import="base.Institutions"%>
                            <%@page   import="base.Base"%>
                            <%    
                          Base ba=new Base();
                               out.println(ba.patient(request.getParameter("namePaciente"))); 
                            %>
                        </p>
                    </div>
                </div>
            </div>
        </header>
    </body>

</html>
