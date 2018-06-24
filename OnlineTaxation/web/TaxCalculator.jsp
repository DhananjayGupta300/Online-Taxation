<%-- 
    Document   : TaxCalculator
    Created on : Jun 24, 2018, 3:01:01 AM
    Author     : Dhananjay Gupta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tax Calculator</title>
    </head>
    <body>
        <h2>Details Submission Form</h2>
        <form action="TaxProcessing">
            <pre>
            Income              <input type="text" name="t1"/>
            Age                 <input type="text" name="t2"/>
            Gender              <input type="radio" name="gender" value="male"/> 
                                <input type="radio" name="gender" value="female" checked="checked"/>
            Senior Citizen      <input type="checkbox" name="senior citizen" value="yes"/>
            Assets              <select name="assets" size="3" multiple="multiple">
                <option>plot</option>
                <option>Apartment</option>
                <option>Gold</option>
                <option>Silver</option>
                <option>Diamond</option>
                <option>Car</option>
                </select>
            Upload Salary Slip  <input type="file" name ="salslip" value=""/>
                                <input type="Submit" value ="Find-Tax"/>
            </pre>
       </form>
    </body>
</html>
