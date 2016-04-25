
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>

    <c:import url="header.html"/>

    <body>
        <c:import url="nav.jsp"/>
        <div class="tab-pane" id="search" >

            <div class="container" style = "margin-top:40px">
                <div class="content-container clearfix">

                    <div class="col-md-12">
                        <div  style="font-size:150%;">
                            <form action="LoginServlet" method="POST" id="loginForm" >
                                <div class="modal-body">
                                    <div style="font-size:20px;">
                                        <Span><Strong>Sign in as:</Strong></Span>
                                        <select style="margin-right: 40%" id="selectSign" onchange="selectSignIn();" name="role">
                                            <option value="Member">Member</option>
                                            <option value="Faculty">Faculty</option>
                                            <option value="Publisher">Publisher</option>
                                        </select>
                                    </div> 
                                    </br>


                                    <input type="text" placeholder="Username" name= "username" class="form-control"/>

                                    <input type="text" placeholder="Password" name= "password" class="form-control"/> 

                                  
                                </div>
                                <div class="modal-footer">

                                    <div>
                                        <button type="submit" value = "Submit" class="btn btn-primary btn-lg btn-block" >Sign in</button>
                                    </div>

                                </div>

                                <!-- End | Register Form -->

                            </div>

                        </form>
                    </div>
                </div>
            </div>

        </div>

        <c:import url="footer.html"/>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>

        <!-- Customized js files -->
        <script src="bootstrap-3.3.6-dist/js/script.js"></script>
    </body>
</html>

