<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUNDLE CLOTH SERVICE</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>BUNDLE CLOTH SERVICE</h1>
	<form id="form" action="ServiceServlet" method="post">
		<fieldset id="PersonalInfo"><legend>Personal Information</legend>

			<div class="grid-container">
				<label for="name">Name*</label>
				<input type="text" name="name" required>
				<label for="age">Age*</label>
				<input type="text" name="age" required>
				<label for="email">Email*</label>
				<input type="text" name="email" required>
				<label for="phoneNumber">Phone Number*</label>
				<input type="text" name="phoneNumber" required>
				<label for="date">Date*</label>
				<input type="date" name="dateService" required>
				<i class="fas fa-calender-alt"></i>
			</div>
		</fieldset>
		<fieldset id="PersonalInfo"><legend>Service Details</legend>

			<div class="grid-container">
				<label for="item">Item</label>
				<input type="text" name="item" required>
				<label for="brand">Brand</label>
				<input type="text" name="brand" required>
				<label for="problem">Problem</label>
				<input type="text" name="problem" required>
				<label for="problemdetails">Detail Problem</label>
				<input type="text" name="problemdetails" required>
			</div>
		</fieldset>
		<br><br>
		<button type="submit" value="Submit" name="action">Submit</button>
		<br><br>
		<button type="reset" value="Reset">Reset</button>
	</form>
</body>
</html>