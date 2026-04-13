<%-- 
    Document   : index
    Created on : Apr 12, 2026, 10:28:19 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
    <div class="cuerpo">
        <header>
            <img><img src="src" alt="alt"/>
            
        </header>
         <nav>
             <section>
                 <article>
                     <fieldset>
                         <legend>registrar usuario</legend>
                         <form  action="svUsuario" method="POST"  >
                             <label for="TxtId">Id</label><br>
                             <input type="number" id="TxtId" name="Id"><br>
                             <label for="TxtNombre">Nombre</label><br>
                             <input type="text" id="TxtNombre" name="Nombre"><br>
                             <label for="TxtApellido">Apellido</label><br>
                             <input type="text" id="TxtApellido" name="Apellido"><br>
                             <label for="TxtTipoDeSangre">Tipo de Sangre</label><br>
                             <input type="text" id="TxtTipoDeSangre" name="tipoDeSangre"><br>
                             <label for="TxtCargo">Cargo</label><br>
                             <input type="number" id="TxtCargo" name="Cargo"><br>
                             <label for="TxtEmail">Email</label><br>
                             <input type="email" id="TxtEmail" name="Email"><br>
                             <label for="TxtPassword">Password</label><br>
                             <input type="password" id="TxtPassword" name="Password"><br>
                             
                             
                             <input type="submit" value="Registrar">
                         </form>
                     </fieldset>
                 </article>
                 <article>
                     <fieldset>
                         <legend>Consultar Usuarios</legend>
                         <p>presiona el boton para consultar los Usuarios</p>
                         <form action="svUsuario" method="get">
                             <input type="submit" value="Consultar">
                         </form>
                     </fieldset>
                 </article>
             </section>
         </nav>
    </div>
        
    </body>
</html>
