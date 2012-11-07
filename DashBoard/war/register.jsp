<head>
<link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
</head>
<script language='JavaScript'>
		function show(name, check)
		{	
			var elem1 = document.getElementById(name);
			if(elem1.style.display == "none"){
				elem1.style.display = "block";
				}else{
				elem1.style.display = "none";
				} 
			
		}
</script>
<body>
<div id="main">
	<fieldset>
		<legend>Register</legend>
			<form id='editForm' action="Register" method="post">
				<br />
				<br />
				Username: 		
				<br />	
				<input style='width: 230px;' type="text" id="username" name="username" />
				<br />
				E-mail: 	
				<br />	
				<input style='width: 230px;' type="text" id="email" name="email" />
				<br />
				Password:  		
				<br />	
				<input style='width: 230px;' type="password" id="password" name="password" value=""/>
				<br />
				Confirm Password:  
				<br />	
				<input style='width: 230px;' type="password" id="cpassword" name="cpassword" value=""/>
				<br />
				<br />
				<input type="checkbox" name="Burgie" onclick="show('jaar1', 'no');"> Ingenieurswetenschappen Jaar 1<br />
				<div id="jaar1" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="fase1"  onclick="show('fase1', 'yes');"> fase 1<br />
				<div id="fase1" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="Analyse"> Analyse <br />
				<input type="checkbox" name="Mechanica"> Mechanica <br />
				<input type="checkbox" name="Chemie"> Chemie <br />
				<input type="checkbox" name="Chemie"> Algebra <br />
				<input type="checkbox" name="Chemie"> Chemie <br />
				</div>
				<input type="checkbox" name="Burgie"  onclick="show('fase2', 'yes');"> fase 2<br />
				<div id="fase2" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="Thermodynamica"> Thermodynamica <br />
				<input type="checkbox" name="Informatica"> Informatica <br />
				<input type="checkbox" name="Materiaalkunde"> Materiaalkunde <br />
				<input type="checkbox" name="Analyse2"> Analyse 2 <br />
				<input type="checkbox" name="Elektrische netwerken"> Elektrische netwerken <br />
				<input type="checkbox" name="Natuurkunde"> Natuurkunde <br />
				</div>
				</div>
				<br />
				<div class="button">
				<input type="submit" value="Submit"/>
				</div>
			</form>
	</fieldset>
</div>
</body>