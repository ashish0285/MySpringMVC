<html>
<body>
<h1>${headerMessage}</h1>

<h3>Student Admission Form</h3>

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

<input type="submit" value="Submit this Form by Clicking Here"/>
</form>

</body>
</html>