<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<h1>${headerMessage}</h1>

<h3>Student Admission Form</h3>

<form:errors path="student1.*"/>
<br>
<form action = "/FirstSpringMVCProject/submitAdmissionForm.html" method = "post">
<table>
<tr>
<td>Student Name :</td> <td><input type="text" name="studentName"/></td>
</tr>
<tr>
<td>Student Hobby :</td><td><input type="text" name="studentHobby"/></td>
</tr>
<tr>
<td>Student Mobile :</td> <td><input type="text" name="studentMobile"/></td>
</tr>
<tr>
<td>Student DOB :</td><td><input type="text" name="studentDOB"/></td>
</tr>
<tr>
<td>Student Skills :</td><td><select name="studentSkills" multiple>
								<option value="Java Core">Java Core</option>
								<option value="Spring Core">Spring Core</option>
								<option value="Java MVC">Java MVC</option>
							</select></td>
</tr>
</table>
<table>
<tr><td>Student Address :</td></tr>
<tr>
<td> Country : <input type="text" name="studentAddress.country"/></td>
<td> City : <input type="text" name="studentAddress.city"/></td>
<td> Street : <input type="text" name="studentAddress.street"/></td>
<td> Pincode : <input type="text" name="studentAddress.pincode"/></td>
</tr>
<tr><td><input type="submit" value="Submit this Form by Clicking Here"/></td></tr>

</table>


</form>

</body>
</html>