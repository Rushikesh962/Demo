<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@include file="Head.jsp" %>
<br><br><br><br>
<body>
      <form action="DDD" Method="Post">
 <div class="col-md-6">
                     <div class="contact_box">
                     <form action="Demo" Method="Post">
                        <h1 class="book_text">Book Appoinment</h1>
                        
                          
                       <input type="text" class="Email_text" placeholder="Patient Name" name="PatientName">
                       <input type="text" class="Email_text" placeholder="Patient Surname" name="PatientSurname">
                        <input type="text" class="Email_text" placeholder="Gender" name="Gender">
                         <input type="date" class="Email_text" placeholder="Date" name="Date">
                          
                          <input type="text" class="Email_text" placeholder="Time" name="Time">
                       <input type="text" class="Email_text" placeholder="Email" name="Email">
                        <input type="text" class="Email_text" placeholder="Mobile Number" name="MobileNumber">
                         <input type="text" class="Email_text" placeholder="Symptoms" name="Symptoms">
                         <input type="text" class="Email_text" placeholder="Department" name="Department">
                          <input type="text" class="Email_text" placeholder="Doctor Name" name="DoctorName">
                         
                        
                       <input type = "submit">
                     </div>
                  </div>
                  </form>
                  <!-- footer section start -->
                   <div class="footer_section layout_padding">
      <div class="container">
         <div class="row">
            <div class="col-lg-3 col-sm-6">
               <div class="footer_logo"><a href="index.html"><img src="images/footer-logo.png"></a></div>
               <h1 class="adderss_text">Contact Us</h1>
               <div class="map_icon"><img src="images/map-icon.png"><span class="paddlin_left_0">Page when looking at its</span></div>
               <div class="map_icon"><img src="images/call-icon.png"><span class="paddlin_left_0">+919876030749</span></div>
               <div class="map_icon"><img src="images/mail-icon.png"><span class="paddlin_left_0"> Abc@gmail.com</span></div>
            </div>
           

                  <ul>
                     <li><a href="#"><img src="images/fb-icon.png"></a></li>
                     <li><a href="#"><img src="images/twitter-icon.png"></a></li>
                     <li><a href="#"><img src="images/linkedin-icon.png"></a></li>
                     <li><a href="#"><img src="images/instagram-icon.png"></a></li>
                  </ul>
               </div>
            </div>
         </div>
      </div>
   </div>
   <!-- footer section end -->

</body>
</html>