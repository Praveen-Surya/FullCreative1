<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>

<body>
	<h1>Welcome!! To_Do_List</h1>
	<form id="form" method="post">

		<label for="content">Content:</label>

		<textarea name="content" id="content" cols="40" rows="5"></textarea>

		<table>

			<tr>
				<td></td>
				<td><input type="button" onclick="addTodo()" value="save"></td>
			</tr>
		</table>
	</form>

	<br>
	<a href="/LogOut">Log Out</a>
	<br>
	<br>
	<ul id="myList1">
		<c:forEach items="${TITLE}" var="Todo">
	
		${Todo.content}<br>

		</c:forEach>
	</ul>
	<ol id="myList"></ol>

	<script>
	
		var list = document.getElementById('myList');
		var rand = function() {
		    return Math.random().toString(36).substr(2);
		};
		
		function addTodo() {	
			var content = document.getElementById('content').value
			var id = rand()			
			var content1 = {
				"Content": content,
			    "Id" : id
			}
			fetch('http://localhost:8080/CreateAList', {
				method: "POST",
				body: JSON.stringify(content1),
				headers: {
					"Content-type": "application/json; charset=UTF-8"
				}

			}).then(function (response) {
				return response.json()
			}).then(json => {

				var data = JSON.parse(json);
				var entry = document.createElement("li");
				var textnode = document.createTextNode(data.Content);
				entry.appendChild(textnode);
				entry.setAttribute('id',id);
				var removeButton = document.createElement('button');
				removeButton.appendChild(document.createTextNode("remove"));
				removeButton.setAttribute('onClick', 'removeName("' +  id + '")');
				entry.appendChild(removeButton);
				document.getElementById('myList').appendChild(entry);
				document.getElementById('content').value = "";
			})
		}


		function removeName(id) {	
			console.log(id);
			var content2 = {
				    "Id" : id
				}			
			fetch('http://localhost:8080/Edit', {						
				method: "POST",
				body: JSON.stringify(content2),
				headers: {
					"Content-type": "application/json; charset=UTF-8"
				}

			}).then(function (response) {
				return response.json()
			}).then(json => {
				console.log(json);
			})
			var item = document.getElementById(id);
			list.removeChild(item);
		}
	</script>

</body>

</html>