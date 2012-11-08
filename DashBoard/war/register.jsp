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
				<input type="checkbox" name="ingenieurswetenschappen" onclick="show('fases', 'no');"> Ingenieurswetenschappen <br />
				<div id="fases" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="fase1"  onclick="show('fase1', 'yes');"> Fase 1<br />
				<div id="fase1" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="semester 1"  onclick="show('semester1', 'yes');"> Semester 1<br />
				<div id="semester1" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="Analyse1"> Analyse, deel 1 <br />
				<input type="checkbox" name="Mechanica1"> Toegepaste Mechanica, deel 1 <br />
				<input type="checkbox" name="Chemie"> Algemene en Technische Scheikunde  <br />
				<input type="checkbox" name="Algebra"> Toegepaste Algebra <br />
				<input type="checkbox" name="Wijsbegeerte"> Wijsbegeerte <br />
				<input type="checkbox" name="Peno1"> Probleemoplossen en Ontwerpen, deel 1 <br />
				</div>
				<input type="checkbox" name="semester2"  onclick="show('semester2', 'yes');"> Semester 2<br />
				<div id="semester2" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="Thermodynamica"> Thermodynamica <br />
				<input type="checkbox" name="Informatica"> Methodiek van de Informatica <br />
				<input type="checkbox" name="Materiaalkunde"> Inleiding tot de Materiaalkunde <br />
				<input type="checkbox" name="Analyse2"> Analyse, deel 2 <br />
				<input type="checkbox" name="Elektrische netwerken"> Elektrische Netwerken <br />
				<input type="checkbox" name="Natuurkunde"> Algemene Natuurkunde <br />
				<input type="checkbox" name="Peno2"> Probleemoplossen en Ontwerpen, deel 2 <br />
				</div>
				</div>
				<input type="checkbox" name="fase2"  onclick="show('fase2', 'yes');"> Fase 2<br />
				<div id="fase2" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="semester 1"  onclick="show('semester3', 'yes');"> Semester 1<br />
				<div id="semester3" style="padding-left: 20px; display: none;">
				<input type="checkbox" name="Analyse3"> Analyse, deel 3 <br />
				<input type="checkbox" name="Mechanica2"> Toegepaste Mechanica, deel 2 <br />
				<input type="checkbox" name="OrganischeChemie"> Organische Scheikunde  <br />
				<input type="checkbox" name="Numerieke"> Numerieke Wiskunde <br />
				<input type="checkbox" name="Statistiek"> Kansrekenen en Statistiek <br />
				<input type="checkbox" name="Iov"> Informatie-overdracht en -verwerking <br />
				<input type="checkbox" name="Economie"> Economie <br />
				<input type="checkbox" name="Peno3"> Probleemoplossen en Ontwerpen, deel 3 <br />
				</div>
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