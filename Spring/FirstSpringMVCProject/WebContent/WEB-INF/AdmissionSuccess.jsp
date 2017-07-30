<html>
<body>
<h1>${headerMessage}</h1>
<h3>Congratulations!! our college has successfully processed your application</h3>
<h2>Details Submitted by you ::</h2>

<table>
<tr>
<td>Student Name :</td>
<td>${student1.studentName}</td>
</tr>
<tr>
<td>Student Hobby :</td>
<td>${student1.studentHobby}</td>
</tr>
<tr>
<td>Student Mobile :</td>
<td>${student1.studentMobile}</td>
</tr>
<tr>
<td>Student DOB :</td>
<td>${student1.studentDOB}</td>
</tr>
<tr>
<td>Student Skills :</td>
<td>${student1.studentSkills}</td>
</tr>
<tr><td>Student Address :</td>
<td>
 Country : ${student1.studentAddress.country}
 City : ${student1.studentAddress.city}
 Street : ${student1.studentAddress.street}
 Pincode : ${student1.studentAddress.pincode}
 </td>
</tr>
</table>


</body> 
</html>