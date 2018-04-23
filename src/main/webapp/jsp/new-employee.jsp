<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
<%--         <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
 --%>    </head>
    
    <body>
        <div class="container">
            <form action="/employee" method="post"  role="form" data-toggle="validator" >
                <c:if test ="${empty action}">                        	
                    <c:set var="action" value="add"/>
                </c:if>
                <input type="hidden" id="action" name="action" value="${action}">
                <input type="hidden" id="idEmployee" name="idEmployee" value="${employee.id}">
                <h2>Employee</h2>
                <div class="form-group col-xs-4">
                    <label for="name" class="control-label col-xs-4">First Name:</label>
                    <input type="text" name="firstName" id="firstName" class="form-control" value="${employee.firstName}" required="true"/>                                   

                    <label for="lastName" class="control-label col-xs-4">Last Name:</label>                   
                    <input type="text" name="lastName" id="lastName" class="form-control" value="${employee.lastName}" required="true"/> 

                    <label for="birthdate" class="control-label col-xs-4">User Name:</label>                 
                    <input type="text" name="username" id="username" class="form-control" value="${employee.username}" maxlength="10" placeholder="dd-MM-yyy" required="true"/>

                    <label for="role" class="control-label col-xs-4">City:</label>                    
                    <input type="text" name="city" id="city" class="form-control" value="${employee.city}" required="true"/> 

                    <label for="department" class="control-label col-xs-4">Age:</label>
                    <input type="text" name="age" id="age" class="form-control" value="${employee.age}" required="true"/>

                    <br></br>
                    <button type="submit" class="btn btn-primary  btn-md">Add</button> 
                </div>                                                      
            </form>
        </div>
    </body>
</html>