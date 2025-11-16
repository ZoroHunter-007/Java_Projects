<link rel="stylesheet" href="../css/style.css">
<h2>Employee List</h2>
<table>
<tr>
 <th>ID</th><th>Name</th><th>Department</th><th>Salary</th>
</tr>
<c:forEach var="e" items="${list}">
<tr>
 <td>${e.id}</td>
 <td>${e.name}</td>
 <td>${e.department}</td>
 <td>${e.salary}</td>
</tr>
</c:forEach>
</table>
